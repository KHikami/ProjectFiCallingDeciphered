package defpackage;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: ddh */
final class ddh implements ddg {
    private static final Logger a;
    private final Map b;
    private final Map c;
    private final String d;
    private final dde e;

    static {
        a = Logger.getLogger(ddh.class.getName());
    }

    private ddh(String str, dde dde) {
        this.b = Collections.synchronizedMap(new HashMap());
        this.c = Collections.synchronizedMap(new HashMap());
        this.d = str;
        this.e = dde;
    }

    public ddh(dde dde) {
        this("/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto", dde);
    }

    public final ddv a(String str) {
        synchronized (this.b) {
            if (!this.b.containsKey(str)) {
                a(str, 0);
            }
        }
        return (ddv) this.b.get(str);
    }

    public final ddv a(int i) {
        synchronized (this.c) {
            if (!this.c.containsKey(Integer.valueOf(i))) {
                List list = (List) buf.K().get(Integer.valueOf(i));
                if (list.size() == 1 && "001".equals(list.get(0))) {
                    a("001", i);
                }
            }
        }
        return (ddv) this.c.get(Integer.valueOf(i));
    }

    private void a(String str, int i) {
        Object valueOf;
        String str2;
        boolean equals = "001".equals(str);
        String valueOf2 = String.valueOf(String.valueOf(this.d));
        if (equals) {
            valueOf = String.valueOf(i);
        } else {
            str2 = str;
        }
        str2 = String.valueOf(String.valueOf(valueOf));
        valueOf2 = new StringBuilder((valueOf2.length() + 1) + str2.length()).append(valueOf2).append("_").append(str2).toString();
        InputStream a = this.e.a(valueOf2);
        String str3;
        if (a == null) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String str4 = "missing metadata: ";
            str2 = String.valueOf(valueOf2);
            logger.log(level, str2.length() != 0 ? str4.concat(str2) : new String(str4));
            str3 = "missing metadata: ";
            str2 = String.valueOf(valueOf2);
            if (str2.length() != 0) {
                str2 = str3.concat(str2);
            } else {
                str2 = new String(str3);
            }
            throw new IllegalStateException(str2);
        }
        try {
            ddv[] ddvArr = ddh.a(new ObjectInputStream(a)).a;
            if (ddvArr.length == 0) {
                logger = a;
                level = Level.SEVERE;
                str4 = "empty metadata: ";
                str2 = String.valueOf(valueOf2);
                logger.log(level, str2.length() != 0 ? str4.concat(str2) : new String(str4));
                str3 = "empty metadata: ";
                str2 = String.valueOf(valueOf2);
                if (str2.length() != 0) {
                    str2 = str3.concat(str2);
                } else {
                    str2 = new String(str3);
                }
                throw new IllegalStateException(str2);
            }
            if (ddvArr.length > 1) {
                Logger logger2 = a;
                Level level2 = Level.WARNING;
                String str5 = "invalid metadata (too many entries): ";
                str2 = String.valueOf(valueOf2);
                logger2.log(level2, str2.length() != 0 ? str5.concat(str2) : new String(str5));
            }
            valueOf = ddvArr[0];
            if (equals) {
                this.c.put(Integer.valueOf(i), valueOf);
            } else {
                this.b.put(str, valueOf);
            }
        } catch (Throwable e) {
            Throwable th = e;
            Logger logger3 = a;
            Level level3 = Level.SEVERE;
            String str6 = "cannot load/parse metadata: ";
            str2 = String.valueOf(valueOf2);
            logger3.log(level3, str2.length() != 0 ? str6.concat(str2) : new String(str6), th);
            str4 = "cannot load/parse metadata: ";
            str2 = String.valueOf(valueOf2);
            if (str2.length() != 0) {
                str2 = str4.concat(str2);
            } else {
                str2 = new String(str4);
            }
            throw new RuntimeException(str2, th);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.ddw a(java.io.ObjectInputStream r5) {
        /*
        r1 = new ddw;
        r1.<init>();
        r0 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        r0 = defpackage.ddf.a(r5, r0);	 Catch:{ IOException -> 0x001d }
        r1.b(r0);	 Catch:{ IOException -> 0x001d }
        r5.close();	 Catch:{ IOException -> 0x0012 }
    L_0x0011:
        return r1;
    L_0x0012:
        r0 = move-exception;
        r2 = a;
        r3 = java.util.logging.Level.WARNING;
        r4 = "error closing input stream (ignored)";
        r2.log(r3, r4, r0);
        goto L_0x0011;
    L_0x001d:
        r0 = move-exception;
        r2 = a;	 Catch:{ all -> 0x0036 }
        r3 = java.util.logging.Level.WARNING;	 Catch:{ all -> 0x0036 }
        r4 = "error reading input (ignored)";
        r2.log(r3, r4, r0);	 Catch:{ all -> 0x0036 }
        r5.close();	 Catch:{ IOException -> 0x002b }
        goto L_0x0011;
    L_0x002b:
        r0 = move-exception;
        r2 = a;
        r3 = java.util.logging.Level.WARNING;
        r4 = "error closing input stream (ignored)";
        r2.log(r3, r4, r0);
        goto L_0x0011;
    L_0x0036:
        r0 = move-exception;
        r5.close();	 Catch:{ IOException -> 0x003b }
    L_0x003a:
        throw r0;
    L_0x003b:
        r1 = move-exception;
        r2 = a;
        r3 = java.util.logging.Level.WARNING;
        r4 = "error closing input stream (ignored)";
        r2.log(r3, r4, r1);
        goto L_0x003a;
        */
        throw new UnsupportedOperationException("Method not decompiled: ddh.a(java.io.ObjectInputStream):ddw");
    }
}
