package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class ojd extends nyx<ojd> {
    public static final nyy<ozo, ojd> f33070a = nyy.m37203a(11, ojd.class, 367806914);
    private static final ojd[] f33071e = new ojd[0];
    public String f33072b;
    public ojc[] f33073c;
    public Integer f33074d;

    public /* synthetic */ nzf m38542a(nyt nyt) {
        return m38540b(nyt);
    }

    public ojd() {
        m38541d();
    }

    private ojd m38541d() {
        this.f33072b = null;
        this.f33073c = ojc.m38535d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38543a(nyu nyu) {
        if (this.f33074d != null) {
            nyu.m37168a(1, this.f33074d.intValue());
        }
        if (this.f33072b != null) {
            nyu.m37170a(2, this.f33072b);
        }
        if (this.f33073c != null && this.f33073c.length > 0) {
            for (nzf nzf : this.f33073c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m38544b() {
        int b = super.b();
        if (this.f33074d != null) {
            b += nyu.m37147f(1, this.f33074d.intValue());
        }
        if (this.f33072b != null) {
            b += nyu.m37137b(2, this.f33072b);
        }
        if (this.f33073c == null || this.f33073c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f33073c) {
            if (nzf != null) {
                i += nyu.m37145d(3, nzf);
            }
        }
        return i;
    }

    private ojd m38540b(nyt nyt) {
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
                            this.f33074d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f33072b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f33073c == null) {
                        a = 0;
                    } else {
                        a = this.f33073c.length;
                    }
                    Object obj = new ojc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33073c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ojc();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ojc();
                    nyt.m37101a(obj[a]);
                    this.f33073c = obj;
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
