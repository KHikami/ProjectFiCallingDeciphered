package p000;

public final class ogo extends nyx<ogo> {
    public byte[] f32741a;
    public ogp f32742b;

    public /* synthetic */ nzf m38214a(nyt nyt) {
        return m38213b(nyt);
    }

    public ogo() {
        this.f32741a = null;
        this.cachedSize = -1;
    }

    public void m38215a(nyu nyu) {
        if (this.f32741a != null) {
            nyu.m37173a(1, this.f32741a);
        }
        if (this.f32742b != null) {
            nyu.m37182b(2, this.f32742b);
        }
        super.a(nyu);
    }

    protected int m38216b() {
        int b = super.b();
        if (this.f32741a != null) {
            b += nyu.m37139b(1, this.f32741a);
        }
        if (this.f32742b != null) {
            return b + nyu.m37145d(2, this.f32742b);
        }
        return b;
    }

    private ogo m38213b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32741a = nyt.m37118k();
                    continue;
                case wi.dH /*18*/:
                    if (this.f32742b == null) {
                        this.f32742b = new ogp();
                    }
                    nyt.m37101a(this.f32742b);
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
