import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.incallui.spam.SpamNotificationActivity;

/* compiled from: PG */
final class bfj implements OnClickListener {
    private /* synthetic */ SpamNotificationActivity a;
    private /* synthetic */ String b;
    private /* synthetic */ bfi c;

    bfj(bfi bfi, SpamNotificationActivity spamNotificationActivity, String str) {
        this.c = bfi;
        this.a = spamNotificationActivity;
        this.b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.c.W = true;
        this.c.a(false);
        this.a.d(this.b);
    }
}
