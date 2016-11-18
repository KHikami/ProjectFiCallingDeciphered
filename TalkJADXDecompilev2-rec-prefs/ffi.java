package p000;

import android.content.Context;
import android.os.AsyncTask;

final class ffi extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ Context f12976a;

    ffi(Context context) {
        this.f12976a = context;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m15210a();
    }

    private Void m15210a() {
        try {
            ffh.m15192a().m15199a(((igb) jyn.m25426a(this.f12976a, igb.class)).mo3193a("366187734148"));
        } catch (Throwable e) {
            glk.m17978c("BabelGcmRegistration", "Error registering for GCM", e);
            ffh.m15192a().m15208j();
        }
        return null;
    }
}
