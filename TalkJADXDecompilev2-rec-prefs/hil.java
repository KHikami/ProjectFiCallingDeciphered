package p000;

import com.google.android.gms.common.api.Status;

public final class hil extends heb {
    final /* synthetic */ hry f16992a;
    final /* synthetic */ hrv f16993b;

    public hil(hrv hrv, gui gui, hry hry) {
        this.f16993b = hrv;
        this.f16992a = hry;
        super(gui, '\u0000');
    }

    private hrz m19848a(Status status) {
        return new him(this, status);
    }

    private void m19849a(hvm hvm) {
        hvm.m21086a(this, false, this.f16992a.m20747a(), null, null, this.f16992a.m20748b());
    }

    protected /* synthetic */ gup mo2424b(Status status) {
        return m19848a(status);
    }
}
