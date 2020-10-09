pipeline {
  agent any
  stages {
    stage('aaaa') {
      steps {
        sh 'echo \'hello\''
      }
    }

    stage('bbbb') {
      steps {
        jacoco(buildOverBuild: true, changeBuildStatus: true)
      }
    }

    stage('cccc') {
      steps {
        echo 'okkk'
      }
    }

  }
  environment {
    stages = ''
  }
}