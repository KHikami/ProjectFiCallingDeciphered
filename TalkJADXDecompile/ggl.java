import android.content.Context;
import android.content.Intent;

public class ggl {
    public geu a;
    public final Intent b;
    public final Context c;

    public void a() {
        glk.c("Babel_telephony", "TeleSetupController.ShowDialogCallback.onError", new Object[0]);
        if (this.a != null) {
            this.a.a(gwb.b(this.c, "babel_outgoing_wifi_call_show_dialog_error_action", "cellular"), this.b);
        }
    }

    public void b() {
        glk.c("Babel_telephony", "TeleSetupController.ShowDialogCallback.onTimeout", new Object[0]);
        if (this.a != null) {
            this.a.a(gwb.b(this.c, "babel_outgoing_wifi_call_show_dialog_timeout_action", "cellular"), this.b);
        }
    }

    public ggl(Context context, geu geu, Intent intent) {
        this.c = context;
        this.a = geu;
        this.b = intent;
    }

    public void c() {
        this.a = null;
    }
}
