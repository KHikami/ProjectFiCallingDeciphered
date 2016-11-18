package p000;

import android.view.View;
import android.view.View.OnClickListener;

final class ggw implements OnClickListener {
    final /* synthetic */ ggu f15258a;

    ggw(ggu ggu) {
        this.f15258a = ggu;
    }

    public void onClick(View view) {
        int i;
        ggu ggu = this.f15258a;
        int b = ggu.m17681b(ggu.getView());
        if (b != -1) {
            i = ggu.f15256b[b];
        } else {
            i = -1;
        }
        this.f15258a.f15255a.m17613a(i);
        ((ggy) ((ghp) this.f15258a.getActivity()).mo1056g()).mo2239a(fde.m15018e(i));
    }
}
