package defpackage;

/* renamed from: hgd */
final class hgd implements Runnable {
    final /* synthetic */ hga a;
    final /* synthetic */ String b;
    final /* synthetic */ hgc c;

    hgd(hgc hgc, hga hga, String str) {
        this.c = hgc;
        this.a = hga;
        this.b = str;
    }

    public void run() {
        if (this.c.c > 0) {
            this.a.a(this.c.d != null ? this.c.d.getBundle(this.b) : null);
        }
        if (this.c.c >= 2) {
            this.a.a();
        }
        if (this.c.c >= 3) {
            this.a.b();
        }
    }
}
