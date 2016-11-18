package p000;

import com.google.android.apps.hangouts.hangout.IncomingRingActivity;

public final class diy implements Runnable {
    final /* synthetic */ IncomingRingActivity f9904a;

    public diy(IncomingRingActivity incomingRingActivity) {
        this.f9904a = incomingRingActivity;
    }

    public void run() {
        if (this.f9904a.f6390o != null) {
            this.f9904a.f6390o.ping();
        }
        if (this.f9904a.f6391p != null) {
            this.f9904a.f6391p.postDelayed(this, 2000);
        }
    }
}
