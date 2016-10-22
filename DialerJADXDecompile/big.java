import android.os.Bundle;
import com.google.android.apps.dialer.extensions.GoogleDialtactsActivity;
import com.google.android.gms.feedback.FeedbackOptions;

/* compiled from: PG */
public final class big implements brf {
    private FeedbackOptions a;
    private /* synthetic */ GoogleDialtactsActivity b;

    public big(GoogleDialtactsActivity googleDialtactsActivity, FeedbackOptions feedbackOptions) {
        this.b = googleDialtactsActivity;
        this.a = feedbackOptions;
    }

    public final void a(Bundle bundle) {
        cka.a(this.b.v, this.a);
        this.b.v.c();
    }

    public final void a(int i) {
    }
}
