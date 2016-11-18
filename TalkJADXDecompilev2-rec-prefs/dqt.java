package p000;

import com.google.android.apps.hangouts.invites.conversationinvitelist.impl.InviteListFragment;
import java.util.concurrent.TimeUnit;

public final class dqt implements Runnable {
    final /* synthetic */ InviteListFragment f10368a;

    public dqt(InviteListFragment inviteListFragment) {
        this.f10368a = inviteListFragment;
    }

    public void run() {
        ((dqq) this.f10368a.bH).notifyDataSetChanged();
        this.f10368a.f6476b.postDelayed(this.f10368a.f6480f, TimeUnit.SECONDS.toMillis(60));
    }
}
