package defpackage;

final class jmm implements Runnable {
    final /* synthetic */ jmj a;
    final /* synthetic */ jmu b;
    final /* synthetic */ jml c;

    jmm(jml jml, jmj jmj, jmu jmu) {
        this.c = jml;
        this.a = jmj;
        this.b = jmu;
    }

    public void run() {
        this.c.c.b.a(this.c.c.a.J_(), this.b, this.c.c.c);
        this.c.c.d = null;
    }
}
