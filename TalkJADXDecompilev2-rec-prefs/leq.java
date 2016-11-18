package p000;

public final class leq extends nyx<leq> {
    public Integer f24856a;
    public String[] f24857b;
    public les f24858c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28910b(nyt);
    }

    public leq() {
        m28911d();
    }

    private leq m28911d() {
        this.f24857b = nzl.f;
        this.f24858c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24856a != null) {
            nyu.a(1, this.f24856a.intValue());
        }
        if (this.f24857b != null && this.f24857b.length > 0) {
            for (String str : this.f24857b) {
                if (str != null) {
                    nyu.a(2, str);
                }
            }
        }
        if (this.f24858c != null) {
            nyu.b(3, this.f24858c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f24856a != null) {
            b += nyu.f(1, this.f24856a.intValue());
        }
        if (this.f24857b != null && this.f24857b.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f24857b.length) {
                String str = this.f24857b[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f24858c != null) {
            return b + nyu.d(3, this.f24858c);
        }
        return b;
    }

    private leq m28910b(nyt nyt) {
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
                            this.f24856a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    a = this.f24857b == null ? 0 : this.f24857b.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24857b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f24857b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f24858c == null) {
                        this.f24858c = new les();
                    }
                    nyt.a(this.f24858c);
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
