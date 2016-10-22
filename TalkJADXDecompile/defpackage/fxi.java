package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: fxi */
final class fxi implements fxl {
    final /* synthetic */ SQLiteDatabase a;

    fxi(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public void a(ContentValues contentValues) {
        this.a.insert("apn", null, contentValues);
    }
}
