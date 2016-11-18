package p000;

import android.content.ContentValues;
import android.database.Cursor;

enum fbf extends fbe {
    fbf(String str, int i) {
        super(str, 0);
    }

    public Object mo1963a(Cursor cursor, int i) {
        return Boolean.valueOf(gld.m17948d(cursor.getInt(i)));
    }

    public void mo1964a(String str, Object obj, ContentValues contentValues) {
        contentValues.put(str, gld.m17926a((Boolean) obj));
    }
}
