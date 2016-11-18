package p000;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;

final class fcq implements OnClickListener {
    final /* synthetic */ Dialog f12703a;

    fcq(Dialog dialog) {
        this.f12703a = dialog;
    }

    public void onClick(View view) {
        this.f12703a.cancel();
    }
}
