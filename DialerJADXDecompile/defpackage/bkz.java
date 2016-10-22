package defpackage;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: bkz */
public final class bkz {
    public final bky a;
    final bkx b;

    public bkz(Context context) {
        this.a = bky.a(context);
        this.b = new bkx(context);
    }

    public final bla a(String str, String str2) {
        avl.b();
        if (str == null) {
            return new bla();
        }
        String formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(str, str2);
        if (TextUtils.isEmpty(formatNumberToE164)) {
            formatNumberToE164 = str;
        }
        return new bla(a(formatNumberToE164), b(str));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final boolean a(java.lang.String r7) {
        /*
        r6 = this;
        r2 = 0;
        r0 = r6.a;
        r1 = "server_spam_table";
        r3 = "number=?";
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r4[r5] = r7;
        r5 = r2;
        r1 = r0.a(r1, r2, r3, r4, r5);
        r0 = defpackage.bkz.a(r1);	 Catch:{ Throwable -> 0x001c }
        if (r1 == 0) goto L_0x001b;
    L_0x0018:
        r1.close();
    L_0x001b:
        return r0;
    L_0x001c:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0026;
    L_0x0021:
        if (r2 == 0) goto L_0x002c;
    L_0x0023:
        r1.close();	 Catch:{ Throwable -> 0x0027 }
    L_0x0026:
        throw r0;
    L_0x0027:
        r1 = move-exception;
        r2.addSuppressed(r1);
        goto L_0x0026;
    L_0x002c:
        r1.close();
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: bkz.a(java.lang.String):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final defpackage.blb b(java.lang.String r7) {
        /*
        r6 = this;
        r2 = r6.c(r7);
        r1 = 0;
        r0 = defpackage.bkz.a(r2);	 Catch:{ Throwable -> 0x0051, all -> 0x0068 }
        if (r0 == 0) goto L_0x0039;
    L_0x000b:
        r0 = r2.moveToFirst();	 Catch:{ Throwable -> 0x0051, all -> 0x0068 }
        if (r0 == 0) goto L_0x0039;
    L_0x0011:
        r0 = "spam_status";
        r0 = r2.getColumnIndex(r0);	 Catch:{ Throwable -> 0x0051, all -> 0x0068 }
        r0 = r2.getInt(r0);	 Catch:{ Throwable -> 0x0051, all -> 0x0068 }
        switch(r0) {
            case 0: goto L_0x0049;
            case 1: goto L_0x0041;
            default: goto L_0x001e;
        };	 Catch:{ Throwable -> 0x0051, all -> 0x0068 }
    L_0x001e:
        r3 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0051, all -> 0x0068 }
        r4 = 50;
        r3.<init>(r4);	 Catch:{ Throwable -> 0x0051, all -> 0x0068 }
        r4 = "Invalid user spam list status from DB: ";
        r3 = r3.append(r4);	 Catch:{ Throwable -> 0x0051, all -> 0x0068 }
        r0 = r3.append(r0);	 Catch:{ Throwable -> 0x0051, all -> 0x0068 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0051, all -> 0x0068 }
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ Throwable -> 0x0051, all -> 0x0068 }
        defpackage.buf.b(r0, r3);	 Catch:{ Throwable -> 0x0051, all -> 0x0068 }
    L_0x0039:
        if (r2 == 0) goto L_0x003e;
    L_0x003b:
        r2.close();
    L_0x003e:
        r0 = defpackage.blb.NOT_ON_LIST;
    L_0x0040:
        return r0;
    L_0x0041:
        r0 = defpackage.blb.SPAM;	 Catch:{ Throwable -> 0x0051, all -> 0x0068 }
        if (r2 == 0) goto L_0x0040;
    L_0x0045:
        r2.close();
        goto L_0x0040;
    L_0x0049:
        r0 = defpackage.blb.NOT_SPAM;	 Catch:{ Throwable -> 0x0051, all -> 0x0068 }
        if (r2 == 0) goto L_0x0040;
    L_0x004d:
        r2.close();
        goto L_0x0040;
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0053 }
    L_0x0053:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
    L_0x0057:
        if (r2 == 0) goto L_0x005e;
    L_0x0059:
        if (r1 == 0) goto L_0x0064;
    L_0x005b:
        r2.close();	 Catch:{ Throwable -> 0x005f }
    L_0x005e:
        throw r0;
    L_0x005f:
        r2 = move-exception;
        r1.addSuppressed(r2);
        goto L_0x005e;
    L_0x0064:
        r2.close();
        goto L_0x005e;
    L_0x0068:
        r0 = move-exception;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: bkz.b(java.lang.String):blb");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(java.lang.String r7, java.lang.String r8, int r9, int r10) {
        /*
        r6 = this;
        r2 = -1;
        defpackage.avl.b();
        if (r7 != 0) goto L_0x0009;
    L_0x0007:
        r0 = r2;
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = android.telephony.PhoneNumberUtils.formatNumberToE164(r7, r8);
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 == 0) goto L_0x004d;
    L_0x0013:
        r4 = r6.c(r7);
        r1 = 0;
        r5 = defpackage.bkz.a(r4);	 Catch:{ Throwable -> 0x0039 }
        if (r4 == 0) goto L_0x0021;
    L_0x001e:
        r4.close();
    L_0x0021:
        r0 = 0;
        r0 = r6.a(r7, r0);
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x0008;
    L_0x002a:
        r2 = r6.b;
        r3 = r2.a(r7, r9, r10);
        r4 = 1;
        r3.c = r4;
        r3.j = r5;
        r2.a(r3);
        goto L_0x0008;
    L_0x0039:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x003b }
    L_0x003b:
        r0 = move-exception;
        if (r4 == 0) goto L_0x0043;
    L_0x003e:
        if (r1 == 0) goto L_0x0049;
    L_0x0040:
        r4.close();	 Catch:{ Throwable -> 0x0044 }
    L_0x0043:
        throw r0;
    L_0x0044:
        r2 = move-exception;
        r1.addSuppressed(r2);
        goto L_0x0043;
    L_0x0049:
        r4.close();
        goto L_0x0043;
    L_0x004d:
        r7 = r0;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: bkz.a(java.lang.String, java.lang.String, int, int):long");
    }

    final long a(String str, int i) {
        bky bky = this.a;
        ContentValues contentValues = new ContentValues();
        contentValues.put("number", str);
        contentValues.put("spam_status", Integer.valueOf(i));
        return bky.getWritableDatabase().insertWithOnConflict("client_spam_table", null, contentValues, 5);
    }

    private final Cursor c(String str) {
        return this.a.a("client_spam_table", null, "number=?", new String[]{str}, null);
    }

    private static boolean a(Cursor cursor) {
        return cursor != null && cursor.getCount() > 0;
    }
}
