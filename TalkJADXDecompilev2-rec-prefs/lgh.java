package p000;

final class lgh implements Runnable {
    final /* synthetic */ int f24948a;
    final /* synthetic */ lgg f24949b;

    lgh(lgg lgg, int i) {
        this.f24949b = lgg;
        this.f24948a = i;
    }

    public void run() {
        this.f24949b.stopSelf(this.f24948a);
    }
}
