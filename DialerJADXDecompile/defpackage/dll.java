package defpackage;

/* compiled from: PG */
/* renamed from: dll */
public final class dll extends deh {
    private static volatile dll[] a;
    private String b;

    public static dll[] d() {
        if (a == null) {
            synchronized (del.b) {
                if (a == null) {
                    a = new dll[0];
                }
            }
        }
        return a;
    }

    public dll() {
        this.b = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.b != null) {
            def.a(1, this.b);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.b != null) {
            return a + def.b(1, this.b);
        }
        return a;
    }

    public final /* synthetic */ dem a(dee dee) {
        while (true) {
            int a = dee.a();
            switch (a) {
                case rl.c /*0*/:
                    break;
                case rl.m /*10*/:
                    this.b = dee.d();
                    continue;
                default:
                    if (!super.a(dee, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
