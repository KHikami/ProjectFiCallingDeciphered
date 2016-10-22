package defpackage;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;

/* renamed from: dbb */
public final class dbb implements OnScrollListener {
    final /* synthetic */ ConversationListFragment a;

    public dbb(ConversationListFragment conversationListFragment) {
        this.a = conversationListFragment;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (ConversationListFragment.a) {
            boolean z = this.a.e;
            boolean v = this.a.v();
            new StringBuilder(103).append("onScroll initialLoadFinished=").append(z).append(" mExhaustedConversationsToLoad=").append(v).append(" mLoadingOlderConversations=").append(this.a.u());
        }
        if (this.a.e && i + i2 == i3) {
            glk.a("Babel_ConvListFragment", "Checking for more conversations", new Object[0]);
            if (this.a.r()) {
                this.a.a(this.a.getView());
            }
        }
    }
}
