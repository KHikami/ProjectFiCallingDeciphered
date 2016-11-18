package defpackage;

import com.google.api.client.http.HttpStatusCodes;

public final class nva extends nyx<nva> {
    private static volatile nva[] g;
    public Integer a;
    public Float b;
    public Integer c;
    public Float d;
    public Float e;
    public Integer f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nva[] d() {
        if (g == null) {
            synchronized (nzc.c) {
                if (g == null) {
                    g = new nva[0];
                }
            }
        }
        return g;
    }

    public nva() {
        g();
    }

    private nva g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.c != null) {
            nyu.a(2, this.c.intValue());
        }
        if (this.e != null) {
            nyu.a(3, this.e.floatValue());
        }
        if (this.f != null) {
            nyu.a(4, this.f.intValue());
        }
        if (this.b != null) {
            nyu.a(5, this.b.floatValue());
        }
        if (this.d != null) {
            nyu.a(6, this.d.floatValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.c != null) {
            b += nyu.f(2, this.c.intValue());
        }
        if (this.e != null) {
            this.e.floatValue();
            b += nyu.h(3) + 4;
        }
        if (this.f != null) {
            b += nyu.f(4, this.f.intValue());
        }
        if (this.b != null) {
            this.b.floatValue();
            b += nyu.h(5) + 4;
        }
        if (this.d == null) {
            return b;
        }
        this.d.floatValue();
        return b + (nyu.h(6) + 4);
    }

    private nva b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 29:
                    this.e = Float.valueOf(nyt.c());
                    continue;
                case 32:
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
                        case HttpStatusCodes.STATUS_CODE_NOT_MODIFIED /*304*/:
                        case 305:
                        case 312:
                        case 314:
                        case 315:
                        case 316:
                        case 15000:
                            this.f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 45:
                    this.b = Float.valueOf(nyt.c());
                    continue;
                case 53:
                    this.d = Float.valueOf(nyt.c());
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
