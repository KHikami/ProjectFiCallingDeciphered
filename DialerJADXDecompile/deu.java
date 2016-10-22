/* compiled from: PG */
public final class deu extends deh {
    public int a;
    public int b;
    public long c;
    public des d;
    public String e;
    public long f;

    public deu() {
        this.a = 1000;
        this.b = 100000;
        this.c = 0;
        this.d = null;
        this.e = "";
        this.f = 0;
        this.n = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.c != 0) {
            def.b(3, this.c);
        }
        if (this.d != null) {
            def.a(4, this.d);
        }
        if (!this.e.equals("")) {
            def.a(5, this.e);
        }
        if (this.f != 0) {
            def.b(6, this.f);
        }
        if (this.a != 1000) {
            def.a(7, this.a);
        }
        if (this.b != 100000) {
            def.a(8, this.b);
        }
        super.a(def);
    }

    protected final int a() {
        int a = super.a();
        if (this.c != 0) {
            a += def.e(3, this.c);
        }
        if (this.d != null) {
            a += def.b(4, this.d);
        }
        if (!this.e.equals("")) {
            a += def.b(5, this.e);
        }
        if (this.f != 0) {
            a += def.e(6, this.f);
        }
        if (this.a != 1000) {
            a += def.c(7, this.a);
        }
        if (this.b != 100000) {
            return a + def.c(8, this.b);
        }
        return a;
    }

    public final /* synthetic */ dem a(dee dee) {
        while (true) {
            int a = dee.a();
            switch (a) {
                case rl.c /*0*/:
                    break;
                case rk.bP /*24*/:
                    this.c = dee.f();
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new des();
                    }
                    dee.a(this.d);
                    continue;
                case 42:
                    this.e = dee.d();
                    continue;
                case 48:
                    this.f = dee.f();
                    continue;
                case 56:
                    a = dee.e();
                    switch (a) {
                        case 1000:
                        case 1001:
                        case 1002:
                        case 1003:
                        case 1004:
                        case 1005:
                        case 1006:
                        case 1007:
                        case 1008:
                        case 1009:
                        case 1010:
                        case 1011:
                        case 1012:
                        case 1013:
                        case 1014:
                        case 1015:
                        case 1016:
                        case 1019:
                        case 1020:
                        case 1021:
                        case 1022:
                        case 1024:
                        case 1025:
                        case 1026:
                        case 1027:
                        case 1028:
                        case 1029:
                        case 1030:
                        case 1041:
                        case 1042:
                        case 1043:
                        case 1044:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case 64:
                    a = dee.e();
                    switch (a) {
                        case 100000:
                        case 100001:
                        case 100002:
                        case 100003:
                        case 100004:
                        case 100005:
                        case 100006:
                        case 100007:
                            this.b = a;
                            break;
                        default:
                            continue;
                    }
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
