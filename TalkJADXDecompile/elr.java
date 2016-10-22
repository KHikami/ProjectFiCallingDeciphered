import android.os.AsyncTask;
import android.widget.Toast;

final class elr extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ elq a;

    elr(elq elq) {
        this.a = elq;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return b();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a();
    }

    private void a() {
        Toast.makeText(this.a.a.a, "done cleaning", 0).show();
    }

    private Void b() {
        bko bko = this.a.a.b;
        fqo fqo = new fqo();
        fqo.c = 0;
        fqo.d = 3600000;
        fqo.e = 518400000;
        fqo.f = 172800000;
        fqo.g = 2;
        fqo.i = 5;
        fqo.j = 345600000;
        fqo.k = 2;
        fqo.l = 5;
        fqo.m = 345600000;
        fqo.h = 2;
        fqo.b = bko.g();
        fqo.a(true);
        fqo.c(this.a.a.a);
        return null;
    }
}
