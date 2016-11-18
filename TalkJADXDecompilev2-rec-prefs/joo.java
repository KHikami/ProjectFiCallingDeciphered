package p000;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public final class joo extends jzl implements OnClickListener {
    private jmo aj;
    private ljp ak;

    protected void mo973f(Bundle bundle) {
        super.mo973f(bundle);
        this.aj = (jmo) this.an.m25443a(jmo.class);
        this.ak = (ljp) this.an.m25454b(ljp.class);
    }

    public Dialog mo792a(Bundle bundle) {
        OnClickListener a;
        if (this.ak != null) {
            a = this.ak.m29180a((OnClickListener) this, "IrrecoverableErrorDialogFragment$onClick");
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
            this.aj.mo3570d();
        } else {
            this.aj.mo3569c();
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        Object obj;
        if (this.ak != null) {
            this.ak.m29183b("IrrecoverableErrorDialogFragment$onCancel");
            obj = 1;
        } else {
            obj = null;
        }
        try {
            this.aj.mo3569c();
        } finally {
            if (obj != null) {
                lkb.m29210b("IrrecoverableErrorDialogFragment$onCancel");
            }
        }
    }
}
