package p000;

public final class bbj extends nyx<bbj> {
    public lna[] f2846a;
    public Integer f2847b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m4742b(nyt);
    }

    public bbj() {
        this.f2846a = lna.m29570d();
        this.f2847b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f2846a != null && this.f2846a.length > 0) {
            for (nzf nzf : this.f2846a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f2847b != null) {
            nyu.a(2, this.f2847b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f2846a != null && this.f2846a.length > 0) {
            for (nzf nzf : this.f2846a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f2847b != null) {
            return b + nyu.f(2, this.f2847b.intValue());
        }
        return b;
    }

    private bbj m4742b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f2846a == null) {
                        a = 0;
                    } else {
                        a = this.f2846a.length;
                    }
                    Object obj = new lna[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f2846a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lna();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lna();
                    nyt.a(obj[a]);
                    this.f2846a = obj;
                    continue;
                case 16:
                    this.f2847b = Integer.valueOf(nyt.f());
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
