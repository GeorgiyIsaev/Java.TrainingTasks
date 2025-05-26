package stage02.utilConsole;

public class ConsolePrinter implements IPrint{

    @Override
    public void print(String string) {
        System.out.print(string);
    }
}
