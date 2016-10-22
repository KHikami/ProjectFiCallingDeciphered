import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
public class ban {
    static final String a;

    static {
        a = ban.class.getSimpleName();
    }

    public static bad a(Context context, ayo ayo, bal bal) {
        bad a = a(context, ayo);
        if (a.h == 1) {
            bae.a(-1, context, a, bal, ayo);
        }
        return a;
    }

    public static bad a(Context context, ayo ayo) {
        String str;
        int i;
        int i2 = 1;
        bad bad = new bad();
        if (ayo.b == null) {
            str = null;
        } else {
            str = ayo.b.getDetails().getCallerDisplayName();
        }
        bad.g = str;
        bad.a = bad.g;
        bad.h = ayo.d();
        if (ayo.b == null) {
            i = -1;
        } else {
            i = ayo.b.getDetails().getCallerDisplayNamePresentation();
        }
        bad.i = i;
        bad.u = ayo.m;
        Object c = buf.c(ayo.b);
        if (!TextUtils.isEmpty(c)) {
            String[] split = c.split("&");
            str = split[0];
            if (split.length > 1) {
                bad.e = split[1];
            }
            int i3 = bad.h;
            if (str != null) {
                String valueOf;
                String valueOf2 = String.valueOf(a(str));
                String valueOf3 = String.valueOf(bad);
                new StringBuilder((String.valueOf(valueOf2).length() + 75) + String.valueOf(valueOf3).length()).append("modifyForSpecialCnapCases: initially, number=").append(valueOf2).append(", presentation=").append(i3).append(" ci ").append(valueOf3);
                if (Arrays.asList(context.getResources().getStringArray(buf.jy)).contains(str) && i3 == 1) {
                    str = context.getString(aq.dC);
                    bad.h = 3;
                }
                if (bad.h == 1 || (bad.h != i3 && i3 == 1)) {
                    if (str.equals("PRIVATE") || str.equals("P") || str.equals("RES")) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    if (i3 != 0) {
                        str = context.getString(aq.dn);
                        bad.h = 2;
                    } else {
                        if (!(str.equals("UNAVAILABLE") || str.equals("UNKNOWN") || str.equals("UNA") || str.equals("U"))) {
                            i2 = 0;
                        }
                        if (i2 != 0) {
                            str = context.getString(aq.dC);
                            bad.h = 3;
                        }
                    }
                    valueOf = String.valueOf(a(str));
                    new StringBuilder(String.valueOf(valueOf).length() + 50).append("SpecialCnap: number=").append(valueOf).append("; presentation now=").append(bad.h);
                }
                valueOf = "modifyForSpecialCnapCases: returning number string=";
                String valueOf4 = String.valueOf(a(str));
                if (valueOf4.length() != 0) {
                    valueOf.concat(valueOf4);
                } else {
                    valueOf4 = new String(valueOf);
                }
            }
            bad.c = str;
        }
        if ((ayo.b() != null && "voicemail".equals(ayo.b().getScheme())) || b(context, ayo)) {
            bad.a(context);
        }
        bbc a = bbc.a(context);
        awp a2 = buf.I(context).a();
        if (!(a2 == null || TextUtils.isEmpty(bad.g) || a.c.get(ayo.d) != null)) {
            Context applicationContext = context.getApplicationContext();
            bdf.c(bbc.a, "Found contact with CNAP name - inserting into cache");
            new bbd(a, a2, bad, ayo, applicationContext).execute(new Void[0]);
        }
        return bad;
    }

    public static awq a(awp awp, bad bad) {
        aws aws = new aws();
        aws.d = bad.a;
        aws.f = bad.l;
        aws.g = bad.k;
        aws.h = bad.c;
        aws.j = bad.d;
        aws.l = bad.q;
        aws.o = bad.p;
        awq a = awp.a(aws);
        a.a(bad.o);
        return a;
    }

    private static String a(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '-' || charAt == '@' || charAt == '.' || charAt == '&') {
                stringBuilder.append(charAt);
            } else {
                stringBuilder.append('x');
            }
        }
        return stringBuilder.toString();
    }

    public static boolean b(Context context, ayo ayo) {
        return axk.a(context, ayo.b.getDetails().getAccountHandle(), buf.c(ayo.b));
    }
}
