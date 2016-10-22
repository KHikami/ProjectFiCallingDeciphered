package defpackage;

import android.os.AsyncTask;

/* renamed from: grb */
final class grb extends AsyncTask<Void, Integer, Void> {
    final /* synthetic */ gqz a;

    grb(gqz gqz) {
        this.a = gqz;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((Void) obj);
    }

    private Void a() {
        this.a.c = blf.b(this.a.d, this.a.a, this.a.b, "video/*");
        return null;
    }

    private void a(Void voidR) {
        super.onPostExecute(voidR);
        this.a.setEnabled(true);
    }
}
