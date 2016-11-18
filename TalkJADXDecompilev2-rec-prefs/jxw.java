package p000;

import android.util.Log;
import com.google.android.libraries.social.silentfeedback.impl.SilentFeedbackService;

public final class jxw implements ieb {
    final /* synthetic */ SilentFeedbackService f21267a;

    public jxw(SilentFeedbackService silentFeedbackService) {
        this.f21267a = silentFeedbackService;
    }

    public void mo2185a(idr idr) {
        Log.e("SilentFeedbackService", "GoogleApiClient silent feedback connection failed with result: " + idr.mo3157a());
        this.f21267a.m10500a();
    }
}
