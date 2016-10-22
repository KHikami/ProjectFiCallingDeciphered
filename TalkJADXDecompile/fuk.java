import android.widget.Toast;

final class fuk extends fip {
    final int a;
    final boolean b;
    final boolean c;
    final czd d;
    final /* synthetic */ fue e;

    fuk(fue fue, int i, boolean z, boolean z2, czd czd) {
        this.e = fue;
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = czd;
    }

    public final void a(int i, bko bko, fiu fiu) {
        if (i == this.a && (fiu.c() instanceof ezu)) {
            this.e.b.b(this);
            this.e.d.a(this.c);
            this.d.a();
            this.e.c = null;
        }
    }

    public final void a(int i, bko bko, fok fok, fdo fdo) {
        if (i == this.a) {
            this.e.b.b(this);
            this.e.d.a(this.b);
            Toast.makeText(this.e.context, bc.W, 0).show();
            this.d.a();
            this.e.c = null;
        }
    }
}
