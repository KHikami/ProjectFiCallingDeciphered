import android.os.AsyncTask;

/* compiled from: PG */
final class bid extends AsyncTask {
    private /* synthetic */ bia a;

    bid(bia bia) {
        this.a = bia;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        if (this.a.e != null) {
            this.a.c.setText(this.a.e.a.d);
            this.a.d.setText(this.a.e.a.h);
        } else {
            this.a.d.setText(this.a.f);
        }
        this.a.c.setVisibility(this.a.e != null ? 0 : 8);
        this.a.d.setVisibility(0);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.a.e = bia.b.b(this.a.g, this.a.f);
        return this.a.e;
    }
}
