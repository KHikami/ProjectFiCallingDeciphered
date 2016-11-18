package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public final class chv extends jxy {
    private chy aj;

    public static void a(boolean z, Context context, ed edVar) {
        Bundle bundle = new Bundle();
        bundle.putString("title", context.getString(gwb.lW));
        bundle.putString("message", context.getString(gwb.lX));
        bundle.putString("positive", context.getString(gwb.lY));
        bundle.putString("negative", context.getString(gwb.lV));
        chv chv = new chv();
        chv.setArguments(bundle);
        chv.a(edVar, "off_the_record_alert");
    }

    protected void f(Bundle bundle) {
        super.f(bundle);
        this.aj = (chy) this.an.a(chy.class);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case -2:
                glk.c("Babel_OffTheRecAlertDlg", "OTR status changed dialog: User clicked cancel.", new Object[0]);
                return;
            case -1:
                glk.c("Babel_OffTheRecAlertDlg", "OTR status changed dialog: User clicked sent.", new Object[0]);
                this.aj.a();
                return;
            default:
                return;
        }
    }
}
