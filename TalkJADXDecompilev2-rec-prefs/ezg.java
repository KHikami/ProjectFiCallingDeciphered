package p000;

import android.net.Uri;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ezg extends evz {
    private static final long serialVersionUID = 1;
    private final String f12539g;
    private final long f12540h;
    private final boolean f12541i;

    public ezg(Uri uri, long j, boolean z) {
        this.f12539g = uri != null ? uri.toString() : null;
        this.f12540h = j;
        this.f12541i = z;
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        RealTimeChatService.m9011a(this.f12539g != null ? Uri.parse(this.f12539g) : null, -1, this.f12540h, this.f12541i);
    }
}
