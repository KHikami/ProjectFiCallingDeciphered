package p000;

import android.content.Context;
import android.text.TextUtils;

public final class exp extends evz {
    private static final long serialVersionUID = 1;
    private final String f12444g;

    exp(lzc lzc) {
        this.f12444g = lzc.f26979a;
        if (evz.f5798a) {
            String valueOf = String.valueOf(lzc);
            new StringBuilder(String.valueOf(valueOf).length() + 26).append("GetHangoutIdResponse from:").append(valueOf);
        }
    }

    public void mo1958a(Context context, bko bko) {
        if (TextUtils.isEmpty(this.f12444g)) {
            iil.m21870a("hangoutId is empty");
            return;
        }
        fde.m15019e(bko).m15078a(new eug(this.f12444g, ((eue) this.b).f12289c), -1);
    }
}
