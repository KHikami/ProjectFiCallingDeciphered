package p000;

import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import java.util.concurrent.TimeUnit;

public final class daz implements Runnable {
    final /* synthetic */ ConversationListFragment f9443a;

    public daz(ConversationListFragment conversationListFragment) {
        this.f9443a = conversationListFragment;
    }

    public void run() {
        if (this.f9443a.aj == null) {
            ((dbh) this.f9443a.bH).notifyDataSetChanged();
        }
        this.f9443a.ak.postDelayed(this.f9443a.al, TimeUnit.SECONDS.toMillis(60));
    }
}
