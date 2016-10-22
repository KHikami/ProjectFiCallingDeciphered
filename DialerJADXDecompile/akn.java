import android.os.AsyncTask;

/* compiled from: PG */
final class akn extends AsyncTask {
    private /* synthetic */ ala[] a;
    private /* synthetic */ akm b;

    akn(akm akm, ala[] alaArr) {
        this.b = akm;
        this.a = alaArr;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.b.b(this.a);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.b.a.q.A = this.b.a.B.a(this.b.a.h, this.b.a.q.e) != null;
        if (buf.J(this.b.a.i).a()) {
            this.b.a.q.z = buf.J(this.b.a.i).a(this.b.a.h, this.b.a.q.e);
        }
        return null;
    }
}
