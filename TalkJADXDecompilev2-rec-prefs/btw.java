package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;

public final class btw extends gpf implements btd {
    String f4456a;

    public btw(Context context) {
        this(context, null);
    }

    private btw(Context context, AttributeSet attributeSet) {
        super(context, null);
    }

    public boolean mo717a() {
        return false;
    }

    public void mo715a(btf btf) {
        Activity activity;
        bko e = fde.m15018e(((jca) jyn.m25426a(getContext(), jca.class)).mo2317a());
        String str = btf.f4390c;
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
        }
        activity = null;
        mo716a(btf.f4406s.m6574a());
        if (activity == null || str == null || ("image/gif".equals(btf.f4406s.f4367j) && !gkd.m17876a(getContext()))) {
            setOnClickListener(null);
            setClickable(false);
        } else {
            setOnClickListener(new btx(this, activity, e, str));
            setClickable(true);
        }
        m6621a(ba.hQ);
        m6622a(e, true, this.f4456a, btf.f4406s.f4360c, btf.f4406s.f4361d, btf.f4406s.f4371n);
    }

    public void mo718b(btf btf) {
        mo716a(btf.f4406s.m6574a());
    }

    protected boolean mo719b() {
        return false;
    }

    public void mo716a(String str) {
        this.f4456a = str;
    }
}
