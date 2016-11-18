package p000;

import android.os.Bundle;
import java.util.List;

final class eqm implements eib {
    final /* synthetic */ Bundle f12059a;
    final /* synthetic */ eql f12060b;

    eqm(eql eql, Bundle bundle) {
        this.f12060b = eql;
        this.f12059a = bundle;
    }

    public void mo748a(List<eic> list, Bundle bundle) {
        boolean z;
        iil.m21869a(Integer.valueOf(list.size()), Integer.valueOf(1));
        eic eic = (eic) list.get(0);
        iil.m21869a(eic.f11580a, (Object) "android.permission.READ_PHONE_STATE");
        if (eic.f11581b) {
            this.f12060b.am = eqr.f12070c;
        } else {
            this.f12060b.am = eqr.f12069b;
        }
        this.f12060b.f12052c = this.f12060b.m14277r();
        eql eql = this.f12060b;
        if (this.f12059a == null) {
            z = true;
        } else {
            z = false;
        }
        eql.m14271a(z);
    }
}
