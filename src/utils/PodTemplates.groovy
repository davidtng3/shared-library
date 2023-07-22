package com.utils

public void dockerTemplate(body) {
  podTemplate(
    containers: [containerTemplate(name: 'docker', image: 'docker', command: 'sleep', args: '99d')]) {
      body.call()
    }
}

public void mavenTemplate(body) {
  podTemplate(
    containers: [containerTemplate(name: 'maven', image: 'maven', command: 'sleep', args: '99d')]) {
      body.call()
    }
}

return this


