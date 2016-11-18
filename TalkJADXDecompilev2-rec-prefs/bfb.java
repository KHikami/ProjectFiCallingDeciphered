package p000;

import android.database.sqlite.SQLiteDatabase;

final class bfb implements jia {
    private static final String[] f3179a = new String[]{"client_callerid_settings"};

    bfb() {
    }

    public String mo507a() {
        return "caller_id";
    }

    public String[] mo510b() {
        return f3179a;
    }

    public String[] mo511c() {
        return new String[0];
    }

    public void mo508a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE client_callerid_settings (phone_number_e164 TEXT PRIMARY KEY,is_default INT,refreshed_at INT,client_callerid_setting BLOB);");
    }

    public boolean mo509a(int i, int i2) {
        if (glk.m17973a("Babel_CalleridDatabase", 3)) {
            glk.m17970a("Babel_CalleridDatabase", "Upgrade database: " + i + " --> " + i2, new Object[0]);
        }
        switch (i) {
            case 1:
            case Integer.MAX_VALUE:
                glk.m17979c("Babel_CalleridDatabase", "db upgrade from " + i + " to " + i2 + " succeeded", new Object[0]);
                return true;
            default:
                glk.m17981d("Babel_CalleridDatabase", "db upgrade not supported", new Object[0]);
                return false;
        }
    }
}
