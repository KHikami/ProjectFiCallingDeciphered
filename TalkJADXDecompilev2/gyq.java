package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;

public final class gyq {
    public static final gtz<Object> a = new gtz("Feedback.API", c, b);
    private static final gue b = new gue((byte) 0);
    private static final guc<hhw, Object> c = new gyr();

    public static gum<Status> a(gui gui, FeedbackOptions feedbackOptions) {
        return gui.a(new gys(gui, feedbackOptions));
    }

    public static gum<Status> b(gui gui, FeedbackOptions feedbackOptions) {
        return gui.a(new gyt(gui, feedbackOptions));
    }
}
