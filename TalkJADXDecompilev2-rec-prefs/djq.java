package p000;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.hangouts.hangout.HangoutActivity;

public final class djq extends dq implements OnClickListener {
    private boolean aj;

    public Dialog mo792a(Bundle bundle) {
        Resources resources = getActivity().getResources();
        Dialog create = new Builder(getActivity()).setMessage(bc.dQ).setTitle(resources.getString(bc.dR)).setPositiveButton(resources.getString(bc.dO), this).setNegativeButton(resources.getString(bc.dP), this).create();
        create.setOnShowListener(new djr(this));
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            startActivity(gwb.m2397z(gwb.m1998b(gwb.m1400H(), "babel_google_voice_add_balance_url", "https://www.google.com/voice/m/billing")));
            this.aj = true;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (dgg.m11692a().m11727s() == null) {
            HangoutActivity hangoutActivity = (HangoutActivity) getActivity();
            if (hangoutActivity != null) {
                hangoutActivity.m8565b(!this.aj);
            }
        }
    }
}
