package uk.co.jamescarr.buildman.component;

import picocli.CommandLine.Command;

@Command(
        name = "component",
        description = "Components that can be used as part of a build",
        subcommands = {CreateComponentCommand.class},
        mixinStandardHelpOptions = true
)
public class ComponentCommand {
}

