package p000;

import android.content.Context;
import android.content.res.Resources;

public final class dta implements gpe {
    static final gla f10486a = gla.f15532c;
    long f10487b;
    private final Context f10488c;
    private final das f10489d;
    private final Resources f10490e;
    private final erm f10491f;

    public dta(Context context, int i, das das, Resources resources) {
        this.f10488c = context;
        this.f10489d = das;
        this.f10490e = resources;
        this.f10491f = new dtb(this, context, (kbu) jyn.m25435b(context).m25443a(kbc.class), i);
    }

    public void mo1661a(String str) {
        this.f10491f.m7738a(str);
    }

    public void mo1662a(boolean z) {
    }

    public void mo1663b(boolean z) {
    }

    void m12640a() {
        String str;
        String str2 = null;
        if (this.f10487b > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (glj.m17960a(this.f10488c, this.f10487b, currentTimeMillis, 262144) != null) {
                String string = this.f10490e.getString(gwb.rz, new Object[]{r1});
                CharSequence a = glj.m17960a(this.f10488c, this.f10487b, currentTimeMillis, 0);
                str2 = this.f10490e.getString(gwb.rz, new Object[]{a});
                str = string;
                this.f10489d.mo1168a(str, str2);
            }
        }
        str = null;
        this.f10489d.mo1168a(str, str2);
    }
}
