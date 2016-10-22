import java.util.Iterator;

final class cei implements bkg {
    final /* synthetic */ cdr a;

    cei(cdr cdr) {
        this.a = cdr;
    }

    public void a() {
        edk edk;
        String str = null;
        cdr cdr = this.a;
        if (cdr.af() || cdr.i.a() == null || !gwb.j(cdr.d())) {
            edk = null;
        } else {
            edk = cdr.Z();
            if (edk == null || !edk.a()) {
                edk = null;
            }
        }
        if (cdr.bj == edk) {
            return;
        }
        if (cdr.bj == null || !cdr.bj.equals(edk)) {
            String str2;
            cdr.bj = edk;
            if (cdr.bj != null) {
                str = edk.b();
                str2 = edk.e;
            } else {
                str2 = null;
            }
            if (cdr.bk != null) {
                cdr.bk.a(str);
            }
            Iterator it = jyn.c(cdr.context, bxu.class).iterator();
            while (it.hasNext()) {
                it.next();
                cdr.av.g();
            }
            cdr.bl.a(str2, str);
        }
    }
}
