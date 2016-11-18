package defpackage;

public enum jrn {
    UNKNOWN(0),
    ORIGINAL(1),
    THUMBNAIL(2),
    PLACEHOLDER(3);
    
    private final int e;

    private jrn(int i) {
        this.e = i;
    }

    public int a() {
        return this.e;
    }
}
