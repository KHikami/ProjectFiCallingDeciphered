package p000;

import android.content.Context;
import android.text.TextUtils;

public final class fyg {
    public static final boolean f14365a = false;

    static {
        kae kae = glk.f15571r;
    }

    private static fyh m16577a(Context context, aiv aiv) {
        if (f14365a) {
            String str = "====> from=";
            String valueOf = String.valueOf(aiv.mo224c().m2444c());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            for (aic c : aiv.m2458e()) {
                String str2 = "====> to=";
                String valueOf2 = String.valueOf(c.m2444c());
                if (valueOf2.length() != 0) {
                    str2.concat(valueOf2);
                } else {
                    valueOf2 = new String(str2);
                }
            }
            new StringBuilder(31).append("====> size=").append(aiv.mo225f());
            new StringBuilder(23).append("====> parts=").append(aiv.m2456d().m2471b());
        }
        if (fyi.m16614a(context)) {
            return new fyh(aiv, ((fyd) jyn.m25426a(context, fyd.class)).m16568a(context, aiv));
        }
        return fyg.m16581b(context, aiv);
    }

    private static fyh m16581b(Context context, aiv aiv) {
        try {
            aid a = fxz.m16551a(context, fxz.m16559b(context), aiv, null);
            if (a == null) {
                throw new fyf("MmsTransactions: send: get empty response");
            } else if (a instanceof aiu) {
                aiu aiu = (aiu) a;
                int e = aiu.m2568e();
                if (e != 128) {
                    glk.m17982e("Babel_SMS", "MMS error, status = " + e, new Object[0]);
                }
                switch (e) {
                    case 128:
                        fyh fyh = new fyh(aiv, aiu);
                        fxz.m16560c(context);
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
            fxz.m16560c(context);
        }
    }

    public static ait m16576a(Context context, byte[] bArr, String str) {
        if (f14365a) {
            String str2 = "MmsTransaction.downloadMmsViaMmsSendReceiveManager: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        try {
            fzo b = fxz.m16559b(context);
            aid a = fxz.m16552a(context, b, str);
            if (a == null) {
                throw new fxy(137, "MmsTransactions: retrieve: get empty or invalid response");
            } else if (a instanceof ait) {
                fyg.m16580a(context, b, bArr, str, 129);
                ait ait = (ait) a;
                return ait;
            } else {
                fyg.m16580a(context, b, bArr, str, 132);
                throw new fyf("MmsTransactions: retrieve: get invalid response type");
            }
        } finally {
            fxz.m16560c(context);
        }
    }

    private static void m16580a(Context context, fzo fzo, byte[] bArr, String str, int i) {
        if (f14365a) {
            String str2 = "MmsTransaction.sendNotifyResponse: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        aid aid = new aid(18, bArr, i);
        if (!ajf.m2609a().mo2135s()) {
            str = null;
        }
        fxz.m16551a(context, fzo, aid, str);
    }

    public static fyh m16578a(Context context, String[] strArr, String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2, long j, int i4, long j2) {
        iil.m21875b("Expected non-null", (Object) context);
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
                if (dak.m11383a(strArr[i5])) {
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
            str5 = ajb.m2599a(context);
            if (!TextUtils.isEmpty(str5)) {
                aiv.mo223a(new aic(str5));
            }
            aic[] a = aic.m2439a(strArr2);
            if (a != null) {
                aiv.m2571a(a);
            }
            if (!TextUtils.isEmpty(str)) {
                aiv.m2455b(new aic(str));
            }
            aiv.m2453a(j2 / 1000000);
            fyl a2 = fyi.m16592a(context, str2, str3, str4, i, i2, i3);
            if (a2.f14390a <= 0) {
                throw new ahy("MmsTransactions: send: zero size body");
            }
            aiv.m2454a(a2.f14391b);
            aiv.m2574c((long) a2.f14390a);
            aiv.m2573b("personal".getBytes());
            aiv.m2572b(604800);
            aiv.m2457d(129);
            aiv.m2575e(129);
            aiv.m2577f(129);
            return fyg.m16577a(context, aiv);
        }
    }

    public static fyh m16579a(Context context, String[] strArr, String str, String str2, boolean z, boolean z2, long j, int i, long j2) {
        iil.m21875b("Expected non-null", (Object) context);
        if (strArr == null || strArr.length <= 0) {
            throw new ahy("MmsTransactions: forwardMessage: no recipient");
        } else if (TextUtils.isEmpty(str2)) {
            throw new ahy("MmsTransactions: forwardMessage: no mms uri");
        } else {
            try {
                aiv aiv = new aiv();
                String a = ajb.m2599a(context);
                if (!TextUtils.isEmpty(a)) {
                    aiv.mo223a(new aic(a));
                }
                aic[] a2 = aic.m2439a(strArr);
                if (a2 != null) {
                    aiv.m2571a(a2);
                }
                if (!TextUtils.isEmpty(str)) {
                    aiv.m2455b(new aic(str));
                }
                aiv.m2453a(j2 / 1000000);
                fyl a3 = fyi.m16591a(context, str2);
                if (a3.f14390a <= 0) {
                    a3.f14390a = 1048;
                }
                aiv.m2454a(a3.f14391b);
                aiv.m2574c((long) a3.f14390a);
                aiv.m2573b("personal".getBytes());
                aiv.m2572b(604800);
                aiv.m2457d(129);
                aiv.m2575e(129);
                aiv.m2577f(129);
                return fyg.m16577a(context, aiv);
            } catch (Throwable e) {
                throw new fxy(136, "Fail to create forward SendReq", e);
            }
        }
    }
}
