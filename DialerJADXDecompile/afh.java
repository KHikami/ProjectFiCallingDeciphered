import android.os.AsyncTask;
import java.util.Map;

/* compiled from: PG */
final class afh extends AsyncTask {
    private /* synthetic */ afc a;

    afh(afc afc) {
        this.a = afc;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.a.a.a((Map) obj);
        this.a.b.set(false);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.a.b(this.a.c);
    }
}
