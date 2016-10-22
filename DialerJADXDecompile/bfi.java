import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.android.incallui.spam.SpamNotificationActivity;

/* compiled from: PG */
public final class bfi extends da {
    boolean W;
    private Context X;

    public final void onDismiss(DialogInterface dialogInterface) {
        SpamNotificationActivity.a(this.X, this.j, 1024);
        super.onDismiss(dialogInterface);
        if (!this.W && e() != null && !e().isFinishing()) {
            e().finish();
        }
    }

    public final void a(Context context) {
        super.a(context);
        this.X = context.getApplicationContext();
    }

    public final Dialog c(Bundle bundle) {
        super.c(bundle);
        SpamNotificationActivity spamNotificationActivity = (SpamNotificationActivity) e();
        String string = this.j.getString("phone_number");
        return new Builder(e()).setCancelable(false).setTitle(a(aq.dB, SpamNotificationActivity.b(string))).setMessage(a(aq.dA)).setNeutralButton(a(aq.cG), new bfl(this)).setPositiveButton(a(aq.du), new bfk(this, spamNotificationActivity, string)).setNegativeButton(a(aq.dr), new bfj(this, spamNotificationActivity, string)).create();
    }

    public final void m() {
        a(false);
        super.m();
    }
}
