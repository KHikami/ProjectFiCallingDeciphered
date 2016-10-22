package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: dcm */
final class dcm implements OnCancelListener {
    final /* synthetic */ dcl a;

    dcm(dcl dcl) {
        this.a = dcl;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.finish();
    }
}
