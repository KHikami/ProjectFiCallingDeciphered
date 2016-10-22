package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.invites.conversationinvitelist.impl.InviteItemView;
import com.google.android.apps.hangouts.invites.conversationinvitelist.impl.InviteListFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: dqn */
public final class dqn implements OnClickListener {
    final /* synthetic */ InviteListFragment a;
    final /* synthetic */ InviteItemView b;

    public dqn(InviteItemView inviteItemView, InviteListFragment inviteListFragment) {
        this.b = inviteItemView;
        this.a = inviteListFragment;
    }

    public void onClick(View view) {
        RealTimeChatService.a(this.b.k, this.b.e, true, false, false);
        this.a.e.a(this.b.e);
        this.a.a(1551);
    }
}
