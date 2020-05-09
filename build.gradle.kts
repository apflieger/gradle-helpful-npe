plugins {
    java
}
repositories {
    mavenCentral()
}
dependencies {
    testImplementation("junit:junit:4.13")
}
tasks.withType<Test> {
    jvmArgs("-XX:+ShowCodeDetailsInExceptionMessages") // Helpful NPEs not working :(
    testLogging {
        setExceptionFormat("full") // Prints exception messages
        showStandardStreams = true // Prints System.out.println
    }
}
