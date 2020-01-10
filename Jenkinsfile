pipeline{
    agent any
    /*  environment{
        SBT_HOME = tool name: 'sbt', type: 'org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'
        PATH = "${env.SBT_HOME}/bin:${env.PATH}"
    }*/
//    def sbtHome = tool 'sbt-1.2.6'
//    def sbt = "${sbtHome}/bin/sbt -no-colors -batch"
    stages{
        stage('Build'){
            steps {
                echo 'Building project'
                sh "${tool name: 'sbt', type: 'org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'}/usr/bin/sbt compile"
            }
        }
//        stage('Unit Test'){
//            steps{
//                echo 'Running unit tests'
//                sh "${sbt} test"
//                sh "${sbt} scalastyle"
//            }
//        }

    }


}