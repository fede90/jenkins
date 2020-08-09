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
                sh "mvn clean install"
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