import com.google.android.gms.common.api.Status;

public final class hiy extends hsn {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean n;
    final /* synthetic */ hso o;

    public hiy(hso hso, gui gui, String str, String str2, long j, boolean z, boolean z2) {
        this.o = hso;
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = z;
        this.n = z2;
        super(gui);
    }

    private void a(hvm hvm) {
        hvm.a(this.a, this.b, this.c, this.d, this.n);
        a(Status.a);
    }
}
