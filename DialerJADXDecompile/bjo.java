import com.google.android.apps.dialer.provider.DialerProvider;

/* compiled from: PG */
public final class bjo implements Runnable {
    private /* synthetic */ DialerProvider a;

    public bjo(DialerProvider dialerProvider) {
        this.a = dialerProvider;
    }

    public final void run() {
        this.a.a();
    }
}
