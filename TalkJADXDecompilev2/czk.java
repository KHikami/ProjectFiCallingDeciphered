package defpackage;

final class czk extends fip {
    final /* synthetic */ czj a;

    czk(czj czj) {
        this.a = czj;
    }

    public void a(int i, bko bko, fiu fiu) {
        evz c = fiu.c();
        synchronized (this.a.c) {
            if (i == this.a.a && this.a.e().isInstance(c)) {
                int i2 = c.c.b;
                if (i2 == 1 || i2 == 0) {
                    this.a.a(fiu);
                } else {
                    this.a.a(new czm());
                }
            }
        }
    }

    public void a(int i, bko bko, fok fok, fdo fdo) {
        synchronized (this.a.c) {
            if (i == this.a.a && this.a.d().isInstance(fok)) {
                this.a.a((Exception) fdo);
            }
        }
    }
}
