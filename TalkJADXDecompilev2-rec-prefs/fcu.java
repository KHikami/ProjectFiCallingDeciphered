package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;

final class fcu implements fcn {
    private final Context f12706a;

    fcu(Context context) {
        this.f12706a = context;
    }

    public fcm mo1976a(int i, bxt bxt, int i2, String str) {
        boolean z = true;
        if (bxt == bxt.HANGOUTS_MESSAGE || bxt == bxt.VIDEO_CALL) {
            return new fcm(true, false, null);
        }
        boolean d = glq.m18019d(gwb.m1400H(), str);
        switch (fcv.f12707a[bxt.ordinal()]) {
            case 1:
                boolean z2;
                String str2 = "SMS_MESSAGE conversation type with non-SMS transport type";
                if (gwb.m2254i(i2) || gwb.m2280k(i2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                iil.m21874a(str2, z2);
                if (d) {
                    return new fcm(m14971a(i), true, str);
                }
                fco fco;
                Context context = this.f12706a;
                if (gwb.m2291l(i2)) {
                    if (TextUtils.isEmpty(str)) {
                        z2 = false;
                    } else {
                        z2 = Patterns.EMAIL_ADDRESS.matcher(str).matches();
                    }
                    if (!z2) {
                        String e = glq.m18021e(gwb.m1400H(), str);
                        int length = e.length() - 1;
                        fco fco2 = new fco(context, i);
                        fco2.f12699c = str;
                        if (glq.m18011b(e)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        fco2.f12698b = z2;
                        if (length > 11) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        fco2.f12697a = z2;
                        fco = fco2;
                        if (fco.m14969a()) {
                            z = false;
                        }
                        return new fcm(z, fco);
                    }
                }
                fco = new fco(context, i);
                fco.f12699c = str;
                if (fco.m14969a()) {
                    z = false;
                }
                return new fcm(z, fco);
            case 2:
                return new fcm(true, d, str);
            default:
                String valueOf = String.valueOf(bxt);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Unknown conversation type: ").append(valueOf).toString());
        }
    }

    public fcm mo1977a(String str) {
        boolean d = glq.m18019d(gwb.m1400H(), str);
        return new fcm(!d, d, str);
    }

    private boolean m14971a(int i) {
        return ((fzw) jyn.m25426a(this.f12706a, fzw.class)).mo2153d(i) == fzx.f14515c;
    }
}
