package p000;

import android.content.res.ColorStateList;
import android.view.View.OnClickListener;

public final class dog {
    private int f10227a = 2;
    private boolean f10228b = true;
    private String f10229c = null;
    private String f10230d = null;
    private ColorStateList f10231e = null;
    private ColorStateList f10232f = null;
    private OnClickListener f10233g = null;
    private int f10234h = -1;

    public dog m12359a(int i) {
        this.f10227a = i;
        return this;
    }

    public dog m12362a(boolean z) {
        this.f10228b = false;
        return this;
    }

    public dog m12361a(String str) {
        this.f10229c = str;
        return this;
    }

    public dog m12364b(String str) {
        this.f10230d = str;
        return this;
    }

    public dog m12363b(int i) {
        this.f10232f = ColorStateList.valueOf(i);
        return this;
    }

    public dog m12360a(OnClickListener onClickListener) {
        this.f10233g = onClickListener;
        return this;
    }

    public dog m12365c(int i) {
        this.f10234h = i;
        return this;
    }

    public dof m12358a() {
        return new dof(this.f10227a, this.f10228b, this.f10229c, this.f10230d, this.f10231e, this.f10232f, this.f10233g, this.f10234h);
    }
}
