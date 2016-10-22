package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.android.incallui.spam.SpamNotificationActivity;

/* compiled from: PG */
/* renamed from: bfg */
final class bfg implements OnClickListener {
    private /* synthetic */ String a;
    private /* synthetic */ bfe b;

    bfg(bfe bfe, String str) {
        this.b = bfe;
        this.a = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.W = true;
        this.b.a(false);
        db dbVar = this.b;
        Intent a = SpamNotificationActivity.a(this.a);
        if (dbVar.u == null) {
            throw new IllegalStateException("Fragment " + dbVar + " not attached to Activity");
        }
        dbVar.u.a(dbVar, a, -1, null);
    }
}
