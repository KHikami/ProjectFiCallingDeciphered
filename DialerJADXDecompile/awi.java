import com.android.dialer.dialpadview.DialpadKeyButton;

/* compiled from: PG */
public final class awi implements Runnable {
    private /* synthetic */ DialpadKeyButton a;

    public awi(DialpadKeyButton dialpadKeyButton) {
        this.a = dialpadKeyButton;
    }

    public final void run() {
        this.a.a(true);
        this.a.announceForAccessibility(this.a.a);
    }
}
