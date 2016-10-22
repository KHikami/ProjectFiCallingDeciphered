package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: ckp */
final class ckp extends aee {
    private final int a;

    public ckp(int i) {
        this.a = i;
    }

    public void a(Rect rect, View view, RecyclerView recyclerView, aep aep) {
        rect.left = this.a;
        if (recyclerView.e(view) == 0) {
            rect.left = 0;
        }
    }
}
