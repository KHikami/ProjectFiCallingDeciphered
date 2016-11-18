package p000;

public final class kic extends nyx<kic> {
    public String[] f21818a;
    public String[] f21819b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25936b(nyt);
    }

    public kic() {
        this.f21818a = nzl.f;
        this.f21819b = nzl.f;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f21818a != null && this.f21818a.length > 0) {
            for (String str : this.f21818a) {
                if (str != null) {
                    nyu.a(1, str);
                }
            }
        }
        if (this.f21819b != null && this.f21819b.length > 0) {
            while (i < this.f21819b.length) {
                String str2 = this.f21819b[i];
                if (str2 != null) {
                    nyu.a(2, str2);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.mo147b();
        if (this.f21818a == null || this.f21818a.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.f21818a) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.f21819b == null || this.f21819b.length <= 0) {
            return i;
        }
        i2 = 0;
        i3 = 0;
        while (i4 < this.f21819b.length) {
            String str2 = this.f21819b[i4];
            if (str2 != null) {
                i3++;
                i2 += nyu.b(str2);
            }
            i4++;
        }
        return (i + i2) + (i3 * 1);
    }

    private kic m25936b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    a = this.f21818a == null ? 0 : this.f21818a.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f21818a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f21818a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    a = this.f21819b == null ? 0 : this.f21819b.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f21819b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f21819b = obj;
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
