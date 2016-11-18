package defpackage;

import android.content.res.ColorStateList;
import android.view.View.OnClickListener;

public final class dog {
    private int a = 2;
    private boolean b = true;
    private String c = null;
    private String d = null;
    private ColorStateList e = null;
    private ColorStateList f = null;
    private OnClickListener g = null;
    private int h = -1;

    public dog a(int i) {
        this.a = i;
        return this;
    }

    public dog a(boolean z) {
        this.b = false;
        return this;
    }

    public dog a(String str) {
        this.c = str;
        return this;
    }

    public dog b(String str) {
        this.d = str;
        return this;
    }

    public dog b(int i) {
        this.f = ColorStateList.valueOf(i);
        return this;
    }

    public dog a(OnClickListener onClickListener) {
        this.g = onClickListener;
        return this;
    }

    public dog c(int i) {
        this.h = i;
        return this;
    }

    public dof a() {
        return new dof(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
