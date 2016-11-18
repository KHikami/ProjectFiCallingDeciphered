package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class lsa extends nyx<lsa> {
    private static volatile lsa[] f26294d;
    public loe f26295a;
    public Integer f26296b;
    public Long f26297c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30265b(nyt);
    }

    public static lsa[] m30266d() {
        if (f26294d == null) {
            synchronized (nzc.c) {
                if (f26294d == null) {
                    f26294d = new lsa[0];
                }
            }
        }
        return f26294d;
    }

    public lsa() {
        m30267g();
    }

    private lsa m30267g() {
        this.f26295a = null;
        this.f26297c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26295a != null) {
            nyu.b(1, this.f26295a);
        }
        if (this.f26296b != null) {
            nyu.a(2, this.f26296b.intValue());
        }
        if (this.f26297c != null) {
            nyu.a(3, this.f26297c.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26295a != null) {
            b += nyu.d(1, this.f26295a);
        }
        if (this.f26296b != null) {
            b += nyu.f(2, this.f26296b.intValue());
        }
        if (this.f26297c != null) {
            return b + nyu.e(3, this.f26297c.longValue());
        }
        return b;
    }

    private lsa m30265b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26295a == null) {
                        this.f26295a = new loe();
                    }
                    nyt.a(this.f26295a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 100:
                        case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                            this.f26296b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f26297c = Long.valueOf(nyt.d());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
