package p000;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

public final class gto extends DialogFragment {
    Dialog f16127a = null;
    OnCancelListener f16128b = null;

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f16128b != null) {
            this.f16128b.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f16127a == null) {
            setShowsDialog(false);
        }
        return this.f16127a;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
