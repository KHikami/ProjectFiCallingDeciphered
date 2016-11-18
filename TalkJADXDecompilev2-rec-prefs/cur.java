package p000;

import android.text.TextUtils;
import com.google.android.apps.hangouts.elane.MainFeedViewController;

public final class cur implements ctm {
    final /* synthetic */ MainFeedViewController f9123a;

    public cur(MainFeedViewController mainFeedViewController) {
        this.f9123a = mainFeedViewController;
    }

    public void mo1418a() {
    }

    public void mo1419a(String str) {
        float f;
        cvo cvo = this.f9123a.f6175b;
        if (TextUtils.equals(str, "localParticipant")) {
            f = 0.1f;
        } else {
            f = 0.4f;
        }
        cvo.m11118a(f);
        this.f9123a.f6175b.m11120a(str, 1);
        this.f9123a.f6174a.m8411a(str);
    }
}
