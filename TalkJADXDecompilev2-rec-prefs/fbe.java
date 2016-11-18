package p000;

import android.content.ContentValues;
import android.database.Cursor;

public enum fbe {
    BOOLEAN,
    INTEGER,
    LONG,
    STRING,
    OBJECT;

    public abstract Object mo1963a(Cursor cursor, int i);

    public abstract void mo1964a(String str, Object obj, ContentValues contentValues);
}
