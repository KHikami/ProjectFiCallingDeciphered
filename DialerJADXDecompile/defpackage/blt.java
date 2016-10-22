package defpackage;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: blt */
public final class blt {
    static final Pattern a;
    private static final Pattern b;
    private static blt c;
    private static Object d;
    private final blu[] e;
    private final Pattern f;

    static {
        a = Pattern.compile(" +");
        b = Pattern.compile("\\W");
        c = new blt(new blu[0]);
    }

    private blt(blu[] bluArr) {
        Arrays.sort(bluArr);
        StringBuilder stringBuilder = new StringBuilder("(");
        for (int i = 0; i < bluArr.length; i++) {
            if (i > 0) {
                stringBuilder.append(")|(");
            }
            stringBuilder.append(b.matcher(bluArr[i].b).replaceAll("\\\\$0"));
        }
        this.f = Pattern.compile(stringBuilder.append(")").toString());
        this.e = bluArr;
    }

    public final blu a(String str) {
        Matcher matcher = this.f.matcher(str);
        if (matcher.lookingAt()) {
            for (int i = 0; i < this.e.length; i++) {
                if (matcher.group(i + 1) != null) {
                    return this.e[i];
                }
            }
        }
        return blu.c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized defpackage.blt a(android.content.ContentResolver r8) {
        /*
        r2 = defpackage.blt.class;
        monitor-enter(r2);
        r3 = defpackage.csn.a(r8);	 Catch:{ all -> 0x008f }
        r0 = d;	 Catch:{ all -> 0x008f }
        if (r3 != r0) goto L_0x0022;
    L_0x000b:
        r0 = "UrlRules";
        r1 = 2;
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x008f }
        if (r0 == 0) goto L_0x001e;
    L_0x0014:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008f }
        r1 = "Using cached rules, versionToken: ";
        r0.<init>(r1);	 Catch:{ all -> 0x008f }
        r0.append(r3);	 Catch:{ all -> 0x008f }
    L_0x001e:
        r0 = c;	 Catch:{ all -> 0x008f }
    L_0x0020:
        monitor-exit(r2);
        return r0;
    L_0x0022:
        r0 = 1;
        r0 = new java.lang.String[r0];	 Catch:{ all -> 0x008f }
        r1 = 0;
        r4 = "url:";
        r0[r1] = r4;	 Catch:{ all -> 0x008f }
        r0 = defpackage.csn.a(r8, r0);	 Catch:{ all -> 0x008f }
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x008f }
        r4.<init>();	 Catch:{ all -> 0x008f }
        r0 = r0.entrySet();	 Catch:{ all -> 0x008f }
        r5 = r0.iterator();	 Catch:{ all -> 0x008f }
    L_0x003b:
        r0 = r5.hasNext();	 Catch:{ all -> 0x008f }
        if (r0 == 0) goto L_0x0092;
    L_0x0041:
        r0 = r5.next();	 Catch:{ all -> 0x008f }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x008f }
        r1 = r0.getKey();	 Catch:{ blv -> 0x0086 }
        r1 = (java.lang.String) r1;	 Catch:{ blv -> 0x0086 }
        r6 = 4;
        r1 = r1.substring(r6);	 Catch:{ blv -> 0x0086 }
        r0 = r0.getValue();	 Catch:{ blv -> 0x0086 }
        r0 = (java.lang.String) r0;	 Catch:{ blv -> 0x0086 }
        if (r0 == 0) goto L_0x003b;
    L_0x005a:
        r6 = r0.length();	 Catch:{ blv -> 0x0086 }
        if (r6 == 0) goto L_0x003b;
    L_0x0060:
        r6 = "UrlRules";
        r7 = 2;
        r6 = android.util.Log.isLoggable(r6, r7);	 Catch:{ blv -> 0x0086 }
        if (r6 == 0) goto L_0x007d;
    L_0x0069:
        r6 = new java.lang.StringBuilder;	 Catch:{ blv -> 0x0086 }
        r7 = "  Rule ";
        r6.<init>(r7);	 Catch:{ blv -> 0x0086 }
        r6 = r6.append(r1);	 Catch:{ blv -> 0x0086 }
        r7 = ": ";
        r6 = r6.append(r7);	 Catch:{ blv -> 0x0086 }
        r6.append(r0);	 Catch:{ blv -> 0x0086 }
    L_0x007d:
        r6 = new blu;	 Catch:{ blv -> 0x0086 }
        r6.<init>(r1, r0);	 Catch:{ blv -> 0x0086 }
        r4.add(r6);	 Catch:{ blv -> 0x0086 }
        goto L_0x003b;
    L_0x0086:
        r0 = move-exception;
        r1 = "UrlRules";
        r6 = "Invalid rule from Gservices";
        android.util.Log.e(r1, r6, r0);	 Catch:{ all -> 0x008f }
        goto L_0x003b;
    L_0x008f:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x0092:
        r1 = new blt;	 Catch:{ all -> 0x008f }
        r0 = r4.size();	 Catch:{ all -> 0x008f }
        r0 = new defpackage.blu[r0];	 Catch:{ all -> 0x008f }
        r0 = r4.toArray(r0);	 Catch:{ all -> 0x008f }
        r0 = (defpackage.blu[]) r0;	 Catch:{ all -> 0x008f }
        r1.<init>(r0);	 Catch:{ all -> 0x008f }
        c = r1;	 Catch:{ all -> 0x008f }
        d = r3;	 Catch:{ all -> 0x008f }
        r0 = "UrlRules";
        r1 = 2;
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x008f }
        if (r0 == 0) goto L_0x00ba;
    L_0x00b0:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008f }
        r1 = "New rules stored, versionToken: ";
        r0.<init>(r1);	 Catch:{ all -> 0x008f }
        r0.append(r3);	 Catch:{ all -> 0x008f }
    L_0x00ba:
        r0 = c;	 Catch:{ all -> 0x008f }
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: blt.a(android.content.ContentResolver):blt");
    }
}
