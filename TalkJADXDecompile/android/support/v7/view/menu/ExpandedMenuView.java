package android.support.v7.view.menu;

import afp;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import xy;
import ya;
import yc;
import yp;

public final class ExpandedMenuView extends ListView implements OnItemClickListener, ya, yp {
    private static final int[] a;
    private xy b;

    static {
        a = new int[]{16842964, 16843049};
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        afp a = afp.a(context, attributeSet, a, i, 0);
        if (a.g(0)) {
            setBackgroundDrawable(a.a(0));
        }
        if (a.g(1)) {
            setDivider(a.a(1));
        }
        a.a();
    }

    public void a(xy xyVar) {
        this.b = xyVar;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public boolean a(yc ycVar) {
        return this.b.a(ycVar, 0);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((yc) getAdapter().getItem(i));
    }
}
