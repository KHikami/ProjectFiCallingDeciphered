package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.android.incallui.spam.SpamNotificationActivity;

/* compiled from: PG */
/* renamed from: bfe */
public final class bfe extends da {
    boolean W;
    private Context X;

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        SpamNotificationActivity.a(this.X, this.j, 1025);
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
        return new Builder(e()).setTitle(a(aq.cA, SpamNotificationActivity.b(string))).setCancelable(false).setMessage(a(aq.dw)).setNeutralButton(a(aq.cG), new bfh(this)).setPositiveButton(a(aq.ds), new bfg(this, string)).setNegativeButton(a(aq.dt), new bff(this, spamNotificationActivity, string)).create();
    }

    public final void m() {
        a(false);
        super.m();
    }
}
