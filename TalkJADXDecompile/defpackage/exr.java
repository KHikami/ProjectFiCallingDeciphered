package defpackage;

import android.text.TextUtils;

/* renamed from: exr */
public final class exr extends evz {
    private static final long serialVersionUID = 1;
    private final String g;
    private final String h;

    exr(lyy lyy) {
        if (lyy.a != null) {
            lyh lyh = lyy.a;
            if (TextUtils.isEmpty(lyh.a)) {
                iil.a("ServerResponse has Hangout but no hangoutId");
                this.g = null;
                this.h = null;
            } else {
                this.g = lyh.a;
                if (lyh.h != null) {
                    this.h = lyh.h.a;
                } else {
                    iil.a("Hangout has no associated conversation");
                    this.h = null;
                }
            }
        } else {
            this.g = null;
            this.h = null;
        }
        if (evz.a) {
            String valueOf = String.valueOf(lyy);
            new StringBuilder(String.valueOf(valueOf).length() + 28).append("GetHangoutInfoResponse from:").append(valueOf);
        }
    }
}
