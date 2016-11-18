package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;

final class afb extends BaseAdapter {
    final /* synthetic */ aez a;

    afb(aez aez) {
        this.a = aez;
    }

    public int getCount() {
        return this.a.c.getChildCount();
    }

    public Object getItem(int i) {
        return ((afd) this.a.c.getChildAt(i)).a();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            aez aez = this.a;
            view = new afd(aez, aez.getContext(), (ts) getItem(i), true);
            view.setBackgroundDrawable(null);
            view.setLayoutParams(new LayoutParams(-1, aez.f));
            return view;
        }
        ((afd) view).a((ts) getItem(i));
        return view;
    }
}
