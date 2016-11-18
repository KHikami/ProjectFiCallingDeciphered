package defpackage;

import android.database.sqlite.SQLiteDatabase;

final class bfb implements jia {
    private static final String[] a = new String[]{"client_callerid_settings"};

    bfb() {
    }

    public String a() {
        return "caller_id";
    }

    public String[] b() {
        return a;
    }

    public String[] c() {
        return new String[0];
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE client_callerid_settings (phone_number_e164 TEXT PRIMARY KEY,is_default INT,refreshed_at INT,client_callerid_setting BLOB);");
    }

    public boolean a(int i, int i2) {
        if (glk.a("Babel_CalleridDatabase", 3)) {
            glk.a("Babel_CalleridDatabase", "Upgrade database: " + i + " --> " + i2, new Object[0]);
        }
        switch (i) {
            case 1:
            case Integer.MAX_VALUE:
                glk.c("Babel_CalleridDatabase", "db upgrade from " + i + " to " + i2 + " succeeded", new Object[0]);
                return true;
            default:
                glk.d("Babel_CalleridDatabase", "db upgrade not supported", new Object[0]);
                return false;
        }
    }
}
