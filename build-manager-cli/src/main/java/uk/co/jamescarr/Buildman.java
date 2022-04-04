package uk.co.jamescarr;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(
        name = "hello",
        version = "Buildman v1.0",
        description = "Says hello",
        mixinStandardHelpOptions = true
)
public class Buildman implements Runnable {

    @Parameters(paramLabel = "<name>", defaultValue = "World", description = "Name to say hello to.")
    String name = "World";

    @Override
    public void run() {
        System.out.printf("Hello, %s!%n", name);
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Buildman()).execute(args);
        System.exit(exitCode);
    }
}
