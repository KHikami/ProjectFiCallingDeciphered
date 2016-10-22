import android.os.AsyncTask;

/* compiled from: PG */
final class bkm extends AsyncTask {
    private /* synthetic */ String a;
    private /* synthetic */ String b;
    private /* synthetic */ bks c;
    private /* synthetic */ bkk d;

    bkm(bkk bkk, String str, String str2, bks bks) {
        this.d = bkk;
        this.a = str;
        this.b = str2;
        this.c = bks;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.c.a((bla) obj);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.d.b.a(this.a, this.b);
    }
}
