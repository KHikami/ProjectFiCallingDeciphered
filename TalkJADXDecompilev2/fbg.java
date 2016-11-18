package defpackage;

import android.content.ContentValues;
import android.database.Cursor;

enum fbg extends fbe {
    fbg(String str, int i) {
        super(str, 1);
    }

    public Object a(Cursor cursor, int i) {
        return Integer.valueOf(cursor.getInt(i));
    }

    public void a(String str, Object obj, ContentValues contentValues) {
        contentValues.put(str, (Integer) obj);
    }
}
