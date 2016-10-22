package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: ang */
public final class ang extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        return new Builder(getActivity()).setTitle(cob.bA).setIconAttribute(16843605).setMessage(cob.bz).setNegativeButton(17039360, null).setPositiveButton(17039370, new anh(this, getActivity().getContentResolver(), getActivity().getApplicationContext())).setCancelable(true).create();
    }
}
