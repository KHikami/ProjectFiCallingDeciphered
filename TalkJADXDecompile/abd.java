import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class abd implements OnGlobalLayoutListener {
    final /* synthetic */ abb a;

    abd(abb abb) {
        this.a = abb;
    }

    public void onGlobalLayout() {
        Object obj;
        abb abb = this.a;
        View view = this.a.c;
        if (oa.s(view) && view.getGlobalVisibleRect(abb.b)) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            this.a.c();
            return;
        }
        this.a.f();
        super.a();
    }
}
