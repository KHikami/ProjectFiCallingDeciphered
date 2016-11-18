package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;

public class yl {
    private final Context f35831a;
    private final xy f35832b;
    private final boolean f35833c;
    private final int f35834d;
    private final int f35835e;
    private View f35836f;
    private int f35837g;
    private boolean f35838h;
    private yo f35839i;
    private yk f35840j;
    private OnDismissListener f35841k;
    private final OnDismissListener f35842l;

    public yl(Context context, xy xyVar, View view, boolean z, int i) {
        this(context, xyVar, view, z, i, 0);
    }

    public yl(Context context, xy xyVar, View view, boolean z, int i, int i2) {
        this.f35837g = 8388611;
        this.f35842l = new ym(this);
        this.f35831a = context;
        this.f35832b = xyVar;
        this.f35836f = view;
        this.f35833c = z;
        this.f35834d = i;
        this.f35835e = i2;
    }

    public void m41512a(OnDismissListener onDismissListener) {
        this.f35841k = onDismissListener;
    }

    public void m41511a(View view) {
        this.f35836f = view;
    }

    public void m41514a(boolean z) {
        this.f35838h = z;
        if (this.f35840j != null) {
            this.f35840j.mo4522a(z);
        }
    }

    public void m41510a(int i) {
        this.f35837g = 8388613;
    }

    public void m41509a() {
        if (!m41517c()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public yk m41516b() {
        if (this.f35840j == null) {
            yk xqVar;
            Display defaultDisplay = ((WindowManager) this.f35831a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else if (VERSION.SDK_INT >= 13) {
                defaultDisplay.getSize(point);
            } else {
                point.set(defaultDisplay.getWidth(), defaultDisplay.getHeight());
            }
            if ((Math.min(point.x, point.y) >= this.f35831a.getResources().getDimensionPixelSize(gwb.aq) ? 1 : null) != null) {
                xqVar = new xq(this.f35831a, this.f35836f, this.f35834d, this.f35835e, this.f35833c);
            } else {
                xqVar = new yt(this.f35831a, this.f35832b, this.f35836f, this.f35834d, this.f35835e, this.f35833c);
            }
            xqVar.mo4521a(this.f35832b);
            xqVar.mo4520a(this.f35842l);
            xqVar.mo4519a(this.f35836f);
            xqVar.mo4511a(this.f35839i);
            xqVar.mo4522a(this.f35838h);
            xqVar.mo4518a(this.f35837g);
            this.f35840j = xqVar;
        }
        return this.f35840j;
    }

    public boolean m41517c() {
        if (m41520f()) {
            return true;
        }
        if (this.f35836f == null) {
            return false;
        }
        m41508a(0, 0, false, false);
        return true;
    }

    public boolean m41515a(int i, int i2) {
        if (m41520f()) {
            return true;
        }
        if (this.f35836f == null) {
            return false;
        }
        m41508a(i, i2, true, true);
        return true;
    }

    private void m41508a(int i, int i2, boolean z, boolean z2) {
        yk b = m41516b();
        b.mo4526c(z2);
        if (z) {
            if ((mj.a(this.f35837g, oa.m37351d(this.f35836f)) & 7) == 5) {
                i -= this.f35836f.getWidth();
            }
            b.mo4523b(i);
            b.mo4525c(i2);
            int i3 = (int) ((this.f35831a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.m41349a(new Rect(i - i3, i2 - i3, i + i3, i3 + i2));
        }
        b.mo4517a();
    }

    public void m41518d() {
        if (m41520f()) {
            this.f35840j.mo4524c();
        }
    }

    public void mo4549e() {
        this.f35840j = null;
        if (this.f35841k != null) {
            this.f35841k.onDismiss();
        }
    }

    public boolean m41520f() {
        return this.f35840j != null && this.f35840j.mo4527d();
    }

    public void m41513a(yo yoVar) {
        this.f35839i = yoVar;
        if (this.f35840j != null) {
            this.f35840j.mo4511a(yoVar);
        }
    }
}
