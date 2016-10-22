package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Resources;
import android.os.Bundle;

/* renamed from: dnf */
public final class dnf extends jzl implements OnClickListener {
    private OnDismissListener aj;

    public Dialog a(Bundle bundle) {
        glk.a("Babel", "Showing disable knocking dialog", new Object[0]);
        gwb.f(1666);
        Context activity = getActivity();
        Resources resources = activity.getResources();
        CharSequence string = resources.getString(ba.la);
        return new Builder(activity).setTitle(string).setMessage(resources.getString(ba.kZ)).setPositiveButton(resources.getString(ba.lb), this).setNegativeButton(resources.getString(ba.kY), this).setCancelable(false).create();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case -2:
                glk.c("Babel", "Knocking will not be disabled", new Object[0]);
                gwb.f(1668);
            case -1:
                glk.c("Babel", "Knocking to be disabled", new Object[0]);
                gwb.f(1667);
                ((dnc) jyn.a(getActivity(), dnc.class)).a(false);
            default:
                iil.a("Unrecognized button click");
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.aj != null) {
            this.aj.onDismiss(dialogInterface);
        }
    }

    public void a(OnDismissListener onDismissListener) {
        this.aj = onDismissListener;
    }
}
