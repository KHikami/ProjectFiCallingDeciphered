package defpackage;

import nyt;
import nyu;
import nzc;
import nzl;

/* renamed from: lku */
public final class lku extends nyx<lku> {
    private static volatile lku[] c;
    public String a;
    public int[] b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lku[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new lku[0];
                }
            }
        }
        return c;
    }

    public lku() {
        g();
    }

    private lku g() {
        this.a = null;
        this.b = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(62, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (int b : this.b) {
                nyu.b(63, b);
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(62, this.a);
        }
        if (this.b == null || this.b.length <= 0) {
            return b;
        }
        return (b + (this.b.length * 4)) + (this.b.length * 2);
    }

    private lku b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int d;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case 498:
                    this.a = nyt.j();
                    continue;
                case 506:
                    a = nyt.r();
                    d = nyt.d(a);
                    int i = a / 4;
                    a = this.b == null ? 0 : this.b.length;
                    Object obj = new int[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.h();
                        a++;
                    }
                    this.b = obj;
                    nyt.e(d);
                    continue;
                case 509:
                    d = nzl.b(nyt, 509);
                    a = this.b == null ? 0 : this.b.length;
                    Object obj2 = new int[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.h();
                        nyt.a();
                        a++;
                    }
                    obj2[a] = nyt.h();
                    this.b = obj2;
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
