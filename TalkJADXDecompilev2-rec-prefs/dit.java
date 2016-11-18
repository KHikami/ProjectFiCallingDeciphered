package p000;

import com.google.android.apps.hangouts.hangout.IncomingRing;

public final class dit implements Runnable {
    final /* synthetic */ IncomingRing f9898a;

    public dit(IncomingRing incomingRing) {
        this.f9898a = incomingRing;
    }

    public void run() {
        glk.m17981d("Babel_IncomingRing", "Timeout", new Object[0]);
        this.f9898a.m8622a(0, 6);
    }
}
