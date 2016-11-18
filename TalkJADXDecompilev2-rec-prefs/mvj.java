package p000;

import java.util.Arrays;

public final class mvj extends nyx<mvj> {
    public String f28477a;
    public int f28478b;
    public byte[] f28479c;
    public long f28480d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33082b(nyt);
    }

    public mvj() {
        m33083d();
    }

    private mvj m33083d() {
        this.f28477a = "";
        this.f28478b = 0;
        this.f28479c = nzl.h;
        this.f28480d = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f28477a == null || this.f28477a.equals(""))) {
            nyu.a(1, this.f28477a);
        }
        if (this.f28478b != 0) {
            nyu.a(2, this.f28478b);
        }
        if (!Arrays.equals(this.f28479c, nzl.h)) {
            nyu.a(4, this.f28479c);
        }
        if (this.f28480d != 0) {
            nyu.b(5, this.f28480d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!(this.f28477a == null || this.f28477a.equals(""))) {
            b += nyu.b(1, this.f28477a);
        }
        if (this.f28478b != 0) {
            b += nyu.f(2, this.f28478b);
        }
        if (!Arrays.equals(this.f28479c, nzl.h)) {
            b += nyu.b(4, this.f28479c);
        }
        if (this.f28480d != 0) {
            return b + nyu.f(5, this.f28480d);
        }
        return b;
    }

    private mvj m33082b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28477a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f28478b = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.f28479c = nyt.k();
                    continue;
                case 40:
                    this.f28480d = nyt.e();
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
