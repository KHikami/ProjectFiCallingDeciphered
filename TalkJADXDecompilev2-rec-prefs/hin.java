package p000;

import com.google.android.gms.common.api.Status;

public final class hin extends heb {
    final /* synthetic */ String f16996a;
    final /* synthetic */ String f16997b;
    final /* synthetic */ hsa f16998c;
    final /* synthetic */ hrv f16999d;

    public hin(hrv hrv, gui gui, String str, String str2, hsa hsa) {
        this.f16999d = hrv;
        this.f16996a = str;
        this.f16997b = str2;
        this.f16998c = hsa;
        super(gui, '\u0000');
    }

    private hsb m19856a(Status status) {
        return new hio(this, status);
    }

    private void m19857a(hvm hvm) {
        hvm.m21084a((hec) this, this.f16996a, this.f16997b, this.f16998c);
    }

    protected /* synthetic */ gup mo2424b(Status status) {
        return m19856a(status);
    }
}
