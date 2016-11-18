package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

final class dhn implements dpo {
    final /* synthetic */ dhm f9762a;

    dhn(dhm dhm) {
        this.f9762a = dhm;
    }

    public void mo1455a(Activity activity, Bundle bundle) {
        did s = dgg.m11692a().m11727s();
        if (s != null) {
            s.m11959a(bundle);
            ikd p = s.m11994p();
            if (p != null) {
                p.m22114a(bundle);
            }
            bko e = fde.m15018e(((jca) jyn.m25426a((Context) activity, jca.class)).mo2317a());
            if (e != null && gwb.m2155d(e)) {
                s.m11982e("Triggering log upload for troubleshooting.");
            }
        }
    }
}
