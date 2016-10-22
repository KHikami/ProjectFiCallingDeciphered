package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;

/* renamed from: deh */
public final class deh extends dq {
    public void onCancel(DialogInterface dialogInterface) {
        ((ded) getTargetFragment()).getActivity().finish();
    }

    public Dialog a(Bundle bundle) {
        int i = getArguments().getInt("action_index");
        if (i < 0 || i > 2) {
            return null;
        }
        CharSequence string;
        Builder builder = new Builder(getActivity());
        Builder title = builder.setTitle(bc.kJ);
        Resources resources = getActivity().getResources();
        switch (i) {
            case wi.w /*0*/:
                string = resources.getString(bc.aC, new Object[]{ded.b});
                break;
            case wi.j /*1*/:
                string = resources.getString(bc.aJ, new Object[]{ded.b});
                break;
            case wi.l /*2*/:
                string = resources.getString(bc.z, new Object[]{ded.b});
                break;
            default:
                throw new IllegalArgumentException("SmsStorageLowWarningFragment: invalid action index " + i);
        }
        title.setMessage(string).setNegativeButton(17039360, new dej(this)).setPositiveButton(17039370, new dei(this, i));
        return builder.create();
    }
}
