import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

final class cau extends caw implements cas, jej, jza {
    private jca b;
    private byq c;
    private iih d;
    private fuz e;
    private fit f;

    public cau(Context context, kbu kbu) {
        super(context, kbu);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        super.a(context, jyn, bundle);
        this.b = (jca) jyn.a(jca.class);
        this.c = (byq) jyn.a(byq.class);
        this.d = (iih) jyn.a(iih.class);
        this.e = (fuz) jyn.a(fuz.class);
        this.f = (fit) jyn.a(fit.class);
        this.a.a(gwb.kV, (jej) this);
    }

    public String b() {
        return this.h.getString(gwb.kY);
    }

    public String c() {
        return gku.a(this.h, a());
    }

    public boolean d() {
        return this.c.f() != 10;
    }

    public void g() {
        this.d.a(this.b.a()).b().c(3294);
        a(gwb.kV, this.h.getString(gwb.kY), a(), h(), 2);
    }

    public void a(int i, Intent intent) {
        if (i == -1) {
            String a = a(intent, h());
            this.c.e(a);
            this.f.b(fde.e(this.b.a()), this.c.b()[0], a);
            this.c.u();
        }
    }

    private Uri a() {
        if (this.c.k() != null) {
            return gld.c(this.c.k());
        }
        return h();
    }

    private Uri h() {
        return this.e.a(this.b.a(), fuz.a(this.c.e(), false));
    }
}
