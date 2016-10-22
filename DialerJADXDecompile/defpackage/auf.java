package defpackage;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* compiled from: PG */
/* renamed from: auf */
public class auf extends DialogFragment {
    public String c;
    public aug d;
    public OnDismissListener e;

    private auf() {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.e != null) {
            this.e.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public void onPause() {
        dismiss();
        this.e = null;
        this.d = null;
        this.c = null;
        super.onPause();
    }
}
