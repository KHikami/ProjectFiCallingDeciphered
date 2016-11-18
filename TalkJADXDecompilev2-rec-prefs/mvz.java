package p000;

import java.util.Arrays;

public final class mvz extends nyx<mvz> {
    public String f28536a;
    public byte[] f28537b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33161b(nyt);
    }

    public mvz() {
        m33162d();
    }

    private mvz m33162d() {
        this.f28536a = "";
        this.f28537b = nzl.h;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f28536a == null || this.f28536a.equals(""))) {
            nyu.a(1, this.f28536a);
        }
        if (!Arrays.equals(this.f28537b, nzl.h)) {
            nyu.a(2, this.f28537b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!(this.f28536a == null || this.f28536a.equals(""))) {
            b += nyu.b(1, this.f28536a);
        }
        if (Arrays.equals(this.f28537b, nzl.h)) {
            return b;
        }
        return b + nyu.b(2, this.f28537b);
    }

    private mvz m33161b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28536a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f28537b = nyt.k();
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
