import com.google.android.apps.hangouts.hangout.IncomingRing;

public final class dit implements Runnable {
    final /* synthetic */ IncomingRing a;

    public dit(IncomingRing incomingRing) {
        this.a = incomingRing;
    }

    public void run() {
        glk.d("Babel_IncomingRing", "Timeout", new Object[0]);
        this.a.a(0, 6);
    }
}
