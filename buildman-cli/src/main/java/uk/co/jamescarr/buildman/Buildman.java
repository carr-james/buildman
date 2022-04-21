package uk.co.jamescarr.buildman;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import uk.co.jamescarr.buildman.component.ComponentCommand;

@Command(
        name = "buildman",
        description = "Manages build details for projects",
        subcommands = {ComponentCommand.class, CommandLine.HelpCommand.class},
        version = "Buildman component v1.0"
)
public class Buildman {

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Buildman()).execute(args);
        System.exit(exitCode);
    }
}

