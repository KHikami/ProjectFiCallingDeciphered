package p000;

import android.app.AlertDialog;
import android.widget.Toast;

final class bfo implements jwn {
    final /* synthetic */ beq f3218a;
    final /* synthetic */ AlertDialog f3219b;
    final /* synthetic */ bfj f3220c;

    bfo(bfj bfj, beq beq, AlertDialog alertDialog) {
        this.f3220c = bfj;
        this.f3218a = beq;
        this.f3219b = alertDialog;
    }

    public boolean mo516a() {
        int i = 0;
        if (this.f3220c.f3202a == null || this.f3220c.f3202a.isEmpty() || !this.f3220c.f3202a.equals(this.f3218a.m5011c())) {
            this.f3219b.show();
        } else {
            bfj bfj = this.f3220c;
            if (bfj.f3209h == null || !bfj.f3209h.isConnected()) {
                Toast.makeText(bfj.f3203b, bfj.f3203b.getString(ba.gB), 0).show();
            } else {
                i = 1;
            }
            if (i != 0) {
                this.f3220c.m5072a(this.f3218a.m5011c());
            }
        }
        return true;
    }
}
