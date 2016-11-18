package p000;

import android.content.Intent;
import android.os.AsyncTask;

final class gze extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ Intent f16419a;
    final /* synthetic */ gzc f16420b;

    gze(gzc gzc, Intent intent) {
        this.f16420b = gzc;
        this.f16419a = intent;
    }

    private Void m19018a() {
        gzc.m8975a(this.f16420b, this.f16419a);
        return null;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m19018a();
    }
}
