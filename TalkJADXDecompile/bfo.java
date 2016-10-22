import android.app.AlertDialog;
import android.widget.Toast;

final class bfo implements jwn {
    final /* synthetic */ beq a;
    final /* synthetic */ AlertDialog b;
    final /* synthetic */ bfj c;

    bfo(bfj bfj, beq beq, AlertDialog alertDialog) {
        this.c = bfj;
        this.a = beq;
        this.b = alertDialog;
    }

    public boolean a() {
        int i = 0;
        if (this.c.a == null || this.c.a.isEmpty() || !this.c.a.equals(this.a.c())) {
            this.b.show();
        } else {
            bfj bfj = this.c;
            if (bfj.h == null || !bfj.h.isConnected()) {
                Toast.makeText(bfj.b, bfj.b.getString(ba.gB), 0).show();
            } else {
                i = 1;
            }
            if (i != 0) {
                this.c.a(this.a.c());
            }
        }
        return true;
    }
}
