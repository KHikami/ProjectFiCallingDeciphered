import android.content.Context;
import android.content.CursorLoader;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/* compiled from: PG */
final class adk extends CursorLoader {
    adk(adi adi, Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context, null, null, null, null, null);
    }

    protected final /* synthetic */ Object onLoadInBackground() {
        return a();
    }

    private Cursor a() {
        try {
            return (Cursor) super.onLoadInBackground();
        } catch (RuntimeException e) {
            Log.w("ContactEntryListFragment", "RuntimeException while trying to query ContactsProvider.");
            return null;
        }
    }
}
