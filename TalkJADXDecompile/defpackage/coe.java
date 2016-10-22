package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: coe */
class coe implements bhj, bhm {
    private final String a;
    private final int b;
    private final boolean c;

    coe(int i, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public bhk c() {
        return bhk.REPLACE_OLD;
    }

    public String b() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        String str = this.a;
        return new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(str).length()).append(valueOf).append(str).append(this.b).toString();
    }

    public final int a(Context context, bhb bhb) {
        String valueOf;
        int i;
        blo blo = new blo(context, this.b);
        eth a = blo.a(this.a, bmg.c, blz.a, 1);
        if (!(a == null || a.b() == null || a.b().isEmpty())) {
            for (String valueOf2 : a.b()) {
                ba.a(this.b, glj.b(), 10, ba.c().c(valueOf2).a(this.a).a(408));
            }
        }
        String str = this.a;
        if (this.c) {
            i = bmg.b;
        } else {
            i = bmg.a;
        }
        eth a2 = blo.a(str, i, blz.a, 1);
        if (a2 == null || a2.b() == null || a2.b().isEmpty()) {
            return bhn.d;
        }
        for (String valueOf22 : a2.b()) {
            ((ect) jyn.a(context, ect.class)).a(this.b, this.a, valueOf22);
        }
        List arrayList = new ArrayList();
        arrayList.add(a2);
        fdn e = fde.e(fde.e(this.b));
        fok coc = new coc(arrayList);
        String str2 = "Babel_MEOTask";
        String str3 = "Send MEO task ";
        valueOf22 = String.valueOf(this.a);
        if (valueOf22.length() != 0) {
            valueOf22 = str3.concat(valueOf22);
        } else {
            valueOf22 = new String(str3);
        }
        glk.a(str2, valueOf22, new Object[0]);
        e.a(coc, -1);
        return bhn.a;
    }
}
