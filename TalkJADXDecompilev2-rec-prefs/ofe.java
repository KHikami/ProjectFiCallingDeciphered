package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class ofe extends nyx<ofe> {
    public mrk f32623a;
    private int f32624b;
    private boolean f32625c;
    private int f32626d;
    private String f32627e;
    private String f32628f;
    private String f32629g;
    private String f32630h;

    public /* synthetic */ nzf m38054a(nyt nyt) {
        return m38053b(nyt);
    }

    public String m38057d() {
        return this.f32628f;
    }

    public ofe() {
        this.f32624b = 0;
        this.f32625c = false;
        this.f32626d = 0;
        this.f32627e = "";
        this.f32628f = "";
        this.f32629g = "";
        this.f32630h = "";
        this.cachedSize = -1;
    }

    public void m38055a(nyu nyu) {
        if (this.f32623a != null) {
            nyu.m37182b(1, this.f32623a);
        }
        if ((this.f32624b & 1) != 0) {
            nyu.m37172a(2, this.f32625c);
        }
        if ((this.f32624b & 2) != 0) {
            nyu.m37168a(3, this.f32626d);
        }
        if ((this.f32624b & 4) != 0) {
            nyu.m37170a(100, this.f32627e);
        }
        if ((this.f32624b & 8) != 0) {
            nyu.m37170a((int) HttpStatusCodes.STATUS_CODE_OK, this.f32628f);
        }
        if ((this.f32624b & 16) != 0) {
            nyu.m37170a((int) HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES, this.f32629g);
        }
        if ((this.f32624b & 32) != 0) {
            nyu.m37170a(400, this.f32630h);
        }
        super.a(nyu);
    }

    protected int m38056b() {
        int b = super.b();
        if (this.f32623a != null) {
            b += nyu.m37145d(1, this.f32623a);
        }
        if ((this.f32624b & 1) != 0) {
            boolean z = this.f32625c;
            b += nyu.m37154h(2) + 1;
        }
        if ((this.f32624b & 2) != 0) {
            b += nyu.m37147f(3, this.f32626d);
        }
        if ((this.f32624b & 4) != 0) {
            b += nyu.m37137b(100, this.f32627e);
        }
        if ((this.f32624b & 8) != 0) {
            b += nyu.m37137b((int) HttpStatusCodes.STATUS_CODE_OK, this.f32628f);
        }
        if ((this.f32624b & 16) != 0) {
            b += nyu.m37137b((int) HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES, this.f32629g);
        }
        if ((this.f32624b & 32) != 0) {
            return b + nyu.m37137b(400, this.f32630h);
        }
        return b;
    }

    private ofe m38053b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32623a == null) {
                        this.f32623a = new mrk();
                    }
                    nyt.m37101a(this.f32623a);
                    continue;
                case 16:
                    this.f32625c = nyt.m37116i();
                    this.f32624b |= 1;
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f32626d = a;
                            this.f32624b |= 2;
                            break;
                        default:
                            continue;
                    }
                case 802:
                    this.f32627e = nyt.m37117j();
                    this.f32624b |= 4;
                    continue;
                case 1602:
                    this.f32628f = nyt.m37117j();
                    this.f32624b |= 8;
                    continue;
                case 2402:
                    this.f32629g = nyt.m37117j();
                    this.f32624b |= 16;
                    continue;
                case 3202:
                    this.f32630h = nyt.m37117j();
                    this.f32624b |= 32;
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
