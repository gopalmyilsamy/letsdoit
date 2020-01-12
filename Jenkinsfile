pipeline{
    agent any
    stages
    {
        stage('SCM Checkout'){
            steps{
                git 'https://github.com/gopalmyilsamy/letsdoit.git'
            }
        }
        stage('mvn'){
            steps{
                sh "mvn clean package"
            }
        }
        stage('docker'){
            steps{
                sh "sudo docker build -t gopalmyilsamy/letsdoit:1.0 ."
            }
        }
    }
}