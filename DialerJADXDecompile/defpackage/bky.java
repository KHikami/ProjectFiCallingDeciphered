package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.ArraySet;
import java.util.Collections;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: bky */
public final class bky extends SQLiteOpenHelper {
    private static bky a;
    private static Context b;

    private bky(Context context, String str) {
        super(context, str, null, 1);
        b = context;
    }

    public static synchronized bky a(Context context) {
        bky bky;
        synchronized (bky.class) {
            if (a == null) {
                a = new bky(context.getApplicationContext(), "normalized_spam.db");
            }
            bky = a;
        }
        return bky;
    }

    public static long b(Context context) {
        return context.getSharedPreferences(context.getPackageName(), 0).getLong("global_blacklist_version_v2", 0);
    }

    private static boolean a(long j, String[] strArr) {
        Editor edit = b.getSharedPreferences(b.getPackageName(), 0).edit();
        edit.putLong("global_blacklist_version_v2", j);
        Object arraySet = new ArraySet();
        Collections.addAll(arraySet, strArr);
        edit.putStringSet("global_blacklist_country_codes", arraySet);
        return edit.commit();
    }

    private static boolean a(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            buf.a("SpamDatabaseHelper, no numbers added to the spam list.", new Object[0]);
            return true;
        }
        ContentValues contentValues = new ContentValues();
        cxl cxl = new cxl();
        for (String str : strArr) {
            contentValues.clear();
            contentValues.put("number", str);
            if (sQLiteDatabase.insert("server_spam_table", null, contentValues) < 0) {
                String valueOf = String.valueOf(buf.k(str));
                buf.c(new StringBuilder(String.valueOf(valueOf).length() + 61).append("SpamDatabaseHelper, could not insert ").append(valueOf).append(" into server spam table.").toString(), new Object[0]);
                return false;
            }
        }
        buf.a("SpamDatabaseHelper, inserted " + strArr.length + " numbers into the server spam list.", new Object[0]);
        return true;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS server_spam_table (number TEXT PRIMARY KEY);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS client_spam_table (number TEXT PRIMARY KEY, spam_status INTEGER);");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        buf.c("SpamDatabaseHelper, upgrading database from " + i + " to " + i2, new Object[0]);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS server_spam_table");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS client_spam_table");
        onCreate(sQLiteDatabase);
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.enableWriteAheadLogging();
    }

    public final Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3) {
        return getReadableDatabase().query(str, null, str2, strArr2, null, null, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.dcy r13, long r14, java.lang.String[] r16) {
        /*
        r12 = this;
        r0 = 1;
        r1 = 0;
        java.util.Objects.requireNonNull(r13);
        r3 = r12.getWritableDatabase();
        r3.beginTransaction();
        r2 = r13.a;	 Catch:{ all -> 0x00ad }
        r2 = defpackage.bky.a(r3, r2);	 Catch:{ all -> 0x00ad }
        if (r2 == 0) goto L_0x00ab;
    L_0x0014:
        r4 = r13.b;	 Catch:{ all -> 0x00ad }
        if (r4 == 0) goto L_0x001b;
    L_0x0018:
        r2 = r4.length;	 Catch:{ all -> 0x00ad }
        if (r2 != 0) goto L_0x0035;
    L_0x001b:
        r2 = "SpamDatabaseHelper, no numbers removed from the spam list.";
        r4 = 0;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x00ad }
        defpackage.buf.a(r2, r4);	 Catch:{ all -> 0x00ad }
        r2 = r0;
    L_0x0024:
        if (r2 == 0) goto L_0x00ab;
    L_0x0026:
        r2 = defpackage.bky.a(r14, r16);	 Catch:{ all -> 0x00ad }
        if (r2 == 0) goto L_0x00ab;
    L_0x002c:
        if (r0 == 0) goto L_0x0031;
    L_0x002e:
        r3.setTransactionSuccessful();	 Catch:{ all -> 0x00ad }
    L_0x0031:
        r3.endTransaction();
        return r0;
    L_0x0035:
        r2 = new cxl;	 Catch:{ all -> 0x00ad }
        r2.<init>();	 Catch:{ all -> 0x00ad }
        r5 = r4.length;	 Catch:{ all -> 0x00ad }
        r2 = r1;
    L_0x003c:
        if (r2 >= r5) goto L_0x0086;
    L_0x003e:
        r6 = r4[r2];	 Catch:{ all -> 0x00ad }
        r7 = "server_spam_table";
        r8 = "number = ?";
        r9 = 1;
        r9 = new java.lang.String[r9];	 Catch:{ all -> 0x00ad }
        r10 = 0;
        r9[r10] = r6;	 Catch:{ all -> 0x00ad }
        r7 = r3.delete(r7, r8, r9);	 Catch:{ all -> 0x00ad }
        if (r7 >= 0) goto L_0x0083;
    L_0x0050:
        r2 = defpackage.buf.k(r6);	 Catch:{ all -> 0x00ad }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00ad }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ad }
        r5 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00ad }
        r5 = r5.length();	 Catch:{ all -> 0x00ad }
        r5 = r5 + 68;
        r4.<init>(r5);	 Catch:{ all -> 0x00ad }
        r5 = "SpamDatabaseHelper, could not delete number ";
        r4 = r4.append(r5);	 Catch:{ all -> 0x00ad }
        r2 = r4.append(r2);	 Catch:{ all -> 0x00ad }
        r4 = " from server spam table.";
        r2 = r2.append(r4);	 Catch:{ all -> 0x00ad }
        r2 = r2.toString();	 Catch:{ all -> 0x00ad }
        r4 = 0;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x00ad }
        defpackage.buf.c(r2, r4);	 Catch:{ all -> 0x00ad }
        r2 = r1;
        goto L_0x0024;
    L_0x0083:
        r2 = r2 + 1;
        goto L_0x003c;
    L_0x0086:
        r2 = r4.length;	 Catch:{ all -> 0x00ad }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ad }
        r5 = 74;
        r4.<init>(r5);	 Catch:{ all -> 0x00ad }
        r5 = "SpamDatabaseHelper, :emoved ";
        r4 = r4.append(r5);	 Catch:{ all -> 0x00ad }
        r2 = r4.append(r2);	 Catch:{ all -> 0x00ad }
        r4 = " numbers from the server spam list.";
        r2 = r2.append(r4);	 Catch:{ all -> 0x00ad }
        r2 = r2.toString();	 Catch:{ all -> 0x00ad }
        r4 = 0;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x00ad }
        defpackage.buf.a(r2, r4);	 Catch:{ all -> 0x00ad }
        r2 = r0;
        goto L_0x0024;
    L_0x00ab:
        r0 = r1;
        goto L_0x002c;
    L_0x00ad:
        r0 = move-exception;
        r3.endTransaction();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bky.a(dcy, long, java.lang.String[]):boolean");
    }

    public final boolean a(dcx dcx, long j, String[] strArr) {
        Objects.requireNonNull(dcx);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.execSQL("DELETE FROM server_spam_table");
            boolean z = bky.a(writableDatabase, dcx.a) && bky.a(j, strArr);
            if (z) {
                writableDatabase.setTransactionSuccessful();
            }
            writableDatabase.endTransaction();
            return z;
        } catch (Throwable th) {
            writableDatabase.endTransaction();
        }
    }
}
