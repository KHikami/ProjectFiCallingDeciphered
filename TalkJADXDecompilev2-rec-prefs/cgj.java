package p000;

final class cgj implements Runnable {
    final /* synthetic */ cgi f5249a;

    cgj(cgi cgi) {
        this.f5249a = cgi;
    }

    public void run() {
        if (this.f5249a.f5246a == cgk.f5250a) {
            this.f5249a.f5246a = cgk.f5251b;
            cgi cgi = this.f5249a;
            if (cgi.f5246a == cgk.f5251b && !cgi.f5248c.af() && cgi.f5248c.aA != 1) {
                for (ccw ccw : cgi.f5248c.bw) {
                    boolean a = ccw.mo809a();
                    ccw.mo806a(a);
                    if (ccw instanceof ddo) {
                        if (a && !cgi.f5247b) {
                            gwb.m1823a(cgi.f5248c.av, 2100);
                            cgi.f5247b = true;
                        } else if (cgi.f5247b && !a) {
                            gwb.m1823a(cgi.f5248c.av, 2101);
                            cgi.f5247b = false;
                        }
                    }
                }
                cgi.f5248c.bx.mo806a(cgi.f5248c.bx.mo809a());
            }
        }
    }
}
