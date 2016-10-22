import com.google.android.apps.hangouts.invites.conversationinvitelist.impl.InviteListFragment;
import java.util.concurrent.TimeUnit;

public final class dqt implements Runnable {
    final /* synthetic */ InviteListFragment a;

    public dqt(InviteListFragment inviteListFragment) {
        this.a = inviteListFragment;
    }

    public void run() {
        ((dqq) this.a.bH).notifyDataSetChanged();
        this.a.b.postDelayed(this.a.f, TimeUnit.SECONDS.toMillis(60));
    }
}
