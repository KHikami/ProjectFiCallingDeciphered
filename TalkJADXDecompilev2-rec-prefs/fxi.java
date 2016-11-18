package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

final class fxi implements fxl {
    final /* synthetic */ SQLiteDatabase f14246a;

    fxi(SQLiteDatabase sQLiteDatabase) {
        this.f14246a = sQLiteDatabase;
    }

    public void mo593a(ContentValues contentValues) {
        this.f14246a.insert("apn", null, contentValues);
    }
}
