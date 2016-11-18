package p000;

public final class lrf extends nyx<lrf> {
    private static volatile lrf[] f26210c;
    public lqd f26211a;
    public lqc[] f26212b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30155b(nyt);
    }

    public static lrf[] m30156d() {
        if (f26210c == null) {
            synchronized (nzc.c) {
                if (f26210c == null) {
                    f26210c = new lrf[0];
                }
            }
        }
        return f26210c;
    }

    public lrf() {
        m30157g();
    }

    private lrf m30157g() {
        this.f26211a = null;
        this.f26212b = lqc.m30002d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26211a != null) {
            nyu.b(1, this.f26211a);
        }
        if (this.f26212b != null && this.f26212b.length > 0) {
            for (nzf nzf : this.f26212b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26211a != null) {
            b += nyu.d(1, this.f26211a);
        }
        if (this.f26212b == null || this.f26212b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26212b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private lrf m30155b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26211a == null) {
                        this.f26211a = new lqd();
                    }
                    nyt.a(this.f26211a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f26212b == null) {
                        a = 0;
                    } else {
                        a = this.f26212b.length;
                    }
                    Object obj = new lqc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26212b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqc();
                    nyt.a(obj[a]);
                    this.f26212b = obj;
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
