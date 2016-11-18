package p000;

import android.view.View;
import android.view.ViewParent;

public final class nl {
    private final View f30088a;
    private ViewParent f30089b;
    private boolean f30090c;
    private int[] f30091d;

    public nl(View view) {
        this.f30088a = view;
    }

    public void m35443a(boolean z) {
        if (this.f30090c) {
            oa.f31462a.mo4136D(this.f30088a);
        }
        this.f30090c = z;
    }

    public boolean m35444a() {
        return this.f30090c;
    }

    public boolean m35450b() {
        return this.f30089b != null;
    }

    public boolean m35447a(int i) {
        if (m35450b()) {
            return true;
        }
        if (m35444a()) {
            View view = this.f30088a;
            for (ViewParent parent = this.f30088a.getParent(); parent != null; parent = parent.getParent()) {
                if (pj.f34989a.mo4255a(parent, view, this.f30088a, i)) {
                    this.f30089b = parent;
                    pj.f34989a.mo4256b(parent, view, this.f30088a, i);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public void m35451c() {
        if (this.f30089b != null) {
            pj.f34989a.mo4250a(this.f30089b, this.f30088a);
            this.f30089b = null;
        }
    }

    public boolean m35448a(int i, int i2, int i3, int i4, int[] iArr) {
        if (m35444a() && this.f30089b != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                int i5;
                int i6;
                if (iArr != null) {
                    this.f30088a.getLocationInWindow(iArr);
                    int i7 = iArr[0];
                    i5 = iArr[1];
                    i6 = i7;
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                pj.f34989a.mo4251a(this.f30089b, this.f30088a, i, i2, i3, i4);
                if (iArr != null) {
                    this.f30088a.getLocationInWindow(iArr);
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

    public boolean m35449a(int i, int i2, int[] iArr, int[] iArr2) {
        if (m35444a() && this.f30089b != null) {
            if (i != 0 || i2 != 0) {
                int i3;
                int i4;
                int[] iArr3;
                if (iArr2 != null) {
                    this.f30088a.getLocationInWindow(iArr2);
                    int i5 = iArr2[0];
                    i3 = iArr2[1];
                    i4 = i5;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                if (iArr == null) {
                    if (this.f30091d == null) {
                        this.f30091d = new int[2];
                    }
                    iArr3 = this.f30091d;
                } else {
                    iArr3 = iArr;
                }
                iArr3[0] = 0;
                iArr3[1] = 0;
                pj.f34989a.mo4252a(this.f30089b, this.f30088a, i, i2, iArr3);
                if (iArr2 != null) {
                    this.f30088a.getLocationInWindow(iArr2);
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

    public boolean m35446a(float f, float f2, boolean z) {
        if (!m35444a() || this.f30089b == null) {
            return false;
        }
        return pj.f34989a.mo4254a(this.f30089b, this.f30088a, f, f2, z);
    }

    public boolean m35445a(float f, float f2) {
        if (!m35444a() || this.f30089b == null) {
            return false;
        }
        return pj.f34989a.mo4253a(this.f30089b, this.f30088a, f, f2);
    }
}
