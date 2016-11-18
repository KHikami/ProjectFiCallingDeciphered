package p000;

import android.os.AsyncTask;

final class bzu extends AsyncTask<Void, Integer, Void> {
    final /* synthetic */ jch f4849a;
    final /* synthetic */ int f4850b;
    final /* synthetic */ bzt f4851c;

    bzu(bzt bzt, jch jch, int i) {
        this.f4851c = bzt;
        this.f4849a = jch;
        this.f4850b = i;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m7042a();
    }

    private Void m7042a() {
        if (this.f4849a == null) {
            glk.m17982e("Babel_GroupLinkSharing", "No account found.", new Object[0]);
            bzt bzt = this.f4851c;
            Exception exception = new Exception("No account found to update link sharing settings for.");
            bzt.m7040a();
        } else {
            this.f4851c.f4847a.f4835b.m6939d(this.f4851c.f4847a.f4836c.mo613a(this.f4851c.c, this.f4850b).m6096p(this.f4851c.f4847a.f4835b.m6921a()));
            gwb.m1863a(new bzv(this));
        }
        return null;
    }
}
