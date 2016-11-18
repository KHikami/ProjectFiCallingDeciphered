package defpackage;

public final class wu<T2> extends wv<T2> {
    final wv<T2> a;
    private final wr b = new wr(this.a);

    public wu(wv<T2> wvVar) {
        this.a = wvVar;
    }

    public int compare(T2 t2, T2 t22) {
        return this.a.compare(t2, t22);
    }

    public void a(int i, int i2) {
        this.b.a(i, i2);
    }

    public void b(int i, int i2) {
        this.b.b(i, i2);
    }

    public void c(int i, int i2) {
        this.b.c(i, i2);
    }

    public void d(int i, int i2) {
        this.b.a(i, i2, null);
    }

    public boolean a(T2 t2, T2 t22) {
        return this.a.a(t2, t22);
    }

    public boolean b(T2 t2, T2 t22) {
        return this.a.b(t2, t22);
    }

    public void a() {
        this.b.a();
    }
}
