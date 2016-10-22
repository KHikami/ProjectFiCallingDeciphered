package defpackage;

import com.google.android.apps.hangouts.hangout.IncomingRingActivity;

/* renamed from: diy */
public final class diy implements Runnable {
    final /* synthetic */ IncomingRingActivity a;

    public diy(IncomingRingActivity incomingRingActivity) {
        this.a = incomingRingActivity;
    }

    public void run() {
        if (this.a.o != null) {
            this.a.o.ping();
        }
        if (this.a.p != null) {
            this.a.p.postDelayed(this, 2000);
        }
    }
}
