package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import java.util.Objects;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: aum */
public final class aum {
    final Context a;

    public aum(Context context) {
        this.a = (Context) Objects.requireNonNull(context);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(android.content.ContentResolver r8) {
        /*
        r7 = 1;
        r3 = 0;
        r6 = 0;
        r1 = defpackage.awe.a;
        r2 = new java.lang.String[r7];
        r0 = "number";
        r2[r6] = r0;
        r0 = r8;
        r4 = r3;
        r5 = r3;
        r2 = r0.query(r1, r2, r3, r4, r5);
        if (r2 != 0) goto L_0x0023;
    L_0x0014:
        r0 = "BlockedNumbersMigrator, migrate - cursor was null";
        r1 = 0;
        r1 = new java.lang.Object[r1];	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        defpackage.buf.a(r0, r1);	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        if (r2 == 0) goto L_0x0021;
    L_0x001e:
        r2.close();
    L_0x0021:
        r0 = r6;
    L_0x0022:
        return r0;
    L_0x0023:
        r0 = r2.getCount();	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r4 = 74;
        r1.<init>(r4);	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r4 = "BlockedNumbersMigrator, migrate - attempting to migrate ";
        r1 = r1.append(r4);	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r0 = r1.append(r0);	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r1 = "numbers";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r1 = 0;
        r1 = new java.lang.Object[r1];	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        defpackage.buf.a(r0, r1);	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
    L_0x0048:
        r0 = r2.moveToNext();	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        if (r0 == 0) goto L_0x0086;
    L_0x004e:
        r0 = "number";
        r0 = r2.getColumnIndex(r0);	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r0 = r2.getString(r0);	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r1 = defpackage.aum.a(r8, r0);	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        if (r1 == 0) goto L_0x0074;
    L_0x005e:
        r0 = "BlockedNumbersMigrator, migrate - number was already blocked in new blocking";
        r1 = 0;
        r1 = new java.lang.Object[r1];	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        defpackage.buf.a(r0, r1);	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        goto L_0x0048;
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0069 }
    L_0x0069:
        r1 = move-exception;
        r3 = r0;
        r0 = r1;
    L_0x006c:
        if (r2 == 0) goto L_0x0073;
    L_0x006e:
        if (r3 == 0) goto L_0x00b4;
    L_0x0070:
        r2.close();	 Catch:{ Throwable -> 0x00af }
    L_0x0073:
        throw r0;
    L_0x0074:
        r1 = new android.content.ContentValues;	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r1.<init>();	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r4 = "original_number";
        r1.put(r4, r0);	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r0 = android.provider.BlockedNumberContract.BlockedNumbers.CONTENT_URI;	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r8.insert(r0, r1);	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r6 = r6 + 1;
        goto L_0x0048;
    L_0x0086:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r1 = 83;
        r0.<init>(r1);	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r1 = "BlockedNumbersMigrator, migrate - migration complete. ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r0 = r0.append(r6);	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r1 = " numbers migrated.";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        r1 = 0;
        r1 = new java.lang.Object[r1];	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        defpackage.buf.a(r0, r1);	 Catch:{ Throwable -> 0x0067, all -> 0x00b8 }
        if (r2 == 0) goto L_0x00ac;
    L_0x00a9:
        r2.close();
    L_0x00ac:
        r0 = r7;
        goto L_0x0022;
    L_0x00af:
        r1 = move-exception;
        r3.addSuppressed(r1);
        goto L_0x0073;
    L_0x00b4:
        r2.close();
        goto L_0x0073;
    L_0x00b8:
        r0 = move-exception;
        goto L_0x006c;
        */
        throw new UnsupportedOperationException("Method not decompiled: aum.a(android.content.ContentResolver):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.content.ContentResolver r8, java.lang.String r9) {
        /*
        r5 = 0;
        r6 = 1;
        r7 = 0;
        r1 = android.provider.BlockedNumberContract.BlockedNumbers.CONTENT_URI;
        r2 = new java.lang.String[r6];
        r0 = "_id";
        r2[r7] = r0;
        r3 = "original_number = ?";
        r4 = new java.lang.String[r6];
        r4[r7] = r9;
        r0 = r8;
        r1 = r0.query(r1, r2, r3, r4, r5);
        if (r1 == 0) goto L_0x0025;
    L_0x0018:
        r0 = r1.getCount();	 Catch:{ Throwable -> 0x0027 }
        if (r0 == 0) goto L_0x0025;
    L_0x001e:
        r0 = r6;
    L_0x001f:
        if (r1 == 0) goto L_0x0024;
    L_0x0021:
        r1.close();
    L_0x0024:
        return r0;
    L_0x0025:
        r0 = r7;
        goto L_0x001f;
    L_0x0027:
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0031;
    L_0x002c:
        if (r5 == 0) goto L_0x0037;
    L_0x002e:
        r1.close();	 Catch:{ Throwable -> 0x0032 }
    L_0x0031:
        throw r0;
    L_0x0032:
        r1 = move-exception;
        r5.addSuppressed(r1);
        goto L_0x0031;
    L_0x0037:
        r1.close();
        goto L_0x0031;
        */
        throw new UnsupportedOperationException("Method not decompiled: aum.a(android.content.ContentResolver, java.lang.String):boolean");
    }

    public final boolean a(auo auo) {
        buf.a("BlockedNumbersMigrator, migrate - start", new Object[0]);
        if (buf.n()) {
            Objects.requireNonNull(auo);
            new aun(this, auo).execute(new Void[0]);
            return true;
        }
        buf.a("BlockedNumbersMigrator, migrate - can't use new filtering", new Object[0]);
        return false;
    }
}
