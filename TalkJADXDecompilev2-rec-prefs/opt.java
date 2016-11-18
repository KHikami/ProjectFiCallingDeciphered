package p000;

public final class opt extends nyx<opt> {
    public oox f33591a;
    public Long f33592b;
    public String f33593c;
    public String f33594d;
    public oqz[] f33595e;
    public osq f33596f;

    public /* synthetic */ nzf m39097a(nyt nyt) {
        return m39095b(nyt);
    }

    public opt() {
        m39096d();
    }

    private opt m39096d() {
        this.f33591a = null;
        this.f33592b = null;
        this.f33593c = null;
        this.f33594d = null;
        this.f33595e = oqz.m39269d();
        this.f33596f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39098a(nyu nyu) {
        if (this.f33591a != null) {
            nyu.m37182b(1, this.f33591a);
        }
        if (this.f33592b != null) {
            nyu.m37181b(2, this.f33592b.longValue());
        }
        if (this.f33593c != null) {
            nyu.m37170a(3, this.f33593c);
        }
        if (this.f33594d != null) {
            nyu.m37170a(4, this.f33594d);
        }
        if (this.f33595e != null && this.f33595e.length > 0) {
            for (nzf nzf : this.f33595e) {
                if (nzf != null) {
                    nyu.m37182b(5, nzf);
                }
            }
        }
        if (this.f33596f != null) {
            nyu.m37182b(6, this.f33596f);
        }
        super.a(nyu);
    }

    protected int m39099b() {
        int b = super.b();
        if (this.f33591a != null) {
            b += nyu.m37145d(1, this.f33591a);
        }
        if (this.f33592b != null) {
            b += nyu.m37148f(2, this.f33592b.longValue());
        }
        if (this.f33593c != null) {
            b += nyu.m37137b(3, this.f33593c);
        }
        if (this.f33594d != null) {
            b += nyu.m37137b(4, this.f33594d);
        }
        if (this.f33595e != null && this.f33595e.length > 0) {
            int i = b;
            for (nzf nzf : this.f33595e) {
                if (nzf != null) {
                    i += nyu.m37145d(5, nzf);
                }
            }
            b = i;
        }
        if (this.f33596f != null) {
            return b + nyu.m37145d(6, this.f33596f);
        }
        return b;
    }

    private opt m39095b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33591a == null) {
                        this.f33591a = new oox();
                    }
                    nyt.m37101a(this.f33591a);
                    continue;
                case 16:
                    this.f33592b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dx /*26*/:
                    this.f33593c = nyt.m37117j();
                    continue;
                case 34:
                    this.f33594d = nyt.m37117j();
                    continue;
                case 42:
                    int b = nzl.m37265b(nyt, 42);
                    if (this.f33595e == null) {
                        a = 0;
                    } else {
                        a = this.f33595e.length;
                    }
                    Object obj = new oqz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33595e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqz();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqz();
                    nyt.m37101a(obj[a]);
                    this.f33595e = obj;
                    continue;
                case 50:
                    if (this.f33596f == null) {
                        this.f33596f = new osq();
                    }
                    nyt.m37101a(this.f33596f);
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
