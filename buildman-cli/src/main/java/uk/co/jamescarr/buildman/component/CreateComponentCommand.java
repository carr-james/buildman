package uk.co.jamescarr.buildman.component;

import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(
        name = "create",
        description = "Creates a new component that can be used in builds"
)
public class CreateComponentCommand implements Runnable {

    @Parameters(paramLabel = "<name>", description = "name of the component")
    String name;

    @Override
    public void run() {
        Component component = Component.of(name, null);
        System.out.printf("Created component \"%s\"%n", component);
    }
}
