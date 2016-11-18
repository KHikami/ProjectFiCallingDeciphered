package p000;

public final class ohf extends nyx<ohf> {
    public String f32846a;
    public String f32847b;
    public String f32848c;
    public String f32849d;
    public String f32850e;

    public /* synthetic */ nzf m38331a(nyt nyt) {
        return m38330b(nyt);
    }

    public ohf() {
        this.f32846a = null;
        this.f32847b = null;
        this.f32848c = null;
        this.f32849d = null;
        this.f32850e = null;
        this.cachedSize = -1;
    }

    public void m38332a(nyu nyu) {
        if (this.f32847b != null) {
            nyu.m37170a(1, this.f32847b);
        }
        if (this.f32850e != null) {
            nyu.m37170a(3, this.f32850e);
        }
        if (this.f32848c != null) {
            nyu.m37170a(4, this.f32848c);
        }
        if (this.f32849d != null) {
            nyu.m37170a(5, this.f32849d);
        }
        if (this.f32846a != null) {
            nyu.m37170a(6, this.f32846a);
        }
        super.a(nyu);
    }

    protected int m38333b() {
        int b = super.b();
        if (this.f32847b != null) {
            b += nyu.m37137b(1, this.f32847b);
        }
        if (this.f32850e != null) {
            b += nyu.m37137b(3, this.f32850e);
        }
        if (this.f32848c != null) {
            b += nyu.m37137b(4, this.f32848c);
        }
        if (this.f32849d != null) {
            b += nyu.m37137b(5, this.f32849d);
        }
        if (this.f32846a != null) {
            return b + nyu.m37137b(6, this.f32846a);
        }
        return b;
    }

    private ohf m38330b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32847b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f32850e = nyt.m37117j();
                    continue;
                case 34:
                    this.f32848c = nyt.m37117j();
                    continue;
                case 42:
                    this.f32849d = nyt.m37117j();
                    continue;
                case 50:
                    this.f32846a = nyt.m37117j();
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
