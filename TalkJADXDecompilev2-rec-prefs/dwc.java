package p000;

import android.content.DialogInterface;
import android.os.Bundle;

public final class dwc extends jxy {
    private dwd aj;

    protected void mo973f(Bundle bundle) {
        super.mo973f(bundle);
        this.aj = (dwd) this.an.m25443a(dwd.class);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case -2:
                this.aj.mo1737b();
                return;
            case -1:
                this.aj.mo495a();
                return;
            default:
                return;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.aj.mo1737b();
    }
}
