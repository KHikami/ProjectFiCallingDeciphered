package defpackage;

public final class dil implements Runnable {
    final /* synthetic */ iie a;
    final /* synthetic */ int b;

    public dil(iie iie, int i) {
        this.a = iie;
        this.b = i;
    }

    public void run() {
        this.a.a().c(this.b);
    }
}
