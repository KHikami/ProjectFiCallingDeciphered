package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: abj */
final class abj implements abn {
    abj() {
    }

    public void a(abk abk, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        abk.a(new aev(colorStateList, f));
        View d = abk.d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        a(abk, f3);
    }

    public void a() {
    }

    private void a(abk abk, float f) {
        abj.f(abk).a(f, abk.b(), abk.c());
        e(abk);
    }

    private float c(abk abk) {
        return abj.f(abk).a();
    }

    public float a(abk abk) {
        return d(abk) * 2.0f;
    }

    public float b(abk abk) {
        return d(abk) * 2.0f;
    }

    private float d(abk abk) {
        return abj.f(abk).b();
    }

    private void e(abk abk) {
        if (abk.b()) {
            float c = c(abk);
            float d = d(abk);
            int ceil = (int) Math.ceil((double) aew.b(c, d, abk.c()));
            int ceil2 = (int) Math.ceil((double) aew.a(c, d, abk.c()));
            abk.a(ceil, ceil2, ceil, ceil2);
            return;
        }
        abk.a(0, 0, 0, 0);
    }

    private static aev f(abk abk) {
        return (aev) abk.a();
    }
}
