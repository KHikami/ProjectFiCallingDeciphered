package defpackage;

import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: cka */
public final class cka {
    static final brb a;
    public static final bqy b;
    private static final bqz c;

    static {
        a = new brb();
        c = new ckb();
        b = new bqy("Feedback.API", c, a);
    }

    public static bri a(brc brc, FeedbackOptions feedbackOptions) {
        return brc.a(new ckc(brc, feedbackOptions));
    }

    public static bri b(brc brc, FeedbackOptions feedbackOptions) {
        return brc.a(new ckd(brc, feedbackOptions));
    }
}
