package defpackage;

/* compiled from: PG */
/* renamed from: dlg */
public final class dlg extends deh {
    private dlf[] a;
    private dkq b;

    public final /* synthetic */ dem a(dee dee) {
        while (true) {
            int a = dee.a();
            switch (a) {
                case rl.c /*0*/:
                    break;
                case rl.m /*10*/:
                    int b = dep.b(dee, 10);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    Object obj = new dlf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new dlf();
                        dee.a(obj[a]);
                        dee.a();
                        a++;
                    }
                    obj[a] = new dlf();
                    dee.a(obj[a]);
                    this.a = obj;
                    continue;
                case rk.bW /*18*/:
                    if (this.b == null) {
                        this.b = new dkq();
                    }
                    dee.a(this.b);
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

    public dlg() {
        this.a = dlf.d();
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null && this.a.length > 0) {
            for (dem dem : this.a) {
                if (dem != null) {
                    def.a(1, dem);
                }
            }
        }
        if (this.b != null) {
            def.a(2, this.b);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.a != null && this.a.length > 0) {
            for (dem dem : this.a) {
                if (dem != null) {
                    a += def.b(1, dem);
                }
            }
        }
        if (this.b != null) {
            return a + def.b(2, this.b);
        }
        return a;
    }
}
