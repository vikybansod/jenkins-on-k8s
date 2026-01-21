pipeline {
    agent {
        kubernetes {
            label 'infra'
            defaultContainer 'infra'
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
