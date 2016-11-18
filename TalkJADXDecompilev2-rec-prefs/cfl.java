package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class cfl implements OnClickListener {
    final /* synthetic */ cdr f5183a;

    cfl(cdr cdr) {
        this.f5183a = cdr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dw activity = this.f5183a.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
