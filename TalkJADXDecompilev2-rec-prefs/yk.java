package p000;

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
    private Rect f35707a;

    public abstract void mo4518a(int i);

    public abstract void mo4519a(View view);

    public abstract void mo4520a(OnDismissListener onDismissListener);

    public abstract void mo4521a(xy xyVar);

    public abstract void mo4522a(boolean z);

    public abstract void mo4523b(int i);

    public abstract void mo4525c(int i);

    public abstract void mo4526c(boolean z);

    yk() {
    }

    public void m41349a(Rect rect) {
        this.f35707a = rect;
    }

    public Rect m41360g() {
        return this.f35707a;
    }

    public void mo4509a(Context context, xy xyVar) {
    }

    public boolean mo4515b(yc ycVar) {
        return false;
    }

    public boolean mo4516c(yc ycVar) {
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        yk.m41345a(listAdapter).f35754b.m41419a((MenuItem) listAdapter.getItem(i), (yn) this, mo4529f() ? 0 : 4);
    }

    protected static int m41344a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
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

    protected static xx m41345a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (xx) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (xx) listAdapter;
    }

    protected static boolean m41346b(xy xyVar) {
        int size = xyVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = xyVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected boolean mo4529f() {
        return true;
    }
}
