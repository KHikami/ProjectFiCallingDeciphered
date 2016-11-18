package defpackage;

final class hgl implements Runnable {
    final /* synthetic */ hga a;
    final /* synthetic */ String b;
    final /* synthetic */ hgk c;

    hgl(hgk hgk, hga hga, String str) {
        this.c = hgk;
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
