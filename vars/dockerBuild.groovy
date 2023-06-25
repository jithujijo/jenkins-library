def call(String buildnumber){
    sh "docker image build -t java-application:${buildnumber} ."
}