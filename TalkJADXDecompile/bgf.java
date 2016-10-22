final class bgf implements Runnable {
    final /* synthetic */ fed a;
    final /* synthetic */ int b;
    final /* synthetic */ loa[] c;
    final /* synthetic */ bge d;

    bgf(bge bge, fed fed, int i, loa[] loaArr) {
        this.d = bge;
        this.a = fed;
        this.b = i;
        this.c = loaArr;
    }

    public void run() {
        this.a.a(this.b, this.c);
    }
}
