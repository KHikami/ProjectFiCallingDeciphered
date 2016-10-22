package defpackage;

import java.util.Arrays;
import nyt;
import nyu;
import nzl;

/* renamed from: lnn */
public final class lnn extends nyx<lnn> {
    public String a;
    public String b;
    public byte[] c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lnn() {
        d();
    }

    private lnn d() {
        this.a = "";
        this.b = "";
        this.c = nzl.h;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (!(this.a == null || this.a.equals(""))) {
            nyu.a(1, this.a);
        }
        if (!(this.b == null || this.b.equals(""))) {
            nyu.a(2, this.b);
        }
        if (!Arrays.equals(this.c, nzl.h)) {
            nyu.a(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (!(this.a == null || this.a.equals(""))) {
            b += nyu.b(1, this.a);
        }
        if (!(this.b == null || this.b.equals(""))) {
            b += nyu.b(2, this.b);
        }
        if (Arrays.equals(this.c, nzl.h)) {
            return b;
        }
        return b + nyu.b(3, this.c);
    }

    private lnn b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.k();
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
