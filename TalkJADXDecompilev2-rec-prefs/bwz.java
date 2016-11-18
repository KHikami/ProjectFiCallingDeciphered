package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;

public final class bwz extends gqz implements btd {
    public bwz(Context context) {
        this(context, null);
    }

    private bwz(Context context, AttributeSet attributeSet) {
        super(context, null);
    }

    public boolean mo717a() {
        return false;
    }

    public void mo715a(btf btf) {
        m6850a(fde.m15018e(((jca) jyn.m25426a(getContext(), jca.class)).mo2317a()), true, btf.f4406s.m6574a(), btf.f4406s.f4368k, btf.f4392e, btf.f4406s.f4369l, btf.f4406s.f4360c, btf.f4406s.f4361d, btf.f4406s.f4371n, btf.f4395h, btf.f4406s.f4370m, null, null);
    }

    public void mo718b(btf btf) {
        mo716a(btf.f4406s.m6574a());
        m6851a(btf.f4395h, btf.f4406s.f4370m);
        mo765a(btf.f4406s.f4369l, btf.f4406s.f4374q);
        if (this.p != btf.f4395h) {
            this.p = btf.f4395h;
            m6628e();
        }
        if (this.p == fwx.ON_SERVER && !TextUtils.isEmpty(btf.f4406s.f4368k) && TextUtils.isEmpty(this.c)) {
            this.b = btf.f4406s.f4368k;
            m6858j();
        }
    }
}
