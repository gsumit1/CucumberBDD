pipeline{

    agent any

    stage ('Test Stage') {

            steps {

               
                    sh 'mvn test'

                

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
