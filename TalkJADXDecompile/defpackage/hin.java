package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: hin */
public final class hin extends heb {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ hsa c;
    final /* synthetic */ hrv d;

    public hin(hrv hrv, gui gui, String str, String str2, hsa hsa) {
        this.d = hrv;
        this.a = str;
        this.b = str2;
        this.c = hsa;
        super(gui, '\u0000');
    }

    private hsb a(Status status) {
        return new hio(this, status);
    }

    private void a(hvm hvm) {
        hvm.a((hec) this, this.a, this.b, this.c);
    }

    protected /* synthetic */ gup b(Status status) {
        return a(status);
    }
}
