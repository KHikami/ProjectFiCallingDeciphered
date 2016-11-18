package p000;

public final class odo extends nyx<odo> {
    public odp f32439a;
    public odk f32440b;
    public odv f32441c;

    public /* synthetic */ nzf m37878a(nyt nyt) {
        return m37877b(nyt);
    }

    public odo() {
        this.cachedSize = -1;
    }

    public void m37879a(nyu nyu) {
        if (this.f32439a != null) {
            nyu.m37182b(1, this.f32439a);
        }
        if (this.f32440b != null) {
            nyu.m37182b(2, this.f32440b);
        }
        if (this.f32441c != null) {
            nyu.m37182b(3, this.f32441c);
        }
        super.a(nyu);
    }

    protected int m37880b() {
        int b = super.b();
        if (this.f32439a != null) {
            b += nyu.m37145d(1, this.f32439a);
        }
        if (this.f32440b != null) {
            b += nyu.m37145d(2, this.f32440b);
        }
        if (this.f32441c != null) {
            return b + nyu.m37145d(3, this.f32441c);
        }
        return b;
    }

    private odo m37877b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32439a == null) {
                        this.f32439a = new odp();
                    }
                    nyt.m37101a(this.f32439a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f32440b == null) {
                        this.f32440b = new odk();
                    }
                    nyt.m37101a(this.f32440b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f32441c == null) {
                        this.f32441c = new odv();
                    }
                    nyt.m37101a(this.f32441c);
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
