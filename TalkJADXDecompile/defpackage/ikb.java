package defpackage;

/* renamed from: ikb */
final class ikb implements Runnable {
    final /* synthetic */ ika a;

    ikb(ika ika) {
        this.a = ika;
    }

    public void run() {
        if (!this.a.a) {
            itx.a(4, "vclib", "We still don't have a connection after 10 seconds. Terminate the call");
            ijt ijt = this.a.b;
            if (ijt.a(ijt.c)) {
                ijt.c.c(3);
                ijt.a(11003);
            }
        }
    }
}
