package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class dcm implements OnCancelListener {
    final /* synthetic */ dcl f9515a;

    dcm(dcl dcl) {
        this.f9515a = dcl;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f9515a.finish();
    }
}
