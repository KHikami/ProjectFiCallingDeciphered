package p000;

import android.content.Context;
import android.content.Intent;

public class ggl {
    public geu f15245a;
    public final Intent f15246b;
    public final Context f15247c;

    public void m17653a() {
        glk.m17979c("Babel_telephony", "TeleSetupController.ShowDialogCallback.onError", new Object[0]);
        if (this.f15245a != null) {
            this.f15245a.m17451a(gwb.m1998b(this.f15247c, "babel_outgoing_wifi_call_show_dialog_error_action", "cellular"), this.f15246b);
        }
    }

    public void m17654b() {
        glk.m17979c("Babel_telephony", "TeleSetupController.ShowDialogCallback.onTimeout", new Object[0]);
        if (this.f15245a != null) {
            this.f15245a.m17451a(gwb.m1998b(this.f15247c, "babel_outgoing_wifi_call_show_dialog_timeout_action", "cellular"), this.f15246b);
        }
    }

    public ggl(Context context, geu geu, Intent intent) {
        this.f15247c = context;
        this.f15245a = geu;
        this.f15246b = intent;
    }

    public void m17655c() {
        this.f15245a = null;
    }
}
