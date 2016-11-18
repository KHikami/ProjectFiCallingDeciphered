package p000;

import android.content.ContentValues;
import android.database.Cursor;

enum fbg extends fbe {
    fbg(String str, int i) {
        super(str, 1);
    }

    public Object mo1963a(Cursor cursor, int i) {
        return Integer.valueOf(cursor.getInt(i));
    }

    public void mo1964a(String str, Object obj, ContentValues contentValues) {
        contentValues.put(str, (Integer) obj);
    }
}
