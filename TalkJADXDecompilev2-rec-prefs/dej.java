package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class dej implements OnClickListener {
    final /* synthetic */ deh f9558a;

    dej(deh deh) {
        this.f9558a = deh;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f9558a.m7002a();
        ((ded) this.f9558a.getTargetFragment()).getActivity().finish();
    }
}
