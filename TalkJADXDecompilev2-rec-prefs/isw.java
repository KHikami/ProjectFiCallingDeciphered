package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class isw extends BroadcastReceiver {
    final /* synthetic */ ism f18912a;

    isw(ism ism) {
        this.f18912a = ism;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.HEADSET_PLUG")) {
            int intExtra = intent.getIntExtra("state", 0);
            itx.m23277a(3, "vclib", "WiredHeadsetReceiver.onReceive: state=" + intExtra + ", isInitialStickyBroadcast=" + isInitialStickyBroadcast());
            switch (intExtra) {
                case 0:
                    this.f18912a.f18881i.remove(isq.WIRED_HEADSET);
                    if (this.f18912a.m23138l()) {
                        this.f18912a.f18881i.add(isq.EARPIECE);
                    }
                    this.f18912a.f18881i.add(isq.SPEAKERPHONE);
                    if (this.f18912a.f18880h == isr.WIRED_HEADSET_ON) {
                        this.f18912a.m23124a(this.f18912a.f18879g);
                        return;
                    } else {
                        this.f18912a.m23131e();
                        return;
                    }
                case 1:
                    this.f18912a.f18881i.add(isq.WIRED_HEADSET);
                    this.f18912a.f18881i.remove(isq.EARPIECE);
                    this.f18912a.f18881i.remove(isq.SPEAKERPHONE);
                    this.f18912a.m23124a(isq.WIRED_HEADSET);
                    return;
                default:
                    return;
            }
        }
    }
}
