package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: cif */
final class cif implements OnClickListener {
    final /* synthetic */ cid a;

    cif(cid cid) {
        this.a = cid;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.h.finish();
    }
}
