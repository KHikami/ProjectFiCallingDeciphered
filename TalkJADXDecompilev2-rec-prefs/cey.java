package p000;

import android.os.AsyncTask.Status;

final class cey implements bpu {
    final /* synthetic */ cdr f5142a;

    cey(cdr cdr) {
        this.f5142a = cdr;
    }

    public void mo903a(bjg bjg, boolean z, int i) {
        if (z) {
            this.f5142a.m7425x();
            return;
        }
        cdr cdr = this.f5142a;
        cdr.al = null;
        cdr.am = 0;
        cdr.an = null;
        cdr.ao = null;
        cdr.ap = 0;
        cdr.aq = null;
    }

    public void mo904a(String str) {
        if (str != null && (this.f5142a.ay == null || this.f5142a.ay.getStatus() == Status.FINISHED)) {
            int i;
            boolean z;
            int i2;
            switch (cfy.f5214a[this.f5142a.al.ordinal()]) {
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                default:
                    String valueOf = String.valueOf(this.f5142a.al);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Unknown conversation type: ").append(valueOf).toString());
            }
            if (this.f5142a.bx.mo809a()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i2 = 63;
            } else {
                i2 = 58;
            }
            this.f5142a.ay = new epi(this.f5142a.getActivity(), this.f5142a.av, str, z, i, true, i2, 0, false, false).m4950b(new Void[0]);
        }
        cdr cdr = this.f5142a;
        cdr.al = null;
        cdr.am = 0;
        cdr.an = null;
        cdr.ao = null;
        cdr.ap = 0;
        cdr.aq = null;
    }

    public void mo902a() {
        cdr cdr = this.f5142a;
        cdr.al = null;
        cdr.am = 0;
        cdr.an = null;
        cdr.ao = null;
        cdr.ap = 0;
        cdr.aq = null;
    }
}
