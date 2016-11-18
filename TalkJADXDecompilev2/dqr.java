package defpackage;

import android.os.AsyncTask;

final class dqr extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ dqq c;

    dqr(dqq dqq, int i, int i2) {
        this.c = dqq;
        this.a = i;
        this.b = i2;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        b();
    }

    private Void a() {
        new blo(this.c.k, this.a).z();
        return null;
    }

    private void b() {
        if (dqq.j == this.b && this.c.l.getActivity() != null) {
            this.c.q = true;
            this.c.l.getLoaderManager().b(1, null, this.c);
            this.c.notifyDataSetChanged();
            this.c.m();
        }
    }
}
