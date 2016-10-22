import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;

/* compiled from: PG */
final class zu extends BaseAdapter {
    private /* synthetic */ zs a;

    zu(zs zsVar) {
        this.a = zsVar;
    }

    public final int getCount() {
        zs zsVar = this.a;
        xp xpVar = null;
        return xpVar.getChildCount();
    }

    public final Object getItem(int i) {
        zs zsVar = this.a;
        xp xpVar = null;
        return ((zw) xpVar.getChildAt(i)).a;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            zs zsVar = this.a;
            view = new zw(zsVar, zsVar.getContext(), (pn) getItem(i), true);
            view.setBackgroundDrawable(null);
            view.setLayoutParams(new LayoutParams(-1, zsVar.e));
            return view;
        }
        zw zwVar = (zw) view;
        zwVar.a = (pn) getItem(i);
        zwVar.a();
        return view;
    }
}
