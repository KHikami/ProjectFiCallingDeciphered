package p000;

final class cto implements Runnable {
    final /* synthetic */ ctn f9069a;

    cto(ctn ctn) {
        this.f9069a = ctn;
    }

    public void run() {
        glk.m17982e("Babel", "Hangout initial join timed out", new Object[0]);
        ctn ctn = this.f9069a;
        ctv ctu = new ctu(10003);
        if (ctn.f9055m == null) {
            ctn.f9055m = ctu;
            for (ctt a : ctn.f9053k) {
                a.mo1394a(ctn.f9055m);
            }
            switch (cts.f9073a[ctu.f9074b - 1]) {
                case 1:
                    ctn.f9045c.mo3213a(10030);
                    return;
                case 2:
                    ctn.f9045c.mo3213a(((ctu) ctu).f9075a);
                    return;
                case 3:
                    ctn.f9045c.mo3213a(72);
                    return;
                default:
                    return;
            }
        }
    }
}
