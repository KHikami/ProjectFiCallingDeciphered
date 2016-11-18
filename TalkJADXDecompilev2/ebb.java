package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public final class ebb extends eat {
    private final ebs c;

    ebb(Context context, int i, ebs ebs, long j) {
        super(context, i, gjj.a(ebs.p.a), j);
        this.c = ebs;
    }

    protected void a(boolean z) {
        CharSequence string = this.r.getResources().getString(bc.hy);
        this.w.a(string);
        this.y.a(string);
        if (TextUtils.isEmpty(this.c.b) || !this.c.g) {
            this.w.b(this.c.b);
        } else {
            gl gaVar = new ga(this.w);
            gaVar.b(this.c.b);
            this.w.a(gaVar);
        }
        super.a(z);
    }

    protected Intent i() {
        return gwb.a(this.s, this.t.a(), this.c.p.e);
    }
}
