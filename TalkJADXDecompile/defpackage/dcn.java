package defpackage;

import android.os.AsyncTask;

/* renamed from: dcn */
final class dcn extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ String a;
    final /* synthetic */ dcl b;

    dcn(dcl dcl, String str) {
        this.b = dcl;
        this.a = str;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Void a() {
        try {
            ((jmq) this.b.E.a(jmq.class)).a(this.a, new jmt().a());
        } catch (Throwable e) {
            glk.c("Babel", "Unable to refresh account", e);
        }
        return null;
    }
}
