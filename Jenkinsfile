pipeline {
  agent none
  stages {
    stage('Reserving') {
      steps {
        node(label: 'cherry') {
          sh 'echo "hello"'
        }

      }
    }

    stage('checkout') {
      steps {
        dir(path: '/home/cherry/workspace')
        git(url: 'https://github.com/Raman535/sharedlib', branch: 'main', credentialsId: 'github')
      }
    }

    stage('Build') {
      steps {
        sh 'python test.py'
      }
    }

    stage('Testing') {
      steps {
        sh 'python unittest.py > out.html'
      }
    }

    stage('Archive') {
      steps {
        archiveArtifacts(artifacts: '*html', onlyIfSuccessful: true)
      }
    }

  }
}