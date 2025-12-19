pipeline {
    agent any
//comt
    stages {
//comts
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/mhdiya43/tp2_jenkins.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}

