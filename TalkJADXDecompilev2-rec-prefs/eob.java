package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.apps.hangouts.phone.HangoutUrlHandlerActivity;

public final class eob implements OnClickListener {
    final /* synthetic */ HangoutUrlHandlerActivity f11914a;

    public eob(HangoutUrlHandlerActivity hangoutUrlHandlerActivity) {
        this.f11914a = hangoutUrlHandlerActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f11914a.finish();
    }
}
