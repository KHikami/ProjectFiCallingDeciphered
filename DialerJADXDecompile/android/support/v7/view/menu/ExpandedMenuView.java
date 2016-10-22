package android.support.v7.view.menu;

import aah;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import su;
import sw;
import sy;
import tl;

/* compiled from: PG */
public final class ExpandedMenuView extends ListView implements OnItemClickListener, sw, tl {
    private static final int[] a;
    private su b;

    static {
        a = new int[]{16842964, 16843049};
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        aah a = aah.a(context, attributeSet, a, i, 0);
        if (a.e(0)) {
            setBackgroundDrawable(a.a(0));
        }
        if (a.e(1)) {
            setDivider(a.a(1));
        }
        a.a.recycle();
    }

    public final void a(su suVar) {
        this.b = suVar;
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final boolean a(sy syVar) {
        return this.b.a((MenuItem) syVar, null, 0);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((sy) getAdapter().getItem(i));
    }
}
