package p000;

import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View.OnClickListener;

public final class dof {
    public final int f10219a;
    public final boolean f10220b;
    public final String f10221c;
    public final int f10222d;
    public final String f10223e;
    public final ColorStateList f10224f;
    public final ColorStateList f10225g;
    public final OnClickListener f10226h;

    dof(int i, boolean z, String str, String str2, ColorStateList colorStateList, ColorStateList colorStateList2, OnClickListener onClickListener, int i2) {
        iil.m21879b("Expected condition to be false", TextUtils.isEmpty(str));
        iil.m21868a(i, 0, 2);
        this.f10219a = i;
        this.f10220b = z;
        this.f10221c = str;
        this.f10223e = str2;
        this.f10224f = colorStateList;
        this.f10225g = colorStateList2;
        this.f10226h = onClickListener;
        this.f10222d = i2;
    }
}
