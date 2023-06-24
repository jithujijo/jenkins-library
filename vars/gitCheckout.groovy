def call(Map stageParams){
    checkout scmGit($class: 'GitSCM', branches: [[name: stageParams.branch]], extensions: [], userRemoteConfigs: [[url: stageParams.url]])
}