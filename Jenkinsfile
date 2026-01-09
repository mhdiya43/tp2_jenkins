pipeline {
    agent any

    environment {
        SONAR_PROJECT_KEY = "tp4-java-project"
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/mhdiya43/tp2_jenkins.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn -B clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn -B test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }

        // ✅ B3 — TEST DU CREDENTIAL GITHUB
        stage('Test Credential') {
            steps {
                withCredentials([string(credentialsId: 'github-token', variable: 'GITHUB_TOKEN')]) {
                    bat 'echo Token récupéré mais caché dans les logs'
                }
            }
        }

        // ✅ ANALYSE SONARQUBE
       stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    bat """
                        mvn -B org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.1.2184:sonar ^
                        -Dsonar.projectKey=${SONAR_PROJECT_KEY}
                    """
                }
            }
        }

        // ✅ QUALITY GATE (BLOQUE LE PIPELINE)
        stage('Quality Gate') {
            steps {
                timeout(time: 2, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }

    post {
        success {
            echo "✅ TP4 réussi : Qualité OK, pipeline validé"
        }
        failure {
            echo "❌ Pipeline bloqué : tests ou Quality Gate en échec"
        }
    }
}
