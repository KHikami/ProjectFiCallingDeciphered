package p000;

import android.os.AsyncTask;

final class hap extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ gui f16474a;
    final /* synthetic */ har f16475b;

    hap(gui gui, har har) {
        this.f16474a = gui;
        this.f16475b = har;
    }

    private Void m19107a() {
        if (this.f16474a.mo2522c().m9653b()) {
            this.f16475b.m19110a().mo2419a(new haq(this));
        } else {
            this.f16475b.m19111b();
            this.f16474a.mo2523d();
        }
        return null;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m19107a();
    }
}
