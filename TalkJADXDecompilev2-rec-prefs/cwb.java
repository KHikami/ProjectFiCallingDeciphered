package p000;

import com.google.android.apps.hangouts.elane.CallActivity;

public class cwb {
    final /* synthetic */ CallActivity f9224a;

    public void m11152a(boolean z) {
        glk.m17970a("Babel_explane", "[CallActivity] onProximityStateChanged: isNear = " + z, new Object[0]);
        ed J_ = this.f9224a.J_();
        if (z) {
            J_.mo1848b();
            glk.m17970a("Babel_explane", "[CallActivity] onProximityStateChanged: removing fragment", new Object[0]);
            J_.mo1845a().mo1527a(J_.mo1843a(gwb.oC)).mo1522a();
            giw.m17753a(this.f9224a.findViewById(gwb.oC));
            J_.mo1848b();
            return;
        }
        glk.m17970a("Babel_explane", "[CallActivity] onProximityStateChanged: adding fragment", new Object[0]);
        giw.m17754a(this.f9224a.findViewById(gwb.oC), true);
        J_.mo1845a().mo1525a(gwb.oC, this.f9224a.mo1085j()).mo1522a();
    }

    public cwb(CallActivity callActivity) {
        this.f9224a = callActivity;
    }
}
