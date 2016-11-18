package defpackage;

final class jir implements Runnable {
    final /* synthetic */ jiq a;

    jir(jiq jiq) {
        this.a = jiq;
    }

    public void run() {
        this.a.a.run();
        this.a.b.a(this.a);
    }
}
