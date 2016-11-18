package defpackage;

import android.view.View;
import android.widget.AbsListView.RecyclerListener;
import com.google.android.apps.hangouts.views.MessageListItemView;

final class cff implements RecyclerListener {
    final /* synthetic */ cdr a;

    cff(cdr cdr) {
        this.a = cdr;
    }

    public void onMovedToScrapHeap(View view) {
        if (view instanceof MessageListItemView) {
            ((MessageListItemView) view).A();
        }
        this.a.bq.remove(view);
    }
}
