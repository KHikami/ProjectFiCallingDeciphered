package defpackage;

/* renamed from: boe */
final class boe implements Runnable {
    private /* synthetic */ bob a;

    boe(bob bob) {
        this.a = bob;
    }

    public final void run() {
        bob bob = this.a;
        bob.o();
        bob.j().b();
        if (!bob.a("android.permission.ACCESS_NETWORK_STATE")) {
            bob.f("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            bob.m();
        }
        if (!bob.a("android.permission.INTERNET")) {
            bob.f("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            bob.m();
        }
        if (bmd.a(bob.g())) {
            bob.b("AnalyticsService registered in the app manifest and enabled");
        } else if (btq.a) {
            bob.f("Device AnalyticsService not registered! Hits will not be delivered reliably.");
        } else {
            bob.e("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!(bob.h || btq.a || bob.b.l())) {
            bob.c();
        }
        bob.l();
    }
}
