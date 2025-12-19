pipeline {
    agent any
    //testing for webhook
    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/mhdiya43/tp2_jenkins.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
