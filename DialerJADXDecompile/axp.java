import android.database.Cursor;

/* compiled from: PG */
public class axp {
    public int a(Cursor cursor) {
        int i = 0;
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            if (b(cursor)) {
                i++;
            }
        }
        return i;
    }

    static boolean b(Cursor cursor) {
        if (cursor.getString(0) == null || cursor.getInt(1) != 0) {
            return false;
        }
        return true;
    }
}
