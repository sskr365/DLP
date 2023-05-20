# Ansible playbooks for PRP configurations deployment
Ansible-playbooks are manged by user “ansiuser” in control machine as well as in managed nodes. 
Created project folder “prp_configs/Asible_Playbooks” under home directory of “ansiuser” in Jenkins server.

Ansible playbooks for lower environments [DEV,ITG1,ITG2,STG1,STG2] are controlling by jenkins job "DXP-NON-PROD/PRP-CONFIGS-DEPLOYMENTS".

Ansible playbooks for PROD environment "DXP-PROD/DXP-DEPLOY-PROD"


Below is the ansible command in jenkins pipeline.

		ansiblePlaybook becomeUser: 'ansiuser', credentialsId: 'jenkins-ansi-play', disableHostKeyChecking: true, vaultCredentialsId: 'ansi-prpconfig', extras: "-e nodes='${instanceHostname}' -e ENV='${ENVIRONMENT}' -e app='${APPLICATION}' -e configfile='${FILES}' -e instance='${tagName}' -e num='${instanceNum}' -e appInstance='${appInstanceName}'", installation: 'Ansible2', inventory: 'inventory', playbook: 'playbooks/prpconfigs.yml', tags:'${FILES}, ${APPRESTART}'  


In the configuration files sensitive infromation like password will be encrypted by using ansible-vault and decrypted during the run time of ansible playbook.
Ansible-vault credentials are passed to ansible playbook using parameter 'vaultCredentialsId', it picks password from jenkins->manage jenkins->credentials using parameter 
'ansi-prpconfig'

Backup files locations of property files in all environments
------------------------------------------------------------

apapche - /etc/httpd/backup

elastic-search - /etc/elasticsearch/elasticsearch-backup

liferay/tomcat - /opt/cloudhost/liferay-tomcat/configfiles-backup/{{ instance }}

**NOTE: Please use GitHub repo "prp-devops/prp-configs" for updating configiuration files for all environments.
**
