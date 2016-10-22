import android.content.ContentValues;
import android.net.Uri;
import android.os.AsyncTask;

/* compiled from: PG */
final class arv extends AsyncTask {
    private /* synthetic */ boolean a;
    private /* synthetic */ Uri b;
    private /* synthetic */ arz c;
    private /* synthetic */ art d;

    arv(art art, boolean z, Uri uri, arz arz) {
        this.d = art;
        this.a = z;
        this.b = uri;
        this.c = arz;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean z = true;
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("archived_by_user", Boolean.valueOf(this.a));
        if (this.d.a.update(this.b, contentValues, null, null) <= 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.c.a(((Boolean) obj).booleanValue());
    }
}
