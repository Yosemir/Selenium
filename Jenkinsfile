pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        bat(script: 'node -v', returnStatus: true, returnStdout: true)
        bat(script: 'selenium-side-runner Asistencia.side', returnStatus: true, returnStdout: true)
      }
    }

  }
}