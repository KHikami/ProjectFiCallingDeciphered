import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.android.incallui.spam.SpamNotificationActivity;

/* compiled from: PG */
public final class bfa implements OnDismissListener {
    private /* synthetic */ SpamNotificationActivity a;

    public bfa(SpamNotificationActivity spamNotificationActivity) {
        this.a = spamNotificationActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.a.isFinishing()) {
            this.a.finish();
        }
    }
}
