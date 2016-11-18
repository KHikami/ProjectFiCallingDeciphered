package p000;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;

public final class dbb implements OnScrollListener {
    final /* synthetic */ ConversationListFragment f9446a;

    public dbb(ConversationListFragment conversationListFragment) {
        this.f9446a = conversationListFragment;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (ConversationListFragment.f6255a) {
            boolean z = this.f9446a.f6259e;
            boolean v = this.f9446a.m8513v();
            new StringBuilder(103).append("onScroll initialLoadFinished=").append(z).append(" mExhaustedConversationsToLoad=").append(v).append(" mLoadingOlderConversations=").append(this.f9446a.m8512u());
        }
        if (this.f9446a.f6259e && i + i2 == i3) {
            glk.m17970a("Babel_ConvListFragment", "Checking for more conversations", new Object[0]);
            if (this.f9446a.m8509r()) {
                this.f9446a.m8492a(this.f9446a.getView());
            }
        }
    }
}
