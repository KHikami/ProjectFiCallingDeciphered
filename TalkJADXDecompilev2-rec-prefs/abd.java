package p000;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class abd implements OnGlobalLayoutListener {
    final /* synthetic */ abb f143a;

    abd(abb abb) {
        this.f143a = abb;
    }

    public void onGlobalLayout() {
        Object obj;
        abb abb = this.f143a;
        View view = this.f143a.f139c;
        if (oa.s(view) && view.getGlobalVisibleRect(abb.f138b)) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            this.f143a.m154c();
            return;
        }
        this.f143a.m177f();
        super.mo14a();
    }
}
