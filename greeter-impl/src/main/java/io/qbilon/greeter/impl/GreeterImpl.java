package io.qbilon.greeter.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import io.qbilon.greeter.api.Greeter;

/**
 * GreeterImpl
 */
// is only set to true because we want to see some output when it's bundle is installed
@Component(immediate = true)
public class GreeterImpl implements Greeter{

    @Activate
    private void activate(){
        System.out.println("GreeterImpl started!");
    }

    @Deactivate
    private void deactivate(){
        System.out.println("GreeterImpl stopped!");
    }

    @Override
    public String getGreeting(String nameToGreet) {
        return "Moinsen " + nameToGreet;
    }
}