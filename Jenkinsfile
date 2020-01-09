pipeline{
    agent any
    environment{
        SBT_HOME = tool name: 'sbt-1.2.6', type: 'org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'
        PATH = "${env.SBT_HOME}/bin:${env.PATH}"
    }
    stages{
        stage('Build'){
            steps {
                echo 'Building project'
                sh "sbt compile"
            }
        }
        stage('Unit Test'){
            steps{
                echo 'Running unit tests'
                sh "sbt test"
                sh "sbt scalastyle"
            }
        }

    }


}