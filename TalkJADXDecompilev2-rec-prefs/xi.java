package p000;

import android.view.View;

final class xi extends pz {
    final /* synthetic */ xh f35678a;
    private boolean f35679b = false;
    private int f35680c = 0;

    xi(xh xhVar) {
        this.f35678a = xhVar;
    }

    public void mo4439a(View view) {
        if (!this.f35679b) {
            this.f35679b = true;
            if (this.f35678a.f35673b != null) {
                this.f35678a.f35673b.a(null);
            }
        }
    }

    private void m41305a() {
        this.f35680c = 0;
        this.f35679b = false;
        this.f35678a.f35674c = false;
    }

    public void mo4440b(View view) {
        int i = this.f35680c + 1;
        this.f35680c = i;
        if (i == this.f35678a.f35672a.size()) {
            if (this.f35678a.f35673b != null) {
                this.f35678a.f35673b.b(null);
            }
            m41305a();
        }
    }
}
