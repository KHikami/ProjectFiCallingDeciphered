package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class oyf extends nyx<oyf> {
    private static volatile oyf[] f34623d;
    public oyh f34624a;
    public oyi f34625b;
    public Integer f34626c;

    public /* synthetic */ nzf m39891a(nyt nyt) {
        return m39888b(nyt);
    }

    public static oyf[] m39889d() {
        if (f34623d == null) {
            synchronized (nzc.f31309c) {
                if (f34623d == null) {
                    f34623d = new oyf[0];
                }
            }
        }
        return f34623d;
    }

    public oyf() {
        m39890g();
    }

    private oyf m39890g() {
        this.f34624a = null;
        this.f34625b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39892a(nyu nyu) {
        if (this.f34624a != null) {
            nyu.m37182b(1, this.f34624a);
        }
        if (this.f34626c != null) {
            nyu.m37168a(2, this.f34626c.intValue());
        }
        if (this.f34625b != null) {
            nyu.m37182b(3, this.f34625b);
        }
        super.a(nyu);
    }

    protected int m39893b() {
        int b = super.b();
        if (this.f34624a != null) {
            b += nyu.m37145d(1, this.f34624a);
        }
        if (this.f34626c != null) {
            b += nyu.m37147f(2, this.f34626c.intValue());
        }
        if (this.f34625b != null) {
            return b + nyu.m37145d(3, this.f34625b);
        }
        return b;
    }

    private oyf m39888b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34624a == null) {
                        this.f34624a = new oyh();
                    }
                    nyt.m37101a(this.f34624a);
                    continue;
                case 16:
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
                        case 312:
                        case 314:
                        case 315:
                        case 316:
                        case 15000:
                            this.f34626c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f34625b == null) {
                        this.f34625b = new oyi();
                    }
                    nyt.m37101a(this.f34625b);
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
