package p000;

import android.os.AsyncTask;

final class dcn extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ String f9516a;
    final /* synthetic */ dcl f9517b;

    dcn(dcl dcl, String str) {
        this.f9517b = dcl;
        this.f9516a = str;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m11448a();
    }

    private Void m11448a() {
        try {
            ((jmq) this.f9517b.E.m25443a(jmq.class)).mo3573a(this.f9516a, new jmt().m24726a());
        } catch (Throwable e) {
            glk.m17978c("Babel", "Unable to refresh account", e);
        }
        return null;
    }
}
