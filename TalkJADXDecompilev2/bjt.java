package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

final class bjt implements fxl {
    final /* synthetic */ SQLiteDatabase a;

    bjt(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public void a(ContentValues contentValues) {
        this.a.insert("apn", null, contentValues);
    }
}
