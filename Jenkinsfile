@Library('jenkins-shared-lib') _

pipeline {
    agent {
        kubernetes {
            label 'infra-agent'
            defaultContainer 'infra'
            yaml """
apiVersion: v1
kind: Pod
metadata:
  labels:
    role: infra
spec:
  containers:
    - name: infra
      image: ${infra_image}:${infra_tag}
      command:  
        - cat
      tty: true
"""
        }
    }

    environment {
        ENV = 'uat'
    }

    stages {
        stage('Verify Container') {
            steps {
                container('infra') {
                    sh '''
                        echo "${AWS_REGION}"
                        echo "${CLUSTER}"
                    '''
                }
            }
        }
        stage('Verify Container 1') {
            steps {
                container('infra') {
                    sh '''
                        echo "Running on Kubernetes agent"
                        echo "Container name: infra"
                        echo "OS details:"
                        ls -lrt /
                        echo "Current user:"
                        whoami
                        echo "Workspace:"
                        pwd
                    '''
                }
            }
        }
    }
}
