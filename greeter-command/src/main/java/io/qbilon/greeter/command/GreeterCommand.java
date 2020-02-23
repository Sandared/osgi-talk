package io.qbilon.greeter.command;

import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Reference;
import org.apache.karaf.shell.api.action.lifecycle.Service;

import io.qbilon.greeter.api.Greeter;

/**
 * GreeterCommand
 */
@Service
@Command(scope = "greeter", name = "greet", description = "Greets when executed")
public class GreeterCommand implements Action{

    @Reference
    private Greeter greeter;

    @Argument(index = 0, name = "Name", required = true, multiValued = false, description = "The name you want to greet.")
    private String name;
    
    @Override
    public Object execute() throws Exception {
        // sys
        System.out.println(greeter.getGreeting(name));
        return null;
    }
}
