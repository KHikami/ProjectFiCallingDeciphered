package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.incallui.spam.SpamNotificationActivity;

/* compiled from: PG */
/* renamed from: bfk */
final class bfk implements OnClickListener {
    private /* synthetic */ SpamNotificationActivity a;
    private /* synthetic */ String b;
    private /* synthetic */ bfi c;

    bfk(bfi bfi, SpamNotificationActivity spamNotificationActivity, String str) {
        this.c = bfi;
        this.a = spamNotificationActivity;
        this.b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.c.W = true;
        this.c.a(false);
        this.a.c(this.b);
    }
}
