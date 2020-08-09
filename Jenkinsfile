pipeline {
    agent any

    tools {
    	maven "m3"
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh "mvn -version"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}