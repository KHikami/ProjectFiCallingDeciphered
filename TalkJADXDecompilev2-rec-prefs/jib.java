package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.LinkedList;

public final class jib {
    private static final String[] f20125a = new String[]{"name"};
    private static final ThreadLocal<ContentValues> f20126b = new jic();
    private static final String[] f20127c = new String[0];
    private static final ThreadLocal<String[]> f20128d = new jid();
    private static final ThreadLocal<String[]> f20129e = new jie();
    private static final ThreadLocal<String[]> f20130f = new jif();

    public static void m24296a(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
        }
    }

    public static void m24300b(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("sqlite_master", f20125a, "type='table' AND name NOT LIKE 'sqlite_%' AND name NOT LIKE 'android_%'", null, null, null, null);
        if (query != null) {
            LinkedList linkedList = new LinkedList();
            while (query.moveToNext()) {
                String string = query.getString(0);
                if (jib.m24299a(sQLiteDatabase, string)) {
                    linkedList.addFirst(string);
                } else {
                    try {
                        linkedList.addLast(string);
                    } finally {
                        query.close();
                    }
                }
            }
            jib.m24297a(sQLiteDatabase, linkedList);
        }
    }

    public static void m24298a(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        LinkedList linkedList = new LinkedList();
        for (String str : strArr) {
            if (jib.m24299a(sQLiteDatabase, str)) {
                linkedList.addFirst(str);
            } else {
                linkedList.addLast(str);
            }
        }
        jib.m24297a(sQLiteDatabase, linkedList);
    }

    private static void m24297a(SQLiteDatabase sQLiteDatabase, LinkedList<String> linkedList) {
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
    private static boolean m24299a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.rawQuery(new StringBuilder(String.valueOf(str).length() + 25).append("pragma foreign_key_list(").append(str).append(")").toString(), null);
            if (cursor != null) {
                if (cursor.getCount() > 0) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return true;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (Exception e) {
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            Cursor cursor2 = cursor;
            Throwable th3 = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th3;
        }
        return false;
    }

    public static void m24301b(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        for (Object obj : strArr) {
            String valueOf = String.valueOf("DROP VIEW IF EXISTS ");
            String valueOf2 = String.valueOf(obj);
            sQLiteDatabase.execSQL(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }
    }

    public static void m24302c(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("sqlite_master", f20125a, "type='view'", null, null, null, null);
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
