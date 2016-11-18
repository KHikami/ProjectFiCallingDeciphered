package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;

final class ecd {
    ecd() {
    }

    void m13492a(Context context, int i, blo blo, String str) {
        int i2;
        gjj a = gjj.m17806a(str);
        boolean a2 = ((fuz) jyn.m25426a(context, fuz.class)).m16291a(i);
        if (fdq.f12773O.m14370b(i)) {
            i2 = blz.f3797c;
        } else {
            i2 = blz.f3795a;
        }
        if (a != null) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!(TextUtils.isEmpty(str2) || blo.m5871a(str2))) {
                    blo.m5948a(str2, bmg.f3960b, i2, -1);
                }
            }
        }
        int a3 = blf.m5752a(blo, a);
        if ((a != null || a3 > 0) && !a2) {
            ecd.m13491a(context, i, true, false);
        }
    }

    static void m13491a(Context context, int i, boolean z, boolean z2) {
        int i2;
        ear b;
        if (fdq.f12773O.m14370b(i)) {
            i2 = ebu.f11141c;
        } else {
            i2 = ebu.f11139a;
        }
        ebw ebw = ebs.f11121o;
        eap a = ebs.m13477a(context, i, z2, i2);
        i2 = ((fuz) jyn.m25426a(context, fuz.class)).m16298f(i);
        if (fdq.f12773O.m14370b(i)) {
            if (i2 == 30) {
                b = ebq.m13474b(i);
            }
            b = null;
        } else {
            if (i2 == 30 || i2 == 25) {
                b = ebq.m13474b(i);
            }
            b = null;
        }
        if (b != null) {
            int i3 = 0;
            while (i3 < a.f11060b.size() && b.f11067g < ((ear) a.f11060b.get(i3)).f11067g) {
                i3++;
            }
            if (i3 < a.f11060b.size()) {
                a.f11060b.add(i3, b);
            } else {
                a.f11060b.add(b);
            }
            a.f11059a += b.f11069i;
        }
        ebz.m13333a(context, i, a, z, z2);
    }
}
