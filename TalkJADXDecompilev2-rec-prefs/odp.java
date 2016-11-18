package p000;

public final class odp extends nyx<odp> {
    public nut[] f32442a;
    public Integer f32443b;
    public Integer f32444c;
    public ode[] f32445d;

    public /* synthetic */ nzf m37882a(nyt nyt) {
        return m37881b(nyt);
    }

    public odp() {
        this.f32442a = nut.m36643d();
        this.f32443b = null;
        this.f32444c = null;
        this.f32445d = ode.m37835d();
        this.cachedSize = -1;
    }

    public void m37883a(nyu nyu) {
        int i = 0;
        if (this.f32442a != null && this.f32442a.length > 0) {
            for (nzf nzf : this.f32442a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f32443b != null) {
            nyu.m37168a(2, this.f32443b.intValue());
        }
        if (this.f32444c != null) {
            nyu.m37168a(3, this.f32444c.intValue());
        }
        if (this.f32445d != null && this.f32445d.length > 0) {
            while (i < this.f32445d.length) {
                nzf nzf2 = this.f32445d[i];
                if (nzf2 != null) {
                    nyu.m37182b(4, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m37884b() {
        int i = 0;
        int b = super.b();
        if (this.f32442a != null && this.f32442a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f32442a) {
                if (nzf != null) {
                    i2 += nyu.m37145d(1, nzf);
                }
            }
            b = i2;
        }
        if (this.f32443b != null) {
            b += nyu.m37147f(2, this.f32443b.intValue());
        }
        if (this.f32444c != null) {
            b += nyu.m37147f(3, this.f32444c.intValue());
        }
        if (this.f32445d != null && this.f32445d.length > 0) {
            while (i < this.f32445d.length) {
                nzf nzf2 = this.f32445d[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(4, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private odp m37881b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f32442a == null) {
                        a = 0;
                    } else {
                        a = this.f32442a.length;
                    }
                    obj = new nut[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32442a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nut();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nut();
                    nyt.m37101a(obj[a]);
                    this.f32442a = obj;
                    continue;
                case 16:
                    this.f32443b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f32444c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 34:
                    b = nzl.m37265b(nyt, 34);
                    if (this.f32445d == null) {
                        a = 0;
                    } else {
                        a = this.f32445d.length;
                    }
                    obj = new ode[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32445d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ode();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ode();
                    nyt.m37101a(obj[a]);
                    this.f32445d = obj;
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
