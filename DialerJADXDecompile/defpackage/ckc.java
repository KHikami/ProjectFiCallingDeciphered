package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: ckc */
final class ckc extends cke {
    private /* synthetic */ FeedbackOptions f;

    ckc(brc brc, FeedbackOptions feedbackOptions) {
        this.f = feedbackOptions;
        super(brc);
    }

    protected final /* synthetic */ void b(bra bra) {
        cne cne = (cne) bra;
        ((cnf) cne.l()).a(cne.a(this.f));
        a(Status.a);
    }
}
