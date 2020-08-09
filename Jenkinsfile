pipline {
	agent any
	
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