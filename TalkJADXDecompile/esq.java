public final class esq {
    int a;
    lof b;
    boolean c;
    String d;
    int e;
    boolean f;

    public esq() {
        this.a = -1;
        this.f = true;
    }

    public esq a(int i) {
        this.a = i;
        if (i != -1) {
            this.d = fde.g(i);
        }
        return this;
    }

    public esq a(lof lof) {
        this.b = lof;
        return this;
    }

    public esq a(boolean z) {
        this.c = true;
        return this;
    }

    public esq b(int i) {
        this.e = i;
        return this;
    }

    public esp a() {
        return new esp(this);
    }
}
