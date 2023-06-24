def call(String credentialsId){
    withSonarQubeEnv(credentialsId: credentialsId) {
      sh "mvn clean package sonar:sonar"
    }
}