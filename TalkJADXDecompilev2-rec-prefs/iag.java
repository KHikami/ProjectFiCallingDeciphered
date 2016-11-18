package p000;

import com.google.android.gms.common.api.Status;

public final class iag extends heb {
    final /* synthetic */ String f17496a;
    final /* synthetic */ String f17497b;
    final /* synthetic */ byte[] f17498c;
    final /* synthetic */ hyb f17499d;

    public iag(hyb hyb, gui gui, String str, String str2, byte[] bArr) {
        this.f17499d = hyb;
        this.f17496a = str;
        this.f17497b = str2;
        this.f17498c = bArr;
        super(gui, (short) 0);
    }

    private void m21485a(iaw iaw) {
        iaw.m21499a((hec) this, this.f17496a, this.f17497b, this.f17498c);
    }

    protected /* synthetic */ gup mo2424b(Status status) {
        return new hyd(status, -1);
    }
}
