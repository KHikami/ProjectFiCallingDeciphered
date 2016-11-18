package p000;

import android.text.TextUtils;
import java.util.Locale;

public final class euk {
    private static final boolean f12297a = false;

    static {
        kae kae = glk.f15565l;
    }

    @Deprecated
    public static lup m14556a(String str, int i, int i2, gmp gmp) {
        return euk.m14557a(null, false, str, i, i2, gmp);
    }

    @Deprecated
    static lup m14557a(lof lof, boolean z, String str, int i, int i2, gmp gmp) {
        return euk.m14559a(euk.m14558a(null, z, str, i, gmp), i2);
    }

    @Deprecated
    static lup m14558a(lof lof, boolean z, String str, int i, gmp gmp) {
        lup lup = new lup();
        lup.f26506a = gmp.mo2302e();
        long b = ffh.m15192a().m15201b();
        if (!(b == 0 && TextUtils.isEmpty(str))) {
            lup.f26507b = new loe();
            if (b != 0) {
                lup.f26507b.f25858b = Long.toString(b);
                lup.f26507b.f25859c = Long.toString(b);
            }
            if (!TextUtils.isEmpty(str)) {
                lup.f26507b.f25857a = str;
            }
        }
        if (lof != null) {
            lup.f26508c = lof;
        }
        if (z) {
            lup.f26509d = Locale.getDefault().toString();
        }
        lup.f26511f = Integer.valueOf(i);
        return lup;
    }

    static lup m14559a(lup lup, int i) {
        if (i != -1 && fdq.f12798n.m14370b(i)) {
            fcw fcw = new fcw(gwb.m1400H());
            long a = fcw.m14977a(i);
            long b = fcw.m14981b(i);
            if (!(a == -1 || b == -1)) {
                lup.f26514i = new lnw();
                lup.f26514i.f25832c = Long.valueOf(a);
                lup.f26514i.f25833d = Long.valueOf(b);
            }
        }
        return lup;
    }

    public static lor m14555a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        lor lor = new lor();
        lor.f25931a = str;
        return lor;
    }
}
