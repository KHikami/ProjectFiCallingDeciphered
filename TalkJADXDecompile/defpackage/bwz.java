package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;

/* renamed from: bwz */
public final class bwz extends gqz implements btd {
    public bwz(Context context) {
        this(context, null);
    }

    private bwz(Context context, AttributeSet attributeSet) {
        super(context, null);
    }

    public boolean a() {
        return false;
    }

    public void a(btf btf) {
        a(fde.e(((jca) jyn.a(getContext(), jca.class)).a()), true, btf.s.a(), btf.s.k, btf.e, btf.s.l, btf.s.c, btf.s.d, btf.s.n, btf.h, btf.s.m, null, null);
    }

    public void b(btf btf) {
        a(btf.s.a());
        a(btf.h, btf.s.m);
        a(btf.s.l, btf.s.q);
        if (this.p != btf.h) {
            this.p = btf.h;
            e();
        }
        if (this.p == fwx.ON_SERVER && !TextUtils.isEmpty(btf.s.k) && TextUtils.isEmpty(this.c)) {
            this.b = btf.s.k;
            j();
        }
    }
}
