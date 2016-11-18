package defpackage;

public final class cxe {
    String a;
    String b;
    boolean c;

    public cxe a(String str) {
        this.a = str;
        return this;
    }

    public cxe b(String str) {
        this.b = str;
        return this;
    }

    public cxe a(boolean z) {
        this.c = z;
        return this;
    }

    public cxd a() {
        return new cxf(this.a, this.b, this.c);
    }
}
