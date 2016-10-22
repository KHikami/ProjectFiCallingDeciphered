package defpackage;

import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import java.util.concurrent.TimeUnit;

/* renamed from: daz */
public final class daz implements Runnable {
    final /* synthetic */ ConversationListFragment a;

    public daz(ConversationListFragment conversationListFragment) {
        this.a = conversationListFragment;
    }

    public void run() {
        if (this.a.aj == null) {
            ((dbh) this.a.bH).notifyDataSetChanged();
        }
        this.a.ak.postDelayed(this.a.al, TimeUnit.SECONDS.toMillis(60));
    }
}
