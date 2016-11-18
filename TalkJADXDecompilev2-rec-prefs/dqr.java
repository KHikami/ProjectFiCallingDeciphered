package p000;

import android.os.AsyncTask;

final class dqr extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ int f10365a;
    final /* synthetic */ int f10366b;
    final /* synthetic */ dqq f10367c;

    dqr(dqq dqq, int i, int i2) {
        this.f10367c = dqq;
        this.f10365a = i;
        this.f10366b = i2;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m12522a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m12523b();
    }

    private Void m12522a() {
        new blo(this.f10367c.f10354k, this.f10365a).m6117z();
        return null;
    }

    private void m12523b() {
        if (dqq.f10351j == this.f10366b && this.f10367c.f10355l.getActivity() != null) {
            this.f10367c.f10360q = true;
            this.f10367c.f10355l.getLoaderManager().mo1998b(1, null, this.f10367c);
            this.f10367c.notifyDataSetChanged();
            this.f10367c.m12517m();
        }
    }
}
