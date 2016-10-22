package defpackage;

import android.os.AsyncTask;

/* renamed from: jsk */
final class jsk extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ jsi a;

    jsk(jsi jsi) {
        this.a = jsi;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Void a() {
        this.a.e.run();
        return null;
    }
}
