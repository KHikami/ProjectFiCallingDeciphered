package p000;

import android.database.sqlite.SQLiteDatabase;

final class biq {
    static final String[] f3443a = new String[]{"_id", "version_code", "persisted_task"};

    static void m5313a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE tasks (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, version_code INT NOT NULL,persisted_task BLOB NOT NULL);");
    }

    static void m5314b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tasks;");
    }
}