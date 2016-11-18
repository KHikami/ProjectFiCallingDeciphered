package defpackage;

import com.google.api.client.http.HttpStatusCodes;

public final class oct extends nyx<oct> {
    public static final nyy<Object, oct> a = nyy.a(11, oct.class, 367806914);
    private static final oct[] e = new oct[0];
    public String b;
    public ocs[] c;
    public int d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oct() {
        this.b = null;
        this.c = ocs.d();
        this.d = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.d != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.d);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.d != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.d);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c == null || this.c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.c) {
            if (nzf != null) {
                i += nyu.d(3, nzf);
            }
        }
        return i;
    }

    private oct b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 400:
                        case HttpStatusCodes.STATUS_CODE_FORBIDDEN /*403*/:
                        case HttpStatusCodes.STATUS_CODE_NOT_FOUND /*404*/:
                        case HttpStatusCodes.STATUS_CODE_CONFLICT /*409*/:
                        case 410:
                        case 412:
                        case 500:
                        case HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE /*503*/:
                            this.d = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    Object obj = new ocs[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ocs();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ocs();
                    nyt.a(obj[a]);
                    this.c = obj;
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
