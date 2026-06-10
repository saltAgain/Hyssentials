
repositories {
    // Any external repositories besides: MavenLocal, MavenCentral, HytaleMaven, and CurseMaven
}

dependencies {
    compileOnly(libs.jetbrains.annotations)
    compileOnly(libs.jspecify)

    //shadowBundle("org.mariadb.jdbc:mariadb-java-client:3.5.3")
    //shadowBundle("com.zaxxer:HikariCP:6.3.0")

    compileOnly(fileTree("libs") {
        include("*.jar")
    })
}