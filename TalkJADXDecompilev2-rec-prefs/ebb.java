package p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public final class ebb extends eat {
    private final ebs f11085c;

    ebb(Context context, int i, ebs ebs, long j) {
        super(context, i, gjj.m17806a(ebs.p.f11061a), j);
        this.f11085c = ebs;
    }

    protected void mo1807a(boolean z) {
        CharSequence string = this.r.getResources().getString(bc.hy);
        this.w.m16429a(string);
        this.y.m16429a(string);
        if (TextUtils.isEmpty(this.f11085c.f11124b) || !this.f11085c.f11129g) {
            this.w.m16436b(this.f11085c.f11124b);
        } else {
            gl gaVar = new ga(this.w);
            gaVar.m16798b(this.f11085c.f11124b);
            this.w.m16428a(gaVar);
        }
        super.mo1807a(z);
    }

    protected Intent mo1813i() {
        return gwb.m1537a(this.s, this.t.m17807a(), this.f11085c.p.f11065e);
    }
}
