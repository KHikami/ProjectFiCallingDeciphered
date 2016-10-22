package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* renamed from: bhn */
public final class bhn extends avw {
    private final String[] e;

    public bhn(Context context) {
        super(context, "dialer.db", 90009);
        this.e = new String[1];
    }

    public static bhn a(Context context) {
        return (bhn) buf.G(context).a(context);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        super.onCreate(sQLiteDatabase);
        a(sQLiteDatabase);
    }

    private final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cached_number_contacts");
        sQLiteDatabase.execSQL("CREATE TABLE cached_number_contacts (normalized_number TEXT PRIMARY KEY NOT NULL, number TEXT NOT NULL, phone_type INTEGER DEFAULT 0, phone_label TEXT,display_name TEXT, has_photo INTEGER DEFAULT 0, has_thumbnail INTEGER DEFAULT 0, photo_uri TEXT, time_last_updated LONG NOT NULL, source_name TEXT, source_type INTEGER DEFAULT 0, source_id TEXT, lookup_key TEXT, reported INTEGER DEFAULT 0, object_id TEXT, user_type INTEGER DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE INDEX cached_number_index ON cached_number_contacts (normalized_number);");
        avw.a(sQLiteDatabase, "proprietary_database_version", "9");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        super.onUpgrade(sQLiteDatabase, i, i2);
        int a = a(sQLiteDatabase, "proprietary_database_version", 0);
        if (a == 0) {
            buf.b("GoogleDialerDatabaseHelper, malformed database version..recreating database", new Object[0]);
        }
        if (a < 6) {
            a(sQLiteDatabase);
            return;
        }
        if (a < 7) {
            sQLiteDatabase.execSQL("ALTER TABLE cached_number_contacts ADD reported INTEGER;");
        }
        if (a < 8) {
            sQLiteDatabase.execSQL("ALTER TABLE cached_number_contacts ADD object_id TEXT;");
        }
        if (a < 9) {
            sQLiteDatabase.execSQL("ALTER TABLE cached_number_contacts ADD user_type INTEGER DEFAULT 0;");
        }
        avw.a(sQLiteDatabase, "proprietary_database_version", "9");
    }

    public final void a(int i) {
        this.e[0] = Integer.toString(i);
        getWritableDatabase().execSQL("DELETE FROM cached_number_contacts WHERE source_type=?", this.e);
    }

    public final void a() {
        this.e[0] = Long.toString(System.currentTimeMillis() - 2592000000L);
        getWritableDatabase().execSQL("DELETE FROM cached_number_contacts WHERE time_last_updated<?", this.e);
    }
}
