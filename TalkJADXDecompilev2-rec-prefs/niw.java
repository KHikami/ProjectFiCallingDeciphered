package p000;

public final class niw extends nyx<niw> {
    public String f29937a;

    public /* synthetic */ nzf m35163a(nyt nyt) {
        return m35161b(nyt);
    }

    public niw() {
        m35162d();
    }

    private niw m35162d() {
        this.f29937a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35164a(nyu nyu) {
        if (this.f29937a != null) {
            nyu.m37170a(1, this.f29937a);
        }
        super.a(nyu);
    }

    protected int m35165b() {
        int b = super.b();
        if (this.f29937a != null) {
            return b + nyu.m37137b(1, this.f29937a);
        }
        return b;
    }

    private niw m35161b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29937a = nyt.m37117j();
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
