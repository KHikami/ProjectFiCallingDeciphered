package p000;

public final class ogq extends nyx<ogq> {
    public int f32745a;
    public ogn f32746b;
    public ogr f32747c;

    public /* synthetic */ nzf m38222a(nyt nyt) {
        return m38221b(nyt);
    }

    public ogq() {
        this.f32745a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m38223a(nyu nyu) {
        if (this.f32745a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f32745a);
        }
        if (this.f32746b != null) {
            nyu.m37182b(2, this.f32746b);
        }
        if (this.f32747c != null) {
            nyu.m37182b(3, this.f32747c);
        }
        super.a(nyu);
    }

    protected int m38224b() {
        int b = super.b();
        if (this.f32745a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f32745a);
        }
        if (this.f32746b != null) {
            b += nyu.m37145d(2, this.f32746b);
        }
        if (this.f32747c != null) {
            return b + nyu.m37145d(3, this.f32747c);
        }
        return b;
    }

    private ogq m38221b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f32745a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f32746b == null) {
                        this.f32746b = new ogn();
                    }
                    nyt.m37101a(this.f32746b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f32747c == null) {
                        this.f32747c = new ogr();
                    }
                    nyt.m37101a(this.f32747c);
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
