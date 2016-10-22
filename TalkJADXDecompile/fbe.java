import android.content.ContentValues;
import android.database.Cursor;

public enum fbe {
    BOOLEAN,
    INTEGER,
    LONG,
    STRING,
    OBJECT;

    public abstract Object a(Cursor cursor, int i);

    public abstract void a(String str, Object obj, ContentValues contentValues);
}
