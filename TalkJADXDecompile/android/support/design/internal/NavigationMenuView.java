package android.support.design.internal;

import acx;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import xy;
import yp;

public class NavigationMenuView extends RecyclerView implements yp {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(new acx(1, false));
    }

    public void a(xy xyVar) {
    }
}
