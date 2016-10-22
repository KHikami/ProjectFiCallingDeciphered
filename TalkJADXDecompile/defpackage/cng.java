package defpackage;

/* renamed from: cng */
final class cng implements Runnable {
    final /* synthetic */ cnf a;

    cng(cnf cnf) {
        this.a = cnf;
    }

    public void run() {
        this.a.a.set(true);
    }
}
