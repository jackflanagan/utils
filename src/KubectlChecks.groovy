def CheckNodes(){
    NotReadyNodes=$(kubectl get nodes | grep NotReady)
    if [ -z "$NotReadyNodes" ]
    then
      echo "No nodes in NotReady status at time of running"
    else
      echo "\$NotReadyNodes is NOT NULL"
      echo "At least one node is being marked as NotReady"
      kubectl get nodes
      exit 0
    fi
}