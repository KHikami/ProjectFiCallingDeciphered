package p000;

import java.util.Arrays;

public final class lnn extends nyx<lnn> {
    public String f25790a;
    public String f25791b;
    public byte[] f25792c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29632b(nyt);
    }

    public lnn() {
        m29633d();
    }

    private lnn m29633d() {
        this.f25790a = "";
        this.f25791b = "";
        this.f25792c = nzl.h;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f25790a == null || this.f25790a.equals(""))) {
            nyu.a(1, this.f25790a);
        }
        if (!(this.f25791b == null || this.f25791b.equals(""))) {
            nyu.a(2, this.f25791b);
        }
        if (!Arrays.equals(this.f25792c, nzl.h)) {
            nyu.a(3, this.f25792c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!(this.f25790a == null || this.f25790a.equals(""))) {
            b += nyu.b(1, this.f25790a);
        }
        if (!(this.f25791b == null || this.f25791b.equals(""))) {
            b += nyu.b(2, this.f25791b);
        }
        if (Arrays.equals(this.f25792c, nzl.h)) {
            return b;
        }
        return b + nyu.b(3, this.f25792c);
    }

    private lnn m29632b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25790a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f25791b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f25792c = nyt.k();
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
