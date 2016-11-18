package defpackage;

public enum moh {
    GENERAL(false, true),
    BOOLEAN(false, false),
    CHARACTER(false, false),
    INTEGRAL(true, false),
    FLOAT(true, true);
    
    private final boolean f;
    private final boolean g;

    public abstract boolean a(Object obj);

    private moh(boolean z, boolean z2) {
        this.f = z;
        this.g = z2;
    }

    boolean a() {
        return this.g;
    }
}
