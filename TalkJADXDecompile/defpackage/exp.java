package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: exp */
public final class exp extends evz {
    private static final long serialVersionUID = 1;
    private final String g;

    exp(lzc lzc) {
        this.g = lzc.a;
        if (evz.a) {
            String valueOf = String.valueOf(lzc);
            new StringBuilder(String.valueOf(valueOf).length() + 26).append("GetHangoutIdResponse from:").append(valueOf);
        }
    }

    public void a(Context context, bko bko) {
        if (TextUtils.isEmpty(this.g)) {
            iil.a("hangoutId is empty");
            return;
        }
        fde.e(bko).a(new eug(this.g, ((eue) this.b).c), -1);
    }
}
