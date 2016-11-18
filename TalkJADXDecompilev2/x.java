package defpackage;

import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import java.util.List;

public class x extends ak {
    public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        return super.a(coordinatorLayout, view, i);
    }

    public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        return super.a(coordinatorLayout, view, i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ int b() {
        return super.b();
    }

    /* synthetic */ View b(List list) {
        return a(list);
    }

    public boolean a_(View view) {
        return view instanceof s;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        s a = a(coordinatorLayout.c(view));
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

    float b(View view) {
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
                    w wVar = (w) childAt.getLayoutParams();
                    int measuredHeight = childAt.getMeasuredHeight();
                    int i3 = wVar.a;
                    if ((i3 & 5) != 5) {
                        if (i > 0) {
                            break;
                        }
                        i2 = i;
                    } else {
                        i2 = (wVar.bottomMargin + wVar.topMargin) + i;
                        if ((i3 & 8) != 0) {
                            i2 += oa.l(childAt);
                        } else if ((i3 & 2) != 0) {
                            i2 += measuredHeight - oa.l(childAt);
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
            if (a2 instanceof t) {
                i2 = ((t) a2).a();
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

    s a(List<View> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = (View) list.get(i);
            if (view instanceof s) {
                return (s) view;
            }
        }
        return null;
    }

    int c(View view) {
        if (view instanceof s) {
            return ((s) view).a();
        }
        return super.c(view);
    }

    public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        gwb a = ((ae) view2.getLayoutParams()).a();
        if (a instanceof t) {
            int bottom = view2.getBottom() - view.getTop();
            oa.e(view, ((((t) a).a + bottom) + this.c) - d(view2));
        }
        return false;
    }
}
