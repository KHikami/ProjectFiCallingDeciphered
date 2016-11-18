package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

public final class gtx extends dq {
    Dialog aj = null;
    OnCancelListener ak = null;

    public Dialog a(Bundle bundle) {
        if (this.aj == null) {
            c(false);
        }
        return this.aj;
    }

    public void a(ed edVar, String str) {
        super.a(edVar, str);
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.ak != null) {
            this.ak.onCancel(dialogInterface);
        }
    }
}
