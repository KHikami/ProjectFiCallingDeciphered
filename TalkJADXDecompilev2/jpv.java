package defpackage;

public final class jpv {
    a a;
    boolean b;
    boolean c;

    jpv() {
    }

    public jpv a(boolean z) {
        this.b = true;
        return this;
    }

    public jpv b(boolean z) {
        this.c = true;
        return this;
    }

    public jpu a() {
        return new jpu(this);
    }
}
