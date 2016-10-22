package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: hiw */
public final class hiw extends hsn {
    final /* synthetic */ hvw a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ hsh n;

    public hiw(hsh hsh, gui gui, hvw hvw, String str, String str2, int i) {
        this.n = hsh;
        this.a = hvw;
        this.b = str;
        this.c = str2;
        this.d = i;
        super(gui);
    }

    private void a(hvm hvm) {
        hvm.a(this.a, this.b, this.c, this.d);
        a(Status.a);
    }
}
