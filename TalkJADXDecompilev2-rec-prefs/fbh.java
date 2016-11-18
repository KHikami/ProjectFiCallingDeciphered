package p000;

import android.content.ContentValues;
import android.database.Cursor;

enum fbh extends fbe {
    fbh(String str, int i) {
        super(str, 2);
    }

    public Object mo1963a(Cursor cursor, int i) {
        return Long.valueOf(cursor.getLong(i));
    }

    public void mo1964a(String str, Object obj, ContentValues contentValues) {
        contentValues.put(str, (Long) obj);
    }
}
