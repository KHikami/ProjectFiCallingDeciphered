package p000;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

final class ub {
    public Method f35193a;
    public Method f35194b;
    public ImageView f35195c;

    ub(Activity activity) {
        try {
            this.f35193a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
            this.f35194b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
        } catch (NoSuchMethodException e) {
            View findViewById = activity.findViewById(16908332);
            if (findViewById != null) {
                ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                if (viewGroup.getChildCount() == 2) {
                    View childAt = viewGroup.getChildAt(0);
                    findViewById = viewGroup.getChildAt(1);
                    if (childAt.getId() != 16908332) {
                        findViewById = childAt;
                    }
                    if (findViewById instanceof ImageView) {
                        this.f35195c = (ImageView) findViewById;
                    }
                }
            }
        }
    }
}
