package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;

final class ecd {
    ecd() {
    }

    void a(Context context, int i, blo blo, String str) {
        int i2;
        gjj a = gjj.a(str);
        boolean a2 = ((fuz) jyn.a(context, fuz.class)).a(i);
        if (fdq.O.b(i)) {
            i2 = blz.c;
        } else {
            i2 = blz.a;
        }
        if (a != null) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!(TextUtils.isEmpty(str2) || blo.a(str2))) {
                    blo.a(str2, bmg.b, i2, -1);
                }
            }
        }
        int a3 = blf.a(blo, a);
        if ((a != null || a3 > 0) && !a2) {
            ecd.a(context, i, true, false);
        }
    }

    static void a(Context context, int i, boolean z, boolean z2) {
        int i2;
        ear b;
        if (fdq.O.b(i)) {
            i2 = ebu.c;
        } else {
            i2 = ebu.a;
        }
        ebw ebw = ebs.o;
        eap a = ebs.a(context, i, z2, i2);
        i2 = ((fuz) jyn.a(context, fuz.class)).f(i);
        if (fdq.O.b(i)) {
            if (i2 == 30) {
                b = ebq.b(i);
            }
            b = null;
        } else {
            if (i2 == 30 || i2 == 25) {
                b = ebq.b(i);
            }
            b = null;
        }
        if (b != null) {
            int i3 = 0;
            while (i3 < a.b.size() && b.g < ((ear) a.b.get(i3)).g) {
                i3++;
            }
            if (i3 < a.b.size()) {
                a.b.add(i3, b);
            } else {
                a.b.add(b);
            }
            a.a += b.i;
        }
        ebz.a(context, i, a, z, z2);
    }
}
