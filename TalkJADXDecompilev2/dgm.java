package defpackage;

import android.text.TextUtils;

final class dgm extends ijj {
    final /* synthetic */ dgl a;

    dgm(dgl dgl) {
        this.a = dgl;
    }

    private void a(lyh lyh) {
        boolean z = true;
        dgg dgg = this.a.a;
        dgg.q.r();
        if (dgg.q.e().g() == null) {
            dgg.q.a(lyh.a);
        }
        if (lyh.h != null) {
            dgg.q.b(lyh.h.a);
        }
        int a = gwb.a(lyh.b, -1);
        if (a == 3) {
            dgg.q.b(true);
            dgg.q.c(lyh.l);
        } else {
            did did = dgg.q;
            if (!(a == 1 || a == 2)) {
                z = false;
            }
            did.c(z);
        }
        ((iix) dgg.p().a(iix.class)).a(new dgk(dgg));
    }

    private void a(lyh lyh, lyh lyh2) {
        CharSequence charSequence;
        String str = null;
        if (lyh.h == null) {
            charSequence = null;
        } else {
            charSequence = lyh.h.a;
        }
        if (lyh2.h != null) {
            str = lyh2.h.a;
        }
        if (!TextUtils.equals(charSequence, str)) {
            this.a.a.q.b(str);
            this.a.a.y();
            for (itg a : this.a.a.a) {
                a.a(str);
            }
        }
    }
}
