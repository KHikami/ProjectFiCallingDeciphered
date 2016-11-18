package p000;

public final class muk extends nyx<muk> {
    private static volatile muk[] f28368c;
    public mum[] f28369a;
    public Integer f28370b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32956b(nyt);
    }

    public static muk[] m32957d() {
        if (f28368c == null) {
            synchronized (nzc.c) {
                if (f28368c == null) {
                    f28368c = new muk[0];
                }
            }
        }
        return f28368c;
    }

    public muk() {
        m32958g();
    }

    private muk m32958g() {
        this.f28369a = mum.m32968d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28369a != null && this.f28369a.length > 0) {
            for (nzf nzf : this.f28369a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f28370b != null) {
            nyu.a(2, this.f28370b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28369a != null && this.f28369a.length > 0) {
            for (nzf nzf : this.f28369a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f28370b != null) {
            return b + nyu.f(2, this.f28370b.intValue());
        }
        return b;
    }

    private muk m32956b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f28369a == null) {
                        a = 0;
                    } else {
                        a = this.f28369a.length;
                    }
                    Object obj = new mum[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28369a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mum();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mum();
                    nyt.a(obj[a]);
                    this.f28369a = obj;
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f28370b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
