package defpackage;

import android.content.Intent;
import android.os.AsyncTask;

final class gze extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ Intent a;
    final /* synthetic */ gzc b;

    gze(gzc gzc, Intent intent) {
        this.b = gzc;
        this.a = intent;
    }

    private Void a() {
        gzc.a(this.b, this.a);
        return null;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }
}
