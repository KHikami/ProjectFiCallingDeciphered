package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/* renamed from: dbz */
public abstract class dbz extends BaseAdapter {
    private final gjs a;
    private final Resources b;
    private final LayoutParams c;
    private final String d;
    private gjw[] e;

    public dbz(Resources resources, gjs gjs) {
        this.b = resources;
        this.d = resources.getResourcePackageName(gwb.cT);
        this.a = gjs;
        int dimensionPixelSize = resources.getDimensionPixelSize(gwb.eK) + (resources.getDimensionPixelSize(gwb.eJ) * 2);
        this.c = new LayoutParams(dimensionPixelSize, dimensionPixelSize);
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

    public void a() {
        if (this.e != null) {
            for (int i = 0; i < this.e.length; i++) {
                if (this.e[i] != null) {
                    this.e[i].cancel(true);
                }
            }
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int dimensionPixelSize;
        if (view == null) {
            view = new ImageView(viewGroup.getContext());
            view.setLayoutParams(this.c);
            dimensionPixelSize = this.b.getDimensionPixelSize(gwb.eJ);
            view.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        } else {
            ImageView imageView = (ImageView) view;
            imageView.setImageDrawable(null);
        }
        int i2 = i / 21;
        a(i2);
        dimensionPixelSize = this.b.getIdentifier(String.format("spoken_emoji_%04X", new Object[]{Integer.valueOf(gwb.a((Integer) getItem(i)))}), "string", this.d);
        Resources resources = this.b;
        if (dimensionPixelSize == 0) {
            dimensionPixelSize = gwb.cT;
        }
        view.setContentDescription(resources.getString(dimensionPixelSize));
        this.a.a(this.b, r2, this.e[i2], view);
        return view;
    }

    private void a(int i) {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = new gjw[((getCount() / 21) + 1)];
                }
            }
        }
        if (this.e[i] == null) {
            synchronized (this) {
                if (this.e[i] == null) {
                    int i2 = i * 21;
                    int min = Math.min(21, getCount() - i2);
                    int[] iArr = new int[min];
                    for (int i3 = 0; i3 < min; i3++) {
                        iArr[i3] = gwb.a((Integer) getItem(i2 + i3));
                    }
                    this.e[i] = this.a.a(iArr);
                }
            }
        }
    }
}
