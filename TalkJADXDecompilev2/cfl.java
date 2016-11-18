package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class cfl implements OnClickListener {
    final /* synthetic */ cdr a;

    cfl(cdr cdr) {
        this.a = cdr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dw activity = this.a.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
