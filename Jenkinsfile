pipeline {
    agent any
    tools {
        maven '3.4.8'
        jdk 'Java1.8'
    }
    stages {
        stage ('Test') {
            steps {
                sh 'mvn clean test -Dcucumber.options="src/test/java/features --tags @Register"' 
            }
        }
                stage ('Cucumber Reports') {

            steps {
            		cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/cucumber.json",
                    jsonReportDirectory: 'target'

            }

        }
    }
    
    
}