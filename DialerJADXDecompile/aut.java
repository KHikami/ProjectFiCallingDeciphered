import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.net.Uri;

/* compiled from: PG */
final class aut extends auv {
    final /* synthetic */ auz a;
    private /* synthetic */ Uri b;
    private /* synthetic */ aup c;

    aut(aup aup, Uri uri, auz auz) {
        this.c = aup;
        this.b = uri;
        this.a = auz;
    }

    public final void a(Cursor cursor) {
        int count = cursor == null ? 0 : cursor.getCount();
        if (count != 1) {
            String valueOf = String.valueOf(this.b);
            throw new SQLiteDatabaseCorruptException(new StringBuilder(String.valueOf(valueOf).length() + 51).append("Returned ").append(count).append(" rows for uri ").append(valueOf).append("where 1 expected.").toString());
        }
        cursor.moveToFirst();
        ContentValues contentValues = new ContentValues();
        DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
        contentValues.remove(buf.q(this.c.b));
        this.c.startDelete(0, new auu(this, contentValues), this.b, null, null);
    }
}
