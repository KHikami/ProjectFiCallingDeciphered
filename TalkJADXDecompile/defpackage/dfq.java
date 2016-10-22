package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: dfq */
public final class dfq extends dq {
    private Dialog aj;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            a();
        }
    }

    public static dfq b(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("error_code", i);
        bundle.putInt("request_code", i2);
        dfq dfq = new dfq();
        dfq.setArguments(bundle);
        return dfq;
    }

    public Dialog a(Bundle bundle) {
        this.aj = gtt.a(getArguments().getInt("error_code"), getActivity(), getArguments().getInt("request_code"));
        return this.aj;
    }

    public void onCancel(DialogInterface dialogInterface) {
        a();
        getActivity().finish();
    }

    public void onActivityCreated(Bundle bundle) {
        if (this.aj == null) {
            c(false);
        }
        super.onActivityCreated(bundle);
    }
}
