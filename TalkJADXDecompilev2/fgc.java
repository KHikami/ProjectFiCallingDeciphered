package defpackage;

import android.widget.Toast;

final class fgc implements Runnable {
    final /* synthetic */ bko a;
    final /* synthetic */ fdx b;
    final /* synthetic */ fdv c;
    final /* synthetic */ dw d;
    final /* synthetic */ fgb e;

    fgc(fgb fgb, bko bko, fdx fdx, fdv fdv, dw dwVar) {
        this.e = fgb;
        this.a = bko;
        this.b = fdx;
        this.c = fdv;
        this.d = dwVar;
    }

    public void run() {
        switch (this.a.I()) {
            case 1:
                this.b.b(this.c);
                return;
            case 2:
                this.d.startActivityForResult(gwb.a(this.a, this.c), 5100);
                return;
            case 3:
                Toast.makeText(this.d, bc.uc, 0).show();
                return;
            default:
                glk.d("Babel", "GetVoiceAccountData didn't return valid account info", new Object[0]);
                return;
        }
    }
}