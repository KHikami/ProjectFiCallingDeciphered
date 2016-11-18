package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

class coe implements bhj, bhm {
    private final String f5813a;
    private final int f5814b;
    private final boolean f5815c;

    coe(int i, String str, boolean z) {
        this.f5813a = str;
        this.f5814b = i;
        this.f5815c = z;
    }

    public bhk mo543c() {
        return bhk.REPLACE_OLD;
    }

    public String mo542b() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        String str = this.f5813a;
        return new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(str).length()).append(valueOf).append(str).append(this.f5814b).toString();
    }

    public final int mo539a(Context context, bhb bhb) {
        int i;
        blo blo = new blo(context, this.f5814b);
        eth a = blo.m5948a(this.f5813a, bmg.f3961c, blz.f3795a, 1);
        if (!(a == null || a.m14461b() == null || a.m14461b().isEmpty())) {
            for (String c : a.m14461b()) {
                String c2;
                ba.m4548a(this.f5814b, glj.m17963b(), 10, ba.m4618c().m12798c(c2).m12789a(this.f5813a).m12786a(408));
            }
        }
        String str = this.f5813a;
        if (this.f5815c) {
            i = bmg.f3960b;
        } else {
            i = bmg.f3959a;
        }
        eth a2 = blo.m5948a(str, i, blz.f3795a, 1);
        if (a2 == null || a2.m14461b() == null || a2.m14461b().isEmpty()) {
            return bhn.f3351d;
        }
        for (String c22 : a2.m14461b()) {
            ((ect) jyn.m25426a(context, ect.class)).mo1830a(this.f5814b, this.f5813a, c22);
        }
        List arrayList = new ArrayList();
        arrayList.add(a2);
        fdn e = fde.m15019e(fde.m15018e(this.f5814b));
        fok coc = new coc(arrayList);
        String str2 = "Babel_MEOTask";
        String str3 = "Send MEO task ";
        c22 = String.valueOf(this.f5813a);
        if (c22.length() != 0) {
            c22 = str3.concat(c22);
        } else {
            c22 = new String(str3);
        }
        glk.m17970a(str2, c22, new Object[0]);
        e.m15078a(coc, -1);
        return bhn.f3348a;
    }
}
