package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: lyj */
public final class lyj extends nyx<lyj> {
    public lyh a;
    public String b;
    public lzj c;
    public lyh[] d;
    public luq responseHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lyj() {
        d();
    }

    private lyj d() {
        this.responseHeader = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = lyh.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.a != null) {
            nyu.b(2, this.a);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.b != null) {
            nyu.a(4, this.b);
        }
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.a != null) {
            b += nyu.d(2, this.a);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.b != null) {
            b += nyu.b(4, this.b);
        }
        if (this.d == null || this.d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.d) {
            if (nzf != null) {
                i += nyu.d(5, nzf);
            }
        }
        return i;
    }

    private lyj b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.a == null) {
                        this.a = new lyh();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new lzj();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    this.b = nyt.j();
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    Object obj = new lyh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lyh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lyh();
                    nyt.a(obj[a]);
                    this.d = obj;
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
