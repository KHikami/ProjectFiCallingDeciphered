package p000;

import android.view.View;
import android.widget.AbsListView.RecyclerListener;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.apps.hangouts.views.ConversationListItemView;
import com.google.android.apps.hangouts.views.ConversationListItemWrapper;

public final class dbc implements RecyclerListener {
    final /* synthetic */ ConversationListFragment f9447a;

    public dbc(ConversationListFragment conversationListFragment) {
        this.f9447a = conversationListFragment;
    }

    public void onMovedToScrapHeap(View view) {
        if (view instanceof ConversationListItemWrapper) {
            View e = ((ConversationListItemWrapper) view).m9372e();
            if (e instanceof ConversationListItemView) {
                ((ConversationListItemView) e).m9317t();
            }
        }
    }
}
