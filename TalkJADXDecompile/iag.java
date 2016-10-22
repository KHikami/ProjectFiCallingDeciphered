import com.google.android.gms.common.api.Status;

public final class iag extends heb {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ byte[] c;
    final /* synthetic */ hyb d;

    public iag(hyb hyb, gui gui, String str, String str2, byte[] bArr) {
        this.d = hyb;
        this.a = str;
        this.b = str2;
        this.c = bArr;
        super(gui, (short) 0);
    }

    private void a(iaw iaw) {
        iaw.a((hec) this, this.a, this.b, this.c);
    }

    protected /* synthetic */ gup b(Status status) {
        return new hyd(status, -1);
    }
}
