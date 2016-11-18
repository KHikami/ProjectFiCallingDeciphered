package defpackage;

import com.google.api.client.http.HttpStatusCodes;

public final class odg extends nyx<odg> {
    private static volatile odg[] d;
    public odi a;
    public odj b;
    public int c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static odg[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new odg[0];
                }
            }
        }
        return d;
    }

    public odg() {
        this.c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.c);
        }
        if (this.b != null) {
            nyu.b(3, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.c);
        }
        if (this.b != null) {
            return b + nyu.d(3, this.b);
        }
        return b;
    }

    private odg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new odi();
                    }
                    nyt.a(this.a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 43:
                        case 44:
                        case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                        case 220:
                        case 221:
                        case 222:
                        case 223:
                        case 224:
                        case 225:
                        case 226:
                        case 227:
                        case 238:
                        case 239:
                        case 240:
                        case 241:
                        case HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES /*300*/:
                        case HttpStatusCodes.STATUS_CODE_FOUND /*302*/:
                        case 312:
                        case 314:
                        case 315:
                        case 316:
                        case 15000:
                            this.c = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.b == null) {
                        this.b = new odj();
                    }
                    nyt.a(this.b);
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
