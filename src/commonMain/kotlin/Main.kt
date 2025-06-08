import commands.PlatformCommand
import kotlinx.cli.*

@OptIn(ExperimentalCli::class)
fun run(args: Array<String>): Result<Unit> {
    return runCatching {
        val parser = ArgParser("kotlin-app-cli")
        parser.subcommands(
            PlatformCommand()
        )
        parser.parse(args)
    }
}


fun main(args: Array<String>) {
    run(args).onFailure { error ->
        println("Error: ${error.message}")
    }
}