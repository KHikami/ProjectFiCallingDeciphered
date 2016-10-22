package defpackage;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: fbf */
enum fbf extends fbe {
    fbf(String str, int i) {
        super(0, (byte) 0);
    }

    public Object a(Cursor cursor, int i) {
        return Boolean.valueOf(gld.d(cursor.getInt(i)));
    }

    public void a(String str, Object obj, ContentValues contentValues) {
        contentValues.put(str, gld.a((Boolean) obj));
    }
}
