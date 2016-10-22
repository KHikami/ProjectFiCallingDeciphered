package defpackage;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

/* renamed from: czf */
public final class czf extends dq {
    private OnCancelListener aj;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getParentFragment() == null) {
            setRetainInstance(true);
        }
    }

    public Dialog a(Bundle bundle) {
        Dialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage(getArguments().getString("message"));
        progressDialog.setProgressStyle(0);
        return progressDialog;
    }

    public void onDestroyView() {
        if (c() != null && getRetainInstance()) {
            c().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.aj != null) {
            this.aj.onCancel(dialogInterface);
        }
    }

    public void a(OnCancelListener onCancelListener) {
        this.aj = onCancelListener;
    }
}
