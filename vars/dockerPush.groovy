def call(String buildnumber){
    sh "docker push us.gcr.io/viu-browser-qa/flowservice-test:main_version_${buildnumber}"
}