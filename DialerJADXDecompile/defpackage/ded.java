package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: ded */
public class ded {
    private static final Logger a;
    private final String b;
    private dea c;
    private Map d;

    static {
        a = Logger.getLogger(ded.class.getName());
    }

    public ded(String str) {
        InputStream objectInputStream;
        IOException e;
        Throwable th;
        this.c = new dea();
        this.d = new HashMap();
        this.b = str;
        try {
            objectInputStream = new ObjectInputStream(ded.class.getResourceAsStream(String.valueOf(this.b).concat("config")));
            try {
                this.c.readExternal(objectInputStream);
                ded.a(objectInputStream);
            } catch (IOException e2) {
                e = e2;
                try {
                    a.log(Level.WARNING, e.toString());
                    ded.a(objectInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    ded.a(objectInputStream);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            objectInputStream = null;
            a.log(Level.WARNING, e.toString());
            ded.a(objectInputStream);
        } catch (Throwable th3) {
            th = th3;
            objectInputStream = null;
            ded.a(objectInputStream);
            throw th;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.deb a(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
        r6 = this;
        r3 = 0;
        r5 = 95;
        r0 = r6.c;
        r1 = r8.length();
        if (r1 == 0) goto L_0x00d8;
    L_0x000b:
        r1 = r0.a;
        r1 = java.util.Arrays.binarySearch(r1, r7);
        if (r1 < 0) goto L_0x00d8;
    L_0x0013:
        r0 = r0.b;
        r0 = r0.get(r1);
        r0 = (java.util.Set) r0;
        r1 = r0.size();
        if (r1 <= 0) goto L_0x00d8;
    L_0x0021:
        r1 = new java.lang.StringBuilder;
        r1.<init>(r8);
        defpackage.dea.a(r9, r1);
        defpackage.dea.a(r10, r1);
        r2 = r1.toString();
        r1 = defpackage.dea.c;
        r1 = r1.get(r2);
        r1 = (java.lang.String) r1;
        if (r1 == 0) goto L_0x0063;
    L_0x003a:
        r4 = r0.contains(r1);
        if (r4 == 0) goto L_0x0063;
    L_0x0040:
        r8 = r1;
    L_0x0041:
        r0 = r8.length();
        if (r0 <= 0) goto L_0x00d8;
    L_0x0047:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r0.append(r7);
        r1 = r1.append(r5);
        r1.append(r8);
        r0 = r0.toString();
    L_0x005b:
        r1 = r0.length();
        if (r1 != 0) goto L_0x00db;
    L_0x0061:
        r0 = r3;
    L_0x0062:
        return r0;
    L_0x0063:
        r1 = r0.contains(r2);
        if (r1 == 0) goto L_0x006b;
    L_0x0069:
        r8 = r2;
        goto L_0x0041;
    L_0x006b:
        r1 = r9.length();
        if (r1 != 0) goto L_0x0077;
    L_0x0071:
        r1 = r10.length();
        if (r1 > 0) goto L_0x0083;
    L_0x0077:
        r1 = r10.length();
        if (r1 != 0) goto L_0x008f;
    L_0x007d:
        r1 = r9.length();
        if (r1 <= 0) goto L_0x008f;
    L_0x0083:
        r1 = 1;
    L_0x0084:
        if (r1 == 0) goto L_0x0091;
    L_0x0086:
        r0 = r0.contains(r8);
        if (r0 != 0) goto L_0x0041;
    L_0x008c:
        r8 = "";
        goto L_0x0041;
    L_0x008f:
        r1 = 0;
        goto L_0x0084;
    L_0x0091:
        r1 = r9.length();
        if (r1 <= 0) goto L_0x008c;
    L_0x0097:
        r1 = r10.length();
        if (r1 <= 0) goto L_0x008c;
    L_0x009d:
        r1 = new java.lang.StringBuilder;
        r1.<init>(r8);
        r1 = r1.append(r5);
        r1 = r1.append(r9);
        r1 = r1.toString();
        r2 = r0.contains(r1);
        if (r2 == 0) goto L_0x00b6;
    L_0x00b4:
        r8 = r1;
        goto L_0x0041;
    L_0x00b6:
        r1 = new java.lang.StringBuilder;
        r1.<init>(r8);
        r1 = r1.append(r5);
        r1 = r1.append(r10);
        r1 = r1.toString();
        r2 = r0.contains(r1);
        if (r2 == 0) goto L_0x00d0;
    L_0x00cd:
        r8 = r1;
        goto L_0x0041;
    L_0x00d0:
        r0 = r0.contains(r8);
        if (r0 == 0) goto L_0x008c;
    L_0x00d6:
        goto L_0x0041;
    L_0x00d8:
        r0 = "";
        goto L_0x005b;
    L_0x00db:
        r1 = r6.d;
        r1 = r1.containsKey(r0);
        if (r1 != 0) goto L_0x0112;
    L_0x00e3:
        r2 = defpackage.ded.class;
        r1 = r6.b;
        r4 = java.lang.String.valueOf(r1);
        r1 = java.lang.String.valueOf(r0);
        r5 = r1.length();
        if (r5 == 0) goto L_0x011c;
    L_0x00f5:
        r1 = r4.concat(r1);
    L_0x00f9:
        r1 = r2.getResourceAsStream(r1);
        r2 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x0122 }
        r2.<init>(r1);	 Catch:{ IOException -> 0x0122 }
        r1 = new deb;	 Catch:{ IOException -> 0x013a, all -> 0x0137 }
        r1.<init>();	 Catch:{ IOException -> 0x013a, all -> 0x0137 }
        r1.readExternal(r2);	 Catch:{ IOException -> 0x013a, all -> 0x0137 }
        r3 = r6.d;	 Catch:{ IOException -> 0x013a, all -> 0x0137 }
        r3.put(r0, r1);	 Catch:{ IOException -> 0x013a, all -> 0x0137 }
        defpackage.ded.a(r2);
    L_0x0112:
        r1 = r6.d;
        r0 = r1.get(r0);
        r0 = (defpackage.deb) r0;
        goto L_0x0062;
    L_0x011c:
        r1 = new java.lang.String;
        r1.<init>(r4);
        goto L_0x00f9;
    L_0x0122:
        r1 = move-exception;
    L_0x0123:
        r2 = a;	 Catch:{ all -> 0x0132 }
        r4 = java.util.logging.Level.WARNING;	 Catch:{ all -> 0x0132 }
        r1 = r1.toString();	 Catch:{ all -> 0x0132 }
        r2.log(r4, r1);	 Catch:{ all -> 0x0132 }
        defpackage.ded.a(r3);
        goto L_0x0112;
    L_0x0132:
        r0 = move-exception;
    L_0x0133:
        defpackage.ded.a(r3);
        throw r0;
    L_0x0137:
        r0 = move-exception;
        r3 = r2;
        goto L_0x0133;
    L_0x013a:
        r1 = move-exception;
        r3 = r2;
        goto L_0x0123;
        */
        throw new UnsupportedOperationException("Method not decompiled: ded.a(int, java.lang.String, java.lang.String, java.lang.String):deb");
    }

    private static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                a.log(Level.WARNING, e.toString());
            }
        }
    }

    public final String a(ddo ddo, String str, String str2, String str3) {
        String a;
        Object obj = 1;
        int i = ddo.b;
        if (i == 1) {
            i = ((int) (ddo.c / 10000000)) + 1000;
        }
        deb a2 = a(i, str, str2, str3);
        String a3 = a2 != null ? a2.a(ddo) : null;
        if (a3 == null || a3.length() == 0) {
            if (str.equals("zh") || str.equals("ja") || str.equals("ko")) {
                obj = null;
            }
            if (obj != null) {
                deb a4 = a(i, "en", "", "");
                if (a4 == null) {
                    return "";
                }
                a = a4.a(ddo);
                return a != null ? "" : a;
            }
        }
        a = a3;
        if (a != null) {
        }
    }
}
