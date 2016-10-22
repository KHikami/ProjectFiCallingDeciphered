package defpackage;

/* renamed from: jqb */
public final class jqb {
    byte[] a;
    int b;
    int c;
    int d;
    boolean e;

    jqb() {
    }

    public jqb a(byte[] bArr) {
        this.a = bArr;
        return this;
    }

    public jqb a(int i) {
        this.b = i;
        return this;
    }

    public jqb b(int i) {
        this.c = i;
        return this;
    }

    public jqa a() {
        return new jqa(this);
    }
}
