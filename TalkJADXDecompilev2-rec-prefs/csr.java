package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.hangouts.elane.CallActivity;
import com.google.android.apps.hangouts.hangout.HangoutActivity;
import java.util.ArrayList;

final class csr implements dlk {
    private Context f9002a;
    private csl f9003b;

    csr(Context context) {
        this.f9002a = context;
        this.f9003b = (csl) jyn.m25426a(context, csl.class);
        cve cve = new cve(context, this.f9003b);
    }

    public Class<?> mo1406a(Bundle bundle) {
        dhz dhz = (dhz) bundle.getParcelable("hangout_room_info");
        int b = ((jcf) jyn.m25426a(this.f9002a, jcf.class)).mo3461b(dhz.m11885a());
        boolean z;
        if (bundle.getInt("hangout_start_source") == 62) {
            z = true;
        } else {
            z = false;
        }
        iil.m21875b("Expected non-null", (Object) dhz);
        if (fdq.f12777S.m14370b(b) && gwb.m1924a(dhz, r1)) {
            glk.m17970a("Babel_explane", "getActivityClass: CallActivity", new Object[0]);
            return CallActivity.class;
        }
        glk.m17970a("Babel_explane", "getActivityClass: HangoutActivity", new Object[0]);
        return HangoutActivity.class;
    }

    public void mo1410a(dhz dhz, ArrayList<edk> arrayList) {
        int b = ((jcf) jyn.m25426a(this.f9002a, jcf.class)).mo3461b(dhz.m11885a());
        boolean b2 = fdq.f12776R.m14370b(b);
        boolean b3 = fdq.f12777S.m14370b(b);
        if (!b2 || !b3) {
            return;
        }
        if (this.f9003b.mo1398a() != null) {
            glk.m17981d("Babel_explane", "handleNewCallStart: Already have a call, ignore new call start.", new Object[0]);
            return;
        }
        mo1409a(dhz, null, true, !arrayList.isEmpty(), true, false);
        ctn a = this.f9003b.mo1398a();
        if (a == null) {
            glk.m17981d("Babel_explane", "handleNewCallStart: No call to start", new Object[0]);
        } else if (!arrayList.isEmpty()) {
            a.m10978j().m11029a(arrayList, true);
        }
    }

    public void mo1409a(dhz dhz, dli dli, boolean z, boolean z2, boolean z3, boolean z4) {
        int b = ((jcf) jyn.m25426a(this.f9002a, jcf.class)).mo3461b(dhz.m11885a());
        if (fdq.f12777S.m14370b(b)) {
            ctn ctn;
            ctn a = this.f9003b.mo1398a();
            if (a != null) {
                if (!(a.m10973e() == -1 || dli == null)) {
                    boolean z5;
                    if (a.m10973e() == 7) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    m10893a(dli, z5);
                }
                ctn = a;
            } else if ((z4 || !dgg.m11692a().m11722n()) && gwb.m1924a(dhz, z4)) {
                boolean b2 = fdq.f12776R.m14370b(b);
                ctn = ctn.m10954a(this.f9002a, dhz, b2 ? null : dli, z, z2, z3);
                m10894b(ctn);
                if (b2 && dli != null) {
                    m10893a(dli, true);
                }
            } else if (dli != null) {
                m10893a(dli, false);
                return;
            } else {
                return;
            }
            if (z && !ctn.m10983o()) {
                ctn.m10982n();
            }
        } else if (dli != null) {
            dli.m12187a(false);
        }
    }

    public void mo1408a(dhz dhz, Activity activity) {
        if (fdq.f12777S.m14370b(((jcf) jyn.m25426a(this.f9002a, jcf.class)).mo3461b(dhz.m11885a()))) {
            ctn a = this.f9003b.mo1398a();
            if (!a.m10966a(dhz)) {
                m10897a(a);
                ite f = a.m10974f();
                f.mo3217a(new css(this, f, dhz, activity));
                a.m10985q();
            }
        }
    }

    public void mo1407a(dhz dhz) {
        if (!fdq.f12777S.m14370b(((jcf) jyn.m25426a(this.f9002a, jcf.class)).mo3461b(dhz.m11885a()))) {
            return;
        }
        if (gwb.m2281k(this.f9002a)) {
            glk.m17981d("Babel_explane", "handleIncomingRing: there is a call going on", new Object[0]);
        } else if (gwb.m1924a(dhz, true)) {
            m10894b(ctn.m10954a(this.f9002a, dhz, null, true, false, false));
        }
    }

    public void mo1413b(dhz dhz) {
        if (fdq.f12777S.m14370b(((jcf) jyn.m25426a(this.f9002a, jcf.class)).mo3461b(dhz.m11885a()))) {
            ctn a = this.f9003b.mo1398a();
            if (a == null) {
                glk.m17981d("Babel_explane", "handleRingStop: call is gone", new Object[0]);
                return;
            }
            CharSequence d = a.m10972d();
            if (d == null) {
                glk.m17981d("Babel_explane", "handleRingStop: hangout id is null", new Object[0]);
            } else if (!TextUtils.equals(d, dhz.m11897g())) {
                glk.m17979c("Babel_explane", "handleRingStop: hangout id does not match", new Object[0]);
            } else if (!a.m10983o()) {
                glk.m17979c("Babel_explane", "handleRingStop: abandoning the call, was not joined", new Object[0]);
                a.m10985q();
                m10897a(a);
            }
        }
    }

    public void mo1415c(dhz dhz) {
        if (fdq.f12777S.m14370b(((jcf) jyn.m25426a(this.f9002a, jcf.class)).mo3461b(dhz.m11885a()))) {
            ctn a = this.f9003b.mo1398a();
            if (a == null) {
                glk.m17979c("Babel_explane", "handleRingCancel: call is gone", new Object[0]);
                return;
            }
            CharSequence d = a.m10972d();
            if (d == null) {
                glk.m17979c("Babel_explane", "handleRingCancel: hangout id is null", new Object[0]);
            } else if (!TextUtils.equals(d, dhz.m11897g())) {
                glk.m17979c("Babel_explane", "handleRingCancel: hangout id does not match", new Object[0]);
            } else if (a.m10976h().m11100c().isEmpty()) {
                a.m10968b(11009);
            }
        }
    }

    public void mo1411a(mcu mcu) {
        ctn a = this.f9003b.mo1398a();
        if (a != null) {
            mcu.f27374a = fde.m15023g(((jcf) jyn.m25426a(this.f9002a, jcf.class)).mo3461b(a.m10967b()));
            mcu.f27384k = a.m10958a();
            lyh a2 = ((ijb) a.m10974f().mo3229t().m21926a(ijb.class)).mo3375a();
            if (a2 != null) {
                mcu.f27376c = a2.f26866a;
                if (a2.f26873h != null) {
                    mcu.f27379f = new mds();
                    mcu.f27379f.f27528a = a2.f26873h.f25931a;
                }
            }
            ith o = a.m10974f().mo3224o();
            mcu.f27375b = o.m23212d();
            mcu.f27378e = o.m23214f();
            lym a3 = ((ijd) a.m10974f().mo3229t().m21926a(ijd.class)).mo3376a();
            if (a3 != null) {
                mcu.f27377d = a3.f26907b;
            }
        }
    }

    public int mo1405a() {
        ctn a = this.f9003b.mo1398a();
        if (a != null) {
            return ((jcf) jyn.m25426a(this.f9002a, jcf.class)).mo3461b(a.m10967b());
        }
        bko v = gwb.m2370v();
        if (v != null) {
            return v.m5638g();
        }
        return -1;
    }

    public int mo1412b() {
        if (this.f9003b.mo1398a() != null) {
            return 412;
        }
        did s = dgg.m11692a().m11727s();
        if (s == null || !s.m11988j()) {
            return 407;
        }
        return 408;
    }

    public int mo1414c() {
        if (this.f9003b.mo1398a() != null) {
            return 412;
        }
        did s = dgg.m11692a().m11727s();
        if (s == null || !s.m11988j()) {
            return 407;
        }
        return 408;
    }

    public boolean mo1416d() {
        return this.f9003b.mo1398a() != null;
    }

    private void m10894b(ctn ctn) {
        ctn.m10974f().mo3217a(new cst(this, ctn));
        ctn.m10976h().m11092a(new csu(this, ctn));
        ctn.m10978j().m11031a(new csv(this, ctn));
        this.f9003b.mo1400a(ctn);
    }

    void m10897a(ctn ctn) {
        if (ctn == this.f9003b.mo1398a()) {
            this.f9003b.mo1400a(null);
        }
    }

    private void m10893a(dli dli, boolean z) {
        gwb.m1863a(new csw(this, dli, z));
    }
}
