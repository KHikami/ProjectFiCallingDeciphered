import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.google.android.apps.hangouts.invites.conversationinvitelist.impl.InviteListFragment;

public final class dqv implements OnScrollListener {
    final /* synthetic */ InviteListFragment a;

    public dqv(InviteListFragment inviteListFragment) {
        this.a = inviteListFragment;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (InviteListFragment.a) {
            boolean z = ((dqq) this.a.bH).p;
            boolean l = ((dqq) this.a.bH).l();
            new StringBuilder(103).append("onScroll initialLoadFinished=").append(z).append(" mExhaustedConversationsToLoad=").append(l).append(" mLoadingOlderConversations=").append(((dqq) this.a.bH).n());
        }
        if (((dqq) this.a.bH).p && i + i2 == i3) {
            glk.a("Babel_InviteListFrag", "Checking for more conversations", new Object[0]);
            if (((dqq) this.a.bH).k()) {
                this.a.a(this.a.getView());
            }
        }
        ((dqq) this.a.bH).m();
    }
}
