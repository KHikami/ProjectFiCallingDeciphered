package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

final class fxj implements fxm {
    final /* synthetic */ ContentValues f14247a;
    final /* synthetic */ SQLiteDatabase f14248b;

    fxj(ContentValues contentValues, SQLiteDatabase sQLiteDatabase) {
        this.f14247a = contentValues;
        this.f14248b = sQLiteDatabase;
    }

    public void mo2111a(String str, String str2, String str3, String str4) {
        this.f14247a.clear();
        this.f14247a.put("numeric", str);
        this.f14247a.put("key", str2);
        this.f14247a.put("value", str3);
        this.f14247a.put("type", str4);
        this.f14248b.insert("mmsconfig", null, this.f14247a);
    }
}
