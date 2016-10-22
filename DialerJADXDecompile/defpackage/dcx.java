package defpackage;

/* compiled from: PG */
/* renamed from: dcx */
public final class dcx extends dem {
    public String[] a;

    public final /* synthetic */ dem a(dee dee) {
        while (true) {
            int a = dee.a();
            switch (a) {
                case rl.c /*0*/:
                    break;
                case rl.m /*10*/:
                    int b = dep.b(dee, 10);
                    a = this.a == null ? 0 : this.a.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = dee.d();
                        dee.a();
                        a++;
                    }
                    obj[a] = dee.d();
                    this.a = obj;
                    continue;
                default:
                    if (!dee.a(a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public dcx() {
        this.a = dep.b;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != null && this.a.length > 0) {
            for (String str : this.a) {
                if (str != null) {
                    def.a(1, str);
                }
            }
        }
        super.a(def);
    }

    protected final int a() {
        int i = 0;
        int a = super.a();
        if (this.a == null || this.a.length <= 0) {
            return a;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.a.length) {
            String str = this.a[i];
            if (str != null) {
                i3++;
                i2 += def.a(str);
            }
            i++;
        }
        return (a + i2) + (i3 * 1);
    }
}
