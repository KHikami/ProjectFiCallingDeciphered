package p000;

import android.widget.Toast;

final class dky extends isa {
    final /* synthetic */ dkx f10053a;

    dky(dkx dkx) {
        this.f10053a = dkx;
    }

    public void mo1593a() {
        glk.m17981d("Babel_calls", "Camera encountered an error", new Object[0]);
        if (this.f10053a.b.m11720l() != null) {
            this.f10053a.b.m11720l().m23059a(false);
            if (this.f10053a.b.m11727s() != null) {
                this.f10053a.b.m11727s().m11970a(false);
                if (this.f10053a.c != null && this.f10053a.c.m11851b() != null) {
                    Toast.makeText(this.f10053a.c.m11851b(), bc.tX, 1).show();
                }
            }
        }
    }

    public void mo1433a(int i, int i2) {
        this.f10053a.m12112g();
    }
}
