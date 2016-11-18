package p000;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;

public final class deh extends dq {
    public void onCancel(DialogInterface dialogInterface) {
        ((ded) getTargetFragment()).getActivity().finish();
    }

    public Dialog mo792a(Bundle bundle) {
        int i = getArguments().getInt("action_index");
        if (i < 0 || i > 2) {
            return null;
        }
        CharSequence string;
        Builder builder = new Builder(getActivity());
        Builder title = builder.setTitle(bc.kJ);
        Resources resources = getActivity().getResources();
        switch (i) {
            case 0:
                string = resources.getString(bc.aC, new Object[]{ded.f9552b});
                break;
            case 1:
                string = resources.getString(bc.aJ, new Object[]{ded.f9552b});
                break;
            case 2:
                string = resources.getString(bc.f2970z, new Object[]{ded.f9552b});
                break;
            default:
                throw new IllegalArgumentException("SmsStorageLowWarningFragment: invalid action index " + i);
        }
        title.setMessage(string).setNegativeButton(17039360, new dej(this)).setPositiveButton(17039370, new dei(this, i));
        return builder.create();
    }
}
