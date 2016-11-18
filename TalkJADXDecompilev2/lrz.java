package defpackage;

import com.google.api.client.http.HttpStatusCodes;

public final class lrz extends nyx<lrz> {
    public Integer a;
    public Long b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lrz() {
        d();
    }

    private lrz d() {
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            return b + nyu.e(2, this.b.longValue());
        }
        return b;
    }

    private lrz b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 100:
                        case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.b = Long.valueOf(nyt.d());
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
