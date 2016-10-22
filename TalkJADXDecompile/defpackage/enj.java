package defpackage;

import android.content.Context;
import android.os.AsyncTask;

/* renamed from: enj */
public final class enj extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ Context a;

    public enj(Context context) {
        this.a = context;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Void a() {
        gwb.y(this.a);
        return null;
    }
}
