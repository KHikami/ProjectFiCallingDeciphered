package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class lrz extends nyx<lrz> {
    public Integer f26292a;
    public Long f26293b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30258b(nyt);
    }

    public lrz() {
        m30259d();
    }

    private lrz m30259d() {
        this.f26293b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26292a != null) {
            nyu.a(1, this.f26292a.intValue());
        }
        if (this.f26293b != null) {
            nyu.a(2, this.f26293b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26292a != null) {
            b += nyu.f(1, this.f26292a.intValue());
        }
        if (this.f26293b != null) {
            return b + nyu.e(2, this.f26293b.longValue());
        }
        return b;
    }

    private lrz m30258b(nyt nyt) {
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
                            this.f26292a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f26293b = Long.valueOf(nyt.d());
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
