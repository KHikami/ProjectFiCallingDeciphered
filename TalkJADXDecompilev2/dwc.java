package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

public final class dwc extends jxy {
    private dwd aj;

    protected void f(Bundle bundle) {
        super.f(bundle);
        this.aj = (dwd) this.an.a(dwd.class);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case -2:
                this.aj.b();
                return;
            case -1:
                this.aj.a();
                return;
            default:
                return;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.aj.b();
    }
}