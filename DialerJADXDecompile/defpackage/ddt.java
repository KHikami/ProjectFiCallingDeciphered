package defpackage;

import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: ddt */
public final class ddt {
    private static ddt a;
    private ded b;
    private final ddk c;

    static {
        a = null;
    }

    private ddt(String str) {
        this.b = null;
        this.c = ddk.a();
        this.b = new ded(str);
    }

    public static synchronized ddt a() {
        ddt ddt;
        synchronized (ddt.class) {
            if (a == null) {
                a = new ddt("/com/google/i18n/phonenumbers/geocoding/data/");
            }
            ddt = a;
        }
        return ddt;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String b(defpackage.ddo r10, java.util.Locale r11) {
        /*
        r9 = this;
        r3 = 1;
        r4 = 0;
        r0 = r9.c;
        r1 = r10.b;
        r0 = r0.c;
        r1 = java.lang.Integer.valueOf(r1);
        r0 = r0.get(r1);
        r0 = (java.util.List) r0;
        if (r0 != 0) goto L_0x0019;
    L_0x0014:
        r0 = new java.util.ArrayList;
        r0.<init>(r4);
    L_0x0019:
        r0 = java.util.Collections.unmodifiableList(r0);
        r1 = r0.size();
        if (r1 != r3) goto L_0x002e;
    L_0x0023:
        r0 = r0.get(r4);
        r0 = (java.lang.String) r0;
        r0 = defpackage.ddt.a(r0, r11);
    L_0x002d:
        return r0;
    L_0x002e:
        r1 = "ZZ";
        r5 = r0.iterator();
    L_0x0034:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0099;
    L_0x003a:
        r0 = r5.next();
        r0 = (java.lang.String) r0;
        r2 = r9.c;
        r6 = r10.b;
        r7 = r2.a(r6, r0);
        if (r7 == 0) goto L_0x0078;
    L_0x004a:
        r8 = "001";
        r8 = r8.equals(r0);
        if (r8 != 0) goto L_0x0086;
    L_0x0052:
        r8 = r2.a(r0);
        if (r8 != 0) goto L_0x0074;
    L_0x0058:
        r1 = new java.lang.IllegalArgumentException;
        r2 = "Invalid region code: ";
        r0 = java.lang.String.valueOf(r0);
        r3 = r0.length();
        if (r3 == 0) goto L_0x006e;
    L_0x0066:
        r0 = r2.concat(r0);
    L_0x006a:
        r1.<init>(r0);
        throw r1;
    L_0x006e:
        r0 = new java.lang.String;
        r0.<init>(r2);
        goto L_0x006a;
    L_0x0074:
        r8 = r8.l;
        if (r6 == r8) goto L_0x0086;
    L_0x0078:
        r2 = r4;
    L_0x0079:
        if (r2 == 0) goto L_0x0096;
    L_0x007b:
        r2 = "ZZ";
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x0097;
    L_0x0083:
        r0 = "";
        goto L_0x002d;
    L_0x0086:
        r6 = defpackage.ddk.a(r10);
        r2 = r2.a(r6, r7);
        r6 = defpackage.ddm.l;
        if (r2 == r6) goto L_0x0094;
    L_0x0092:
        r2 = r3;
        goto L_0x0079;
    L_0x0094:
        r2 = r4;
        goto L_0x0079;
    L_0x0096:
        r0 = r1;
    L_0x0097:
        r1 = r0;
        goto L_0x0034;
    L_0x0099:
        r0 = defpackage.ddt.a(r1, r11);
        goto L_0x002d;
        */
        throw new UnsupportedOperationException("Method not decompiled: ddt.b(ddo, java.util.Locale):java.lang.String");
    }

    private static String a(String str, Locale locale) {
        return (str == null || str.equals("ZZ") || str.equals("001")) ? "" : new Locale("", str).getDisplayCountry(locale);
    }

    private String c(ddo ddo, Locale locale) {
        String str;
        String language = locale.getLanguage();
        String str2 = "";
        String country = locale.getCountry();
        int i = ddo.b;
        if (ddk.b.containsKey(Integer.valueOf(i))) {
            str = (String) ddk.b.get(Integer.valueOf(i));
        } else {
            str = "";
        }
        String a = ddk.a(ddo);
        if (str.equals("") || !a.startsWith(str)) {
            str = this.b.a(ddo, language, str2, country);
        } else {
            ddo a2;
            try {
                a2 = this.c.a(a.substring(str.length()), this.c.a(ddo.b));
            } catch (ddi e) {
                a2 = ddo;
            }
            str = this.b.a(a2, language, str2, country);
        }
        if (str.length() > 0) {
            return str;
        }
        return b(ddo, locale);
    }

    public final String a(ddo ddo, Locale locale) {
        String a;
        int i;
        ddk ddk = this.c;
        int i2 = ddo.b;
        List list = (List) ddk.c.get(Integer.valueOf(i2));
        if (list == null) {
            a = ddk.a(ddo);
            Logger logger = ddk.a;
            Level level = Level.INFO;
            a = String.valueOf(String.valueOf(a));
            logger.log(level, new StringBuilder(a.length() + 54).append("Missing/invalid country_code (").append(i2).append(") for number ").append(a).toString());
            a = null;
        } else if (list.size() == 1) {
            a = (String) list.get(0);
        } else {
            a = ddk.a(ddo, list);
        }
        ddv a2 = ddk.a(ddo.b, a);
        if (a2 == null) {
            i = ddm.l;
        } else {
            i = ddk.a(ddk.a(ddo), a2);
        }
        if (i == ddm.l) {
            return "";
        }
        if (i == ddm.a || i == ddm.b || i == ddm.c) {
            i = 1;
        } else {
            i = 0;
        }
        if (i == 0) {
            return b(ddo, locale);
        }
        return c(ddo, locale);
    }
}
