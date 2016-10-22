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

/* compiled from: PG */
/* renamed from: tg */
abstract class tg implements OnItemClickListener, tj, to {
    Rect e;

    public abstract void a(int i);

    public abstract void a(View view);

    public abstract void a(OnDismissListener onDismissListener);

    public abstract void a(su suVar);

    public abstract void a(boolean z);

    public abstract void b(int i);

    public abstract void c(int i);

    public abstract void c(boolean z);

    tg() {
    }

    public final void a(Context context, su suVar) {
    }

    public final boolean b(sy syVar) {
        return false;
    }

    public final boolean c(sy syVar) {
        return false;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        tg.a(listAdapter).a.a((MenuItem) listAdapter.getItem(i), null, 0);
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

    protected static st a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (st) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (st) listAdapter;
    }

    protected static boolean b(su suVar) {
        int size = suVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = suVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}
