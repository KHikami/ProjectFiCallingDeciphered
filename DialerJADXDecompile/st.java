import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* compiled from: PG */
public final class st extends BaseAdapter {
    private static int c;
    public su a;
    boolean b;
    private int d;
    private final boolean e;
    private final LayoutInflater f;

    public final /* synthetic */ Object getItem(int i) {
        return a(i);
    }

    static {
        c = buf.bV;
    }

    public st(su suVar, LayoutInflater layoutInflater, boolean z) {
        this.d = -1;
        this.e = z;
        this.f = layoutInflater;
        this.a = suVar;
        a();
    }

    public final int getCount() {
        ArrayList j = this.e ? this.a.j() : this.a.h();
        if (this.d < 0) {
            return j.size();
        }
        return j.size() - 1;
    }

    public final sy a(int i) {
        ArrayList j = this.e ? this.a.j() : this.a.h();
        if (this.d >= 0 && i >= this.d) {
            i++;
        }
        return (sy) j.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        if (view == null) {
            inflate = this.f.inflate(c, viewGroup, false);
        } else {
            inflate = view;
        }
        tm tmVar = (tm) inflate;
        if (this.b) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) inflate;
            listMenuItemView.c = true;
            listMenuItemView.b = true;
        }
        tmVar.a(a(i), 0);
        return inflate;
    }

    private void a() {
        sy syVar = this.a.i;
        if (syVar != null) {
            ArrayList j = this.a.j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (((sy) j.get(i)) == syVar) {
                    this.d = i;
                    return;
                }
            }
        }
        this.d = -1;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
