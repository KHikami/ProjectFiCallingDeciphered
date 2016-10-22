package defpackage;

import android.os.AsyncTask.Status;

/* renamed from: cey */
final class cey implements bpu {
    final /* synthetic */ cdr a;

    cey(cdr cdr) {
        this.a = cdr;
    }

    public void a(bjg bjg, boolean z, int i) {
        if (z) {
            this.a.x();
            return;
        }
        cdr cdr = this.a;
        cdr.al = null;
        cdr.am = 0;
        cdr.an = null;
        cdr.ao = null;
        cdr.ap = 0;
        cdr.aq = null;
    }

    public void a(String str) {
        if (str != null && (this.a.ay == null || this.a.ay.getStatus() == Status.FINISHED)) {
            int i;
            boolean z;
            int i2;
            switch (cfy.a[this.a.al.ordinal()]) {
                case wi.j /*1*/:
                    i = 1;
                    break;
                case wi.l /*2*/:
                    i = 2;
                    break;
                default:
                    String valueOf = String.valueOf(this.a.al);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Unknown conversation type: ").append(valueOf).toString());
            }
            if (this.a.bx.a()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i2 = 63;
            } else {
                i2 = 58;
            }
            this.a.ay = new epi(this.a.getActivity(), this.a.av, str, z, i, true, i2, 0, false, false).b(new Void[0]);
        }
        cdr cdr = this.a;
        cdr.al = null;
        cdr.am = 0;
        cdr.an = null;
        cdr.ao = null;
        cdr.ap = 0;
        cdr.aq = null;
    }

    public void a() {
        cdr cdr = this.a;
        cdr.al = null;
        cdr.am = 0;
        cdr.an = null;
        cdr.ao = null;
        cdr.ap = 0;
        cdr.aq = null;
    }
}
