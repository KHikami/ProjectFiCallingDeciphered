package p000;

public final class mva extends nyx<mva> {
    public Float f28432a;
    public mvc f28433b;
    public Float f28434c;
    public Float f28435d;
    public mvc[] f28436e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33038b(nyt);
    }

    public mva() {
        m33039d();
    }

    private mva m33039d() {
        this.f28432a = null;
        this.f28433b = null;
        this.f28434c = null;
        this.f28435d = null;
        this.f28436e = mvc.m33049d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28432a != null) {
            nyu.a(1, this.f28432a.floatValue());
        }
        if (this.f28433b != null) {
            nyu.b(2, this.f28433b);
        }
        if (this.f28434c != null) {
            nyu.a(3, this.f28434c.floatValue());
        }
        if (this.f28435d != null) {
            nyu.a(4, this.f28435d.floatValue());
        }
        if (this.f28436e != null && this.f28436e.length > 0) {
            for (nzf nzf : this.f28436e) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28432a != null) {
            this.f28432a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.f28433b != null) {
            b += nyu.d(2, this.f28433b);
        }
        if (this.f28434c != null) {
            this.f28434c.floatValue();
            b += nyu.h(3) + 4;
        }
        if (this.f28435d != null) {
            this.f28435d.floatValue();
            b += nyu.h(4) + 4;
        }
        if (this.f28436e == null || this.f28436e.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f28436e) {
            if (nzf != null) {
                i += nyu.d(5, nzf);
            }
        }
        return i;
    }

    private mva m33038b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f28432a = Float.valueOf(nyt.c());
                    continue;
                case wi.dH /*18*/:
                    if (this.f28433b == null) {
                        this.f28433b = new mvc();
                    }
                    nyt.a(this.f28433b);
                    continue;
                case 29:
                    this.f28434c = Float.valueOf(nyt.c());
                    continue;
                case 37:
                    this.f28435d = Float.valueOf(nyt.c());
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    if (this.f28436e == null) {
                        a = 0;
                    } else {
                        a = this.f28436e.length;
                    }
                    Object obj = new mvc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28436e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mvc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mvc();
                    nyt.a(obj[a]);
                    this.f28436e = obj;
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
