package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: cig */
final class cig implements OnClickListener {
    final /* synthetic */ cid a;

    cig(cid cid) {
        this.a = cid;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.h.finish();
    }
}
