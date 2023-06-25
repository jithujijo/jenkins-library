def call(String buildnumber){
    sh "docker tag java-application:${buildnumber} us.gcr.io/viu-browser-qa/flowservice-test:main:${buildnumber}"
}