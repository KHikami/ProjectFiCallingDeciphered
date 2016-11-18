package defpackage;

public class bke extends frj {
    public final fbt a;
    public final fqx b;

    public bke(fbt fbt, fqx fqx) {
        if (fbt == null) {
            glk.e("Babel", "lookupSpec should not be empty", new Object[0]);
        }
        if (fqx == null) {
            glk.e("Babel", "consumer should not be null", new Object[0]);
        }
        this.a = fbt;
        this.b = fqx;
    }

    public bke(String str, fqx fqx) {
        this(fbt.a(str), fqx);
    }

    public fqx a() {
        return this.b;
    }

    public fbt d() {
        return this.a;
    }

    public String c() {
        return this.a.c();
    }
}
