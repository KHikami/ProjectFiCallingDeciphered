package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: gyq */
public final class gyq {
    public static final gtz<Object> a;
    private static final gue b;
    private static final guc<hhw, Object> c;

    static {
        b = new gue((byte) 0);
        c = new gyr();
        a = new gtz("Feedback.API", c, b);
    }

    public static gum<Status> a(gui gui, FeedbackOptions feedbackOptions) {
        return gui.a(new gys(gui, feedbackOptions));
    }

    public static gum<Status> b(gui gui, FeedbackOptions feedbackOptions) {
        return gui.a(new gyt(gui, feedbackOptions));
    }
}
