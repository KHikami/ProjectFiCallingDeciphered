package defpackage;

import com.google.android.apps.hangouts.elane.CallActivity;

public final class crj extends cvm {
    final /* synthetic */ CallActivity a;
    private boolean b = false;

    public crj(CallActivity callActivity) {
        this.a = callActivity;
    }

    public void a(lym lym) {
        if (this.b) {
            this.a.findViewById(gwb.oC).announceForAccessibility(this.a.getString(ba.kg, new Object[]{cvh.a(this.a, lym)}));
        }
    }

    public void b(lym lym) {
        this.a.findViewById(gwb.oC).announceForAccessibility(this.a.getString(ba.kh, new Object[]{cvh.a(this.a, lym)}));
    }

    public void a() {
        this.b = true;
    }
}