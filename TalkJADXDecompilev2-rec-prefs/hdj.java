package p000;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

final class hdj extends heb {
    final /* synthetic */ hdc f16696a;
    private final WeakReference<gui> f16697b;
    private int f16698c = 5;

    public hdj(hdc hdc, gui gui) {
        this.f16696a = hdc;
        super(gui);
        this.f16697b = new WeakReference(gui);
    }

    private void m19418j() {
        gui gui = (gui) this.f16697b.get();
        if (gui != null) {
            if (this.f16698c < 0) {
                gui.mo2523d();
                return;
            }
            if (hdc.f16674a.m19429c()) {
                this.f16698c = 0;
            }
            this.f16698c--;
            this.f16696a.m19404a().schedule(new hdk(this, gui), 200, TimeUnit.MILLISECONDS);
        }
    }

    protected /* synthetic */ void mo2425a(gud gud) {
        m19418j();
    }

    protected /* synthetic */ gup mo2424b(Status status) {
        return status;
    }
}
