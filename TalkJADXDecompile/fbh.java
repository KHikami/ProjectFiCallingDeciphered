import android.content.ContentValues;
import android.database.Cursor;

enum fbh extends fbe {
    fbh(String str, int i) {
        super(2, (byte) 0);
    }

    public Object a(Cursor cursor, int i) {
        return Long.valueOf(cursor.getLong(i));
    }

    public void a(String str, Object obj, ContentValues contentValues) {
        contentValues.put(str, (Long) obj);
    }
}
