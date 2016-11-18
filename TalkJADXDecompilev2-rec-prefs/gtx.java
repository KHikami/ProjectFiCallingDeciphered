package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

public final class gtx extends dq {
    Dialog aj = null;
    OnCancelListener ak = null;

    public Dialog mo792a(Bundle bundle) {
        if (this.aj == null) {
            m7010c(false);
        }
        return this.aj;
    }

    public void mo2341a(ed edVar, String str) {
        super.mo2341a(edVar, str);
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.ak != null) {
            this.ak.onCancel(dialogInterface);
        }
    }
}
