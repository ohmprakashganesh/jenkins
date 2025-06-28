pipeline {
    agent any
    tools {
        maven 'Maven 3'
    }
    stages {
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ohmprakashganesh/jenkins']])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t omprakash766/devops-integration .'
                }
            }

        }
        stage('push image to Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                    bat "echo %dockerhubpwd% | docker login -u omprakash766 --password-stdin"
                    bat 'docker push omprakash766/devops-integration '
}


                }

            }
        }
    }
}