package defpackage;

import android.text.TextUtils;
import java.util.Locale;

public final class euk {
    private static final boolean a = false;

    static {
        kae kae = glk.l;
    }

    @Deprecated
    public static lup a(String str, int i, int i2, gmp gmp) {
        return euk.a(null, false, str, i, i2, gmp);
    }

    @Deprecated
    static lup a(lof lof, boolean z, String str, int i, int i2, gmp gmp) {
        return euk.a(euk.a(null, z, str, i, gmp), i2);
    }

    @Deprecated
    static lup a(lof lof, boolean z, String str, int i, gmp gmp) {
        lup lup = new lup();
        lup.a = gmp.e();
        long b = ffh.a().b();
        if (!(b == 0 && TextUtils.isEmpty(str))) {
            lup.b = new loe();
            if (b != 0) {
                lup.b.b = Long.toString(b);
                lup.b.c = Long.toString(b);
            }
            if (!TextUtils.isEmpty(str)) {
                lup.b.a = str;
            }
        }
        if (lof != null) {
            lup.c = lof;
        }
        if (z) {
            lup.d = Locale.getDefault().toString();
        }
        lup.f = Integer.valueOf(i);
        return lup;
    }

    static lup a(lup lup, int i) {
        if (i != -1 && fdq.n.b(i)) {
            fcw fcw = new fcw(gwb.H());
            long a = fcw.a(i);
            long b = fcw.b(i);
            if (!(a == -1 || b == -1)) {
                lup.i = new lnw();
                lup.i.c = Long.valueOf(a);
                lup.i.d = Long.valueOf(b);
            }
        }
        return lup;
    }

    public static lor a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        lor lor = new lor();
        lor.a = str;
        return lor;
    }
}
