import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

final class hdj extends heb {
    final /* synthetic */ hdc a;
    private final WeakReference<gui> b;
    private int c;

    public hdj(hdc hdc, gui gui) {
        this.a = hdc;
        super(gui);
        this.b = new WeakReference(gui);
        this.c = 5;
    }

    private void j() {
        gui gui = (gui) this.b.get();
        if (gui != null) {
            if (this.c < 0) {
                gui.d();
                return;
            }
            if (hdc.a.c()) {
                this.c = 0;
            }
            this.c--;
            this.a.a().schedule(new hdk(this, gui), 200, TimeUnit.MILLISECONDS);
        }
    }

    protected /* synthetic */ void a(gud gud) {
        j();
    }

    protected /* synthetic */ gup b(Status status) {
        return status;
    }
}
