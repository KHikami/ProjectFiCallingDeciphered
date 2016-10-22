import android.os.AsyncTask;

final class hap extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ gui a;
    final /* synthetic */ har b;

    hap(gui gui, har har) {
        this.a = gui;
        this.b = har;
    }

    private Void a() {
        if (this.a.c().b()) {
            this.b.a().a(new haq(this));
        } else {
            this.b.b();
            this.a.d();
        }
        return null;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }
}
