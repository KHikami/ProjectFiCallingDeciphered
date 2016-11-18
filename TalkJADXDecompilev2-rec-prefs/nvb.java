package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class nvb extends nyx<nvb> {
    private static volatile nvb[] f31100g;
    public Integer f31101a;
    public Float f31102b;
    public Integer f31103c;
    public Float f31104d;
    public Float f31105e;
    public Integer f31106f;

    public /* synthetic */ nzf m36685a(nyt nyt) {
        return m36682b(nyt);
    }

    public static nvb[] m36683d() {
        if (f31100g == null) {
            synchronized (nzc.f31309c) {
                if (f31100g == null) {
                    f31100g = new nvb[0];
                }
            }
        }
        return f31100g;
    }

    public nvb() {
        m36684g();
    }

    private nvb m36684g() {
        this.f31101a = null;
        this.f31102b = null;
        this.f31103c = null;
        this.f31104d = null;
        this.f31105e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36686a(nyu nyu) {
        nyu.m37168a(1, this.f31101a.intValue());
        nyu.m37168a(2, this.f31103c.intValue());
        nyu.m37168a(3, this.f31106f.intValue());
        if (this.f31105e != null) {
            nyu.m37167a(4, this.f31105e.floatValue());
        }
        if (this.f31102b != null) {
            nyu.m37167a(5, this.f31102b.floatValue());
        }
        if (this.f31104d != null) {
            nyu.m37167a(6, this.f31104d.floatValue());
        }
        super.a(nyu);
    }

    protected int m36687b() {
        int b = ((super.b() + nyu.m37147f(1, this.f31101a.intValue())) + nyu.m37147f(2, this.f31103c.intValue())) + nyu.m37147f(3, this.f31106f.intValue());
        if (this.f31105e != null) {
            this.f31105e.floatValue();
            b += nyu.m37154h(4) + 4;
        }
        if (this.f31102b != null) {
            this.f31102b.floatValue();
            b += nyu.m37154h(5) + 4;
        }
        if (this.f31104d == null) {
            return b;
        }
        this.f31104d.floatValue();
        return b + (nyu.m37154h(6) + 4);
    }

    private nvb m36682b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f31101a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f31103c = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 43:
                        case 44:
                        case 45:
                        case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                        case 220:
                        case 221:
                        case 222:
                        case 223:
                        case 224:
                        case 225:
                        case 226:
                        case 227:
                        case 240:
                        case 241:
                        case HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES /*300*/:
                        case HttpStatusCodes.STATUS_CODE_FOUND /*302*/:
                        case 312:
                        case 314:
                        case 315:
                        case 316:
                        case 15000:
                            this.f31106f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 37:
                    this.f31105e = Float.valueOf(nyt.m37106c());
                    continue;
                case 45:
                    this.f31102b = Float.valueOf(nyt.m37106c());
                    continue;
                case 53:
                    this.f31104d = Float.valueOf(nyt.m37106c());
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
