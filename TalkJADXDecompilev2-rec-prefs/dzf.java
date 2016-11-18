package p000;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.hangouts.R$drawable;

public final class dzf extends dyy {
    public int mo1639a() {
        return bc.bu;
    }

    public int mo1641b() {
        return R$drawable.ce;
    }

    public int mo1642c() {
        return 4;
    }

    public void mo1640a(Activity activity) {
        gwb.m1823a(this.a, 1604);
        if (this.a != null) {
            ((fuz) jyn.m25426a((Context) activity, fuz.class)).m16290a(activity, this.a.m5638g(), null);
        } else {
            glk.m17982e("Babel", "Unexpected null account in dnd_item", new Object[0]);
        }
    }

    public int mo1643d() {
        return 1;
    }

    public int mo1644e() {
        return 4;
    }
}
