def call(String buildnumber){
    sh """
    docker image rm java-application:${buildnumber}
    docker image rm us.gcr.io/viu-browser-qa/flowservice-test:main_version_${buildnumber}
    
    """
}