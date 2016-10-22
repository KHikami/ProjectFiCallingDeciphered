package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: acn */
public final class acn extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        return new Builder(getActivity()).setTitle(buf.eo).setMessage(buf.en).setNegativeButton(17039360, null).setPositiveButton(17039370, new aco(this, getActivity().getApplicationContext(), getActivity().getContentResolver())).setCancelable(true).create();
    }
}
