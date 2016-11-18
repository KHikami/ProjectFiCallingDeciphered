package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;

final class afb extends BaseAdapter {
    final /* synthetic */ aez f509a;

    afb(aez aez) {
        this.f509a = aez;
    }

    public int getCount() {
        return this.f509a.f499c.getChildCount();
    }

    public Object getItem(int i) {
        return ((afd) this.f509a.f499c.getChildAt(i)).m913a();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            aez aez = this.f509a;
            view = new afd(aez, aez.getContext(), (ts) getItem(i), true);
            view.setBackgroundDrawable(null);
            view.setLayoutParams(new LayoutParams(-1, aez.f502f));
            return view;
        }
        ((afd) view).m914a((ts) getItem(i));
        return view;
    }
}
