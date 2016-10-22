import android.view.View;
import android.widget.AbsListView.RecyclerListener;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.apps.hangouts.views.ConversationListItemView;
import com.google.android.apps.hangouts.views.ConversationListItemWrapper;

public final class dbc implements RecyclerListener {
    final /* synthetic */ ConversationListFragment a;

    public dbc(ConversationListFragment conversationListFragment) {
        this.a = conversationListFragment;
    }

    public void onMovedToScrapHeap(View view) {
        if (view instanceof ConversationListItemWrapper) {
            View e = ((ConversationListItemWrapper) view).e();
            if (e instanceof ConversationListItemView) {
                ((ConversationListItemView) e).t();
            }
        }
    }
}
