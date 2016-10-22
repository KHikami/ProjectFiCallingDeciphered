package defpackage;

/* compiled from: PG */
/* renamed from: dcy */
public final class dcy extends dem {
    public String[] a;
    public String[] b;

    public final /* synthetic */ dem a(dee dee) {
        while (true) {
            int a = dee.a();
            int b;
            Object obj;
            switch (a) {
                case rl.c /*0*/:
                    break;
                case rl.m /*10*/:
                    b = dep.b(dee, 10);
                    a = this.a == null ? 0 : this.a.length;
                    obj = new String[(b + a)];
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
                case rk.bW /*18*/:
                    b = dep.b(dee, 18);
                    a = this.b == null ? 0 : this.b.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = dee.d();
                        dee.a();
                        a++;
                    }
                    obj[a] = dee.d();
                    this.b = obj;
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

    public dcy() {
        this.a = dep.b;
        this.b = dep.b;
        this.r = -1;
    }

    public final void a(def def) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (String str : this.a) {
                if (str != null) {
                    def.a(1, str);
                }
            }
        }
        if (this.b != null && this.b.length > 0) {
            while (i < this.b.length) {
                String str2 = this.b[i];
                if (str2 != null) {
                    def.a(2, str2);
                }
                i++;
            }
        }
        super.a(def);
    }

    protected final int a() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int a = super.a();
        if (this.a == null || this.a.length <= 0) {
            i = a;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.a) {
                if (str != null) {
                    i3++;
                    i2 += def.a(str);
                }
            }
            i = (a + i2) + (i3 * 1);
        }
        if (this.b == null || this.b.length <= 0) {
            return i;
        }
        i2 = 0;
        i3 = 0;
        while (i4 < this.b.length) {
            String str2 = this.b[i4];
            if (str2 != null) {
                i3++;
                i2 += def.a(str2);
            }
            i4++;
        }
        return (i + i2) + (i3 * 1);
    }
}
