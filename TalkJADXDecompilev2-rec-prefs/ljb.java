package p000;

import android.content.Context;

public final class ljb {
    private final dr f25077a;

    public ljb(dr drVar) {
        this.f25077a = drVar;
    }

    public void m29158a() {
        if (lkb.m29208a(lhc.I_AM_THE_FRAMEWORK)) {
            lkb.m29202a("Fragment:onActivityResult").m29175a();
        } else {
            gwb.aC((Context) bm.m6123a(this.f25077a.getActivity(), (Object) "called before fragment was attached to an Activity")).m29183b("Fragment:onActivityResult");
        }
    }

    public void m29159b() {
        if (lkb.m29208a(lhc.I_AM_THE_FRAMEWORK)) {
            lkb.m29202a("Fragment:onOptionsItemSelected").m29175a();
        } else {
            gwb.aC((Context) bm.m6123a(this.f25077a.getActivity(), (Object) "called before fragment was attached to an Activity")).m29183b("Fragment:onOptionsItemSelected");
        }
    }
}
