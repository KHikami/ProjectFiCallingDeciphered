public final class jmt {
    boolean a;
    long b;
    boolean c;

    public jmt() {
        this.c = true;
    }

    public jmt a(boolean z) {
        this.a = z;
        return this;
    }

    public jmt a(long j) {
        this.b = 0;
        return this;
    }

    public jmt b(boolean z) {
        this.c = false;
        return this;
    }

    public jms a() {
        return new jms(this);
    }
}
