package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;

public final class zq extends acw {
    @ExportedProperty
    public boolean a;
    @ExportedProperty
    public int b;
    @ExportedProperty
    public int c;
    @ExportedProperty
    public boolean d;
    @ExportedProperty
    public boolean e;
    public boolean f;

    public zq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public zq(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public zq(zq zqVar) {
        super(zqVar);
        this.a = zqVar.a;
    }

    public zq(int i, int i2) {
        super(-2, -2);
        this.a = false;
    }
}
