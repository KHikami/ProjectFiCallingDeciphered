package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

final class ggw implements OnClickListener {
    final /* synthetic */ ggu a;

    ggw(ggu ggu) {
        this.a = ggu;
    }

    public void onClick(View view) {
        int i;
        ggu ggu = this.a;
        int b = ggu.b(ggu.getView());
        if (b != -1) {
            i = ggu.b[b];
        } else {
            i = -1;
        }
        this.a.a.a(i);
        ((ggy) ((ghp) this.a.getActivity()).g()).a(fde.e(i));
    }
}
