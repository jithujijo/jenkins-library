def call(){
    sh "docker image build -t java-application:latest ."
}