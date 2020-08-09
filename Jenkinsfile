pipeline {
	environment {
		JAVA_TOOL_OPTIONS = "-Duser.home=/var/maven"
	}
    agent {
    	docker {
    		image "maven:3.6.3-openjdk-8"
    		label "docker"
    		args "-v /tmp/maven:/var/maven/.m2 -e MAVEN_CONFIG=/var/maven/.m2"
    	}
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