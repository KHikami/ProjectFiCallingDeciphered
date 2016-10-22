public final class fji {
    final int a;
    boolean b;
    boolean c;
    flt d;

    public fji(int i) {
        this.a = i;
        this.d = flt.UNKNOWN_TYPE;
        this.b = true;
        this.c = false;
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
