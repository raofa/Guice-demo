package main.java.com.example.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceApp {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new PrinterModule());
        IPrinter printer = injector.getInstance(IPrinter.class);
        printer.print(" Hello Guice");
    }
}
