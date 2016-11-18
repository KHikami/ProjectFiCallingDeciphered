package defpackage;

import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View.OnClickListener;

public final class dof {
    public final int a;
    public final boolean b;
    public final String c;
    public final int d;
    public final String e;
    public final ColorStateList f;
    public final ColorStateList g;
    public final OnClickListener h;

    dof(int i, boolean z, String str, String str2, ColorStateList colorStateList, ColorStateList colorStateList2, OnClickListener onClickListener, int i2) {
        iil.b("Expected condition to be false", TextUtils.isEmpty(str));
        iil.a(i, 0, 2);
        this.a = i;
        this.b = z;
        this.c = str;
        this.e = str2;
        this.f = colorStateList;
        this.g = colorStateList2;
        this.h = onClickListener;
        this.d = i2;
    }
}
