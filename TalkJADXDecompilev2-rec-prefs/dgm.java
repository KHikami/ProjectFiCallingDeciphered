package p000;

import android.text.TextUtils;

final class dgm extends ijj {
    final /* synthetic */ dgl f9705a;

    dgm(dgl dgl) {
        this.f9705a = dgl;
    }

    private void m11767a(lyh lyh) {
        boolean z = true;
        dgg dgg = this.f9705a.f9704a;
        dgg.f9694q.m11996r();
        if (dgg.f9694q.m11981e().m11897g() == null) {
            dgg.f9694q.m11965a(lyh.f26866a);
        }
        if (lyh.f26873h != null) {
            dgg.f9694q.m11975b(lyh.f26873h.f25931a);
        }
        int a = gwb.m1508a(lyh.f26867b, -1);
        if (a == 3) {
            dgg.f9694q.m11976b(true);
            dgg.f9694q.m11977c(lyh.f26877l);
        } else {
            did did = dgg.f9694q;
            if (!(a == 1 || a == 2)) {
                z = false;
            }
            did.m11978c(z);
        }
        ((iix) dgg.m11724p().m21926a(iix.class)).mo3363a(new dgk(dgg));
    }

    private void m11768a(lyh lyh, lyh lyh2) {
        CharSequence charSequence;
        String str = null;
        if (lyh.f26873h == null) {
            charSequence = null;
        } else {
            charSequence = lyh.f26873h.f25931a;
        }
        if (lyh2.f26873h != null) {
            str = lyh2.f26873h.f25931a;
        }
        if (!TextUtils.equals(charSequence, str)) {
            this.f9705a.f9704a.f9694q.m11975b(str);
            this.f9705a.f9704a.m11733y();
            for (itg a : this.f9705a.f9704a.f9678a) {
                a.mo1564a(str);
            }
        }
    }
}
