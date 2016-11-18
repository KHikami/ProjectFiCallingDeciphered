package p000;

final class mto implements Runnable {
    final /* synthetic */ Runnable f28290a;
    final /* synthetic */ mtn f28291b;

    mto(mtn mtn, Runnable runnable) {
        this.f28291b = mtn;
        this.f28290a = runnable;
    }

    public void run() {
        this.f28291b.f28287a = false;
        this.f28290a.run();
    }
}
