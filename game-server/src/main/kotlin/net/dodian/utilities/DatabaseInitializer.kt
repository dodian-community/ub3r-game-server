package net.dodian.utilities

import org.apache.ibatis.jdbc.ScriptRunner
import java.nio.file.Path

fun initializeDatabase() {
    val file = Path.of("./.initialized_database").toFile()
    if (file.exists()) return else file.createNewFile();

    val dbSqlPath = Path.of("./").resolve("database")

    println("Initializing Dodian's database from the SQL files found at: ${dbSqlPath.toAbsolutePath()}")

    var startTime = System.currentTimeMillis() / 1000
    dbSqlPath.toFile().walk().filter { it.isFile }.forEach {
        val currentTime = System.currentTimeMillis() / 1000
        println("Importing file: ${it.absolutePath}")
        ScriptRunner(dbConnection).apply {
            setAutoCommit(true)
            setStopOnError(true)
            setLogWriter(null)
        }.runScript(it.bufferedReader())
        println("Took ${(System.currentTimeMillis() / 1000) - currentTime} seconds to import file: ${it.absolutePath}")
        println()
    }
    println("Successfully imported database in ${(System.currentTimeMillis() / 1000) - startTime} seconds")
}