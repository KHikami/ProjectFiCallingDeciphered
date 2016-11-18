package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;

public final class eba extends eat {
    private final int f11084c;

    eba(Context context, int i, gjj gjj, int i2, long j) {
        super(context, i, gjj, j);
        this.f11084c = i2;
    }

    protected void mo1807a(boolean z) {
        Resources resources = this.r.getResources();
        CharSequence string = resources.getString(bc.hx);
        this.w.m16429a(string);
        this.y.m16429a(string);
        CharSequence quantityString = resources.getQuantityString(gwb.f882if, this.t.size(), new Object[]{Integer.valueOf(this.f11084c), Integer.valueOf(this.t.size())});
        this.w.m16436b(quantityString);
        this.y.m16436b(quantityString);
        super.mo1807a(z);
    }

    protected Intent mo1813i() {
        return gwb.m2228h(fde.m15018e(this.s));
    }
}
