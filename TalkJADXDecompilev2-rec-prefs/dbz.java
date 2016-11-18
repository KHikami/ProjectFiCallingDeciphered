package p000;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public abstract class dbz extends BaseAdapter {
    private final gjs f9482a;
    private final Resources f9483b;
    private final LayoutParams f9484c;
    private final String f9485d;
    private gjw[] f9486e;

    public dbz(Resources resources, gjs gjs) {
        this.f9483b = resources;
        this.f9485d = resources.getResourcePackageName(gwb.cT);
        this.f9482a = gjs;
        int dimensionPixelSize = resources.getDimensionPixelSize(gwb.eK) + (resources.getDimensionPixelSize(gwb.eJ) * 2);
        this.f9484c = new LayoutParams(dimensionPixelSize, dimensionPixelSize);
    }

    public Object getItem(int i) {
        if (i < 0 || i >= getCount()) {
            return Integer.valueOf(8194);
        }
        return Integer.valueOf((int) getItemId(i));
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    public boolean isEnabled(int i) {
        return i < getCount();
    }

    public void m11425a() {
        if (this.f9486e != null) {
            for (int i = 0; i < this.f9486e.length; i++) {
                if (this.f9486e[i] != null) {
                    this.f9486e[i].cancel(true);
                }
            }
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int dimensionPixelSize;
        if (view == null) {
            view = new ImageView(viewGroup.getContext());
            view.setLayoutParams(this.f9484c);
            dimensionPixelSize = this.f9483b.getDimensionPixelSize(gwb.eJ);
            view.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        } else {
            ImageView imageView = (ImageView) view;
            imageView.setImageDrawable(null);
        }
        int i2 = i / 21;
        m11424a(i2);
        dimensionPixelSize = this.f9483b.getIdentifier(String.format("spoken_emoji_%04X", new Object[]{Integer.valueOf(gwb.m1507a((Integer) getItem(i)))}), "string", this.f9485d);
        Resources resources = this.f9483b;
        if (dimensionPixelSize == 0) {
            dimensionPixelSize = gwb.cT;
        }
        view.setContentDescription(resources.getString(dimensionPixelSize));
        this.f9482a.m17856a(this.f9483b, r2, this.f9486e[i2], view);
        return view;
    }

    private void m11424a(int i) {
        if (this.f9486e == null) {
            synchronized (this) {
                if (this.f9486e == null) {
                    this.f9486e = new gjw[((getCount() / 21) + 1)];
                }
            }
        }
        if (this.f9486e[i] == null) {
            synchronized (this) {
                if (this.f9486e[i] == null) {
                    int i2 = i * 21;
                    int min = Math.min(21, getCount() - i2);
                    int[] iArr = new int[min];
                    for (int i3 = 0; i3 < min; i3++) {
                        iArr[i3] = gwb.m1507a((Integer) getItem(i2 + i3));
                    }
                    this.f9486e[i] = this.f9482a.m17855a(iArr);
                }
            }
        }
    }
}
