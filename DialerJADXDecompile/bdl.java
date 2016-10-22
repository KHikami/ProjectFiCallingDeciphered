import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;

/* compiled from: PG */
public final class bdl implements DisplayListener {
    DisplayManager a;
    private boolean b;
    private /* synthetic */ bdk c;

    bdl(bdk bdk, DisplayManager displayManager) {
        this.c = bdk;
        this.b = true;
        this.a = displayManager;
    }

    public final void onDisplayRemoved(int i) {
    }

    public final void onDisplayChanged(int i) {
        boolean z = true;
        if (i == 0) {
            if (this.a.getDisplay(i).getState() == 1) {
                z = false;
            }
            if (z != this.b) {
                this.b = z;
                bdk bdk = this.c;
                boolean z2 = this.b;
                bdf.d(bdk, "isDisplayOn: " + z2);
                bdk.c.a(z2);
            }
        }
    }

    public final void onDisplayAdded(int i) {
    }
}
