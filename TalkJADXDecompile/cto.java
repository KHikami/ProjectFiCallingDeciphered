final class cto implements Runnable {
    final /* synthetic */ ctn a;

    cto(ctn ctn) {
        this.a = ctn;
    }

    public void run() {
        glk.e("Babel", "Hangout initial join timed out", new Object[0]);
        ctn ctn = this.a;
        ctv ctu = new ctu(10003);
        if (ctn.m == null) {
            ctn.m = ctu;
            for (ctt a : ctn.k) {
                a.a(ctn.m);
            }
            switch (cts.a[ctu.b - 1]) {
                case wi.j /*1*/:
                    ctn.c.a(10030);
                case wi.l /*2*/:
                    ctn.c.a(((ctu) ctu).a);
                case wi.z /*3*/:
                    ctn.c.a(72);
                default:
            }
        }
    }
}
