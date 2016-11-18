package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class odg extends nyx<odg> {
    private static volatile odg[] f32407d;
    public odi f32408a;
    public odj f32409b;
    public int f32410c;

    public /* synthetic */ nzf m37845a(nyt nyt) {
        return m37843b(nyt);
    }

    public static odg[] m37844d() {
        if (f32407d == null) {
            synchronized (nzc.f31309c) {
                if (f32407d == null) {
                    f32407d = new odg[0];
                }
            }
        }
        return f32407d;
    }

    public odg() {
        this.f32410c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m37846a(nyu nyu) {
        if (this.f32408a != null) {
            nyu.m37182b(1, this.f32408a);
        }
        if (this.f32410c != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f32410c);
        }
        if (this.f32409b != null) {
            nyu.m37182b(3, this.f32409b);
        }
        super.a(nyu);
    }

    protected int m37847b() {
        int b = super.b();
        if (this.f32408a != null) {
            b += nyu.m37145d(1, this.f32408a);
        }
        if (this.f32410c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(2, this.f32410c);
        }
        if (this.f32409b != null) {
            return b + nyu.m37145d(3, this.f32409b);
        }
        return b;
    }

    private odg m37843b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32408a == null) {
                        this.f32408a = new odi();
                    }
                    nyt.m37101a(this.f32408a);
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
                            this.f32410c = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f32409b == null) {
                        this.f32409b = new odj();
                    }
                    nyt.m37101a(this.f32409b);
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
