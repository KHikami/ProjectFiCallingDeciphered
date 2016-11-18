package p000;

public final class oyb extends nyx<oyb> {
    public oyc[] f34575a;

    public /* synthetic */ nzf m39868a(nyt nyt) {
        return m39866b(nyt);
    }

    public oyb() {
        m39867d();
    }

    private oyb m39867d() {
        this.f34575a = oyc.m39872d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39869a(nyu nyu) {
        if (this.f34575a != null && this.f34575a.length > 0) {
            for (nzf nzf : this.f34575a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m39870b() {
        int b = super.b();
        if (this.f34575a != null && this.f34575a.length > 0) {
            for (nzf nzf : this.f34575a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private oyb m39866b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f34575a == null) {
                        a = 0;
                    } else {
                        a = this.f34575a.length;
                    }
                    Object obj = new oyc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34575a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oyc();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oyc();
                    nyt.m37101a(obj[a]);
                    this.f34575a = obj;
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
