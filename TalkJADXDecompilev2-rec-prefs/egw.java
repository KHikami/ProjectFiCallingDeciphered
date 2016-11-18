package p000;

import android.os.Bundle;
import java.util.List;

final class egw implements eib {
    final /* synthetic */ egv f11476a;

    egw(egv egv) {
        this.f11476a = egv;
    }

    public void mo748a(List<eic> list, Bundle bundle) {
        boolean z = ((eic) list.get(0)).f11581b && ((eic) list.get(1)).f11581b;
        glk.m17979c("Babel", "granted:" + z, new Object[0]);
        if (z) {
            this.f11476a.m13905a(true);
            ((dwt) this.f11476a.binder.m25443a(dwt.class)).mo1760a();
        }
    }
}
