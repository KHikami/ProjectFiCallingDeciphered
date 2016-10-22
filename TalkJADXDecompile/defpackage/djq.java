package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.hangouts.hangout.HangoutActivity;

/* renamed from: djq */
public final class djq extends dq implements OnClickListener {
    private boolean aj;

    public Dialog a(Bundle bundle) {
        Resources resources = getActivity().getResources();
        Dialog create = new Builder(getActivity()).setMessage(bc.dQ).setTitle(resources.getString(bc.dR)).setPositiveButton(resources.getString(bc.dO), this).setNegativeButton(resources.getString(bc.dP), this).create();
        create.setOnShowListener(new djr(this));
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            startActivity(gwb.z(gwb.b(gwb.H(), "babel_google_voice_add_balance_url", "https://www.google.com/voice/m/billing")));
            this.aj = true;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (dgg.a().s() == null) {
            HangoutActivity hangoutActivity = (HangoutActivity) getActivity();
            if (hangoutActivity != null) {
                hangoutActivity.b(!this.aj);
            }
        }
    }
}
