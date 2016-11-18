package p000;

public final class lst extends nyx<lst> {
    private static volatile lst[] f26342c;
    public lor f26343a;
    public String[] f26344b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30366b(nyt);
    }

    public static lst[] m30367d() {
        if (f26342c == null) {
            synchronized (nzc.c) {
                if (f26342c == null) {
                    f26342c = new lst[0];
                }
            }
        }
        return f26342c;
    }

    public lst() {
        m30368g();
    }

    private lst m30368g() {
        this.f26343a = null;
        this.f26344b = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26343a != null) {
            nyu.b(1, this.f26343a);
        }
        if (this.f26344b != null && this.f26344b.length > 0) {
            for (String str : this.f26344b) {
                if (str != null) {
                    nyu.a(2, str);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f26343a != null) {
            b += nyu.d(1, this.f26343a);
        }
        if (this.f26344b == null || this.f26344b.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f26344b.length) {
            String str = this.f26344b[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private lst m30366b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26343a == null) {
                        this.f26343a = new lor();
                    }
                    nyt.a(this.f26343a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    a = this.f26344b == null ? 0 : this.f26344b.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26344b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f26344b = obj;
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
