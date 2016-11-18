package p000;

public final class npy extends nyx<npy> {
    public npu[] f30466a;
    public npu[] f30467b;

    public /* synthetic */ nzf m36102a(nyt nyt) {
        return m36100b(nyt);
    }

    public npy() {
        m36101d();
    }

    private npy m36101d() {
        this.f30466a = npu.m36080d();
        this.f30467b = npu.m36080d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36103a(nyu nyu) {
        int i = 0;
        if (this.f30466a != null && this.f30466a.length > 0) {
            for (nzf nzf : this.f30466a) {
                if (nzf != null) {
                    nyu.m37182b(4, nzf);
                }
            }
        }
        if (this.f30467b != null && this.f30467b.length > 0) {
            while (i < this.f30467b.length) {
                nzf nzf2 = this.f30467b[i];
                if (nzf2 != null) {
                    nyu.m37182b(5, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m36104b() {
        int i = 0;
        int b = super.b();
        if (this.f30466a != null && this.f30466a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f30466a) {
                if (nzf != null) {
                    i2 += nyu.m37145d(4, nzf);
                }
            }
            b = i2;
        }
        if (this.f30467b != null && this.f30467b.length > 0) {
            while (i < this.f30467b.length) {
                nzf nzf2 = this.f30467b[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(5, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private npy m36100b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 34:
                    b = nzl.m37265b(nyt, 34);
                    if (this.f30466a == null) {
                        a = 0;
                    } else {
                        a = this.f30466a.length;
                    }
                    obj = new npu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30466a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new npu();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new npu();
                    nyt.m37101a(obj[a]);
                    this.f30466a = obj;
                    continue;
                case 42:
                    b = nzl.m37265b(nyt, 42);
                    if (this.f30467b == null) {
                        a = 0;
                    } else {
                        a = this.f30467b.length;
                    }
                    obj = new npu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30467b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new npu();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new npu();
                    nyt.m37101a(obj[a]);
                    this.f30467b = obj;
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
