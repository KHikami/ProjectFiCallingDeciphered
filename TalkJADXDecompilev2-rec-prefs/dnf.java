package p000;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Resources;
import android.os.Bundle;

public final class dnf extends jzl implements OnClickListener {
    private OnDismissListener aj;

    public Dialog mo792a(Bundle bundle) {
        glk.m17970a("Babel", "Showing disable knocking dialog", new Object[0]);
        gwb.m2198f(1666);
        Context activity = getActivity();
        Resources resources = activity.getResources();
        CharSequence string = resources.getString(ba.la);
        return new Builder(activity).setTitle(string).setMessage(resources.getString(ba.kZ)).setPositiveButton(resources.getString(ba.lb), this).setNegativeButton(resources.getString(ba.kY), this).setCancelable(false).create();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case -2:
                glk.m17979c("Babel", "Knocking will not be disabled", new Object[0]);
                gwb.m2198f(1668);
                return;
            case -1:
                glk.m17979c("Babel", "Knocking to be disabled", new Object[0]);
                gwb.m2198f(1667);
                ((dnc) jyn.m25426a(getActivity(), dnc.class)).mo1624a(false);
                return;
            default:
                iil.m21870a("Unrecognized button click");
                return;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.aj != null) {
            this.aj.onDismiss(dialogInterface);
        }
    }

    public void m12277a(OnDismissListener onDismissListener) {
        this.aj = onDismissListener;
    }
}
