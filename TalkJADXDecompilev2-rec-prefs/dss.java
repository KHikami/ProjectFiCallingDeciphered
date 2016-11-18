package p000;

import android.view.View;
import android.view.View.OnClickListener;

final class dss implements OnClickListener {
    final /* synthetic */ dso f10470a;

    dss(dso dso) {
        this.f10470a = dso;
    }

    public void onClick(View view) {
        if (this.f10470a.m7009c() != null) {
            this.f10470a.m7009c().dismiss();
        }
    }
}
