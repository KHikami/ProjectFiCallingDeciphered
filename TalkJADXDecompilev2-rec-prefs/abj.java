package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

final class abj implements abn {
    abj() {
    }

    public void mo20a(abk abk, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        abk.m213a(new aev(colorStateList, f));
        View d = abk.m216d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        m201a(abk, f3);
    }

    public void mo19a() {
    }

    private void m201a(abk abk, float f) {
        abj.m205f(abk).m891a(f, abk.m214b(), abk.m215c());
        m204e(abk);
    }

    private float m202c(abk abk) {
        return abj.m205f(abk).m890a();
    }

    public float mo18a(abk abk) {
        return m203d(abk) * 2.0f;
    }

    public float mo21b(abk abk) {
        return m203d(abk) * 2.0f;
    }

    private float m203d(abk abk) {
        return abj.m205f(abk).m892b();
    }

    private void m204e(abk abk) {
        if (abk.m214b()) {
            float c = m202c(abk);
            float d = m203d(abk);
            int ceil = (int) Math.ceil((double) aew.m896b(c, d, abk.m215c()));
            int ceil2 = (int) Math.ceil((double) aew.m893a(c, d, abk.m215c()));
            abk.m212a(ceil, ceil2, ceil, ceil2);
            return;
        }
        abk.m212a(0, 0, 0, 0);
    }

    private static aev m205f(abk abk) {
        return (aev) abk.m210a();
    }
}
