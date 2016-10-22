/* compiled from: PG */
public final class deq extends deh {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public der g;
    public des h;
    public String i;
    public boolean j;
    public int[] k;

    public final /* synthetic */ dem a(dee dee) {
        while (true) {
            int a = dee.a();
            int i;
            int i2;
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
                        case rl.e /*3*/:
                        case rl.f /*4*/:
                        case rl.g /*5*/:
                        case rl.i /*6*/:
                        case rl.h /*7*/:
                        case rl.j /*8*/:
                        case rl.l /*9*/:
                        case rl.m /*10*/:
                        case rl.n /*11*/:
                        case rl.k /*12*/:
                            this.b = a;
                            break;
                        default:
                            continue;
                    }
                case rk.bP /*24*/:
                    a = dee.e();
                    switch (a) {
                        case rl.c /*0*/:
                        case rq.b /*1*/:
                        case rq.c /*2*/:
                        case rl.e /*3*/:
                        case rl.f /*4*/:
                        case rl.g /*5*/:
                        case rl.i /*6*/:
                            this.c = a;
                            break;
                        default:
                            continue;
                    }
                case 32:
                    this.d = dee.e();
                    continue;
                case 40:
                    this.e = dee.e();
                    continue;
                case 48:
                    this.f = dee.e();
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new der();
                    }
                    dee.a(this.g);
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new des();
                    }
                    dee.a(this.h);
                    continue;
                case 74:
                    this.i = dee.d();
                    continue;
                case 80:
                    this.j = dee.c();
                    continue;
                case 88:
                    int b = dep.b(dee, 88);
                    Object obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            dee.a();
                        }
                        int e = dee.e();
                        switch (e) {
                            case rl.c /*0*/:
                            case rq.b /*1*/:
                            case rq.c /*2*/:
                            case rl.e /*3*/:
                                a = i2 + 1;
                                obj[i2] = e;
                                break;
                            default:
                                a = i2;
                                break;
                        }
                        i++;
                        i2 = a;
                    }
                    if (i2 != 0) {
                        a = this.k == null ? 0 : this.k.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.k, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.k = obj2;
                            break;
                        }
                        this.k = obj;
                        break;
                    }
                    continue;
                case 90:
                    i = dee.b(dee.e());
                    i2 = dee.j();
                    a = 0;
                    while (dee.i() > 0) {
                        switch (dee.e()) {
                            case rl.c /*0*/:
                            case rq.b /*1*/:
                            case rq.c /*2*/:
                            case rl.e /*3*/:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        dee.d(i2);
                        if (this.k == null) {
                            i2 = 0;
                        } else {
                            i2 = this.k.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.k, 0, obj3, 0, i2);
                        }
                        while (dee.i() > 0) {
                            int e2 = dee.e();
                            switch (e2) {
                                case rl.c /*0*/:
                                case rq.b /*1*/:
                                case rq.c /*2*/:
                                case rl.e /*3*/:
                                    a = i2 + 1;
                                    obj3[i2] = e2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.k = obj3;
                    }
                    dee.c(i);
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

    public deq() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = null;
        this.i = "";
        this.j = false;
        this.k = dep.a;
        this.n = null;
        this.r = -1;
    }

    public final void a(def def) {
        if (this.a != 0) {
            def.a(1, this.a);
        }
        if (this.b != 0) {
            def.a(2, this.b);
        }
        if (this.c != 0) {
            def.a(3, this.c);
        }
        if (this.d != 0) {
            def.a(4, this.d);
        }
        if (this.e != 0) {
            def.a(5, this.e);
        }
        if (this.f != 0) {
            def.a(6, this.f);
        }
        if (this.g != null) {
            def.a(7, this.g);
        }
        if (this.h != null) {
            def.a(8, this.h);
        }
        if (!this.i.equals("")) {
            def.a(9, this.i);
        }
        if (this.j) {
            def.a(10, this.j);
        }
        if (this.k != null && this.k.length > 0) {
            for (int a : this.k) {
                def.a(11, a);
            }
        }
        super.a(def);
    }

    protected final int a() {
        int i = 0;
        int a = super.a();
        if (this.a != 0) {
            a += def.c(1, this.a);
        }
        if (this.b != 0) {
            a += def.c(2, this.b);
        }
        if (this.c != 0) {
            a += def.c(3, this.c);
        }
        if (this.d != 0) {
            a += def.c(4, this.d);
        }
        if (this.e != 0) {
            a += def.c(5, this.e);
        }
        if (this.f != 0) {
            a += def.c(6, this.f);
        }
        if (this.g != null) {
            a += def.b(7, this.g);
        }
        if (this.h != null) {
            a += def.b(8, this.h);
        }
        if (!this.i.equals("")) {
            a += def.b(9, this.i);
        }
        if (this.j) {
            boolean z = this.j;
            a += def.b(10) + 1;
        }
        if (this.k == null || this.k.length <= 0) {
            return a;
        }
        int i2 = 0;
        while (i < this.k.length) {
            i2 += def.a(this.k[i]);
            i++;
        }
        return (a + i2) + (this.k.length * 1);
    }
}
