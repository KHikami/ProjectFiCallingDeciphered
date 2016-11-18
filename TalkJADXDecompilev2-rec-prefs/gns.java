package p000;

import com.google.android.apps.hangouts.fragments.ConversationListFragment.InviteListItem;
import com.google.android.apps.hangouts.views.ConversationListItemWrapper;

public final class gns implements Runnable {
    final /* synthetic */ ConversationListItemWrapper f15742a;

    public gns(ConversationListItemWrapper conversationListItemWrapper) {
        this.f15742a = conversationListItemWrapper;
    }

    public void run() {
        if (this.f15742a.f6942a instanceof gmt) {
            ((gmt) this.f15742a.f6942a).m9250a();
        } else if (this.f15742a.f6942a instanceof InviteListItem) {
            ((InviteListItem) this.f15742a.f6942a).m8481a();
        }
    }
}
