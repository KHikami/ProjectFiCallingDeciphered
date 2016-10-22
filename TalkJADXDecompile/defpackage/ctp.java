package defpackage;

/* renamed from: ctp */
final class ctp implements Runnable {
    final /* synthetic */ ctn a;

    ctp(ctn ctn) {
        this.a = ctn;
    }

    public void run() {
        ctn ctn = this.a;
        for (ctt a : ctn.k) {
            a.a(ctn.p, ctn.g.a());
        }
    }
}
