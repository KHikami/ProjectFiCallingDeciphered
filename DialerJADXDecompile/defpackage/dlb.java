package defpackage;

/* compiled from: PG */
/* renamed from: dlb */
public final class dlb extends deh {
    public dlh[] a;

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
                    Object obj = new dlh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new dlh();
                        dee.a(obj[a]);
                        dee.a();
                        a++;
                    }
                    obj[a] = new dlh();
                    dee.a(obj[a]);
                    this.a = obj;
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

    public dlb() {
        this.a = dlh.d();
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
        return a;
    }
}
