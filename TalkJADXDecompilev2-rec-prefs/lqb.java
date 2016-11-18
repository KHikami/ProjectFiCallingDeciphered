package p000;

public final class lqb extends nyx<lqb> {
    public Integer f26056a;
    public Integer f26057b;
    public String[] f26058c;
    public Integer f26059d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29996b(nyt);
    }

    public lqb() {
        m29997d();
    }

    private lqb m29997d() {
        this.f26056a = null;
        this.f26057b = null;
        this.f26058c = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26056a != null) {
            nyu.a(1, this.f26056a.intValue());
        }
        if (this.f26057b != null) {
            nyu.a(2, this.f26057b.intValue());
        }
        if (this.f26058c != null && this.f26058c.length > 0) {
            for (String str : this.f26058c) {
                if (str != null) {
                    nyu.a(3, str);
                }
            }
        }
        if (this.f26059d != null) {
            nyu.a(4, this.f26059d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f26056a != null) {
            b += nyu.f(1, this.f26056a.intValue());
        }
        if (this.f26057b != null) {
            b += nyu.f(2, this.f26057b.intValue());
        }
        if (this.f26058c != null && this.f26058c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f26058c.length) {
                String str = this.f26058c[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f26059d != null) {
            return b + nyu.f(4, this.f26059d.intValue());
        }
        return b;
    }

    private lqb m29996b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26056a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f26057b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    a = this.f26058c == null ? 0 : this.f26058c.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26058c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f26058c = obj;
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f26059d = Integer.valueOf(a);
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
