import android.util.Log;
import com.google.android.libraries.social.silentfeedback.impl.SilentFeedbackService;

public final class jxw implements ieb {
    final /* synthetic */ SilentFeedbackService a;

    public jxw(SilentFeedbackService silentFeedbackService) {
        this.a = silentFeedbackService;
    }

    public void a(idr idr) {
        Log.e("SilentFeedbackService", "GoogleApiClient silent feedback connection failed with result: " + idr.a());
        this.a.a();
    }
}
