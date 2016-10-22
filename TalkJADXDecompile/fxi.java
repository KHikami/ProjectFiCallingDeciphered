import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

final class fxi implements fxl {
    final /* synthetic */ SQLiteDatabase a;

    fxi(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public void a(ContentValues contentValues) {
        this.a.insert("apn", null, contentValues);
    }
}
