package uk.co.jamescarr.buildman.component;

import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(
        name = "edit",
        description = "Edit an existing component"
)
public class EditComponentCommand implements Runnable {

    @Parameters(paramLabel = "<name>", description = "name of the component")
    String name;

    @Override
    public void run() {
        Component component = Component.of(name, null);
        System.out.printf("Edited component \"%s\"%n", component);
    }
}
