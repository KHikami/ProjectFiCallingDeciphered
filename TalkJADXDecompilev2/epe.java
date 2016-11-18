package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.google.android.apps.hangouts.phone.ShortlinkUrlHandlerActivity;

public final class epe implements OnCancelListener {
    final /* synthetic */ ShortlinkUrlHandlerActivity a;

    public epe(ShortlinkUrlHandlerActivity shortlinkUrlHandlerActivity) {
        this.a = shortlinkUrlHandlerActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.finish();
    }
}
