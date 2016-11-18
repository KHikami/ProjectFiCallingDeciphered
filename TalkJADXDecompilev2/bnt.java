package defpackage;

import android.view.View;
import android.widget.AbsListView.RecyclerListener;
import com.google.android.apps.hangouts.views.MessageListItemView;

final class bnt implements RecyclerListener {
    final /* synthetic */ bns a;

    bnt(bns bns) {
        this.a = bns;
    }

    public void onMovedToScrapHeap(View view) {
        if (view instanceof MessageListItemView) {
            ((MessageListItemView) view).m();
        }
    }
}
