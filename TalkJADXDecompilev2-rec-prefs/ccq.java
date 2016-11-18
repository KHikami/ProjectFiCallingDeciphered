package p000;

import android.os.AsyncTask;

final class ccq extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ Runnable f5016a;

    ccq(Runnable runnable) {
        this.f5016a = runnable;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m7212a();
    }

    private Void m7212a() {
        this.f5016a.run();
        return null;
    }
}
