package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: bhs */
public final class bhs implements bef {
    public final bei a(Context context) {
        return new bju(context);
    }

    public final bee a() {
        return new bee();
    }

    public final Intent b(Context context) {
        String a = csn.a(context.getContentResolver(), "dialer_in_call_ui_ready_action", "com.google.android.intent.action.IN_CALL_UI_READY");
        return new Intent(a).setPackage(csn.a(context.getContentResolver(), "dialer_in_call_ui_ready_package", "com.google.android.talk"));
    }

    public final Intent c(Context context) {
        String a = csn.a(context.getContentResolver(), "dialer_call_state_button_touched_action", "com.google.android.intent.action.CALL_STATE_BUTTON_TOUCHED");
        return new Intent(a).setPackage(csn.a(context.getContentResolver(), "dialer_call_state_button_touched_package", "com.google.android.talk"));
    }

    public final bec a(Context context, bed bed) {
        return new bec(context, bed);
    }

    public final bea d(Context context) {
        if (bim.a == null) {
            bim.a = new bim(context);
        }
        return bim.a;
    }
}
