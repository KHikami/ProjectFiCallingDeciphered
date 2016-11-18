package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public final class chv extends jxy {
    private chy aj;

    public static void m7680a(boolean z, Context context, ed edVar) {
        Bundle bundle = new Bundle();
        bundle.putString("title", context.getString(gwb.lW));
        bundle.putString("message", context.getString(gwb.lX));
        bundle.putString("positive", context.getString(gwb.lY));
        bundle.putString("negative", context.getString(gwb.lV));
        chv chv = new chv();
        chv.setArguments(bundle);
        chv.mo2341a(edVar, "off_the_record_alert");
    }

    protected void mo973f(Bundle bundle) {
        super.mo973f(bundle);
        this.aj = (chy) this.an.m25443a(chy.class);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case -2:
                glk.m17979c("Babel_OffTheRecAlertDlg", "OTR status changed dialog: User clicked cancel.", new Object[0]);
                return;
            case -1:
                glk.m17979c("Babel_OffTheRecAlertDlg", "OTR status changed dialog: User clicked sent.", new Object[0]);
                this.aj.mo898a();
                return;
            default:
                return;
        }
    }
}
