package defpackage;

import android.content.Context;
import android.content.res.Resources;

public final class dta implements gpe {
    static final gla a = gla.c;
    long b;
    private final Context c;
    private final das d;
    private final Resources e;
    private final erm f;

    public dta(Context context, int i, das das, Resources resources) {
        this.c = context;
        this.d = das;
        this.e = resources;
        this.f = new dtb(this, context, (kbu) jyn.b(context).a(kbc.class), i);
    }

    public void a(String str) {
        this.f.a(str);
    }

    public void a(boolean z) {
    }

    public void b(boolean z) {
    }

    void a() {
        String str;
        String str2 = null;
        if (this.b > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (glj.a(this.c, this.b, currentTimeMillis, 262144) != null) {
                String string = this.e.getString(gwb.rz, new Object[]{r1});
                CharSequence a = glj.a(this.c, this.b, currentTimeMillis, 0);
                str2 = this.e.getString(gwb.rz, new Object[]{a});
                str = string;
                this.d.a(str, str2);
            }
        }
        str = null;
        this.d.a(str, str2);
    }
}
