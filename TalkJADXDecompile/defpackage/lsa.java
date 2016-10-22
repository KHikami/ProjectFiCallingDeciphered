package defpackage;

import com.google.api.client.http.HttpStatusCodes;
import nyt;
import nyu;
import nzc;

/* renamed from: lsa */
public final class lsa extends nyx<lsa> {
    private static volatile lsa[] d;
    public loe a;
    public Integer b;
    public Long c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lsa[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new lsa[0];
                }
            }
        }
        return d;
    }

    public lsa() {
        g();
    }

    private lsa g() {
        this.a = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null) {
            return b + nyu.e(3, this.c.longValue());
        }
        return b;
    }

    private lsa b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new loe();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dI /*16*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case 100:
                        case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.d());
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
