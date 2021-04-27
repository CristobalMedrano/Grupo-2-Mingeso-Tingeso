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
				dir("/var/lib/jenkins/workspace/rama/back") {
					withSonarQubeEnv('SonarQube') {
						sh 'chmod +x ./gradlew'
						sh './gradlew sonarqube'
    					}
				}
  		    }
        }
        stage('JUnit'){            
            steps{
                dir("/var/lib/jenkins/workspace/rama/back"){
                    echo 'Iniciando JUnit'
                    sh 'chmod +x ./gradlew'
                    sh './gradlew test --info'
                
                }
                
            }
        }
    }
}