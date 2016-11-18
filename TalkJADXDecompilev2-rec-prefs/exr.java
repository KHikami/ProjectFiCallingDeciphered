package p000;

import android.text.TextUtils;

public final class exr extends evz {
    private static final long serialVersionUID = 1;
    private final String f12445g;
    private final String f12446h;

    exr(lyy lyy) {
        if (lyy.f26965a != null) {
            lyh lyh = lyy.f26965a;
            if (TextUtils.isEmpty(lyh.f26866a)) {
                iil.m21870a("ServerResponse has Hangout but no hangoutId");
                this.f12445g = null;
                this.f12446h = null;
            } else {
                this.f12445g = lyh.f26866a;
                if (lyh.f26873h != null) {
                    this.f12446h = lyh.f26873h.f25931a;
                } else {
                    iil.m21870a("Hangout has no associated conversation");
                    this.f12446h = null;
                }
            }
        } else {
            this.f12445g = null;
            this.f12446h = null;
        }
        if (evz.f5798a) {
            String valueOf = String.valueOf(lyy);
            new StringBuilder(String.valueOf(valueOf).length() + 28).append("GetHangoutInfoResponse from:").append(valueOf);
        }
    }
}
