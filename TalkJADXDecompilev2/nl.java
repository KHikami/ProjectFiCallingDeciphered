package defpackage;

import android.view.View;
import android.view.ViewParent;

public final class nl {
    private final View a;
    private ViewParent b;
    private boolean c;
    private int[] d;

    public nl(View view) {
        this.a = view;
    }

    public void a(boolean z) {
        if (this.c) {
            oa.a.D(this.a);
        }
        this.c = z;
    }

    public boolean a() {
        return this.c;
    }

    public boolean b() {
        return this.b != null;
    }

    public boolean a(int i) {
        if (b()) {
            return true;
        }
        if (a()) {
            View view = this.a;
            for (ViewParent parent = this.a.getParent(); parent != null; parent = parent.getParent()) {
                if (pj.a.a(parent, view, this.a, i)) {
                    this.b = parent;
                    pj.a.b(parent, view, this.a, i);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public void c() {
        if (this.b != null) {
            pj.a.a(this.b, this.a);
            this.b = null;
        }
    }

    public boolean a(int i, int i2, int i3, int i4, int[] iArr) {
        if (a() && this.b != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                int i5;
                int i6;
                if (iArr != null) {
                    this.a.getLocationInWindow(iArr);
                    int i7 = iArr[0];
                    i5 = iArr[1];
                    i6 = i7;
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                pj.a.a(this.b, this.a, i, i2, i3, i4);
                if (iArr != null) {
                    this.a.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i5;
                }
                return true;
            } else if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
        }
        return false;
    }

    public boolean a(int i, int i2, int[] iArr, int[] iArr2) {
        if (a() && this.b != null) {
            if (i != 0 || i2 != 0) {
                int i3;
                int i4;
                int[] iArr3;
                if (iArr2 != null) {
                    this.a.getLocationInWindow(iArr2);
                    int i5 = iArr2[0];
                    i3 = iArr2[1];
                    i4 = i5;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                if (iArr == null) {
                    if (this.d == null) {
                        this.d = new int[2];
                    }
                    iArr3 = this.d;
                } else {
                    iArr3 = iArr;
                }
                iArr3[0] = 0;
                iArr3[1] = 0;
                pj.a.a(this.b, this.a, i, i2, iArr3);
                if (iArr2 != null) {
                    this.a.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i4;
                    iArr2[1] = iArr2[1] - i3;
                }
                return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    public boolean a(float f, float f2, boolean z) {
        if (!a() || this.b == null) {
            return false;
        }
        return pj.a.a(this.b, this.a, f, f2, z);
    }

    public boolean a(float f, float f2) {
        if (!a() || this.b == null) {
            return false;
        }
        return pj.a.a(this.b, this.a, f, f2);
    }
}
