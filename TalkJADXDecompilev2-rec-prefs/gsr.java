package p000;

public class gsr extends Exception {
    public gsr(String str) {
        super(str);
    }

    public gsr(String str, byte b) {
        this(str);
    }
}
