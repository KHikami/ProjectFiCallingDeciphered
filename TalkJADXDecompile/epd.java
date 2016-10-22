import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.apps.hangouts.phone.ShortlinkUrlHandlerActivity;

public final class epd implements OnClickListener {
    final /* synthetic */ ShortlinkUrlHandlerActivity a;

    public epd(ShortlinkUrlHandlerActivity shortlinkUrlHandlerActivity) {
        this.a = shortlinkUrlHandlerActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
    }
}
