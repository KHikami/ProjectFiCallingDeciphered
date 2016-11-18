package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class nva extends nyx<nva> {
    private static volatile nva[] f31093g;
    public Integer f31094a;
    public Float f31095b;
    public Integer f31096c;
    public Float f31097d;
    public Float f31098e;
    public Integer f31099f;

    public /* synthetic */ nzf m36679a(nyt nyt) {
        return m36676b(nyt);
    }

    public static nva[] m36677d() {
        if (f31093g == null) {
            synchronized (nzc.f31309c) {
                if (f31093g == null) {
                    f31093g = new nva[0];
                }
            }
        }
        return f31093g;
    }

    public nva() {
        m36678g();
    }

    private nva m36678g() {
        this.f31094a = null;
        this.f31095b = null;
        this.f31096c = null;
        this.f31097d = null;
        this.f31098e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36680a(nyu nyu) {
        if (this.f31094a != null) {
            nyu.m37168a(1, this.f31094a.intValue());
        }
        if (this.f31096c != null) {
            nyu.m37168a(2, this.f31096c.intValue());
        }
        if (this.f31098e != null) {
            nyu.m37167a(3, this.f31098e.floatValue());
        }
        if (this.f31099f != null) {
            nyu.m37168a(4, this.f31099f.intValue());
        }
        if (this.f31095b != null) {
            nyu.m37167a(5, this.f31095b.floatValue());
        }
        if (this.f31097d != null) {
            nyu.m37167a(6, this.f31097d.floatValue());
        }
        super.a(nyu);
    }

    protected int m36681b() {
        int b = super.b();
        if (this.f31094a != null) {
            b += nyu.m37147f(1, this.f31094a.intValue());
        }
        if (this.f31096c != null) {
            b += nyu.m37147f(2, this.f31096c.intValue());
        }
        if (this.f31098e != null) {
            this.f31098e.floatValue();
            b += nyu.m37154h(3) + 4;
        }
        if (this.f31099f != null) {
            b += nyu.m37147f(4, this.f31099f.intValue());
        }
        if (this.f31095b != null) {
            this.f31095b.floatValue();
            b += nyu.m37154h(5) + 4;
        }
        if (this.f31097d == null) {
            return b;
        }
        this.f31097d.floatValue();
        return b + (nyu.m37154h(6) + 4);
    }

    private nva m36676b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f31094a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f31096c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 29:
                    this.f31098e = Float.valueOf(nyt.m37106c());
                    continue;
                case 32:
                    a = nyt.m37112f();
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
                            this.f31099f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 45:
                    this.f31095b = Float.valueOf(nyt.m37106c());
                    continue;
                case 53:
                    this.f31097d = Float.valueOf(nyt.m37106c());
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
