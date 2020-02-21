node{
    stage('Create File') {
        sh 'touch NewFile.txt'
    }
    stage('Write to file ') {
        sh 'echo "A wrote something to the file" > NewFile.txt'
    }
    stage('Print File'){
        sh 'cat NewFile.txt'
    }
}
