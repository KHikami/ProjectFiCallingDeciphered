package defpackage;

/* renamed from: grs */
public final class grs implements jca {
    private final jcf a;
    private final int b;

    public grs(jcf jcf, int i) {
        this.a = jcf;
        this.b = i;
    }

    public int a() {
        return this.b;
    }

    public boolean b() {
        return this.b != -1;
    }

    public jch c() {
        return this.a.a(this.b);
    }

    public jca a(jcc jcc) {
        return this;
    }
}
