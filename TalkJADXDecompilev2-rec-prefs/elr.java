package p000;

import android.os.AsyncTask;
import android.widget.Toast;

final class elr extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ elq f11824a;

    elr(elq elq) {
        this.f11824a = elq;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m14110b();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m14109a();
    }

    private void m14109a() {
        Toast.makeText(this.f11824a.f11823a.f11810a, "done cleaning", 0).show();
    }

    private Void m14110b() {
        bko bko = this.f11824a.f11823a.f11811b;
        fqo fqo = new fqo();
        fqo.f13761c = 0;
        fqo.f13762d = 3600000;
        fqo.f13763e = 518400000;
        fqo.f13764f = 172800000;
        fqo.f13765g = 2;
        fqo.f13767i = 5;
        fqo.f13768j = 345600000;
        fqo.f13769k = 2;
        fqo.f13770l = 5;
        fqo.f13771m = 345600000;
        fqo.f13766h = 2;
        fqo.f13760b = bko.m5638g();
        fqo.m15987a(true);
        fqo.m15990c(this.f11824a.f11823a.f11810a);
        return null;
    }
}
