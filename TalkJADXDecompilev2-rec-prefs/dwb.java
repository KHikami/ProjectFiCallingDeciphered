package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public final class dwb extends jxy {
    private jmo aj;

    static void m12897a(Context context, ed edVar, int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("title", context.getString(i));
        bundle.putString("message", context.getString(i2));
        bundle.putString("positive", context.getString(bc.hW));
        bundle.putString("negative", context.getString(bc.hX));
        dwb dwb = new dwb();
        dwb.setArguments(bundle);
        dwb.mo2341a(edVar, "error");
    }

    protected void mo973f(Bundle bundle) {
        super.mo973f(bundle);
        this.aj = (jmo) this.an.m25443a(jmo.class);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case -2:
                this.aj.mo3569c();
                return;
            case -1:
                this.aj.mo3567b();
                return;
            default:
                return;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.aj.mo3569c();
    }
}
