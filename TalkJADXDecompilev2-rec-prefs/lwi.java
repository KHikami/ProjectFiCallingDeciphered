package p000;

public final class lwi extends nyx<lwi> {
    public ltb[] f26679a;
    public Long f26680b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30862b(nyt);
    }

    public lwi() {
        m30863d();
    }

    private lwi m30863d() {
        this.f26679a = ltb.m30409d();
        this.f26680b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26679a != null && this.f26679a.length > 0) {
            for (nzf nzf : this.f26679a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f26680b != null) {
            nyu.a(2, this.f26680b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26679a != null && this.f26679a.length > 0) {
            for (nzf nzf : this.f26679a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f26680b != null) {
            return b + nyu.e(2, this.f26680b.longValue());
        }
        return b;
    }

    private lwi m30862b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f26679a == null) {
                        a = 0;
                    } else {
                        a = this.f26679a.length;
                    }
                    Object obj = new ltb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26679a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ltb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ltb();
                    nyt.a(obj[a]);
                    this.f26679a = obj;
                    continue;
                case 16:
                    this.f26680b = Long.valueOf(nyt.d());
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
