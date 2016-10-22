package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;

/* renamed from: eba */
public final class eba extends eat {
    private final int c;

    eba(Context context, int i, gjj gjj, int i2, long j) {
        super(context, i, gjj, j);
        this.c = i2;
    }

    protected void a(boolean z) {
        Resources resources = this.r.getResources();
        CharSequence string = resources.getString(bc.hx);
        this.w.a(string);
        this.y.a(string);
        CharSequence quantityString = resources.getQuantityString(gwb.if, this.t.size(), new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.t.size())});
        this.w.b(quantityString);
        this.y.b(quantityString);
        super.a(z);
    }

    protected Intent i() {
        return gwb.h(fde.e(this.s));
    }
}
