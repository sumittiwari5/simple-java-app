pipeline{
    tools {
        maven  'mvn'
    }
    agent any
    stages{
        stage('cloning the code'){
            steps{
                echo "cloning the code "
                git branch: 'test', url: 'https://github.com/sumittiwari5/simple-java-app.git'
            }
        }
        stage('test the code'){
            steps{
                echo "testing the code  "
                sh 'mvn clean install'
            }
        }
        stage('archive jar') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
    }
}
    }
}
