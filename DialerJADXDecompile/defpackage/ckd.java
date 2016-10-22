package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: ckd */
final class ckd extends cke {
    private /* synthetic */ FeedbackOptions f;

    ckd(brc brc, FeedbackOptions feedbackOptions) {
        this.f = feedbackOptions;
        super(brc);
    }

    protected final /* synthetic */ void b(bra bra) {
        cne cne = (cne) bra;
        ((cnf) cne.l()).b(cne.a(this.f));
        a(Status.a);
    }
}
