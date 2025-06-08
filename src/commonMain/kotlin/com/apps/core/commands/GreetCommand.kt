package com.apps.core.commands

import kotlinx.cli.*

@OptIn(ExperimentalCli::class)
class GreetCommand : Subcommand("-info", "Print application info") {
    override fun execute() {
        println("Running info command from CLI app.")
    }
}
