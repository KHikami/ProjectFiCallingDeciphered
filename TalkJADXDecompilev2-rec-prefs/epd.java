package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.apps.hangouts.phone.ShortlinkUrlHandlerActivity;

public final class epd implements OnClickListener {
    final /* synthetic */ ShortlinkUrlHandlerActivity f11972a;

    public epd(ShortlinkUrlHandlerActivity shortlinkUrlHandlerActivity) {
        this.f11972a = shortlinkUrlHandlerActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f11972a.finish();
    }
}
