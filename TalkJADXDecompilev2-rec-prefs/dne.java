package p000;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;

public final class dne extends jzl implements OnClickListener {
    public Dialog mo792a(Bundle bundle) {
        CharSequence string;
        glk.m17970a("Babel", "Showing allow externals dialog", new Object[0]);
        Context activity = getActivity();
        Resources resources = activity.getResources();
        CharSequence c = ((dnc) jyn.m25426a(this.am, dnc.class)).mo1627c();
        if (TextUtils.isEmpty(c)) {
            string = resources.getString(ba.kT);
        } else {
            string = resources.getString(ba.kS, new Object[]{c});
        }
        if (TextUtils.isEmpty(c)) {
            c = resources.getString(ba.kR);
        } else {
            c = resources.getString(ba.kQ, new Object[]{c});
        }
        return new Builder(activity).setTitle(string).setMessage(c).setPositiveButton(resources.getString(ba.kO), this).setNegativeButton(resources.getString(ba.kP), this).create();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case -2:
                glk.m17979c("Babel", "Not allowing external users to join the call", new Object[0]);
                return;
            case -1:
                glk.m17979c("Babel", "Allowing external users to join the call", new Object[0]);
                gwb.m2198f(1501);
                ((dnc) jyn.m25426a(this.am, dnc.class)).mo1624a(true);
                return;
            default:
                iil.m21870a("Unrecognized button click");
                return;
        }
    }
}
