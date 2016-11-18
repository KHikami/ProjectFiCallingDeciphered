package p000;

import android.content.ContentValues;
import android.database.Cursor;

enum fbi extends fbe {
    fbi(String str, int i) {
        super(str, 3);
    }

    public Object mo1963a(Cursor cursor, int i) {
        return cursor.getString(i);
    }

    public void mo1964a(String str, Object obj, ContentValues contentValues) {
        contentValues.put(str, (String) obj);
    }
}
