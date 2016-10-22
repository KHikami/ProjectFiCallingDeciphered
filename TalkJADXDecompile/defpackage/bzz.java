package defpackage;

import android.os.AsyncTask;
import android.text.TextUtils;

/* renamed from: bzz */
final class bzz extends AsyncTask<Void, Integer, Void> {
    final /* synthetic */ jch a;
    final /* synthetic */ bow b;
    final /* synthetic */ int c;
    final /* synthetic */ bzy d;

    bzz(bzy bzy, jch jch, bow bow, int i) {
        this.d = bzy;
        this.a = jch;
        this.b = bow;
        this.c = i;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Void a() {
        if (this.a == null) {
            glk.e("Babel_GroupLinkSharing", "No account found.", new Object[0]);
            this.d.a(new Exception());
        } else {
            this.d.b.b.g(this.d.b.c.a(this.d.c, this.c).q(this.d.b.b.a()));
            if (this.d.a != null) {
                this.d.a.a();
            }
            if (TextUtils.isEmpty(this.d.b.b.m())) {
                glk.e("Babel_GroupLinkSharing", "Error in retrieving the group conversation URL", new Object[0]);
                this.d.a(new Exception());
            } else {
                this.d.b.a();
            }
        }
        return null;
    }
}
