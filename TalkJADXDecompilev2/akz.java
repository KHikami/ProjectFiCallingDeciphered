package defpackage;

public class akz extends Exception {
    public akz(String str) {
        super(str);
    }

    public akz(byte b) {
        this();
    }

    public akz(String str, byte b) {
        this(str);
    }
}