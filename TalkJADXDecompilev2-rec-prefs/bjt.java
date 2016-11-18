package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

final class bjt implements fxl {
    final /* synthetic */ SQLiteDatabase f3550a;

    bjt(SQLiteDatabase sQLiteDatabase) {
        this.f3550a = sQLiteDatabase;
    }

    public void mo593a(ContentValues contentValues) {
        this.f3550a.insert("apn", null, contentValues);
    }
}
