package p000;

public final class gfw extends nzf {
    public gfx[] f15187a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m17575b(nyt);
    }

    public gfw() {
        m17576d();
    }

    private gfw m17576d() {
        this.f15187a = gfx.m17581d();
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f15187a != null && this.f15187a.length > 0) {
            for (nzf nzf : this.f15187a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f15187a != null && this.f15187a.length > 0) {
            for (nzf nzf : this.f15187a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private gfw m17575b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f15187a == null) {
                        a = 0;
                    } else {
                        a = this.f15187a.length;
                    }
                    Object obj = new gfx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f15187a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new gfx();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new gfx();
                    nyt.a(obj[a]);
                    this.f15187a = obj;
                    continue;
                default:
                    if (!nyt.b(a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
