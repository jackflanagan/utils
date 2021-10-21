def addtest(){
    NotReadyNodes = sh(
        script: 'kubectl get nodes | grep NotReady',
        returnStdout: true
    )
    echo "Pointer 1"
    echo NotReadyNodes
    if(NotReadyNodes.isEmpty()){
        echo "No Nodes in NotReady status at time of running"
    } else {
        echo "Nodes in NotReady state"
        sh 'kubectl get nodes'
        exit 0 
    }
}