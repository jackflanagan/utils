def addtest(){
    NotReadyNodes = sh(
        script: 'kubectl get nodes | grep NotReady',
        returnStatus: true
    )
    if(NotReadyNodes==1){
        echo "No Nodes in NotReady status at time of running"
    } else {
        echo "Nodes in NotReady state"
        sh 'kubectl get nodes'
        exit 0 
    }
}