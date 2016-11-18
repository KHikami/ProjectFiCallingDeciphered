package p000;

import android.os.AsyncTask;

final class cno extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ cnn f5713a;

    cno(cnn cnn) {
        this.f5713a = cnn;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m7976a();
    }

    private Void m7976a() {
        ccy.m7220a(this.f5713a.f5712a.context.getContentResolver(), this.f5713a.f5712a.f5709b.getPath(), bxo.VIDEO);
        return null;
    }
}
