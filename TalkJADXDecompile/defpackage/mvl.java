package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: mvl */
public final class mvl extends nyx<mvl> {
    public String a;
    public mvw b;
    public mvh c;
    public String d;
    public int e;
    public mvm[] f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mvl() {
        d();
    }

    private mvl d() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = "";
        this.e = 0;
        this.f = mvm.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (!(this.a == null || this.a.equals(""))) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (!(this.d == null || this.d.equals(""))) {
            nyu.a(4, this.d);
        }
        if (this.e != 0) {
            nyu.a(5, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            for (nzf nzf : this.f) {
                if (nzf != null) {
                    nyu.b(6, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (!(this.a == null || this.a.equals(""))) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (!(this.d == null || this.d.equals(""))) {
            b += nyu.b(4, this.d);
        }
        if (this.e != 0) {
            b += nyu.f(5, this.e);
        }
        if (this.f == null || this.f.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f) {
            if (nzf != null) {
                i += nyu.d(6, nzf);
            }
        }
        return i;
    }

    private mvl b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new mvw();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new mvh();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                            this.e = a;
                            break;
                        default:
                            continue;
                    }
                case 50:
                    int b = nzl.b(nyt, 50);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    Object obj = new mvm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mvm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mvm();
                    nyt.a(obj[a]);
                    this.f = obj;
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
