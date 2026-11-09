 pipeline{
    agent any
    stages{
        stage("compile"){
            steps{
                sh "javac Factorial.java TestFactorial.java"
            }
        }
        stage("run"){
            steps{
                sh 'java TestFactorial'
            }
        }
        stage("creation of jar file"){
            steps{
                sh 'jar cfm manifest.txt Factorial.class TestFactorial.class'
            }
        }
        stage("run jar files"){
            steps{
                sh 'java -jar Factorial.jar'
                archiArtifacts artifacts: "factorial.jar"
            }
        }
    }
    post{
        success{ 
            echo "pipeline successfully created"
        }
        failure{
            echo "error occured check again"
        }
    }
    
}
