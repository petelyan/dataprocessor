pipeline{
    agent any
    stages{
        stage('Build'){
            steps {
                echo 'Building project'
                sh "${tool name: 'sbt', type: 'org.jvnet.hudson.plugins.SbtPluginsBuilder$SbtInstallation'}/bin/sbt compile"
            }
        }
        stage('Unit Test'){
            steps{
                echo 'Running unit tests'
                sh "${tool name: 'sbt', type: 'org.jvnet.hudson.plugins.SbtPluginsBuilder$SbtInstallation'}/bin/sbt test"
                sh "${tool name: 'sbt', type: 'org.jvnet.hudson.plugins.SbtPluginsBuilder$SbtInstallation'}/bin/sbt scalastyle"
            }
        }

    }


}