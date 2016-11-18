package p000;

public class bke extends frj {
    public final fbt f3612a;
    public final fqx f3613b;

    public bke(fbt fbt, fqx fqx) {
        if (fbt == null) {
            glk.m17982e("Babel", "lookupSpec should not be empty", new Object[0]);
        }
        if (fqx == null) {
            glk.m17982e("Babel", "consumer should not be null", new Object[0]);
        }
        this.f3612a = fbt;
        this.f3613b = fqx;
    }

    public bke(String str, fqx fqx) {
        this(fbt.m14917a(str), fqx);
    }

    public fqx m5574a() {
        return this.f3613b;
    }

    public fbt m5576d() {
        return this.f3612a;
    }

    public String mo594c() {
        return this.f3612a.m14924c();
    }
}
