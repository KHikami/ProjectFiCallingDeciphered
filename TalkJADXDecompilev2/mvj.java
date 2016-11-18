package defpackage;

import java.util.Arrays;

public final class mvj extends nyx<mvj> {
    public String a;
    public int b;
    public byte[] c;
    public long d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mvj() {
        d();
    }

    private mvj d() {
        this.a = "";
        this.b = 0;
        this.c = nzl.h;
        this.d = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (!(this.a == null || this.a.equals(""))) {
            nyu.a(1, this.a);
        }
        if (this.b != 0) {
            nyu.a(2, this.b);
        }
        if (!Arrays.equals(this.c, nzl.h)) {
            nyu.a(4, this.c);
        }
        if (this.d != 0) {
            nyu.b(5, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (!(this.a == null || this.a.equals(""))) {
            b += nyu.b(1, this.a);
        }
        if (this.b != 0) {
            b += nyu.f(2, this.b);
        }
        if (!Arrays.equals(this.c, nzl.h)) {
            b += nyu.b(4, this.c);
        }
        if (this.d != 0) {
            return b + nyu.f(5, this.d);
        }
        return b;
    }

    private mvj b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.b = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.c = nyt.k();
                    continue;
                case 40:
                    this.d = nyt.e();
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
