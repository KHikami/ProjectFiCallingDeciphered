package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.incallui.spam.SpamNotificationActivity;

/* compiled from: PG */
/* renamed from: bff */
final class bff implements OnClickListener {
    private /* synthetic */ SpamNotificationActivity a;
    private /* synthetic */ String b;
    private /* synthetic */ bfe c;

    bff(bfe bfe, SpamNotificationActivity spamNotificationActivity, String str) {
        this.c = bfe;
        this.a = spamNotificationActivity;
        this.b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.c.W = true;
        this.c.a(false);
        this.a.d(this.b);
    }
}
