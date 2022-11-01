package main.java.com.example.guice;

public class BluetoothPrinter implements IPrinter{

    @Override
    public void print(String message) {
        System.out.println("BluetoothPrinter prints" + message);
    }
}
