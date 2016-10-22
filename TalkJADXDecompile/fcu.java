import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;

final class fcu implements fcn {
    private final Context a;

    fcu(Context context) {
        this.a = context;
    }

    public fcm a(int i, bxt bxt, int i2, String str) {
        boolean z = true;
        if (bxt == bxt.HANGOUTS_MESSAGE || bxt == bxt.VIDEO_CALL) {
            return new fcm(true, false, null);
        }
        boolean d = glq.d(gwb.H(), str);
        switch (fcv.a[bxt.ordinal()]) {
            case wi.j /*1*/:
                boolean z2;
                String str2 = "SMS_MESSAGE conversation type with non-SMS transport type";
                if (gwb.i(i2) || gwb.k(i2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                iil.a(str2, z2);
                if (d) {
                    return new fcm(a(i), true, str);
                }
                fco fco;
                Context context = this.a;
                if (gwb.l(i2)) {
                    if (TextUtils.isEmpty(str)) {
                        z2 = false;
                    } else {
                        z2 = Patterns.EMAIL_ADDRESS.matcher(str).matches();
                    }
                    if (!z2) {
                        String e = glq.e(gwb.H(), str);
                        int length = e.length() - 1;
                        fco fco2 = new fco(context, i);
                        fco2.c = str;
                        if (glq.b(e)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        fco2.b = z2;
                        if (length > 11) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        fco2.a = z2;
                        fco = fco2;
                        if (fco.a()) {
                            z = false;
                        }
                        return new fcm(z, fco);
                    }
                }
                fco = new fco(context, i);
                fco.c = str;
                if (fco.a()) {
                    z = false;
                }
                return new fcm(z, fco);
            case wi.l /*2*/:
                return new fcm(true, d, str);
            default:
                String valueOf = String.valueOf(bxt);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Unknown conversation type: ").append(valueOf).toString());
        }
    }

    public fcm a(String str) {
        boolean d = glq.d(gwb.H(), str);
        return new fcm(!d, d, str);
    }

    private boolean a(int i) {
        return ((fzw) jyn.a(this.a, fzw.class)).d(i) == fzx.c;
    }
}
