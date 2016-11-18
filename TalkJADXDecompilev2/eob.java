package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.apps.hangouts.phone.HangoutUrlHandlerActivity;

public final class eob implements OnClickListener {
    final /* synthetic */ HangoutUrlHandlerActivity a;

    public eob(HangoutUrlHandlerActivity hangoutUrlHandlerActivity) {
        this.a = hangoutUrlHandlerActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
    }
}
