println("Hello word")
log("Johan", mapOf("command" to "git log", "exitCode" to 23))

dir("monorepository") {
    val x = sh("git log -1").block()
    log("Git: $x")
}

log("Hi")
