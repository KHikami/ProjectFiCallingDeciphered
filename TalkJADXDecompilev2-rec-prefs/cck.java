package p000;

final class cck implements Runnable {
    final /* synthetic */ ccj f5009a;

    cck(ccj ccj) {
        this.f5009a = ccj;
    }

    public void run() {
        blo blo = new blo(this.f5009a.f5008b.f4999a, this.f5009a.f5007a);
        blo.m5958a();
        try {
            blo.m5909B(this.f5009a.f5008b.f5001c.f4146a);
            blo.m6015b();
            blf.m5757a(this.f5009a.f5007a);
        } finally {
            blo.m6028c();
        }
    }
}
