package p000;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.google.android.apps.hangouts.invites.conversationinvitelist.impl.InviteListFragment;

public final class dqv implements OnScrollListener {
    final /* synthetic */ InviteListFragment f10370a;

    public dqv(InviteListFragment inviteListFragment) {
        this.f10370a = inviteListFragment;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (InviteListFragment.f6474a) {
            boolean z = ((dqq) this.f10370a.bH).f10359p;
            boolean l = ((dqq) this.f10370a.bH).m12516l();
            new StringBuilder(103).append("onScroll initialLoadFinished=").append(z).append(" mExhaustedConversationsToLoad=").append(l).append(" mLoadingOlderConversations=").append(((dqq) this.f10370a.bH).m12518n());
        }
        if (((dqq) this.f10370a.bH).f10359p && i + i2 == i3) {
            glk.m17970a("Babel_InviteListFrag", "Checking for more conversations", new Object[0]);
            if (((dqq) this.f10370a.bH).m12515k()) {
                this.f10370a.m8711a(this.f10370a.getView());
            }
        }
        ((dqq) this.f10370a.bH).m12517m();
    }
}
