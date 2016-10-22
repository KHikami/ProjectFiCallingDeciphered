import android.net.Uri;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ezg extends evz {
    private static final long serialVersionUID = 1;
    private final String g;
    private final long h;
    private final boolean i;

    public ezg(Uri uri, long j, boolean z) {
        this.g = uri != null ? uri.toString() : null;
        this.h = j;
        this.i = z;
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        RealTimeChatService.a(this.g != null ? Uri.parse(this.g) : null, -1, this.h, this.i);
    }
}
