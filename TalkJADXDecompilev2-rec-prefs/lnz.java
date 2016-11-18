package p000;

public final class lnz extends nyx<lnz> {
    public loa[] f25841a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29695b(nyt);
    }

    public lnz() {
        m29696d();
    }

    private lnz m29696d() {
        this.f25841a = loa.m29701d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25841a != null && this.f25841a.length > 0) {
            for (nzf nzf : this.f25841a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25841a != null && this.f25841a.length > 0) {
            for (nzf nzf : this.f25841a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private lnz m29695b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f25841a == null) {
                        a = 0;
                    } else {
                        a = this.f25841a.length;
                    }
                    Object obj = new loa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25841a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new loa();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new loa();
                    nyt.a(obj[a]);
                    this.f25841a = obj;
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
