package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: aim */
public class aim {
    private static final String a;

    static {
        a = aim.class.getSimpleName();
    }

    public static boolean a(Integer num) {
        return num.intValue() == 0 || num.intValue() == 19;
    }

    public static CharSequence a(Integer num, CharSequence charSequence, int i, Context context) {
        Objects.requireNonNull(context);
        if (aim.a(num)) {
            return charSequence == null ? "" : charSequence;
        } else {
            int c;
            if (i == 2) {
                c = aim.c(num);
            } else {
                c = aim.b(num);
                if (i != 1) {
                    Log.e(a, "Un-recognized interaction type: " + i + ". Defaulting to ContactDisplayUtils.INTERACTION_CALL.");
                }
            }
            return context.getResources().getText(c);
        }
    }

    public static int b(Integer num) {
        if (num == null) {
            return buf.dQ;
        }
        switch (num.intValue()) {
            case rq.b /*1*/:
                return buf.dL;
            case rq.c /*2*/:
                return buf.dP;
            case rl.e /*3*/:
                return buf.dY;
            case rl.f /*4*/:
                return buf.dK;
            case rl.g /*5*/:
                return buf.dJ;
            case rl.i /*6*/:
                return buf.dS;
            case rl.h /*7*/:
                return buf.dQ;
            case rl.j /*8*/:
                return buf.dF;
            case rl.l /*9*/:
                return buf.dG;
            case rl.m /*10*/:
                return buf.dH;
            case rl.n /*11*/:
                return buf.dM;
            case rl.k /*12*/:
                return buf.dN;
            case rk.i /*13*/:
                return buf.dR;
            case rk.bV /*14*/:
                return buf.dT;
            case rk.bY /*15*/:
                return buf.dW;
            case rk.bX /*16*/:
                return buf.dX;
            case rk.bZ /*17*/:
                return buf.dZ;
            case rk.bW /*18*/:
                return buf.ea;
            case rk.m /*19*/:
                return buf.dD;
            case rk.h /*20*/:
                return buf.dO;
            default:
                return buf.dI;
        }
    }

    public static int c(Integer num) {
        if (num == null) {
            return buf.gB;
        }
        switch (num.intValue()) {
            case rq.b /*1*/:
                return buf.gw;
            case rq.c /*2*/:
                return buf.gA;
            case rl.e /*3*/:
                return buf.gH;
            case rl.f /*4*/:
                return buf.gv;
            case rl.g /*5*/:
                return buf.gu;
            case rl.i /*6*/:
                return buf.gD;
            case rl.h /*7*/:
                return buf.gB;
            case rl.j /*8*/:
                return buf.gq;
            case rl.l /*9*/:
                return buf.gr;
            case rl.m /*10*/:
                return buf.gs;
            case rl.n /*11*/:
                return buf.gx;
            case rl.k /*12*/:
                return buf.gy;
            case rk.i /*13*/:
                return buf.gC;
            case rk.bV /*14*/:
                return buf.gE;
            case rk.bY /*15*/:
                return buf.gF;
            case rk.bX /*16*/:
                return buf.gG;
            case rk.bZ /*17*/:
                return buf.gI;
            case rk.bW /*18*/:
                return buf.gJ;
            case rk.m /*19*/:
                return buf.go;
            case rk.h /*20*/:
                return buf.gz;
            default:
                return buf.gt;
        }
    }

    public static boolean a(CharSequence charSequence) {
        return charSequence != null && Patterns.PHONE.matcher(charSequence.toString()).matches();
    }

    public static Spannable a(String str, String str2) {
        if (str == null) {
            return null;
        }
        Spannable spannableString = new SpannableString(str);
        int indexOf = str2 == null ? -1 : str.indexOf(str2);
        while (indexOf >= 0) {
            int length = str2.length() + indexOf;
            spannableString.setSpan(buf.g(str2), indexOf, length, 33);
            indexOf = str.indexOf(str2, length);
        }
        return spannableString;
    }

    public static CharSequence a(Resources resources, int i, String str) {
        return aim.a(resources.getString(i, new Object[]{str}), str);
    }

    public static String a(String str, String str2, aic aic) {
        if (aic == null) {
            if (str != null) {
                return str;
            }
            return str2;
        } else if (aic.b() == 1 || aic.b() != 2 || TextUtils.isEmpty(str2)) {
            return str;
        } else {
            return str2;
        }
    }

    public static String b(String str, String str2, aic aic) {
        if (aic == null) {
            if (str != null) {
                return str;
            }
            return str2;
        } else if (aic.a() == 1 || aic.a() != 2 || TextUtils.isEmpty(str2)) {
            return str;
        } else {
            return str2;
        }
    }
}
