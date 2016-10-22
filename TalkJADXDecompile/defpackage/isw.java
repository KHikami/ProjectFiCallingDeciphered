package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: isw */
final class isw extends BroadcastReceiver {
    final /* synthetic */ ism a;

    isw(ism ism) {
        this.a = ism;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.HEADSET_PLUG")) {
            int intExtra = intent.getIntExtra("state", 0);
            itx.a(3, "vclib", "WiredHeadsetReceiver.onReceive: state=" + intExtra + ", isInitialStickyBroadcast=" + isInitialStickyBroadcast());
            switch (intExtra) {
                case wi.w /*0*/:
                    this.a.i.remove(isq.WIRED_HEADSET);
                    if (this.a.l()) {
                        this.a.i.add(isq.EARPIECE);
                    }
                    this.a.i.add(isq.SPEAKERPHONE);
                    if (this.a.h == isr.WIRED_HEADSET_ON) {
                        this.a.a(this.a.g);
                    } else {
                        this.a.e();
                    }
                case wi.j /*1*/:
                    this.a.i.add(isq.WIRED_HEADSET);
                    this.a.i.remove(isq.EARPIECE);
                    this.a.i.remove(isq.SPEAKERPHONE);
                    this.a.a(isq.WIRED_HEADSET);
                default:
            }
        }
    }
}
