pipeline {
    agent any 
    stages {
        stage('Stage 1') {
            steps {
                echo 'Hello world!' 
            }
        }
        stage('Analisis de SonarQube') {
            steps {
				dir("/var/lib/jenkins/workspace/evaluacion_1/back") {
					withSonarQubeEnv('SonarQube') {
						sh 'chmod +x ./gradlew'
						sh './gradlew sonarqube'
    					}
				}
  		}
    }
}
}