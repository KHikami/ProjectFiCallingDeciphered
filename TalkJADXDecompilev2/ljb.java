package defpackage;

import android.content.Context;

public final class ljb {
    private final dr a;

    public ljb(dr drVar) {
        this.a = drVar;
    }

    public void a() {
        if (lkb.a(lhc.I_AM_THE_FRAMEWORK)) {
            lkb.a("Fragment:onActivityResult").a();
        } else {
            gwb.aC((Context) bm.a(this.a.getActivity(), (Object) "called before fragment was attached to an Activity")).b("Fragment:onActivityResult");
        }
    }

    public void b() {
        if (lkb.a(lhc.I_AM_THE_FRAMEWORK)) {
            lkb.a("Fragment:onOptionsItemSelected").a();
        } else {
            gwb.aC((Context) bm.a(this.a.getActivity(), (Object) "called before fragment was attached to an Activity")).b("Fragment:onOptionsItemSelected");
        }
    }
}
