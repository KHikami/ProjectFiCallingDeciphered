package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: avw */
public class avw extends SQLiteOpenHelper {
    public static final Uri a;
    public final Context b;
    final Object c;
    final AtomicBoolean d;
    private boolean e;

    static {
        a = Uri.parse("content://com.android.dialer/smart_dial_updated");
    }

    public avw(Context context, String str, int i) {
        super(context, str, null, i);
        this.c = new Object();
        this.d = new AtomicBoolean(false);
        this.e = false;
        this.b = (Context) Objects.requireNonNull(context, "Context must not be null");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = 8;
        int i4 = 7;
        int a = a(sQLiteDatabase, "database_version", 0);
        if (a == 0) {
            Log.e("DialerDatabaseHelper", "Malformed database version..recreating database");
        }
        if (a < 4) {
            a(sQLiteDatabase);
            return;
        }
        if (a < 7) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS filtered_numbers_table");
            sQLiteDatabase.execSQL("CREATE TABLE filtered_numbers_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,normalized_number TEXT UNIQUE,number TEXT,country_iso TEXT,times_filtered INTEGER,last_time_filtered LONG,creation_time LONG,type INTEGER,source INTEGER);");
        } else {
            i4 = a;
        }
        if (i4 < 8) {
            sQLiteDatabase.execSQL("ALTER TABLE smartdial_table ADD carrier_presence INTEGER NOT NULL DEFAULT 0");
        } else {
            i3 = i4;
        }
        if (i3 < 9) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS voicemail_archive_table");
            sQLiteDatabase.execSQL("CREATE TABLE voicemail_archive_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,number TEXT,date LONG,duration LONG,mime_type TEXT,countryiso TEXT,_data TEXT,geocoded_location TEXT,name TEXT,numbertype INTEGER,numberlabel TEXT,lookup_uri TEXT,matched_number TEXT,normalized_number TEXT,photo_id LONG,formatted_number TEXT,archived_by_user INTEGER,presentation INTEGER,subscription_component_name TEXT,subscription_id TEXT,features INTEGER,server_id INTEGER,transcription TEXT,photo_uri TEXT);");
            i3 = 9;
        }
        if (i3 != 9) {
            throw new IllegalStateException("error upgrading the database to version 9");
        }
        avw.a(sQLiteDatabase, "database_version", "9");
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("property_key", str);
        contentValues.put("property_value", str2);
        sQLiteDatabase.replace("properties", null, contentValues);
    }

    private static String b(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor query;
        try {
            String string;
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            query = sQLiteDatabase2.query("properties", new String[]{"property_value"}, "property_key=?", new String[]{str}, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    string = query.getString(0);
                } else {
                    string = null;
                }
                query.close();
            } else {
                string = null;
            }
            if (string != null) {
                return string;
            }
            return str2;
        } catch (SQLiteException e) {
            return str2;
        } catch (Throwable th) {
            query.close();
        }
    }

    public final int a(SQLiteDatabase sQLiteDatabase, String str, int i) {
        try {
            return Integer.parseInt(avw.b(sQLiteDatabase, str, ""));
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    static void a(SQLiteDatabase sQLiteDatabase, Cursor cursor) {
        sQLiteDatabase.beginTransaction();
        try {
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                Long valueOf = Long.valueOf(cursor.getLong(0));
                String valueOf2 = String.valueOf("contact_id=");
                String valueOf3 = String.valueOf(valueOf);
                sQLiteDatabase.delete("smartdial_table", new StringBuilder((String.valueOf(valueOf2).length() + 0) + String.valueOf(valueOf3).length()).append(valueOf2).append(valueOf3).toString(), null);
                valueOf2 = String.valueOf("contact_id=");
                String valueOf4 = String.valueOf(valueOf);
                sQLiteDatabase.delete("prefix_table", new StringBuilder((String.valueOf(valueOf2).length() + 0) + String.valueOf(valueOf4).length()).append(valueOf2).append(valueOf4).toString(), null);
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    protected final void a(SQLiteDatabase sQLiteDatabase, Cursor cursor, Long l) {
        sQLiteDatabase.beginTransaction();
        try {
            SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("INSERT INTO smartdial_table (data_id, phone_number, contact_id, lookup_key, display_name, photo_id, last_time_used, times_used, starred, is_super_primary, in_visible_group, is_primary, carrier_presence, last_smartdial_update_time)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            SQLiteStatement compileStatement2 = sQLiteDatabase.compileStatement("INSERT INTO prefix_table (contact_id, prefix)  VALUES (?, ?)");
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                compileStatement.clearBindings();
                Object string = cursor.getString(3);
                if (!TextUtils.isEmpty(string)) {
                    compileStatement.bindString(2, string);
                    string = cursor.getString(5);
                    if (TextUtils.isEmpty(string)) {
                        continue;
                    } else {
                        compileStatement.bindString(4, string);
                        String string2 = cursor.getString(6);
                        if (string2 == null) {
                            compileStatement.bindString(5, this.b.getResources().getString(buf.fI));
                        } else {
                            compileStatement.bindString(5, string2);
                        }
                        compileStatement.bindLong(1, cursor.getLong(0));
                        compileStatement.bindLong(3, cursor.getLong(4));
                        compileStatement.bindLong(6, cursor.getLong(7));
                        compileStatement.bindLong(7, cursor.getLong(8));
                        compileStatement.bindLong(8, (long) cursor.getInt(9));
                        compileStatement.bindLong(9, (long) cursor.getInt(10));
                        compileStatement.bindLong(10, (long) cursor.getInt(11));
                        compileStatement.bindLong(11, (long) cursor.getInt(12));
                        compileStatement.bindLong(12, (long) cursor.getInt(13));
                        compileStatement.bindLong(13, (long) cursor.getInt(14));
                        compileStatement.bindLong(14, l.longValue());
                        compileStatement.executeInsert();
                        Iterator it = axd.b(cursor.getString(3)).iterator();
                        while (it.hasNext()) {
                            string2 = (String) it.next();
                            compileStatement2.bindLong(1, cursor.getLong(4));
                            compileStatement2.bindString(2, string2);
                            compileStatement2.executeInsert();
                            compileStatement2.clearBindings();
                        }
                    }
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    static void b(SQLiteDatabase sQLiteDatabase, Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("display_name");
        int columnIndex2 = cursor.getColumnIndex("contact_id");
        sQLiteDatabase.beginTransaction();
        try {
            SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("INSERT INTO prefix_table (contact_id, prefix)  VALUES (?, ?)");
            while (cursor.moveToNext()) {
                Iterator it = axd.a(cursor.getString(columnIndex)).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    compileStatement.bindLong(1, cursor.getLong(columnIndex2));
                    compileStatement.bindString(2, str);
                    compileStatement.executeInsert();
                    compileStatement.clearBindings();
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final ArrayList a(String str, axc axc) {
        if (this.d.get()) {
            return new ArrayList();
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        String concat = String.valueOf(str).concat("%");
        ArrayList arrayList = new ArrayList();
        String l = Long.toString(System.currentTimeMillis());
        String valueOf = String.valueOf("SELECT data_id, display_name, photo_id, phone_number, contact_id, lookup_key, carrier_presence FROM smartdial_table WHERE contact_id IN  (SELECT contact_id FROM prefix_table WHERE prefix_table.prefix LIKE '");
        String valueOf2 = String.valueOf("smartdial_table.starred DESC, smartdial_table.is_super_primary DESC, (CASE WHEN ( ?1 - smartdial_table.last_time_used) < 259200000 THEN 0  WHEN ( ?1 - smartdial_table.last_time_used) < 2592000000 THEN 1  ELSE 2 END), smartdial_table.times_used DESC, smartdial_table.in_visible_group DESC, smartdial_table.display_name, smartdial_table.contact_id, smartdial_table.is_primary DESC");
        Cursor rawQuery = readableDatabase.rawQuery(new StringBuilder(((String.valueOf(valueOf).length() + 12) + String.valueOf(concat).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(concat).append("') ORDER BY ").append(valueOf2).toString(), new String[]{l});
        if (rawQuery == null) {
            return arrayList;
        }
        try {
            Set hashSet = new HashSet();
            int i = 0;
            while (rawQuery.moveToNext() && i < 20) {
                long j = rawQuery.getLong(0);
                String string = rawQuery.getString(1);
                String string2 = rawQuery.getString(3);
                long j2 = rawQuery.getLong(4);
                long j3 = rawQuery.getLong(2);
                String string3 = rawQuery.getString(5);
                int i2 = rawQuery.getInt(6);
                avx avx = new avx(this, string3, j2);
                if (!hashSet.contains(avx)) {
                    boolean a = axc.a(string);
                    Object obj = axc.a(string2, str, true) != null ? 1 : null;
                    if (a || obj != null) {
                        hashSet.add(avx);
                        arrayList.add(new avy(j2, j, string, string2, string3, j3, i2));
                        i++;
                    }
                }
            }
            rawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            rawQuery.close();
        }
    }

    private final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS prefix_table");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS smartdial_table");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS properties");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS filtered_numbers_table");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS voicemail_archive_table");
        sQLiteDatabase.execSQL("CREATE TABLE smartdial_table (id INTEGER PRIMARY KEY AUTOINCREMENT,data_id INTEGER, phone_number TEXT,contact_id INTEGER,lookup_key TEXT,display_name TEXT, photo_id INTEGER, last_smartdial_update_time LONG, last_time_used LONG, times_used INTEGER, starred INTEGER, is_super_primary INTEGER, in_visible_group INTEGER, is_primary INTEGER, carrier_presence INTEGER NOT NULL DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE TABLE prefix_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,prefix TEXT COLLATE NOCASE, contact_id INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE properties (property_key TEXT PRIMARY KEY, property_value TEXT );");
        sQLiteDatabase.execSQL("CREATE TABLE filtered_numbers_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,normalized_number TEXT UNIQUE,number TEXT,country_iso TEXT,times_filtered INTEGER,last_time_filtered LONG,creation_time LONG,type INTEGER,source INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE voicemail_archive_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,number TEXT,date LONG,duration LONG,mime_type TEXT,countryiso TEXT,_data TEXT,geocoded_location TEXT,name TEXT,numbertype INTEGER,numberlabel TEXT,lookup_uri TEXT,matched_number TEXT,normalized_number TEXT,photo_id LONG,formatted_number TEXT,archived_by_user INTEGER,presentation INTEGER,subscription_component_name TEXT,subscription_id TEXT,features INTEGER,server_id INTEGER,transcription TEXT,photo_uri TEXT);");
        avw.a(sQLiteDatabase, "database_version", "9");
        Editor edit = this.b.getSharedPreferences("com.android.dialer", 0).edit();
        edit.putLong("last_updated_millis", 0);
        edit.apply();
    }
}
