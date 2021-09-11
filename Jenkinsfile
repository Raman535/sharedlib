pipeline {
  agent any
  stages {
    stage('Reserving') {
      steps {
        node(label: 'cherry') {
          sh 'echo "hello"'
        }

      }
    }

    stage('checkout') {
      agent any
      steps {
        dir(path: '/home/cherry/workspace') {
          git(url: 'https://github.com/Raman535/sharedlib/', branch: 'main', credentialsId: 'github')
        }

      }
    }

    stage('Build') {
      agent any
      steps {
        sh 'python3 test.py'
      }
    }

    stage('Testing') {
      steps {
        sh 'python3 test_x.py > out.html'
      }
    }

    stage('Archive') {
      steps {
        archiveArtifacts(artifacts: '*html', onlyIfSuccessful: true)
      }
    }

  }
}