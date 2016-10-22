import com.google.android.apps.hangouts.elane.StatusOverlay;

public final class cwi implements Runnable {
    final /* synthetic */ StatusOverlay a;

    public cwi(StatusOverlay statusOverlay) {
        this.a = statusOverlay;
    }

    public void run() {
        this.a.b();
    }
}
