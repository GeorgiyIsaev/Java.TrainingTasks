package stage02.utilConsole;

public interface IPrint {
    void print(String string);
    default void println(String s) {
        print(s + "\n");
    }
}
