package defpackage;

final class mto implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ mtn b;

    mto(mtn mtn, Runnable runnable) {
        this.b = mtn;
        this.a = runnable;
    }

    public void run() {
        this.b.a = false;
        this.a.run();
    }
}
