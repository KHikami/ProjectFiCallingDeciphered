package defpackage;

import android.text.TextUtils;

/* renamed from: cud */
final class cud extends ijj {
    final /* synthetic */ cuc a;

    cud(cuc cuc) {
        this.a = cuc;
    }

    private void a(lyh lyh) {
        if (lyh.h != null) {
            this.a.a.d.j = this.a.a.d.j.e(lyh.h.a);
        }
    }

    private void a(lyh lyh, lyh lyh2) {
        CharSequence charSequence;
        Object obj = null;
        if (lyh.h == null) {
            charSequence = null;
        } else {
            charSequence = lyh.h.a;
        }
        if (lyh2.h != null) {
            obj = lyh2.h.a;
        }
        if (!TextUtils.equals(charSequence, obj)) {
            this.a.a.d.j = this.a.a.d.j.e(obj);
        }
    }
}
