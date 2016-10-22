import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import java.util.Comparator;

public final class m implements Comparator {
    private /* synthetic */ CoordinatorLayout a;

    public m(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view != view2) {
            if (((p) view.getLayoutParams()).a(this.a, view, view2)) {
                return 1;
            }
            if (((p) view2.getLayoutParams()).a(this.a, view2, view)) {
                return -1;
            }
        }
        return 0;
    }
}
