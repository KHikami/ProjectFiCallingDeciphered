package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: jib */
public final class jib {
    private static final String[] a;
    private static final ThreadLocal<ContentValues> b;
    private static final String[] c;
    private static final ThreadLocal<String[]> d;
    private static final ThreadLocal<String[]> e;
    private static final ThreadLocal<String[]> f;

    static {
        a = new String[]{"name"};
        b = new jic();
        c = new String[0];
        d = new jid();
        e = new jie();
        f = new jif();
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("sqlite_master", a, "type='table' AND name NOT LIKE 'sqlite_%' AND name NOT LIKE 'android_%'", null, null, null, null);
        if (query != null) {
            LinkedList linkedList = new LinkedList();
            while (query.moveToNext()) {
                String string = query.getString(0);
                if (jib.a(sQLiteDatabase, string)) {
                    linkedList.addFirst(string);
                } else {
                    try {
                        linkedList.addLast(string);
                    } finally {
                        query.close();
                    }
                }
            }
            jib.a(sQLiteDatabase, linkedList);
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        LinkedList linkedList = new LinkedList();
        for (String str : strArr) {
            if (jib.a(sQLiteDatabase, str)) {
                linkedList.addFirst(str);
            } else {
                linkedList.addLast(str);
            }
        }
        jib.a(sQLiteDatabase, linkedList);
    }

    private static void a(SQLiteDatabase sQLiteDatabase, LinkedList<String> linkedList) {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String valueOf = String.valueOf("DROP TABLE IF EXISTS ");
            str = String.valueOf(str);
            sQLiteDatabase.execSQL(str.length() != 0 ? valueOf.concat(str) : new String(valueOf));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.database.sqlite.SQLiteDatabase r4, java.lang.String r5) {
        /*
        r0 = 0;
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x003f, all -> 0x0046 }
        r2 = java.lang.String.valueOf(r5);	 Catch:{ Exception -> 0x003f, all -> 0x0046 }
        r2 = r2.length();	 Catch:{ Exception -> 0x003f, all -> 0x0046 }
        r2 = r2 + 25;
        r1.<init>(r2);	 Catch:{ Exception -> 0x003f, all -> 0x0046 }
        r2 = "pragma foreign_key_list(";
        r1 = r1.append(r2);	 Catch:{ Exception -> 0x003f, all -> 0x0046 }
        r1 = r1.append(r5);	 Catch:{ Exception -> 0x003f, all -> 0x0046 }
        r2 = ")";
        r1 = r1.append(r2);	 Catch:{ Exception -> 0x003f, all -> 0x0046 }
        r1 = r1.toString();	 Catch:{ Exception -> 0x003f, all -> 0x0046 }
        r2 = 0;
        r0 = r4.rawQuery(r1, r2);	 Catch:{ Exception -> 0x003f, all -> 0x0046 }
        if (r0 == 0) goto L_0x0038;
    L_0x002b:
        r1 = r0.getCount();	 Catch:{ Exception -> 0x003f, all -> 0x0050 }
        if (r1 <= 0) goto L_0x0038;
    L_0x0031:
        if (r0 == 0) goto L_0x0036;
    L_0x0033:
        r0.close();
    L_0x0036:
        r0 = 1;
    L_0x0037:
        return r0;
    L_0x0038:
        if (r0 == 0) goto L_0x003d;
    L_0x003a:
        r0.close();
    L_0x003d:
        r0 = 0;
        goto L_0x0037;
    L_0x003f:
        r1 = move-exception;
        if (r0 == 0) goto L_0x003d;
    L_0x0042:
        r0.close();
        goto L_0x003d;
    L_0x0046:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x004a:
        if (r1 == 0) goto L_0x004f;
    L_0x004c:
        r1.close();
    L_0x004f:
        throw r0;
    L_0x0050:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
        goto L_0x004a;
        */
        throw new UnsupportedOperationException("Method not decompiled: jib.a(android.database.sqlite.SQLiteDatabase, java.lang.String):boolean");
    }

    public static void b(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        for (Object obj : strArr) {
            String valueOf = String.valueOf("DROP VIEW IF EXISTS ");
            String valueOf2 = String.valueOf(obj);
            sQLiteDatabase.execSQL(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }
    }

    public static void c(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("sqlite_master", a, "type='view'", null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    String string = query.getString(0);
                    String valueOf = String.valueOf("DROP VIEW IF EXISTS ");
                    string = String.valueOf(string);
                    sQLiteDatabase.execSQL(string.length() != 0 ? valueOf.concat(string) : new String(valueOf));
                } finally {
                    query.close();
                }
            }
        }
    }
}
