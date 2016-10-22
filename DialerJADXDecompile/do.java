final class do implements Runnable {
    private /* synthetic */ int a;
    private /* synthetic */ int b;
    private /* synthetic */ dm c;

    do(dm dmVar, int i, int i2) {
        this.c = dmVar;
        this.a = i;
        this.b = i2;
    }

    public final void run() {
        dm dmVar = this.c;
        dk dkVar = this.c.h;
        dmVar.a(null, this.a, this.b);
    }
}
