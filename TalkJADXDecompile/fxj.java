import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

final class fxj implements fxm {
    final /* synthetic */ ContentValues a;
    final /* synthetic */ SQLiteDatabase b;

    fxj(ContentValues contentValues, SQLiteDatabase sQLiteDatabase) {
        this.a = contentValues;
        this.b = sQLiteDatabase;
    }

    public void a(String str, String str2, String str3, String str4) {
        this.a.clear();
        this.a.put("numeric", str);
        this.a.put("key", str2);
        this.a.put("value", str3);
        this.a.put("type", str4);
        this.b.insert("mmsconfig", null, this.a);
    }
}
