package p000;

public enum moh {
    GENERAL(false, true),
    BOOLEAN(false, false),
    CHARACTER(false, false),
    INTEGRAL(true, false),
    FLOAT(true, true);
    
    private final boolean f28016f;
    private final boolean f28017g;

    public abstract boolean mo3903a(Object obj);

    private moh(boolean z, boolean z2) {
        this.f28016f = z;
        this.f28017g = z2;
    }

    boolean m32621a() {
        return this.f28017g;
    }
}
