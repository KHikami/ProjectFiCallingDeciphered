package defpackage;

import android.os.AsyncTask;

/* renamed from: bzu */
final class bzu extends AsyncTask<Void, Integer, Void> {
    final /* synthetic */ jch a;
    final /* synthetic */ int b;
    final /* synthetic */ bzt c;

    bzu(bzt bzt, jch jch, int i) {
        this.c = bzt;
        this.a = jch;
        this.b = i;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Void a() {
        if (this.a == null) {
            glk.e("Babel_GroupLinkSharing", "No account found.", new Object[0]);
            bzt bzt = this.c;
            Exception exception = new Exception("No account found to update link sharing settings for.");
            bzt.a();
        } else {
            this.c.a.b.d(this.c.a.c.a(this.c.c, this.b).p(this.c.a.b.a()));
            gwb.a(new bzv(this));
        }
        return null;
    }
}
