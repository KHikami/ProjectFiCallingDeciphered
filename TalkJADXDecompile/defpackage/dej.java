package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: dej */
final class dej implements OnClickListener {
    final /* synthetic */ deh a;

    dej(deh deh) {
        this.a = deh;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.a();
        ((ded) this.a.getTargetFragment()).getActivity().finish();
    }
}
