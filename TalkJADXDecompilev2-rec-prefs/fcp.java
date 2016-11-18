package p000;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;

final class fcp implements OnClickListener {
    final /* synthetic */ Dialog f12702a;

    fcp(Dialog dialog) {
        this.f12702a = dialog;
    }

    public void onClick(View view) {
        this.f12702a.cancel();
    }
}
