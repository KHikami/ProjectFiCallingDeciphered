package defpackage;

import android.widget.Toast;

final class dky extends isa {
    final /* synthetic */ dkx a;

    dky(dkx dkx) {
        this.a = dkx;
    }

    public void a() {
        glk.d("Babel_calls", "Camera encountered an error", new Object[0]);
        if (this.a.b.l() != null) {
            this.a.b.l().a(false);
            if (this.a.b.s() != null) {
                this.a.b.s().a(false);
                if (this.a.c != null && this.a.c.b() != null) {
                    Toast.makeText(this.a.c.b(), bc.tX, 1).show();
                }
            }
        }
    }

    public void a(int i, int i2) {
        this.a.g();
    }
}
