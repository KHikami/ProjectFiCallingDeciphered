package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: ifr */
public final class ifr implements ifk {
    private FeedbackOptions a;

    ifr(FeedbackOptions feedbackOptions) {
        this.a = feedbackOptions;
    }

    public Bitmap a() {
        return this.a.g().a();
    }

    public FeedbackOptions b() {
        return this.a;
    }
}
