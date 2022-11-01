package main.java.com.example.guice;

import com.google.inject.AbstractModule;

public class PrinterModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(IPrinter.class).to(BluetoothPrinter.class);
    }
}
