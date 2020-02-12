pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        bat 'node -v'
        bat 'selenium-side-runner Asistencia.side'
      }
    }

  }
}