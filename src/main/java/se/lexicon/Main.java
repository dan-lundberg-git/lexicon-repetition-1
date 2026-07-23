package se.lexicon;

import se.lexicon.service.VendingMachine;
import se.lexicon.ui.Console;

public class Main {
    static void main() {
        VendingMachine vm = new VendingMachine();
        Console console = new Console();

        console.printMenu(vm.getProducts(), vm.getBalance());
    }
}
