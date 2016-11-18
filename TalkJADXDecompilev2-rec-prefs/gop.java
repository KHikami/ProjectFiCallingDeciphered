package p000;

import android.view.View;
import android.view.View.OnLongClickListener;

final class gop implements OnLongClickListener {
    final /* synthetic */ gor f15815a;
    final /* synthetic */ gon f15816b;

    gop(gon gon, gor gor) {
        this.f15816b = gon;
        this.f15815a = gor;
    }

    public boolean onLongClick(View view) {
        this.f15815a.m18235a(this.f15816b);
        return true;
    }
}
