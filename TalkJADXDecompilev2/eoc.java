package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.google.android.apps.hangouts.phone.HangoutUrlHandlerActivity;

public final class eoc implements OnCancelListener {
    final /* synthetic */ HangoutUrlHandlerActivity a;

    public eoc(HangoutUrlHandlerActivity hangoutUrlHandlerActivity) {
        this.a = hangoutUrlHandlerActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.finish();
    }
}
