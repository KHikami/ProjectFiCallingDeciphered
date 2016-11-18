package defpackage;

import android.os.AsyncTask;

final class ccq extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ Runnable a;

    ccq(Runnable runnable) {
        this.a = runnable;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Void a() {
        this.a.run();
        return null;
    }
}
