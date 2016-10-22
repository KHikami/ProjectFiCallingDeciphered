import android.view.View;

final class dbf implements gan {
    final /* synthetic */ dbe a;
    private boolean b;
    private final boolean c;

    dbf(dbe dbe, boolean z) {
        this.a = dbe;
        this.c = z;
    }

    public void onClick(View view) {
        int i;
        if (this.c) {
            i = 2886;
        } else {
            i = 2888;
        }
        int g = this.a.a.g();
        for (int i2 = 0; i2 < this.a.b.size(); i2++) {
            ((iih) this.a.c.binder.a(iih.class)).a(g).b().c(i);
        }
        dbe dbe = this.a;
        if (dbe.b != null && dbe.b.size() > 0) {
            dbe.a(dbe.b, false, false);
            dbe.b = null;
        }
        this.b = true;
    }

    public void a() {
        if (!this.b) {
            this.a.a(this.a.b, true, false);
        }
        this.b = false;
    }
}
