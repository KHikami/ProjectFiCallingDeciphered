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
    private final View a;
    private final List<azw> b;
    private baa c;
    private Point d;

    public azz(View view) {
        this.b = new ArrayList();
        this.a = view;
    }

    void a() {
        if (!this.b.isEmpty()) {
            int d = d();
            int c = c();
            if (a(d) && a(c)) {
                for (azw a : this.b) {
                    a.a(d, c);
                }
                b();
            }
        }
    }

    void a(azw azw) {
        int d = d();
        int c = c();
        if (a(d) && a(c)) {
            if (d != -2) {
                d = (d - oa.g(this.a)) - oa.h(this.a);
            }
            if (c != -2) {
                c = (c - this.a.getPaddingTop()) - this.a.getPaddingBottom();
            }
            azw.a(d, c);
            return;
        }
        if (!this.b.contains(azw)) {
            this.b.add(azw);
        }
        if (this.c == null) {
            ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            this.c = new baa(this);
            viewTreeObserver.addOnPreDrawListener(this.c);
        }
    }

    void b() {
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.c);
        }
        this.c = null;
        this.b.clear();
    }

    private int c() {
        LayoutParams layoutParams = this.a.getLayoutParams();
        if (a(this.a.getHeight())) {
            return this.a.getHeight();
        }
        if (layoutParams != null) {
            return a(layoutParams.height, true);
        }
        return 0;
    }

    private int d() {
        LayoutParams layoutParams = this.a.getLayoutParams();
        if (a(this.a.getWidth())) {
            return this.a.getWidth();
        }
        if (layoutParams != null) {
            return a(layoutParams.width, false);
        }
        return 0;
    }

    private int a(int i, boolean z) {
        if (i != -2) {
            return i;
        }
        Point point;
        if (this.d != null) {
            point = this.d;
        } else {
            Display defaultDisplay = ((WindowManager) this.a.getContext().getSystemService("window")).getDefaultDisplay();
            if (VERSION.SDK_INT >= 13) {
                this.d = new Point();
                defaultDisplay.getSize(this.d);
            } else {
                this.d = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
            }
            point = this.d;
        }
        return z ? point.y : point.x;
    }

    private static boolean a(int i) {
        return i > 0 || i == -2;
    }
}
