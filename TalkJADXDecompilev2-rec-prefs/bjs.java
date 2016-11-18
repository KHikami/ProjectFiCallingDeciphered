package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class bjs extends SQLiteOpenHelper {
    public static final String[] f3544a = new String[]{"type", "mmsc", "mmsproxy", "mmsport", "_id", "current", "numeric", "name", "mcc", "mnc", "apn"};
    public static final String[] f3545b = new String[]{"name", "mcc", "mnc", "apn", "user", "server", "password", "proxy", "port", "mmsc", "mmsproxy", "mmsport", "authtype", "type", "protocol", "roaming_protocol", "carrier_enabled", "bearer", "mvno_type", "mvno_match_data", "current"};
    public static final String[] f3546c = new String[]{"key", "value", "type"};
    private static final boolean f3547d = false;
    private static final String[] f3548f = new String[]{"_id"};
    private SQLiteDatabase f3549e = getWritableDatabase();

    static {
        kae kae = glk.f15557d;
    }

    bjs(Context context) {
        super(context, "apn.db", null, 2);
        glk.m17970a("Babel_ApnDb", "ApnDatabase constructor", new Object[0]);
    }

    public static SQLiteDatabase m5482a(Context context) {
        return ((bjs) jyn.m25426a(context, bjs.class)).f3549e;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        bjs.m5488e(sQLiteDatabase);
        bko k = fde.m15031k();
        if (k != null) {
            bmv b = bmr.m6166a(gwb.m1400H(), k.m5638g()).m6187b();
            bjs.m5484a(sQLiteDatabase, bjs.m5483a(b.m6210e()));
            b.m6204a("DROP TABLE IF EXISTS apn;");
        }
    }

    public static List<ContentValues> m5483a(SQLiteDatabase sQLiteDatabase) {
        try {
            Cursor query = sQLiteDatabase.query("apn", f3545b, "current NOT NULL", null, null, null, null);
            if (query != null) {
                List<ContentValues> arrayList = new ArrayList();
                while (query.moveToNext()) {
                    ContentValues a = bjs.m5481a(query);
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

    public static void m5484a(SQLiteDatabase sQLiteDatabase, List<ContentValues> list) {
        Throwable e;
        String valueOf;
        Cursor query;
        if (list != null && list.size() > 0) {
            for (ContentValues contentValues : list) {
                StringBuilder stringBuilder = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                for (String str : contentValues.keySet()) {
                    if (!"current".equals(str)) {
                        if (stringBuilder.length() > 0) {
                            stringBuilder.append(" AND ");
                        }
                        CharSequence asString = contentValues.getAsString(str);
                        if (TextUtils.isEmpty(asString)) {
                            stringBuilder.append(str).append(" IS NULL");
                        } else {
                            stringBuilder.append(str).append("=?");
                            arrayList.add(asString);
                        }
                    }
                }
                try {
                    query = sQLiteDatabase.query("apn", f3548f, stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                sQLiteDatabase.update("apn", contentValues, "_id=?", new String[]{query.getString(0)});
                                if (query != null) {
                                    query.close();
                                }
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            try {
                                valueOf = String.valueOf(e);
                                glk.m17980d("Babel_ApnDb", new StringBuilder(String.valueOf(valueOf).length() + 50).append("ApnDatabase.saveUserDataFromOldTable: query error ").append(valueOf).toString(), e);
                                if (query != null) {
                                    query.close();
                                }
                            } catch (Throwable th) {
                                e = th;
                            }
                        }
                    }
                    contentValues.put("numeric", fzo.m16706a(contentValues.getAsString("mcc"), contentValues.getAsString("mnc")));
                    sQLiteDatabase.insert("apn", null, contentValues);
                    if (query != null) {
                        query.close();
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    query = null;
                    valueOf = String.valueOf(e);
                    glk.m17980d("Babel_ApnDb", new StringBuilder(String.valueOf(valueOf).length() + 50).append("ApnDatabase.saveUserDataFromOldTable: query error ").append(valueOf).toString(), e);
                    if (query != null) {
                        query.close();
                    }
                } catch (Throwable th2) {
                    e = th2;
                    query = null;
                }
            }
            return;
        }
        return;
        if (query != null) {
            query.close();
        }
        throw e;
    }

    private static ContentValues m5481a(Cursor cursor) {
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

    private static void m5488e(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS apn;");
        sQLiteDatabase.execSQL("CREATE TABLE apn(_id INTEGER PRIMARY KEY,name TEXT,numeric TEXT,mcc TEXT,mnc TEXT,apn TEXT,user TEXT,server TEXT,password TEXT,proxy TEXT,port TEXT,mmsproxy TEXT,mmsport TEXT,mmsc TEXT,authtype INTEGER,type TEXT,current INTEGER,protocol TEXT,roaming_protocol TEXT,carrier_enabled BOOLEAN,bearer INTEGER,mvno_type TEXT,mvno_match_data TEXT);");
        bjs.m5489f(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        bjs.m5488e(sQLiteDatabase);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        bjs.m5488e(sQLiteDatabase);
    }

    private static void m5489f(SQLiteDatabase sQLiteDatabase) {
        XmlPullParser xml = gwb.m1400H().getResources().getXml(gwb.iI);
        try {
            fxk a = fxk.m16470a(xml);
            a.m16476a(new bjt(sQLiteDatabase));
            a.m16478a();
        } catch (Throwable e) {
            Log.e("Babel_ApnDb", "Got exception while loading APN database.", e);
        } finally {
            xml.close();
        }
    }

    public static void m5485b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS apn");
        sQLiteDatabase.execSQL("CREATE TABLE apn(_id INTEGER PRIMARY KEY,name TEXT,numeric TEXT,mcc TEXT,mnc TEXT,apn TEXT,user TEXT,server TEXT,password TEXT,proxy TEXT,port TEXT,mmsproxy TEXT,mmsport TEXT,mmsc TEXT,authtype INTEGER,type TEXT,current INTEGER,protocol TEXT,roaming_protocol TEXT,carrier_enabled BOOLEAN,bearer INTEGER,mvno_type TEXT,mvno_match_data TEXT);");
        sQLiteDatabase.endTransaction();
        bjs.m5489f(sQLiteDatabase);
    }

    public static void m5486c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS apn");
        sQLiteDatabase.execSQL("CREATE TABLE apn(_id INTEGER PRIMARY KEY,name TEXT,numeric TEXT,mcc TEXT,mnc TEXT,apn TEXT,user TEXT,server TEXT,password TEXT,proxy TEXT,port TEXT,mmsproxy TEXT,mmsport TEXT,mmsc TEXT,authtype INTEGER,type TEXT,current INTEGER,protocol TEXT,roaming_protocol TEXT,carrier_enabled BOOLEAN,bearer INTEGER,mvno_type TEXT,mvno_match_data TEXT);");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS mmsconfig");
        sQLiteDatabase.execSQL("CREATE TABLE mmsconfig(_id INTEGER PRIMARY KEY,numeric TEXT,key TEXT,value TEXT,type TEXT);");
        sQLiteDatabase.endTransaction();
    }

    public static void m5487d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS mmsconfig");
    }
}
