import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;

/* compiled from: PG */
final class ami extends AsyncTask {
    private /* synthetic */ Context a;
    private /* synthetic */ Uri b;
    private /* synthetic */ amm c;

    ami(Context context, Uri uri, amm amm) {
        this.a = context;
        this.b = uri;
        this.c = amm;
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.a.getContentResolver().delete(this.b, null, null);
        return null;
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        if (this.c != null) {
            this.c.b();
        }
    }
}
