package p000;

import android.os.AsyncTask;
import android.text.TextUtils;

final class bzz extends AsyncTask<Void, Integer, Void> {
    final /* synthetic */ jch f4865a;
    final /* synthetic */ bow f4866b;
    final /* synthetic */ int f4867c;
    final /* synthetic */ bzy f4868d;

    bzz(bzy bzy, jch jch, bow bow, int i) {
        this.f4868d = bzy;
        this.f4865a = jch;
        this.f4866b = bow;
        this.f4867c = i;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m7057a();
    }

    private Void m7057a() {
        if (this.f4865a == null) {
            glk.m17982e("Babel_GroupLinkSharing", "No account found.", new Object[0]);
            this.f4868d.m7053a(new Exception());
        } else {
            this.f4868d.f4864b.f4856b.m6947g(this.f4868d.f4864b.f4857c.mo613a(this.f4868d.c, this.f4867c).m6098q(this.f4868d.f4864b.f4856b.m6921a()));
            if (this.f4868d.f4863a != null) {
                this.f4868d.f4863a.mo1484a();
            }
            if (TextUtils.isEmpty(this.f4868d.f4864b.f4856b.m6953m())) {
                glk.m17982e("Babel_GroupLinkSharing", "Error in retrieving the group conversation URL", new Object[0]);
                this.f4868d.m7053a(new Exception());
            } else {
                this.f4868d.f4864b.m7043a();
            }
        }
        return null;
    }
}
