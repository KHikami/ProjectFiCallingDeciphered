package defpackage;

public final class kqq extends nyx<kqq> {
    public Integer a;
    public String[] b;
    public kqs c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kqq() {
        d();
    }

    private kqq d() {
        this.b = nzl.f;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (String str : this.b) {
                if (str != null) {
                    nyu.a(2, str);
                }
            }
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null && this.b.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.b.length) {
                String str = this.b[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.c != null) {
            return b + nyu.d(3, this.c);
        }
        return b;
    }

    private kqq b(nyt nyt) {
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
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    a = this.b == null ? 0 : this.b.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new kqs();
                    }
                    nyt.a(this.c);
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
