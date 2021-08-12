#!/usr/bin/env groovy
pipeline {
    agent any
    options {
        ansiColor('xterm')
        timestamps()
    }
    stages {
        stage('Build') {
            steps {
                sh 'docker build -t hello-final:BASIC-1.0.${BUILD_NUMBER}-${GIT_COMMIT} .'
            }
        }
        stage('Deploy') {
            steps {
                sh "docker-compose up -d'"
            }
        }
    }
}
