import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.provider.ContactsContract.Data;
import android.util.Log;

/* compiled from: PG */
public class aca {
    private static final String a;

    static {
        a = aca.class.getSimpleName();
    }

    public static void a(Context context, long j) {
        if (j == -1) {
            Log.e(a, "Invalid arguments for setSuperPrimary request");
            return;
        }
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("is_super_primary", Integer.valueOf(1));
        contentValues.put("is_primary", Integer.valueOf(1));
        context.getContentResolver().update(ContentUris.withAppendedId(Data.CONTENT_URI, j), contentValues, null, null);
    }
}
