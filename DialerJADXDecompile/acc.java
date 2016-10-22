import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: PG */
public abstract class acc extends AsyncQueryHandler {
    public abstract void a(int i, Object obj, Cursor cursor);

    public acc(ContentResolver contentResolver) {
        super(contentResolver);
    }

    public void startQuery(int i, Object obj, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super.startQuery(i, new acd(obj, strArr), uri, strArr, str, strArr2, str2);
    }

    protected final void onQueryComplete(int i, Object obj, Cursor cursor) {
        acd acd = (acd) obj;
        super.onQueryComplete(i, acd.a, cursor);
        if (cursor == null) {
            cursor = new acb(acd.b);
        }
        a(i, acd.a, cursor);
    }
}
