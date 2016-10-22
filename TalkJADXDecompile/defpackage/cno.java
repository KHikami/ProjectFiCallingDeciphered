package defpackage;

import android.os.AsyncTask;

/* renamed from: cno */
final class cno extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ cnn a;

    cno(cnn cnn) {
        this.a = cnn;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Void a() {
        ccy.a(this.a.a.context.getContentResolver(), this.a.a.b.getPath(), bxo.VIDEO);
        return null;
    }
}
