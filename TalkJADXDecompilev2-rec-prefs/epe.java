package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.google.android.apps.hangouts.phone.ShortlinkUrlHandlerActivity;

public final class epe implements OnCancelListener {
    final /* synthetic */ ShortlinkUrlHandlerActivity f11973a;

    public epe(ShortlinkUrlHandlerActivity shortlinkUrlHandlerActivity) {
        this.f11973a = shortlinkUrlHandlerActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f11973a.finish();
    }
}
