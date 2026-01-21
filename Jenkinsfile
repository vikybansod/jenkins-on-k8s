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
      image: ubuntu:noble
      command:
        - cat
      tty: true
"""
        }
    }

    stages {
        stage('Verify Container') {
            steps {
                container('infra') {
                    sh '''
                        echo "Running on Kubernetes agent"
                        echo "Container name: infra"
                        echo "OS details:"
                        cat /etc/os-release
                        echo "Current user:"
                        whoami
                        echo "Workspace:"
                        pwd
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
