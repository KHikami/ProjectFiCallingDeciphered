package defpackage;

/* compiled from: PG */
/* renamed from: dks */
public final class dks extends deh {
    private int a;
    private int b;
    private Long c;
    private dlp[] d;
    private dlm[] e;

    public final /* synthetic */ dem a(dee dee) {
        while (true) {
            int a = dee.a();
            int b;
            Object obj;
            switch (a) {
                case rl.c /*0*/:
                    break;
                case rl.j /*8*/:
                    a = dee.e();
                    switch (a) {
                        case rl.c /*0*/:
                        case rq.b /*1*/:
                        case rq.c /*2*/:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case rk.bX /*16*/:
                    a = dee.e();
                    switch (a) {
                        case rl.c /*0*/:
                        case rq.b /*1*/:
                        case rq.c /*2*/:
                            this.b = a;
                            break;
                        default:
                            continue;
                    }
                case rk.bP /*24*/:
                    this.c = Long.valueOf(dee.f());
                    continue;
                case 34:
                    b = dep.b(dee, 34);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new dlp[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new dlp();
                        dee.a(obj[a]);
                        dee.a();
                        a++;
                    }
                    obj[a] = new dlp();
                    dee.a(obj[a]);
                    this.d = obj;
                    continue;
                case 42:
                    b = dep.b(dee, 42);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new dlm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new dlm();
                        dee.a(obj[a]);
                        dee.a();
                        a++;
                    }
                    obj[a] = new dlm();
                    dee.a(obj[a]);
                    this.e = obj;
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

    public dks() {
        this.a = oe.INVALID_ID;
        this.b = oe.INVALID_ID;
        this.c = null;
        this.d = dlp.d();
        this.e = dlm.d();
        this.r = -1;
    }

    public final void a(def def) {
        int i = 0;
        if (this.a != oe.INVALID_ID) {
            def.a(1, this.a);
        }
        if (this.b != oe.INVALID_ID) {
            def.a(2, this.b);
        }
        if (this.c != null) {
            def.b(3, this.c.longValue());
        }
        if (this.d != null && this.d.length > 0) {
            for (dem dem : this.d) {
                if (dem != null) {
                    def.a(4, dem);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                dem dem2 = this.e[i];
                if (dem2 != null) {
                    def.a(5, dem2);
                }
                i++;
            }
        }
        super.a(def);
    }

    protected final int a() {
        int i = 0;
        int a = super.a();
        if (this.a != oe.INVALID_ID) {
            a += def.c(1, this.a);
        }
        if (this.b != oe.INVALID_ID) {
            a += def.c(2, this.b);
        }
        if (this.c != null) {
            a += def.e(3, this.c.longValue());
        }
        if (this.d != null && this.d.length > 0) {
            int i2 = a;
            for (dem dem : this.d) {
                if (dem != null) {
                    i2 += def.b(4, dem);
                }
            }
            a = i2;
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                dem dem2 = this.e[i];
                if (dem2 != null) {
                    a += def.b(5, dem2);
                }
                i++;
            }
        }
        return a;
    }
}
