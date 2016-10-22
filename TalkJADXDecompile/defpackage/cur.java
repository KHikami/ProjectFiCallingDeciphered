package defpackage;

import android.text.TextUtils;
import com.google.android.apps.hangouts.elane.MainFeedViewController;

/* renamed from: cur */
public final class cur implements ctm {
    final /* synthetic */ MainFeedViewController a;

    public cur(MainFeedViewController mainFeedViewController) {
        this.a = mainFeedViewController;
    }

    public void a() {
    }

    public void a(String str) {
        float f;
        cvo cvo = this.a.b;
        if (TextUtils.equals(str, "localParticipant")) {
            f = 0.1f;
        } else {
            f = 0.4f;
        }
        cvo.a(f);
        this.a.b.a(str, 1);
        this.a.a.a(str);
    }
}
