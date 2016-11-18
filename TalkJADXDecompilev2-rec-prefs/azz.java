package p000;

import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

final class azz {
    private final View f2649a;
    private final List<azw> f2650b = new ArrayList();
    private baa f2651c;
    private Point f2652d;

    public azz(View view) {
        this.f2649a = view;
    }

    void m4513a() {
        if (!this.f2650b.isEmpty()) {
            int d = m4512d();
            int c = m4511c();
            if (azz.m4510a(d) && azz.m4510a(c)) {
                for (azw a : this.f2650b) {
                    a.mo418a(d, c);
                }
                m4515b();
            }
        }
    }

    void m4514a(azw azw) {
        int d = m4512d();
        int c = m4511c();
        if (azz.m4510a(d) && azz.m4510a(c)) {
            if (d != -2) {
                d = (d - oa.g(this.f2649a)) - oa.h(this.f2649a);
            }
            if (c != -2) {
                c = (c - this.f2649a.getPaddingTop()) - this.f2649a.getPaddingBottom();
            }
            azw.mo418a(d, c);
            return;
        }
        if (!this.f2650b.contains(azw)) {
            this.f2650b.add(azw);
        }
        if (this.f2651c == null) {
            ViewTreeObserver viewTreeObserver = this.f2649a.getViewTreeObserver();
            this.f2651c = new baa(this);
            viewTreeObserver.addOnPreDrawListener(this.f2651c);
        }
    }

    void m4515b() {
        ViewTreeObserver viewTreeObserver = this.f2649a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f2651c);
        }
        this.f2651c = null;
        this.f2650b.clear();
    }

    private int m4511c() {
        LayoutParams layoutParams = this.f2649a.getLayoutParams();
        if (azz.m4510a(this.f2649a.getHeight())) {
            return this.f2649a.getHeight();
        }
        if (layoutParams != null) {
            return m4509a(layoutParams.height, true);
        }
        return 0;
    }

    private int m4512d() {
        LayoutParams layoutParams = this.f2649a.getLayoutParams();
        if (azz.m4510a(this.f2649a.getWidth())) {
            return this.f2649a.getWidth();
        }
        if (layoutParams != null) {
            return m4509a(layoutParams.width, false);
        }
        return 0;
    }

    private int m4509a(int i, boolean z) {
        if (i != -2) {
            return i;
        }
        Point point;
        if (this.f2652d != null) {
            point = this.f2652d;
        } else {
            Display defaultDisplay = ((WindowManager) this.f2649a.getContext().getSystemService("window")).getDefaultDisplay();
            if (VERSION.SDK_INT >= 13) {
                this.f2652d = new Point();
                defaultDisplay.getSize(this.f2652d);
            } else {
                this.f2652d = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
            }
            point = this.f2652d;
        }
        return z ? point.y : point.x;
    }

    private static boolean m4510a(int i) {
        return i > 0 || i == -2;
    }
}
