import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.quickreply.impl.QuickReplyActivity;

public final class fcc implements OnClickListener {
    final /* synthetic */ QuickReplyActivity a;

    public fcc(QuickReplyActivity quickReplyActivity) {
        this.a = quickReplyActivity;
    }

    public void onClick(View view) {
        this.a.finish();
        QuickReplyActivity quickReplyActivity = this.a;
        if (quickReplyActivity.u == 1) {
            quickReplyActivity.n.a(new fko(quickReplyActivity.r, quickReplyActivity.s, 3));
        }
    }
}
