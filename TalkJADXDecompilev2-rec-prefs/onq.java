package p000;

public final class onq extends nyx<onq> {
    public Integer f33321a;
    public Integer f33322b;
    public Integer f33323c;

    public /* synthetic */ nzf m38830a(nyt nyt) {
        return m38829b(nyt);
    }

    public onq() {
        this.f33321a = null;
        this.f33322b = null;
        this.f33323c = null;
        this.cachedSize = -1;
    }

    public void m38831a(nyu nyu) {
        if (this.f33321a != null) {
            nyu.m37168a(1, this.f33321a.intValue());
        }
        if (this.f33322b != null) {
            nyu.m37168a(2, this.f33322b.intValue());
        }
        if (this.f33323c != null) {
            nyu.m37168a(3, this.f33323c.intValue());
        }
        super.a(nyu);
    }

    protected int m38832b() {
        int b = super.b();
        if (this.f33321a != null) {
            b += nyu.m37147f(1, this.f33321a.intValue());
        }
        if (this.f33322b != null) {
            b += nyu.m37147f(2, this.f33322b.intValue());
        }
        if (this.f33323c != null) {
            return b + nyu.m37147f(3, this.f33323c.intValue());
        }
        return b;
    }

    private onq m38829b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f33321a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f33322b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f33323c = Integer.valueOf(nyt.m37112f());
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
