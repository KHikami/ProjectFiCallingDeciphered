package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class nuv extends nyx<nuv> {
    private static volatile nuv[] f31032g;
    public Integer f31033a;
    public Float f31034b;
    public Integer f31035c;
    public Float f31036d;
    public Float f31037e;
    public int f31038f;

    public /* synthetic */ nzf m36653a(nyt nyt) {
        return m36651b(nyt);
    }

    public static nuv[] m36652d() {
        if (f31032g == null) {
            synchronized (nzc.f31309c) {
                if (f31032g == null) {
                    f31032g = new nuv[0];
                }
            }
        }
        return f31032g;
    }

    public nuv() {
        this.f31033a = null;
        this.f31034b = null;
        this.f31035c = null;
        this.f31036d = null;
        this.f31037e = null;
        this.f31038f = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m36654a(nyu nyu) {
        if (this.f31033a != null) {
            nyu.m37168a(1, this.f31033a.intValue());
        }
        if (this.f31035c != null) {
            nyu.m37168a(2, this.f31035c.intValue());
        }
        if (this.f31037e != null) {
            nyu.m37167a(3, this.f31037e.floatValue());
        }
        if (this.f31038f != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(4, this.f31038f);
        }
        if (this.f31034b != null) {
            nyu.m37167a(5, this.f31034b.floatValue());
        }
        if (this.f31036d != null) {
            nyu.m37167a(6, this.f31036d.floatValue());
        }
        super.a(nyu);
    }

    protected int m36655b() {
        int b = super.b();
        if (this.f31033a != null) {
            b += nyu.m37147f(1, this.f31033a.intValue());
        }
        if (this.f31035c != null) {
            b += nyu.m37147f(2, this.f31035c.intValue());
        }
        if (this.f31037e != null) {
            this.f31037e.floatValue();
            b += nyu.m37154h(3) + 4;
        }
        if (this.f31038f != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(4, this.f31038f);
        }
        if (this.f31034b != null) {
            this.f31034b.floatValue();
            b += nyu.m37154h(5) + 4;
        }
        if (this.f31036d == null) {
            return b;
        }
        this.f31036d.floatValue();
        return b + (nyu.m37154h(6) + 4);
    }

    private nuv m36651b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f31033a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f31035c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 29:
                    this.f31037e = Float.valueOf(nyt.m37106c());
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
                            this.f31038f = a;
                            break;
                        default:
                            continue;
                    }
                case 45:
                    this.f31034b = Float.valueOf(nyt.m37106c());
                    continue;
                case 53:
                    this.f31036d = Float.valueOf(nyt.m37106c());
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
