package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class oct extends nyx<oct> {
    public static final nyy<Object, oct> f32297a = nyy.m37203a(11, oct.class, 367806914);
    private static final oct[] f32298e = new oct[0];
    public String f32299b;
    public ocs[] f32300c;
    public int f32301d;

    public /* synthetic */ nzf m37788a(nyt nyt) {
        return m37787b(nyt);
    }

    public oct() {
        this.f32299b = null;
        this.f32300c = ocs.m37783d();
        this.f32301d = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m37789a(nyu nyu) {
        if (this.f32301d != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f32301d);
        }
        if (this.f32299b != null) {
            nyu.m37170a(2, this.f32299b);
        }
        if (this.f32300c != null && this.f32300c.length > 0) {
            for (nzf nzf : this.f32300c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m37790b() {
        int b = super.b();
        if (this.f32301d != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f32301d);
        }
        if (this.f32299b != null) {
            b += nyu.m37137b(2, this.f32299b);
        }
        if (this.f32300c == null || this.f32300c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f32300c) {
            if (nzf != null) {
                i += nyu.m37145d(3, nzf);
            }
        }
        return i;
    }

    private oct m37787b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 400:
                        case HttpStatusCodes.STATUS_CODE_FORBIDDEN /*403*/:
                        case HttpStatusCodes.STATUS_CODE_NOT_FOUND /*404*/:
                        case HttpStatusCodes.STATUS_CODE_CONFLICT /*409*/:
                        case 410:
                        case 412:
                        case 500:
                        case HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE /*503*/:
                            this.f32301d = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f32299b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f32300c == null) {
                        a = 0;
                    } else {
                        a = this.f32300c.length;
                    }
                    Object obj = new ocs[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32300c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ocs();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ocs();
                    nyt.m37101a(obj[a]);
                    this.f32300c = obj;
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
