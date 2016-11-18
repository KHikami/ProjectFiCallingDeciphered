package p000;

import android.support.v4.widget.DrawerLayout;
import android.view.View;

public final class sk extends to {
    final int f35107a;
    tl f35108b;
    final /* synthetic */ DrawerLayout f35109c;
    private final Runnable f35110d = new sl(this);

    public sk(DrawerLayout drawerLayout, int i) {
        this.f35109c = drawerLayout;
        this.f35107a = i;
    }

    public void m40630a(tl tlVar) {
        this.f35108b = tlVar;
    }

    public void m40625a() {
        this.f35109c.removeCallbacks(this.f35110d);
    }

    public boolean mo4363a(View view, int i) {
        return this.f35109c.g(view) && this.f35109c.a(view, this.f35107a) && this.f35109c.a(view) == 0;
    }

    public void mo4359a(int i) {
        this.f35109c.a(i, this.f35108b.m40775c());
    }

    public void mo4362a(View view, int i, int i2) {
        float f;
        int width = view.getWidth();
        if (this.f35109c.a(view, 3)) {
            f = ((float) (width + i)) / ((float) width);
        } else {
            f = ((float) (this.f35109c.getWidth() - i)) / ((float) width);
        }
        this.f35109c.b(view, f);
        view.setVisibility(f == 0.0f ? 4 : 0);
        this.f35109c.invalidate();
    }

    public void mo4364b(View view, int i) {
        ((sh) view.getLayoutParams()).f35100c = false;
        m40632b();
    }

    void m40632b() {
        int i = 3;
        if (this.f35107a == 3) {
            i = 5;
        }
        View d = this.f35109c.d(i);
        if (d != null) {
            this.f35109c.i(d);
        }
    }

    public void mo4361a(View view, float f, float f2) {
        int i;
        float d = this.f35109c.d(view);
        int width = view.getWidth();
        if (this.f35109c.a(view, 3)) {
            i = (f > 0.0f || (f == 0.0f && d > 0.5f)) ? 0 : -width;
        } else {
            i = this.f35109c.getWidth();
            if (f < 0.0f || (f == 0.0f && d > 0.5f)) {
                i -= width;
            }
        }
        this.f35108b.m40767a(i, view.getTop());
        this.f35109c.invalidate();
    }

    public void mo4366c() {
        this.f35109c.postDelayed(this.f35110d, 160);
    }

    public void mo4360a(int i, int i2) {
        View d;
        if ((i & 1) == 1) {
            d = this.f35109c.d(3);
        } else {
            d = this.f35109c.d(5);
        }
        if (d != null && this.f35109c.a(d) == 0) {
            this.f35108b.m40766a(d, i2);
        }
    }

    public int mo4358a(View view) {
        return this.f35109c.g(view) ? view.getWidth() : 0;
    }

    public int mo4365c(View view, int i) {
        if (this.f35109c.a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.f35109c.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    public int mo4367d(View view, int i) {
        return view.getTop();
    }
}
