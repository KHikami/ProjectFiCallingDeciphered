package defpackage;

import nyt;
import nyu;
import nzc;

/* renamed from: kul */
public final class kul extends nyx<kul> {
    private static volatile kul[] k;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public Integer i;
    public kum j;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kul[] d() {
        if (k == null) {
            synchronized (nzc.c) {
                if (k == null) {
                    k = new kul[0];
                }
            }
        }
        return k;
    }

    public kul() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.b);
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.e != null) {
            nyu.a(4, this.e);
        }
        if (this.f != null) {
            nyu.a(5, this.f);
        }
        if (this.h != null) {
            nyu.a(6, this.h);
        }
        if (this.i != null) {
            nyu.a(7, this.i.intValue());
        }
        if (this.g != null) {
            nyu.a(8, this.g);
        }
        if (this.a != null) {
            nyu.a(9, this.a);
        }
        if (this.j != null) {
            nyu.b(10, this.j);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b() + nyu.b(1, this.b);
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.d != null) {
            b += nyu.b(3, this.d);
        }
        if (this.e != null) {
            b += nyu.b(4, this.e);
        }
        if (this.f != null) {
            b += nyu.b(5, this.f);
        }
        if (this.h != null) {
            b += nyu.b(6, this.h);
        }
        if (this.i != null) {
            b += nyu.f(7, this.i.intValue());
        }
        if (this.g != null) {
            b += nyu.b(8, this.g);
        }
        if (this.a != null) {
            b += nyu.b(9, this.a);
        }
        if (this.j != null) {
            return b + nyu.d(10, this.j);
        }
        return b;
    }

    private kul b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.b = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.c = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.d = nyt.j();
                    continue;
                case 34:
                    this.e = nyt.j();
                    continue;
                case 42:
                    this.f = nyt.j();
                    continue;
                case 50:
                    this.h = nyt.j();
                    continue;
                case 56:
                    this.i = Integer.valueOf(nyt.f());
                    continue;
                case 66:
                    this.g = nyt.j();
                    continue;
                case 74:
                    this.a = nyt.j();
                    continue;
                case 82:
                    if (this.j == null) {
                        this.j = new kum();
                    }
                    nyt.a(this.j);
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
