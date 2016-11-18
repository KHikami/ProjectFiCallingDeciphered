package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class lry extends nyx<lry> {
    public Integer f26291a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30253b(nyt);
    }

    public lry() {
        m30254d();
    }

    private lry m30254d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26291a != null) {
            nyu.a(1, this.f26291a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26291a != null) {
            return b + nyu.f(1, this.f26291a.intValue());
        }
        return b;
    }

    private lry m30253b(nyt nyt) {
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
                            this.f26291a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
