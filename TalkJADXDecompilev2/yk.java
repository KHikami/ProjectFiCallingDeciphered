package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

abstract class yk implements OnItemClickListener, yn, ys {
    private Rect a;

    public abstract void a(int i);

    public abstract void a(View view);

    public abstract void a(OnDismissListener onDismissListener);

    public abstract void a(xy xyVar);

    public abstract void a(boolean z);

    public abstract void b(int i);

    public abstract void c(int i);

    public abstract void c(boolean z);

    yk() {
    }

    public void a(Rect rect) {
        this.a = rect;
    }

    public Rect g() {
        return this.a;
    }

    public void a(Context context, xy xyVar) {
    }

    public boolean b(yc ycVar) {
        return false;
    }

    public boolean c(yc ycVar) {
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        yk.a(listAdapter).b.a((MenuItem) listAdapter.getItem(i), (yn) this, f() ? 0 : 4);
    }

    protected static int a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        int i4 = 0;
        ViewGroup viewGroup2 = viewGroup;
        while (i2 < count) {
            ViewGroup frameLayout;
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType != i3) {
                i3 = itemViewType;
                view = null;
            }
            if (viewGroup2 == null) {
                frameLayout = new FrameLayout(context);
            } else {
                frameLayout = viewGroup2;
            }
            view = listAdapter.getView(i2, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth <= i4) {
                measuredWidth = i4;
            }
            i2++;
            i4 = measuredWidth;
            viewGroup2 = frameLayout;
        }
        return i4;
    }

    protected static xx a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (xx) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (xx) listAdapter;
    }

    protected static boolean b(xy xyVar) {
        int size = xyVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = xyVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected boolean f() {
        return true;
    }
}
