package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: dwc */
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
            case -1:
                this.aj.a();
            default:
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.aj.b();
    }
}
