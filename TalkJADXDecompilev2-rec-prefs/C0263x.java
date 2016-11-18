package p000;

import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import java.util.List;

public class C0263x extends ak {
    public /* bridge */ /* synthetic */ boolean m41255a(CoordinatorLayout coordinatorLayout, View view, int i) {
        return super.a(coordinatorLayout, view, i);
    }

    public /* bridge */ /* synthetic */ boolean m41256a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        return super.a(coordinatorLayout, view, i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ int m41259b() {
        return super.b();
    }

    /* synthetic */ View m41260b(List list) {
        return m41253a(list);
    }

    public boolean a_(View view) {
        return view instanceof s;
    }

    public boolean m41257a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        s a = m41253a(coordinatorLayout.c(view));
        if (a != null) {
            rect.offset(view.getLeft(), view.getTop());
            Rect rect2 = this.a;
            rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
            if (!rect2.contains(rect)) {
                boolean z2;
                if (z) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                a.a(false, z2);
                return true;
            }
        }
        return false;
    }

    float m41258b(View view) {
        if (view instanceof s) {
            int i;
            int i2;
            s sVar = (s) view;
            int a = sVar.a();
            if (sVar.a != -1) {
                i = sVar.a;
            } else {
                int childCount = sVar.getChildCount() - 1;
                i = 0;
                while (childCount >= 0) {
                    View childAt = sVar.getChildAt(childCount);
                    C0262w c0262w = (C0262w) childAt.getLayoutParams();
                    int measuredHeight = childAt.getMeasuredHeight();
                    int i3 = c0262w.f35420a;
                    if ((i3 & 5) != 5) {
                        if (i > 0) {
                            break;
                        }
                        i2 = i;
                    } else {
                        i2 = (c0262w.bottomMargin + c0262w.topMargin) + i;
                        if ((i3 & 8) != 0) {
                            i2 += oa.m37365l(childAt);
                        } else if ((i3 & 2) != 0) {
                            i2 += measuredHeight - oa.m37365l(childAt);
                        } else {
                            i2 += measuredHeight;
                        }
                    }
                    childCount--;
                    i = i2;
                }
                i2 = Math.max(0, i);
                sVar.a = i2;
                i = i2;
            }
            gwb a2 = ((ae) sVar.getLayoutParams()).a();
            if (a2 instanceof C0259t) {
                i2 = ((C0259t) a2).m40689a();
            } else {
                i2 = 0;
            }
            if (i != 0 && a + i2 <= i) {
                return 0.0f;
            }
            i = a - i;
            if (i != 0) {
                return (((float) i2) / ((float) i)) + 1.0f;
            }
        }
        return 0.0f;
    }

    s m41253a(List<View> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = (View) list.get(i);
            if (view instanceof s) {
                return (s) view;
            }
        }
        return null;
    }

    int m41262c(View view) {
        if (view instanceof s) {
            return ((s) view).a();
        }
        return super.c(view);
    }

    public boolean m41261b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        gwb a = ((ae) view2.getLayoutParams()).a();
        if (a instanceof C0259t) {
            int bottom = view2.getBottom() - view.getTop();
            oa.m37356e(view, ((((C0259t) a).f35121a + bottom) + this.c) - d(view2));
        }
        return false;
    }
}
