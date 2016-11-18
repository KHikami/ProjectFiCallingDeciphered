package p000;

public final class bch {
    String f3006a;
    String f3007b;
    int f3008c;
    bci f3009d;

    bch() {
    }

    public bcg m4854a() {
        return new bcg(this);
    }

    public bch m4855a(bcg bcg) {
        if (bcg.m4844a()) {
            m4856a(bcg.m4845b());
        }
        if (bcg.m4846c()) {
            m4853b(bcg.m4847d());
        }
        if (bcg.m4848e() > 0) {
            m4851a(bcg.m4848e());
        }
        if (bcg.m4849f()) {
            m4852a(bcg.m4850g());
        }
        return this;
    }

    public bch m4856a(String str) {
        this.f3006a = str;
        return this;
    }

    private bch m4853b(String str) {
        this.f3007b = str;
        return this;
    }

    private bch m4851a(int i) {
        this.f3008c = i;
        return this;
    }

    private bch m4852a(bci bci) {
        this.f3009d = bci;
        return this;
    }
}
