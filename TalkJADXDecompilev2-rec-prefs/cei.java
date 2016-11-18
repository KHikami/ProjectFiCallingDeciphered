package p000;

import java.util.Iterator;

final class cei implements bkg {
    final /* synthetic */ cdr f5126a;

    cei(cdr cdr) {
        this.f5126a = cdr;
    }

    public void mo764a() {
        edk edk;
        String str = null;
        cdr cdr = this.f5126a;
        if (cdr.af() || cdr.f5106i.mo931a() == null || !gwb.m2267j(cdr.mo858d())) {
            edk = null;
        } else {
            edk = cdr.mo832Z();
            if (edk == null || !edk.m13589a()) {
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
                str = edk.m13590b();
                str2 = edk.f11216e;
            } else {
                str2 = null;
            }
            if (cdr.bk != null) {
                cdr.bk.mo1661a(str);
            }
            Iterator it = jyn.m25438c(cdr.context, bxu.class).iterator();
            while (it.hasNext()) {
                it.next();
                cdr.av.m5638g();
            }
            cdr.bl.m7286a(str2, str);
        }
    }
}
