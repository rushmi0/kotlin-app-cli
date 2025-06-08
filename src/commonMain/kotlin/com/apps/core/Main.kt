package com.apps.core

import com.apps.core.commands.GreetCommand
import com.apps.core.commands.PlatformCommand
import kotlinx.cli.*

@OptIn(ExperimentalCli::class)
fun main(args: Array<String>) {
    val parser = ArgParser("kotlin-app-cli")

    parser.subcommands(
        GreetCommand(),
        PlatformCommand()
    )

    parser.parse(args)
}
