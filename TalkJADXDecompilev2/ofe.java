package defpackage;

import com.google.api.client.http.HttpStatusCodes;

public final class ofe extends nyx<ofe> {
    public mrk a;
    private int b;
    private boolean c;
    private int d;
    private String e;
    private String f;
    private String g;
    private String h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public String d() {
        return this.f;
    }

    public ofe() {
        this.b = 0;
        this.c = false;
        this.d = 0;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if ((this.b & 1) != 0) {
            nyu.a(2, this.c);
        }
        if ((this.b & 2) != 0) {
            nyu.a(3, this.d);
        }
        if ((this.b & 4) != 0) {
            nyu.a(100, this.e);
        }
        if ((this.b & 8) != 0) {
            nyu.a((int) HttpStatusCodes.STATUS_CODE_OK, this.f);
        }
        if ((this.b & 16) != 0) {
            nyu.a((int) HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES, this.g);
        }
        if ((this.b & 32) != 0) {
            nyu.a(400, this.h);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if ((this.b & 1) != 0) {
            boolean z = this.c;
            b += nyu.h(2) + 1;
        }
        if ((this.b & 2) != 0) {
            b += nyu.f(3, this.d);
        }
        if ((this.b & 4) != 0) {
            b += nyu.b(100, this.e);
        }
        if ((this.b & 8) != 0) {
            b += nyu.b((int) HttpStatusCodes.STATUS_CODE_OK, this.f);
        }
        if ((this.b & 16) != 0) {
            b += nyu.b((int) HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES, this.g);
        }
        if ((this.b & 32) != 0) {
            return b + nyu.b(400, this.h);
        }
        return b;
    }

    private ofe b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new mrk();
                    }
                    nyt.a(this.a);
                    continue;
                case 16:
                    this.c = nyt.i();
                    this.b |= 1;
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.d = a;
                            this.b |= 2;
                            break;
                        default:
                            continue;
                    }
                case 802:
                    this.e = nyt.j();
                    this.b |= 4;
                    continue;
                case 1602:
                    this.f = nyt.j();
                    this.b |= 8;
                    continue;
                case 2402:
                    this.g = nyt.j();
                    this.b |= 16;
                    continue;
                case 3202:
                    this.h = nyt.j();
                    this.b |= 32;
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
