//some new type called kae that stores a string else creates a default object with the string fed in

public class kae {
    private final String a;

    protected kae(String str) {
        this.a = str;
    }

    public kae(String str, byte b) {
        this(str);
    }
}
