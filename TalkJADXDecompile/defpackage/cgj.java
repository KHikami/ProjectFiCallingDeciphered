package defpackage;

/* renamed from: cgj */
final class cgj implements Runnable {
    final /* synthetic */ cgi a;

    cgj(cgi cgi) {
        this.a = cgi;
    }

    public void run() {
        if (this.a.a == cgk.a) {
            this.a.a = cgk.b;
            cgi cgi = this.a;
            if (cgi.a == cgk.b && !cgi.c.af() && cgi.c.aA != 1) {
                for (ccw ccw : cgi.c.bw) {
                    boolean a = ccw.a();
                    ccw.a(a);
                    if (ccw instanceof ddo) {
                        if (a && !cgi.b) {
                            gwb.a(cgi.c.av, 2100);
                            cgi.b = true;
                        } else if (cgi.b && !a) {
                            gwb.a(cgi.c.av, 2101);
                            cgi.b = false;
                        }
                    }
                }
                cgi.c.bx.a(cgi.c.bx.a());
            }
        }
    }
}
