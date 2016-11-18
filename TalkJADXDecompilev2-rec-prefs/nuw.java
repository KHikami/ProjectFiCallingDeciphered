package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class nuw extends nyx<nuw> {
    private static volatile nuw[] f31039g;
    public Integer f31040a;
    public Float f31041b;
    public Integer f31042c;
    public Float f31043d;
    public Float f31044e;
    public int f31045f;

    public /* synthetic */ nzf m36658a(nyt nyt) {
        return m36656b(nyt);
    }

    public static nuw[] m36657d() {
        if (f31039g == null) {
            synchronized (nzc.f31309c) {
                if (f31039g == null) {
                    f31039g = new nuw[0];
                }
            }
        }
        return f31039g;
    }

    public nuw() {
        this.f31040a = null;
        this.f31041b = null;
        this.f31042c = null;
        this.f31043d = null;
        this.f31044e = null;
        this.f31045f = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m36659a(nyu nyu) {
        nyu.m37168a(1, this.f31040a.intValue());
        nyu.m37168a(2, this.f31042c.intValue());
        nyu.m37168a(3, this.f31045f);
        if (this.f31044e != null) {
            nyu.m37167a(4, this.f31044e.floatValue());
        }
        if (this.f31041b != null) {
            nyu.m37167a(5, this.f31041b.floatValue());
        }
        if (this.f31043d != null) {
            nyu.m37167a(6, this.f31043d.floatValue());
        }
        super.a(nyu);
    }

    protected int m36660b() {
        int b = ((super.b() + nyu.m37147f(1, this.f31040a.intValue())) + nyu.m37147f(2, this.f31042c.intValue())) + nyu.m37147f(3, this.f31045f);
        if (this.f31044e != null) {
            this.f31044e.floatValue();
            b += nyu.m37154h(4) + 4;
        }
        if (this.f31041b != null) {
            this.f31041b.floatValue();
            b += nyu.m37154h(5) + 4;
        }
        if (this.f31043d == null) {
            return b;
        }
        this.f31043d.floatValue();
        return b + (nyu.m37154h(6) + 4);
    }

    private nuw m36656b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f31040a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f31042c = Integer.valueOf(nyt.m37112f());
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
                            this.f31045f = a;
                            break;
                        default:
                            continue;
                    }
                case 37:
                    this.f31044e = Float.valueOf(nyt.m37106c());
                    continue;
                case 45:
                    this.f31041b = Float.valueOf(nyt.m37106c());
                    continue;
                case 53:
                    this.f31043d = Float.valueOf(nyt.m37106c());
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
