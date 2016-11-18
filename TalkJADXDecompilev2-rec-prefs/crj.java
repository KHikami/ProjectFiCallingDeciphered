package p000;

import com.google.android.apps.hangouts.elane.CallActivity;

public final class crj extends cvm {
    final /* synthetic */ CallActivity f8939a;
    private boolean f8940b = false;

    public crj(CallActivity callActivity) {
        this.f8939a = callActivity;
    }

    public void mo1387a(lym lym) {
        if (this.f8940b) {
            this.f8939a.findViewById(gwb.oC).announceForAccessibility(this.f8939a.getString(ba.kg, new Object[]{cvh.m11090a(this.f8939a, lym)}));
        }
    }

    public void mo1388b(lym lym) {
        this.f8939a.findViewById(gwb.oC).announceForAccessibility(this.f8939a.getString(ba.kh, new Object[]{cvh.m11090a(this.f8939a, lym)}));
    }

    public void mo1393a() {
        this.f8940b = true;
    }
}
