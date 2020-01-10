pipeline{
    agent any
    stages{
        stage('Build'){
            steps {
                echo 'Building project'
                sh "sbt clean compile"
            }
        }
        stage('Unit Test'){
            steps{
                echo 'Running unit tests'
                sh "sbt test"
            }
        }
        stage('Package'){
            steps{
                echo 'Packaging...'
                sh "sbt package"
            }
        }

    }


}