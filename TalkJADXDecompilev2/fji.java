package defpackage;

public final class fji {
    final int a;
    boolean b = true;
    boolean c = false;
    flt d = flt.UNKNOWN_TYPE;

    public fji(int i) {
        this.a = i;
    }

    public fji a(boolean z) {
        this.b = z;
        return this;
    }

    public fji b(boolean z) {
        this.c = false;
        return this;
    }

    public fji a(flt flt) {
        this.d = flt;
        return this;
    }

    public fjh a() {
        return new fjh(this);
    }
}
