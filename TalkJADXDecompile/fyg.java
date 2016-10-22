import android.content.Context;
import android.text.TextUtils;

public final class fyg {
    public static final boolean a;

    static {
        kae kae = glk.r;
        a = false;
    }

    private static fyh a(Context context, aiv aiv) {
        if (a) {
            String str = "====> from=";
            String valueOf = String.valueOf(aiv.c().c());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            for (aic c : aiv.e()) {
                String str2 = "====> to=";
                String valueOf2 = String.valueOf(c.c());
                if (valueOf2.length() != 0) {
                    str2.concat(valueOf2);
                } else {
                    valueOf2 = new String(str2);
                }
            }
            new StringBuilder(31).append("====> size=").append(aiv.f());
            new StringBuilder(23).append("====> parts=").append(aiv.d().b());
        }
        if (fyi.a(context)) {
            return new fyh(aiv, ((fyd) jyn.a(context, fyd.class)).a(context, aiv));
        }
        return b(context, aiv);
    }

    private static fyh b(Context context, aiv aiv) {
        try {
            aid a = fxz.a(context, fxz.b(context), aiv, null);
            if (a == null) {
                throw new fyf("MmsTransactions: send: get empty response");
            } else if (a instanceof aiu) {
                aiu aiu = (aiu) a;
                int e = aiu.e();
                if (e != 128) {
                    glk.e("Babel_SMS", "MMS error, status = " + e, new Object[0]);
                }
                switch (e) {
                    case 128:
                        fyh fyh = new fyh(aiv, aiu);
                        fxz.c(context);
                        return fyh;
                    case 129:
                    case 224:
                        throw new fxy(119, "mms error response");
                    case 130:
                    case 225:
                        throw new fxy(124, "mms error response");
                    case 131:
                    case 226:
                        throw new fxy(128, "mms error response");
                    case 132:
                    case 193:
                    case 227:
                        throw new fxy(125, "mms error response");
                    case 133:
                    case 194:
                    case 228:
                        throw new fxy(127, "mms error response");
                    case 134:
                        throw new fxy(126, "mms error response");
                    case 135:
                    case 229:
                        throw new fxy(129, "mms error response");
                    case 136:
                        throw new fxy(130, "mms error response");
                    case 230:
                    case 231:
                    case 232:
                    case 233:
                        throw new fxy(131, "mms error response");
                    case 234:
                        throw new fxy(132, "mms error response");
                    case 235:
                        throw new fxy(133, "mms error response");
                    default:
                        throw new fyf("MmsTransactions: send: resp error");
                }
                throw new fyf(e);
            } else {
                throw new fyf("MmsTransactions: send: get invalid response type");
            }
        } catch (Throwable e2) {
            throw new fyf(e2);
        } catch (Throwable th) {
            fxz.c(context);
        }
    }

    public static ait a(Context context, byte[] bArr, String str) {
        if (a) {
            String str2 = "MmsTransaction.downloadMmsViaMmsSendReceiveManager: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        try {
            fzo b = fxz.b(context);
            aid a = fxz.a(context, b, str);
            if (a == null) {
                throw new fxy(137, "MmsTransactions: retrieve: get empty or invalid response");
            } else if (a instanceof ait) {
                a(context, b, bArr, str, 129);
                ait ait = (ait) a;
                return ait;
            } else {
                a(context, b, bArr, str, 132);
                throw new fyf("MmsTransactions: retrieve: get invalid response type");
            }
        } finally {
            fxz.c(context);
        }
    }

    private static void a(Context context, fzo fzo, byte[] bArr, String str, int i) {
        if (a) {
            String str2 = "MmsTransaction.sendNotifyResponse: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        aid aid = new aid(18, bArr, i);
        if (!ajf.a().s()) {
            str = null;
        }
        fxz.a(context, fzo, aid, str);
    }

    public static fyh a(Context context, String[] strArr, String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2, long j, int i4, long j2) {
        iil.b("Expected non-null", (Object) context);
        if (strArr == null || strArr.length <= 0) {
            throw new ahy("MmsTransactions: send: no recipient");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new ahy("MmsTransactions: send: no content (subject or text or image)");
        } else {
            String str5;
            String[] strArr2 = new String[strArr.length];
            for (int i5 = 0; i5 < strArr.length; i5++) {
                int i6;
                String[] strArr3;
                str5 = strArr[i5];
                if (dak.a(strArr[i5])) {
                    i6 = i5;
                    strArr3 = strArr2;
                } else if (str5 == null) {
                    str5 = null;
                    i6 = i5;
                    strArr3 = strArr2;
                } else {
                    int length = str5.length();
                    StringBuilder stringBuilder = new StringBuilder(length);
                    for (i6 = 0; i6 < length; i6++) {
                        char charAt = str5.charAt(i6);
                        if (Character.isLetterOrDigit(charAt) || charAt == '+' || charAt == '*' || charAt == '#') {
                            stringBuilder.append(charAt);
                        }
                    }
                    str5 = stringBuilder.toString();
                    i6 = i5;
                    strArr3 = strArr2;
                }
                strArr3[i6] = str5;
            }
            aiv aiv = new aiv();
            str5 = ajb.a(context);
            if (!TextUtils.isEmpty(str5)) {
                aiv.a(new aic(str5));
            }
            aic[] a = aic.a(strArr2);
            if (a != null) {
                aiv.a(a);
            }
            if (!TextUtils.isEmpty(str)) {
                aiv.b(new aic(str));
            }
            aiv.a(j2 / 1000000);
            fyl a2 = fyi.a(context, str2, str3, str4, i, i2, i3);
            if (a2.a <= 0) {
                throw new ahy("MmsTransactions: send: zero size body");
            }
            aiv.a(a2.b);
            aiv.c((long) a2.a);
            aiv.b("personal".getBytes());
            aiv.b(604800);
            aiv.d(129);
            aiv.e(129);
            aiv.f(129);
            return a(context, aiv);
        }
    }

    public static fyh a(Context context, String[] strArr, String str, String str2, boolean z, boolean z2, long j, int i, long j2) {
        iil.b("Expected non-null", (Object) context);
        if (strArr == null || strArr.length <= 0) {
            throw new ahy("MmsTransactions: forwardMessage: no recipient");
        } else if (TextUtils.isEmpty(str2)) {
            throw new ahy("MmsTransactions: forwardMessage: no mms uri");
        } else {
            try {
                aiv aiv = new aiv();
                String a = ajb.a(context);
                if (!TextUtils.isEmpty(a)) {
                    aiv.a(new aic(a));
                }
                aic[] a2 = aic.a(strArr);
                if (a2 != null) {
                    aiv.a(a2);
                }
                if (!TextUtils.isEmpty(str)) {
                    aiv.b(new aic(str));
                }
                aiv.a(j2 / 1000000);
                fyl a3 = fyi.a(context, str2);
                if (a3.a <= 0) {
                    a3.a = 1048;
                }
                aiv.a(a3.b);
                aiv.c((long) a3.a);
                aiv.b("personal".getBytes());
                aiv.b(604800);
                aiv.d(129);
                aiv.e(129);
                aiv.f(129);
                return a(context, aiv);
            } catch (Throwable e) {
                throw new fxy(136, "Fail to create forward SendReq", e);
            }
        }
    }
}
