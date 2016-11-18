package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.google.android.apps.hangouts.phone.HangoutUrlHandlerActivity;

public final class eoc implements OnCancelListener {
    final /* synthetic */ HangoutUrlHandlerActivity f11915a;

    public eoc(HangoutUrlHandlerActivity hangoutUrlHandlerActivity) {
        this.f11915a = hangoutUrlHandlerActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f11915a.finish();
    }
}
