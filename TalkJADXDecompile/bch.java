public final class bch {
    String a;
    String b;
    int c;
    bci d;

    bch() {
    }

    public bcg a() {
        return new bcg(this);
    }

    public bch a(bcg bcg) {
        if (bcg.a()) {
            a(bcg.b());
        }
        if (bcg.c()) {
            b(bcg.d());
        }
        if (bcg.e() > 0) {
            a(bcg.e());
        }
        if (bcg.f()) {
            a(bcg.g());
        }
        return this;
    }

    public bch a(String str) {
        this.a = str;
        return this;
    }

    private bch b(String str) {
        this.b = str;
        return this;
    }

    private bch a(int i) {
        this.c = i;
        return this;
    }

    private bch a(bci bci) {
        this.d = bci;
        return this;
    }
}
