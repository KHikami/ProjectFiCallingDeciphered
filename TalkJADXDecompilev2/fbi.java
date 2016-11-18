package defpackage;

import android.content.ContentValues;
import android.database.Cursor;

enum fbi extends fbe {
    fbi(String str, int i) {
        super(str, 3);
    }

    public Object a(Cursor cursor, int i) {
        return cursor.getString(i);
    }

    public void a(String str, Object obj, ContentValues contentValues) {
        contentValues.put(str, (String) obj);
    }
}
