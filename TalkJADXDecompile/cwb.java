import com.google.android.apps.hangouts.elane.CallActivity;

public class cwb {
    final /* synthetic */ CallActivity a;

    public void a(boolean z) {
        glk.a("Babel_explane", "[CallActivity] onProximityStateChanged: isNear = " + z, new Object[0]);
        ed J_ = this.a.J_();
        if (z) {
            J_.b();
            glk.a("Babel_explane", "[CallActivity] onProximityStateChanged: removing fragment", new Object[0]);
            J_.a().a(J_.a(gwb.oC)).a();
            giw.a(this.a.findViewById(gwb.oC));
            J_.b();
            return;
        }
        glk.a("Babel_explane", "[CallActivity] onProximityStateChanged: adding fragment", new Object[0]);
        giw.a(this.a.findViewById(gwb.oC), true);
        J_.a().a(gwb.oC, this.a.j()).a();
    }

    public cwb(CallActivity callActivity) {
        this.a = callActivity;
    }
}
