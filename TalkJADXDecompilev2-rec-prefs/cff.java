package p000;

import android.view.View;
import android.widget.AbsListView.RecyclerListener;
import com.google.android.apps.hangouts.views.MessageListItemView;

final class cff implements RecyclerListener {
    final /* synthetic */ cdr f5165a;

    cff(cdr cdr) {
        this.f5165a = cdr;
    }

    public void onMovedToScrapHeap(View view) {
        if (view instanceof MessageListItemView) {
            ((MessageListItemView) view).m9463A();
        }
        this.f5165a.bq.remove(view);
    }
}
