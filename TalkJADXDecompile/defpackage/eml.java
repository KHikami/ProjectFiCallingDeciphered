package defpackage;

import android.os.AsyncTask;

/* renamed from: eml */
final class eml extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ emk a;

    eml(emk emk) {
        this.a = emk;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Void a() {
        new blo(this.a.a.a, this.a.a.c).e((glj.a() * 1000) - 864000000000L);
        return null;
    }
}
