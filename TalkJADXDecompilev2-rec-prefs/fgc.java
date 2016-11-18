package p000;

import android.widget.Toast;

final class fgc implements Runnable {
    final /* synthetic */ bko f12993a;
    final /* synthetic */ fdx f12994b;
    final /* synthetic */ fdv f12995c;
    final /* synthetic */ dw f12996d;
    final /* synthetic */ fgb f12997e;

    fgc(fgb fgb, bko bko, fdx fdx, fdv fdv, dw dwVar) {
        this.f12997e = fgb;
        this.f12993a = bko;
        this.f12994b = fdx;
        this.f12995c = fdv;
        this.f12996d = dwVar;
    }

    public void run() {
        switch (this.f12993a.m5622I()) {
            case 1:
                this.f12994b.mo1155b(this.f12995c);
                return;
            case 2:
                this.f12996d.startActivityForResult(gwb.m1543a(this.f12993a, this.f12995c), 5100);
                return;
            case 3:
                Toast.makeText(this.f12996d, bc.uc, 0).show();
                return;
            default:
                glk.m17981d("Babel", "GetVoiceAccountData didn't return valid account info", new Object[0]);
                return;
        }
    }
}
