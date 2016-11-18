package defpackage;

import com.google.android.apps.hangouts.fragments.ConversationListFragment.InviteListItem;
import com.google.android.apps.hangouts.views.ConversationListItemWrapper;

public final class gns implements Runnable {
    final /* synthetic */ ConversationListItemWrapper a;

    public gns(ConversationListItemWrapper conversationListItemWrapper) {
        this.a = conversationListItemWrapper;
    }

    public void run() {
        if (this.a.a instanceof gmt) {
            ((gmt) this.a.a).a();
        } else if (this.a.a instanceof InviteListItem) {
            ((InviteListItem) this.a.a).a();
        }
    }
}
