pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        bat(script: 'node -v', returnStatus: true, returnStdout: true)
        bat 'selenium-side-runner Asistencia.side'
      }
    }

  }
}