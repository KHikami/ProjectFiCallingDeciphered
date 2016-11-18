package p000;

public final class oib extends nyx<oib> {
    public ohq f32954a;
    public Integer f32955b;
    public oic f32956c;
    public Integer f32957d;
    public ohv[] f32958e;

    public /* synthetic */ nzf m38444a(nyt nyt) {
        return m38442b(nyt);
    }

    public oib() {
        m38443d();
    }

    private oib m38443d() {
        this.f32954a = null;
        this.f32956c = null;
        this.f32957d = null;
        this.f32958e = ohv.m38408d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38445a(nyu nyu) {
        if (this.f32954a != null) {
            nyu.m37182b(2, this.f32954a);
        }
        if (this.f32955b != null) {
            nyu.m37168a(5, this.f32955b.intValue());
        }
        if (this.f32956c != null) {
            nyu.m37182b(6, this.f32956c);
        }
        if (this.f32957d != null) {
            nyu.m37168a(7, this.f32957d.intValue());
        }
        if (this.f32958e != null && this.f32958e.length > 0) {
            for (nzf nzf : this.f32958e) {
                if (nzf != null) {
                    nyu.m37182b(8, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m38446b() {
        int b = super.b();
        if (this.f32954a != null) {
            b += nyu.m37145d(2, this.f32954a);
        }
        if (this.f32955b != null) {
            b += nyu.m37147f(5, this.f32955b.intValue());
        }
        if (this.f32956c != null) {
            b += nyu.m37145d(6, this.f32956c);
        }
        if (this.f32957d != null) {
            b += nyu.m37147f(7, this.f32957d.intValue());
        }
        if (this.f32958e == null || this.f32958e.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f32958e) {
            if (nzf != null) {
                i += nyu.m37145d(8, nzf);
            }
        }
        return i;
    }

    private oib m38442b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.f32954a == null) {
                        this.f32954a = new ohq();
                    }
                    nyt.m37101a(this.f32954a);
                    continue;
                case 40:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f32955b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 50:
                    if (this.f32956c == null) {
                        this.f32956c = new oic();
                    }
                    nyt.m37101a(this.f32956c);
                    continue;
                case 56:
                    this.f32957d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 66:
                    int b = nzl.m37265b(nyt, 66);
                    if (this.f32958e == null) {
                        a = 0;
                    } else {
                        a = this.f32958e.length;
                    }
                    Object obj = new ohv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32958e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohv();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ohv();
                    nyt.m37101a(obj[a]);
                    this.f32958e = obj;
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
