package defpackage;

public final class bhv {
    boolean a;
    boolean b;
    boolean c;

    public bhv a(boolean z) {
        this.a = z;
        return this;
    }

    public bhv b(boolean z) {
        this.b = z;
        return this;
    }

    public bhv c(boolean z) {
        this.c = z;
        return this;
    }

    public bhu a() {
        return new bhu(this);
    }
}
