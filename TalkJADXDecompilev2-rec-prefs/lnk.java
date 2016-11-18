package p000;

import java.util.Arrays;

public final class lnk extends nyx<lnk> {
    public byte[] f25781a;
    public mwb f25782b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29617b(nyt);
    }

    public lnk() {
        m29618d();
    }

    private lnk m29618d() {
        this.f25781a = nzl.h;
        this.f25782b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!Arrays.equals(this.f25781a, nzl.h)) {
            nyu.a(1, this.f25781a);
        }
        if (this.f25782b != null) {
            nyu.b(2, this.f25782b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!Arrays.equals(this.f25781a, nzl.h)) {
            b += nyu.b(1, this.f25781a);
        }
        if (this.f25782b != null) {
            return b + nyu.d(2, this.f25782b);
        }
        return b;
    }

    private lnk m29617b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25781a = nyt.k();
                    continue;
                case wi.dH /*18*/:
                    if (this.f25782b == null) {
                        this.f25782b = new mwb();
                    }
                    nyt.a(this.f25782b);
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
