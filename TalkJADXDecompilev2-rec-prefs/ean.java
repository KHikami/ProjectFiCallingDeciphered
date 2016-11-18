package p000;

import android.content.Context;
import java.util.Locale;

final class ean extends ecw {
    private final String f11054a;

    ean(Context context, int i, eap eap, int i2, boolean z) {
        super(context, i, eap, false);
        this.f11054a = String.format(Locale.US, "%02d", new Object[]{Integer.valueOf(i2)});
    }

    protected void mo1806a() {
        this.w.m16437b(Integer.toString(this.s)).m16441c(this.f11054a);
        super.mo1806a();
    }

    protected boolean mo1808b() {
        return false;
    }

    protected void mo1809c() {
        if (eao.m13370b(this.r)) {
            gwb.m1823a(fde.m15018e(this.s), 1929);
        }
    }
}
