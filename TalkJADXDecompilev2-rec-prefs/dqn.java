package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.invites.conversationinvitelist.impl.InviteItemView;
import com.google.android.apps.hangouts.invites.conversationinvitelist.impl.InviteListFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dqn implements OnClickListener {
    final /* synthetic */ InviteListFragment f10345a;
    final /* synthetic */ InviteItemView f10346b;

    public dqn(InviteItemView inviteItemView, InviteListFragment inviteListFragment) {
        this.f10346b = inviteItemView;
        this.f10345a = inviteListFragment;
    }

    public void onClick(View view) {
        RealTimeChatService.m9003a(this.f10346b.f6469k, this.f10346b.f6463e, true, false, false);
        this.f10345a.f6479e.mo1122a(this.f10346b.f6463e);
        this.f10345a.m8710a(1551);
    }
}
