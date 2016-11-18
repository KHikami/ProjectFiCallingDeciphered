package p000;

public final class kqq extends nyx<kqq> {
    public Integer f22797a;
    public String[] f22798b;
    public kqs f22799c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27091b(nyt);
    }

    public kqq() {
        m27092d();
    }

    private kqq m27092d() {
        this.f22798b = nzl.f;
        this.f22799c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22797a != null) {
            nyu.a(1, this.f22797a.intValue());
        }
        if (this.f22798b != null && this.f22798b.length > 0) {
            for (String str : this.f22798b) {
                if (str != null) {
                    nyu.a(2, str);
                }
            }
        }
        if (this.f22799c != null) {
            nyu.b(3, this.f22799c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f22797a != null) {
            b += nyu.f(1, this.f22797a.intValue());
        }
        if (this.f22798b != null && this.f22798b.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f22798b.length) {
                String str = this.f22798b[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f22799c != null) {
            return b + nyu.d(3, this.f22799c);
        }
        return b;
    }

    private kqq m27091b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f22797a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    a = this.f22798b == null ? 0 : this.f22798b.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22798b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f22798b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f22799c == null) {
                        this.f22799c = new kqs();
                    }
                    nyt.a(this.f22799c);
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
