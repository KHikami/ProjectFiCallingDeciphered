package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.widget.ListAdapter;

/* compiled from: PG */
/* renamed from: acs */
public final class acs extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        Builder builder = new Builder(getActivity());
        Bundle arguments = getArguments();
        ListAdapter aij = new aij(builder.getContext(), (aik) arguments.getSerializable("list_filter"));
        aij.a = buf.do;
        OnClickListener act = new act(this, aij);
        builder.setTitle(arguments.getInt("title_res_id"));
        builder.setSingleChoiceItems(aij, 0, act);
        return builder.create();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null && (targetFragment instanceof acu)) {
            ((acu) targetFragment).a();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        setTargetFragment(null, -1);
        super.onSaveInstanceState(bundle);
    }
}
