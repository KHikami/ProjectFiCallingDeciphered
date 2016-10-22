import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public final class jor extends jzl implements OnClickListener {
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
            a = this.ak.a((OnClickListener) this, "NetworkErrorDialogFragment$onClick");
        } else {
            Object obj = this;
        }
        Builder builder = new Builder(getActivity());
        builder.setTitle(gwb.zw);
        builder.setMessage(gwb.zs);
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
            this.ak.b("NetworkErrorDialogFragment$onCancel");
            obj = 1;
        } else {
            obj = null;
        }
        try {
            this.aj.c();
            if (obj != null) {
                lkb.b("NetworkErrorDialogFragment$onCancel");
            }
        } catch (Throwable th) {
            if (obj != null) {
                lkb.b("NetworkErrorDialogFragment$onCancel");
            }
        }
    }
}
