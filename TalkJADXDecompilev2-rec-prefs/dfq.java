package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class dfq extends dq {
    private Dialog aj;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            m7002a();
        }
    }

    public static dfq m11616b(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("error_code", i);
        bundle.putInt("request_code", i2);
        dfq dfq = new dfq();
        dfq.setArguments(bundle);
        return dfq;
    }

    public Dialog mo792a(Bundle bundle) {
        this.aj = gtt.m18580a(getArguments().getInt("error_code"), getActivity(), getArguments().getInt("request_code"));
        return this.aj;
    }

    public void onCancel(DialogInterface dialogInterface) {
        m7002a();
        getActivity().finish();
    }

    public void onActivityCreated(Bundle bundle) {
        if (this.aj == null) {
            m7010c(false);
        }
        super.onActivityCreated(bundle);
    }
}
