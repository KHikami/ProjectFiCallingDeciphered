package p000;

public final class khy extends nyx<khy> {
    public String[] f21807a;
    public String[] f21808b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25917b(nyt);
    }

    public khy() {
        m25918d();
    }

    private khy m25918d() {
        this.f21807a = nzl.f;
        this.f21808b = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f21807a != null && this.f21807a.length > 0) {
            for (String str : this.f21807a) {
                if (str != null) {
                    nyu.a(1, str);
                }
            }
        }
        if (this.f21808b != null && this.f21808b.length > 0) {
            while (i < this.f21808b.length) {
                String str2 = this.f21808b[i];
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
        if (this.f21807a == null || this.f21807a.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.f21807a) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.f21808b == null || this.f21808b.length <= 0) {
            return i;
        }
        i2 = 0;
        i3 = 0;
        while (i4 < this.f21808b.length) {
            String str2 = this.f21808b[i4];
            if (str2 != null) {
                i3++;
                i2 += nyu.b(str2);
            }
            i4++;
        }
        return (i + i2) + (i3 * 1);
    }

    private khy m25917b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    a = this.f21807a == null ? 0 : this.f21807a.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f21807a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f21807a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    a = this.f21808b == null ? 0 : this.f21808b.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f21808b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f21808b = obj;
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
