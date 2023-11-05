def MavenHome= tool name: 'Maven-3.9.5'
def call(String mavenCommand) {
  if ("${mavenCommand}" == "Clean") {
    sh "${MavenHome}/bin/mvn clean"
  }
  else if ("${mavenCommand}" == "Test") {
    sh "${MavenHome}/bin/mvn clean test"
  }
  else if ("${mavenCommand}" == "compile") {
    sh "${MavenHome}/bin/mvn clean compile"
  }
  else if ("${mavenCommand}" == "Package") {
    sh "${MavenHome}/bin/mvn clean package"
  }
  else if ("${mavenCommand}" == "Install") {
    sh "${MavenHome}/bin/mvn clean install"
  }
}
