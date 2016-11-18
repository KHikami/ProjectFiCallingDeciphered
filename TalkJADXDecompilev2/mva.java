package defpackage;

public final class mva extends nyx<mva> {
    public Float a;
    public mvc b;
    public Float c;
    public Float d;
    public mvc[] e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mva() {
        d();
    }

    private mva d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = mvc.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.floatValue());
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c.floatValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.floatValue());
        }
        if (this.e != null && this.e.length > 0) {
            for (nzf nzf : this.e) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            this.c.floatValue();
            b += nyu.h(3) + 4;
        }
        if (this.d != null) {
            this.d.floatValue();
            b += nyu.h(4) + 4;
        }
        if (this.e == null || this.e.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.e) {
            if (nzf != null) {
                i += nyu.d(5, nzf);
            }
        }
        return i;
    }

    private mva b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.a = Float.valueOf(nyt.c());
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new mvc();
                    }
                    nyt.a(this.b);
                    continue;
                case 29:
                    this.c = Float.valueOf(nyt.c());
                    continue;
                case 37:
                    this.d = Float.valueOf(nyt.c());
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    Object obj = new mvc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mvc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mvc();
                    nyt.a(obj[a]);
                    this.e = obj;
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
