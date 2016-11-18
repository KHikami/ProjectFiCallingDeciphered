package p000;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

final class ckp extends aee {
    private final int f5527a;

    public ckp(int i) {
        this.f5527a = i;
    }

    public void mo752a(Rect rect, View view, RecyclerView recyclerView, aep aep) {
        rect.left = this.f5527a;
        if (recyclerView.m3081e(view) == 0) {
            rect.left = 0;
        }
    }
}
