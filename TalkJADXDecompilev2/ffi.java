package defpackage;

import android.content.Context;
import android.os.AsyncTask;

final class ffi extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ Context a;

    ffi(Context context) {
        this.a = context;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Void a() {
        try {
            ffh.a().a(((igb) jyn.a(this.a, igb.class)).a("366187734148"));
        } catch (Throwable e) {
            glk.c("BabelGcmRegistration", "Error registering for GCM", e);
            ffh.a().j();
        }
        return null;
    }
}
