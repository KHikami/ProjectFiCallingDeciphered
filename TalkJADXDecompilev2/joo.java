package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public final class joo extends jzl implements OnClickListener {
    private jmo aj;
    private ljp ak;

    protected void f(Bundle bundle) {
        super.f(bundle);
        this.aj = (jmo) this.an.a(jmo.class);
        this.ak = (ljp) this.an.b(ljp.class);
    }

    public Dialog a(Bundle bundle) {
        OnClickListener a;
        if (this.ak != null) {
            a = this.ak.a((OnClickListener) this, "IrrecoverableErrorDialogFragment$onClick");
        } else {
            Object obj = this;
        }
        Builder builder = new Builder(getActivity());
        builder.setTitle(gwb.zv);
        builder.setMessage(gwb.zt);
        builder.setPositiveButton(gwb.zu, a);
        builder.setNegativeButton(17039360, a);
        return builder.create();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.aj.d();
        } else {
            this.aj.c();
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        Object obj;
        if (this.ak != null) {
            this.ak.b("IrrecoverableErrorDialogFragment$onCancel");
            obj = 1;
        } else {
            obj = null;
        }
        try {
            this.aj.c();
        } finally {
            if (obj != null) {
                lkb.b("IrrecoverableErrorDialogFragment$onCancel");
            }
        }
    }
}
