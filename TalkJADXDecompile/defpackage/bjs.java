package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: bjs */
public class bjs extends SQLiteOpenHelper {
    public static final String[] a;
    public static final String[] b;
    public static final String[] c;
    private static final boolean d;
    private static final String[] f;
    private SQLiteDatabase e;

    static {
        kae kae = glk.d;
        d = false;
        a = new String[]{"type", "mmsc", "mmsproxy", "mmsport", "_id", "current", "numeric", "name", "mcc", "mnc", "apn"};
        b = new String[]{"name", "mcc", "mnc", "apn", "user", "server", "password", "proxy", "port", "mmsc", "mmsproxy", "mmsport", "authtype", "type", "protocol", "roaming_protocol", "carrier_enabled", "bearer", "mvno_type", "mvno_match_data", "current"};
        c = new String[]{"key", "value", "type"};
        f = new String[]{"_id"};
    }

    bjs(Context context) {
        super(context, "apn.db", null, 2);
        this.e = getWritableDatabase();
        glk.a("Babel_ApnDb", "ApnDatabase constructor", new Object[0]);
    }

    public static SQLiteDatabase a(Context context) {
        return ((bjs) jyn.a(context, bjs.class)).e;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        bjs.e(sQLiteDatabase);
        bko k = fde.k();
        if (k != null) {
            bmv b = bmr.a(gwb.H(), k.g()).b();
            bjs.a(sQLiteDatabase, bjs.a(b.e()));
            b.a("DROP TABLE IF EXISTS apn;");
        }
    }

    public static List<ContentValues> a(SQLiteDatabase sQLiteDatabase) {
        try {
            Cursor query = sQLiteDatabase.query("apn", b, "current NOT NULL", null, null, null, null);
            if (query != null) {
                List<ContentValues> arrayList = new ArrayList();
                while (query.moveToNext()) {
                    ContentValues a = bjs.a(query);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                return arrayList;
            }
        } catch (SQLiteException e) {
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.database.sqlite.SQLiteDatabase r11, java.util.List<android.content.ContentValues> r12) {
        /*
        r9 = 0;
        if (r12 == 0) goto L_0x0009;
    L_0x0003:
        r0 = r12.size();
        if (r0 > 0) goto L_0x000a;
    L_0x0009:
        return;
    L_0x000a:
        r10 = r12.iterator();
    L_0x000e:
        r0 = r10.hasNext();
        if (r0 == 0) goto L_0x0009;
    L_0x0014:
        r0 = r10.next();
        r8 = r0;
        r8 = (android.content.ContentValues) r8;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = new java.util.ArrayList;
        r4.<init>();
        r0 = r8.keySet();
        r1 = r0.iterator();
    L_0x002d:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x006d;
    L_0x0033:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r2 = "current";
        r2 = r2.equals(r0);
        if (r2 != 0) goto L_0x002d;
    L_0x0041:
        r2 = r3.length();
        if (r2 <= 0) goto L_0x004c;
    L_0x0047:
        r2 = " AND ";
        r3.append(r2);
    L_0x004c:
        r2 = r8.getAsString(r0);
        r5 = android.text.TextUtils.isEmpty(r2);
        if (r5 == 0) goto L_0x0060;
    L_0x0056:
        r0 = r3.append(r0);
        r2 = " IS NULL";
        r0.append(r2);
        goto L_0x002d;
    L_0x0060:
        r0 = r3.append(r0);
        r5 = "=?";
        r0.append(r5);
        r4.add(r2);
        goto L_0x002d;
    L_0x006d:
        r1 = "apn";
        r2 = f;	 Catch:{ SQLiteException -> 0x00fe, all -> 0x00f4 }
        r3 = r3.toString();	 Catch:{ SQLiteException -> 0x00fe, all -> 0x00f4 }
        r0 = r4.size();	 Catch:{ SQLiteException -> 0x00fe, all -> 0x00f4 }
        r0 = new java.lang.String[r0];	 Catch:{ SQLiteException -> 0x00fe, all -> 0x00f4 }
        r4 = r4.toArray(r0);	 Catch:{ SQLiteException -> 0x00fe, all -> 0x00f4 }
        r4 = (java.lang.String[]) r4;	 Catch:{ SQLiteException -> 0x00fe, all -> 0x00f4 }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r0 = r11;
        r1 = r0.query(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ SQLiteException -> 0x00fe, all -> 0x00f4 }
        if (r1 == 0) goto L_0x00aa;
    L_0x008b:
        r0 = r1.moveToFirst();	 Catch:{ SQLiteException -> 0x00c6 }
        if (r0 == 0) goto L_0x00aa;
    L_0x0091:
        r0 = "apn";
        r2 = "_id=?";
        r3 = 1;
        r3 = new java.lang.String[r3];	 Catch:{ SQLiteException -> 0x00c6 }
        r4 = 0;
        r5 = 0;
        r5 = r1.getString(r5);	 Catch:{ SQLiteException -> 0x00c6 }
        r3[r4] = r5;	 Catch:{ SQLiteException -> 0x00c6 }
        r11.update(r0, r8, r2, r3);	 Catch:{ SQLiteException -> 0x00c6 }
    L_0x00a3:
        if (r1 == 0) goto L_0x000e;
    L_0x00a5:
        r1.close();
        goto L_0x000e;
    L_0x00aa:
        r0 = "numeric";
        r2 = "mcc";
        r2 = r8.getAsString(r2);	 Catch:{ SQLiteException -> 0x00c6 }
        r3 = "mnc";
        r3 = r8.getAsString(r3);	 Catch:{ SQLiteException -> 0x00c6 }
        r2 = defpackage.fzo.a(r2, r3);	 Catch:{ SQLiteException -> 0x00c6 }
        r8.put(r0, r2);	 Catch:{ SQLiteException -> 0x00c6 }
        r0 = "apn";
        r2 = 0;
        r11.insert(r0, r2, r8);	 Catch:{ SQLiteException -> 0x00c6 }
        goto L_0x00a3;
    L_0x00c6:
        r0 = move-exception;
    L_0x00c7:
        r2 = "Babel_ApnDb";
        r3 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00fc }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00fc }
        r5 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x00fc }
        r5 = r5.length();	 Catch:{ all -> 0x00fc }
        r5 = r5 + 50;
        r4.<init>(r5);	 Catch:{ all -> 0x00fc }
        r5 = "ApnDatabase.saveUserDataFromOldTable: query error ";
        r4 = r4.append(r5);	 Catch:{ all -> 0x00fc }
        r3 = r4.append(r3);	 Catch:{ all -> 0x00fc }
        r3 = r3.toString();	 Catch:{ all -> 0x00fc }
        defpackage.glk.d(r2, r3, r0);	 Catch:{ all -> 0x00fc }
        if (r1 == 0) goto L_0x000e;
    L_0x00ef:
        r1.close();
        goto L_0x000e;
    L_0x00f4:
        r0 = move-exception;
        r1 = r9;
    L_0x00f6:
        if (r1 == 0) goto L_0x00fb;
    L_0x00f8:
        r1.close();
    L_0x00fb:
        throw r0;
    L_0x00fc:
        r0 = move-exception;
        goto L_0x00f6;
    L_0x00fe:
        r0 = move-exception;
        r1 = r9;
        goto L_0x00c7;
        */
        throw new UnsupportedOperationException("Method not decompiled: bjs.a(android.database.sqlite.SQLiteDatabase, java.util.List):void");
    }

    private static ContentValues a(Cursor cursor) {
        int columnCount = cursor.getColumnCount();
        if (columnCount <= 0) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        for (int i = 0; i < columnCount; i++) {
            contentValues.put(cursor.getColumnName(i), cursor.getString(i));
        }
        return contentValues;
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
    }

    public void close() {
        super.close();
    }

    private static void e(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS apn;");
        sQLiteDatabase.execSQL("CREATE TABLE apn(_id INTEGER PRIMARY KEY,name TEXT,numeric TEXT,mcc TEXT,mnc TEXT,apn TEXT,user TEXT,server TEXT,password TEXT,proxy TEXT,port TEXT,mmsproxy TEXT,mmsport TEXT,mmsc TEXT,authtype INTEGER,type TEXT,current INTEGER,protocol TEXT,roaming_protocol TEXT,carrier_enabled BOOLEAN,bearer INTEGER,mvno_type TEXT,mvno_match_data TEXT);");
        bjs.f(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        bjs.e(sQLiteDatabase);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        bjs.e(sQLiteDatabase);
    }

    private static void f(SQLiteDatabase sQLiteDatabase) {
        XmlPullParser xml = gwb.H().getResources().getXml(gwb.iI);
        try {
            fxk a = fxk.a(xml);
            a.a(new bjt(sQLiteDatabase));
            a.a();
        } catch (Throwable e) {
            Log.e("Babel_ApnDb", "Got exception while loading APN database.", e);
        } finally {
            xml.close();
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS apn");
        sQLiteDatabase.execSQL("CREATE TABLE apn(_id INTEGER PRIMARY KEY,name TEXT,numeric TEXT,mcc TEXT,mnc TEXT,apn TEXT,user TEXT,server TEXT,password TEXT,proxy TEXT,port TEXT,mmsproxy TEXT,mmsport TEXT,mmsc TEXT,authtype INTEGER,type TEXT,current INTEGER,protocol TEXT,roaming_protocol TEXT,carrier_enabled BOOLEAN,bearer INTEGER,mvno_type TEXT,mvno_match_data TEXT);");
        sQLiteDatabase.endTransaction();
        bjs.f(sQLiteDatabase);
    }

    public static void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS apn");
        sQLiteDatabase.execSQL("CREATE TABLE apn(_id INTEGER PRIMARY KEY,name TEXT,numeric TEXT,mcc TEXT,mnc TEXT,apn TEXT,user TEXT,server TEXT,password TEXT,proxy TEXT,port TEXT,mmsproxy TEXT,mmsport TEXT,mmsc TEXT,authtype INTEGER,type TEXT,current INTEGER,protocol TEXT,roaming_protocol TEXT,carrier_enabled BOOLEAN,bearer INTEGER,mvno_type TEXT,mvno_match_data TEXT);");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS mmsconfig");
        sQLiteDatabase.execSQL("CREATE TABLE mmsconfig(_id INTEGER PRIMARY KEY,numeric TEXT,key TEXT,value TEXT,type TEXT);");
        sQLiteDatabase.endTransaction();
    }

    public static void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS mmsconfig");
    }
}
