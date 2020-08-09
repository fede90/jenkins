pipline {
	agent any

	tools {
		maven "m3"
	}
	
	stages {
		stage("Build") {
			steps {
				echo "building app..."
				sh "mvn clean install"
			}
		}
	}

	post {
		always {
			cleanWs()
		}
	}
}