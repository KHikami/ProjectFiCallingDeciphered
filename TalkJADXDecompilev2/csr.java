package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.hangouts.elane.CallActivity;
import com.google.android.apps.hangouts.hangout.HangoutActivity;
import java.util.ArrayList;

final class csr implements dlk {
    private Context a;
    private csl b;

    csr(Context context) {
        this.a = context;
        this.b = (csl) jyn.a(context, csl.class);
        cve cve = new cve(context, this.b);
    }

    public Class<?> a(Bundle bundle) {
        dhz dhz = (dhz) bundle.getParcelable("hangout_room_info");
        int b = ((jcf) jyn.a(this.a, jcf.class)).b(dhz.a());
        boolean z;
        if (bundle.getInt("hangout_start_source") == 62) {
            z = true;
        } else {
            z = false;
        }
        iil.b("Expected non-null", (Object) dhz);
        if (fdq.S.b(b) && gwb.a(dhz, r1)) {
            glk.a("Babel_explane", "getActivityClass: CallActivity", new Object[0]);
            return CallActivity.class;
        }
        glk.a("Babel_explane", "getActivityClass: HangoutActivity", new Object[0]);
        return HangoutActivity.class;
    }

    public void a(dhz dhz, ArrayList<edk> arrayList) {
        int b = ((jcf) jyn.a(this.a, jcf.class)).b(dhz.a());
        boolean b2 = fdq.R.b(b);
        boolean b3 = fdq.S.b(b);
        if (!b2 || !b3) {
            return;
        }
        if (this.b.a() != null) {
            glk.d("Babel_explane", "handleNewCallStart: Already have a call, ignore new call start.", new Object[0]);
            return;
        }
        a(dhz, null, true, !arrayList.isEmpty(), true, false);
        ctn a = this.b.a();
        if (a == null) {
            glk.d("Babel_explane", "handleNewCallStart: No call to start", new Object[0]);
        } else if (!arrayList.isEmpty()) {
            a.j().a(arrayList, true);
        }
    }

    public void a(dhz dhz, dli dli, boolean z, boolean z2, boolean z3, boolean z4) {
        int b = ((jcf) jyn.a(this.a, jcf.class)).b(dhz.a());
        if (fdq.S.b(b)) {
            ctn ctn;
            ctn a = this.b.a();
            if (a != null) {
                if (!(a.e() == -1 || dli == null)) {
                    boolean z5;
                    if (a.e() == 7) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    a(dli, z5);
                }
                ctn = a;
            } else if ((z4 || !dgg.a().n()) && gwb.a(dhz, z4)) {
                boolean b2 = fdq.R.b(b);
                ctn = ctn.a(this.a, dhz, b2 ? null : dli, z, z2, z3);
                b(ctn);
                if (b2 && dli != null) {
                    a(dli, true);
                }
            } else if (dli != null) {
                a(dli, false);
                return;
            } else {
                return;
            }
            if (z && !ctn.o()) {
                ctn.n();
            }
        } else if (dli != null) {
            dli.a(false);
        }
    }

    public void a(dhz dhz, Activity activity) {
        if (fdq.S.b(((jcf) jyn.a(this.a, jcf.class)).b(dhz.a()))) {
            ctn a = this.b.a();
            if (!a.a(dhz)) {
                a(a);
                ite f = a.f();
                f.a(new css(this, f, dhz, activity));
                a.q();
            }
        }
    }

    public void a(dhz dhz) {
        if (!fdq.S.b(((jcf) jyn.a(this.a, jcf.class)).b(dhz.a()))) {
            return;
        }
        if (gwb.k(this.a)) {
            glk.d("Babel_explane", "handleIncomingRing: there is a call going on", new Object[0]);
        } else if (gwb.a(dhz, true)) {
            b(ctn.a(this.a, dhz, null, true, false, false));
        }
    }

    public void b(dhz dhz) {
        if (fdq.S.b(((jcf) jyn.a(this.a, jcf.class)).b(dhz.a()))) {
            ctn a = this.b.a();
            if (a == null) {
                glk.d("Babel_explane", "handleRingStop: call is gone", new Object[0]);
                return;
            }
            CharSequence d = a.d();
            if (d == null) {
                glk.d("Babel_explane", "handleRingStop: hangout id is null", new Object[0]);
            } else if (!TextUtils.equals(d, dhz.g())) {
                glk.c("Babel_explane", "handleRingStop: hangout id does not match", new Object[0]);
            } else if (!a.o()) {
                glk.c("Babel_explane", "handleRingStop: abandoning the call, was not joined", new Object[0]);
                a.q();
                a(a);
            }
        }
    }

    public void c(dhz dhz) {
        if (fdq.S.b(((jcf) jyn.a(this.a, jcf.class)).b(dhz.a()))) {
            ctn a = this.b.a();
            if (a == null) {
                glk.c("Babel_explane", "handleRingCancel: call is gone", new Object[0]);
                return;
            }
            CharSequence d = a.d();
            if (d == null) {
                glk.c("Babel_explane", "handleRingCancel: hangout id is null", new Object[0]);
            } else if (!TextUtils.equals(d, dhz.g())) {
                glk.c("Babel_explane", "handleRingCancel: hangout id does not match", new Object[0]);
            } else if (a.h().c().isEmpty()) {
                a.b(11009);
            }
        }
    }

    public void a(mcu mcu) {
        ctn a = this.b.a();
        if (a != null) {
            mcu.a = fde.g(((jcf) jyn.a(this.a, jcf.class)).b(a.b()));
            mcu.k = a.a();
            lyh a2 = ((ijb) a.f().t().a(ijb.class)).a();
            if (a2 != null) {
                mcu.c = a2.a;
                if (a2.h != null) {
                    mcu.f = new mds();
                    mcu.f.a = a2.h.a;
                }
            }
            ith o = a.f().o();
            mcu.b = o.d();
            mcu.e = o.f();
            lym a3 = ((ijd) a.f().t().a(ijd.class)).a();
            if (a3 != null) {
                mcu.d = a3.b;
            }
        }
    }

    public int a() {
        ctn a = this.b.a();
        if (a != null) {
            return ((jcf) jyn.a(this.a, jcf.class)).b(a.b());
        }
        bko v = gwb.v();
        if (v != null) {
            return v.g();
        }
        return -1;
    }

    public int b() {
        if (this.b.a() != null) {
            return 412;
        }
        did s = dgg.a().s();
        if (s == null || !s.j()) {
            return 407;
        }
        return 408;
    }

    public int c() {
        if (this.b.a() != null) {
            return 412;
        }
        did s = dgg.a().s();
        if (s == null || !s.j()) {
            return 407;
        }
        return 408;
    }

    public boolean d() {
        return this.b.a() != null;
    }

    private void b(ctn ctn) {
        ctn.f().a(new cst(this, ctn));
        ctn.h().a(new csu(this, ctn));
        ctn.j().a(new csv(this, ctn));
        this.b.a(ctn);
    }

    void a(ctn ctn) {
        if (ctn == this.b.a()) {
            this.b.a(null);
        }
    }

    private void a(dli dli, boolean z) {
        gwb.a(new csw(this, dli, z));
    }
}
