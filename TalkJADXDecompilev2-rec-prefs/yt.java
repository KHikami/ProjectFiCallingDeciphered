package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

final class yt extends yk implements OnKeyListener, OnItemClickListener, OnDismissListener, yn {
    final ado f35844a;
    View f35845b;
    private final Context f35846c;
    private final xy f35847d;
    private final xx f35848e;
    private final boolean f35849f;
    private final int f35850g;
    private final int f35851h;
    private final int f35852i;
    private final OnGlobalLayoutListener f35853j = new yu(this);
    private OnDismissListener f35854k;
    private View f35855l;
    private yo f35856m;
    private ViewTreeObserver f35857n;
    private boolean f35858o;
    private boolean f35859p;
    private int f35860q;
    private int f35861r = 0;
    private boolean f35862s;

    public yt(Context context, xy xyVar, View view, int i, int i2, boolean z) {
        this.f35846c = context;
        this.f35847d = xyVar;
        this.f35849f = z;
        this.f35848e = new xx(xyVar, LayoutInflater.from(context), this.f35849f);
        this.f35851h = i;
        this.f35852i = i2;
        Resources resources = context.getResources();
        this.f35850g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(gwb.ar));
        this.f35855l = view;
        this.f35844a = new ado(this.f35846c, null, this.f35851h, this.f35852i);
        xyVar.m41416a((yn) this, context);
    }

    public void mo4522a(boolean z) {
        this.f35848e.m41399a(z);
    }

    public void mo4518a(int i) {
        this.f35861r = i;
    }

    public void mo4524c() {
        if (mo4527d()) {
            this.f35844a.c();
        }
    }

    public void mo4521a(xy xyVar) {
    }

    public boolean mo4527d() {
        return !this.f35858o && this.f35844a.d();
    }

    public void onDismiss() {
        this.f35858o = true;
        this.f35847d.close();
        if (this.f35857n != null) {
            if (!this.f35857n.isAlive()) {
                this.f35857n = this.f35845b.getViewTreeObserver();
            }
            this.f35857n.removeGlobalOnLayoutListener(this.f35853j);
            this.f35857n = null;
        }
        if (this.f35854k != null) {
            this.f35854k.onDismiss();
        }
    }

    public void mo4513b(boolean z) {
        this.f35859p = false;
        if (this.f35848e != null) {
            this.f35848e.notifyDataSetChanged();
        }
    }

    public void mo4511a(yo yoVar) {
        this.f35856m = yoVar;
    }

    public boolean mo4512a(yv yvVar) {
        if (yvVar.hasVisibleItems()) {
            yl ylVar = new yl(this.f35846c, yvVar, this.f35845b, this.f35849f, this.f35851h, this.f35852i);
            ylVar.m41513a(this.f35856m);
            ylVar.m41514a(yk.m41346b((xy) yvVar));
            ylVar.m41512a(this.f35854k);
            this.f35854k = null;
            this.f35847d.m41417a(false);
            if (ylVar.m41515a(this.f35844a.j(), this.f35844a.k())) {
                if (this.f35856m != null) {
                    this.f35856m.mo4442a(yvVar);
                }
                return true;
            }
        }
        return false;
    }

    public void mo4510a(xy xyVar, boolean z) {
        if (xyVar == this.f35847d) {
            mo4524c();
            if (this.f35856m != null) {
                this.f35856m.mo4441a(xyVar, z);
            }
        }
    }

    public boolean mo4514b() {
        return false;
    }

    public void mo4519a(View view) {
        this.f35855l = view;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo4524c();
        return true;
    }

    public void mo4520a(OnDismissListener onDismissListener) {
        this.f35854k = onDismissListener;
    }

    public ListView mo4528e() {
        return this.f35844a.e();
    }

    public void mo4523b(int i) {
        this.f35844a.c(i);
    }

    public void mo4525c(int i) {
        this.f35844a.d(i);
    }

    public void mo4526c(boolean z) {
        this.f35862s = z;
    }

    public void mo4517a() {
        boolean z = true;
        if (!mo4527d()) {
            if (this.f35858o || this.f35855l == null) {
                z = false;
            } else {
                this.f35845b = this.f35855l;
                this.f35844a.a(this);
                this.f35844a.a(this);
                this.f35844a.a(true);
                View view = this.f35845b;
                boolean z2 = this.f35857n == null;
                this.f35857n = view.getViewTreeObserver();
                if (z2) {
                    this.f35857n.addOnGlobalLayoutListener(this.f35853j);
                }
                this.f35844a.a(view);
                this.f35844a.e(this.f35861r);
                if (!this.f35859p) {
                    this.f35860q = yk.m41344a(this.f35848e, null, this.f35846c, this.f35850g);
                    this.f35859p = true;
                }
                this.f35844a.g(this.f35860q);
                this.f35844a.h(2);
                this.f35844a.a(m41360g());
                this.f35844a.a();
                ViewGroup e = this.f35844a.e();
                e.setOnKeyListener(this);
                if (this.f35862s && this.f35847d.m41444o() != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f35846c).inflate(gwb.bX, e, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f35847d.m41444o());
                    }
                    frameLayout.setEnabled(false);
                    e.addHeaderView(frameLayout, null, false);
                }
                this.f35844a.a(this.f35848e);
                this.f35844a.a();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }
}
