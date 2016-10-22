package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: fge */
public final class fge extends fgg<eta, ews> {
    public fge(Context context, int i, fgh fgh) {
        super(context, i, fgh, bc.ui);
    }

    public void a(fme fme) {
        RealTimeChatService.c(fme, this.d);
    }

    public Class<eta> d() {
        return eta.class;
    }

    public Class<ews> e() {
        return ews.class;
    }
}
