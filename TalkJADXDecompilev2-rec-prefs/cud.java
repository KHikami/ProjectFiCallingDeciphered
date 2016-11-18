package p000;

import android.text.TextUtils;

final class cud extends ijj {
    final /* synthetic */ cuc f9097a;

    cud(cuc cuc) {
        this.f9097a = cuc;
    }

    private void m11022a(lyh lyh) {
        if (lyh.f26873h != null) {
            this.f9097a.f9096a.f9086d.f9052j = this.f9097a.f9096a.f9086d.f9052j.m11894e(lyh.f26873h.f25931a);
        }
    }

    private void m11023a(lyh lyh, lyh lyh2) {
        CharSequence charSequence;
        Object obj = null;
        if (lyh.f26873h == null) {
            charSequence = null;
        } else {
            charSequence = lyh.f26873h.f25931a;
        }
        if (lyh2.f26873h != null) {
            obj = lyh2.f26873h.f25931a;
        }
        if (!TextUtils.equals(charSequence, obj)) {
            this.f9097a.f9096a.f9086d.f9052j = this.f9097a.f9096a.f9086d.f9052j.m11894e(obj);
        }
    }
}
