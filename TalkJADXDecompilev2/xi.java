package defpackage;

import android.view.View;

final class xi extends pz {
    final /* synthetic */ xh a;
    private boolean b = false;
    private int c = 0;

    xi(xh xhVar) {
        this.a = xhVar;
    }

    public void a(View view) {
        if (!this.b) {
            this.b = true;
            if (this.a.b != null) {
                this.a.b.a(null);
            }
        }
    }

    private void a() {
        this.c = 0;
        this.b = false;
        this.a.c = false;
    }

    public void b(View view) {
        int i = this.c + 1;
        this.c = i;
        if (i == this.a.a.size()) {
            if (this.a.b != null) {
                this.a.b.b(null);
            }
            a();
        }
    }
}
