package p000;

import android.content.Intent;
import android.support.v7.widget.ActivityChooserView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;

public final class zy implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {
    final /* synthetic */ ActivityChooserView f35952a;

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        switch (((zx) adapterView.getAdapter()).getItemViewType(i)) {
            case 0:
                this.f35952a.a();
                if (!this.f35952a.h) {
                    if (!this.f35952a.a.m41622e()) {
                        i++;
                    }
                    Intent b = this.f35952a.a.m41621d().m41610b(i);
                    if (b != null) {
                        b.addFlags(524288);
                        this.f35952a.getContext().startActivity(b);
                        return;
                    }
                    return;
                } else if (i > 0) {
                    this.f35952a.a.m41621d().m41612c(i);
                    return;
                } else {
                    return;
                }
            case 1:
                ActivityChooserView activityChooserView = this.f35952a;
                if (activityChooserView.a.m41621d() == null) {
                    throw new IllegalStateException("No data model. Did you call #setDataModel?");
                }
                add b2;
                activityChooserView.getViewTreeObserver().addOnGlobalLayoutListener(activityChooserView.f);
                boolean z = activityChooserView.c.getVisibility() == 0;
                activityChooserView.a.m41620c();
                if (z) {
                    activityChooserView.a.m41617a(false);
                    activityChooserView.a.m41616a(Integer.MAX_VALUE);
                    b2 = activityChooserView.b();
                } else {
                    activityChooserView.a.m41617a(false);
                    activityChooserView.a.m41616a(Integer.MAX_VALUE);
                    b2 = activityChooserView.b();
                }
                if (!b2.d()) {
                    if (activityChooserView.h || !z) {
                        activityChooserView.a.m41618a(true, z);
                    } else {
                        activityChooserView.a.m41618a(false, false);
                    }
                    b2.g(Math.min(activityChooserView.a.m41615a(), activityChooserView.d));
                    b2.a();
                    if (activityChooserView.e != null) {
                        activityChooserView.e.a(true);
                    }
                    b2.e().setContentDescription(activityChooserView.getContext().getString(gwb.cf));
                    return;
                }
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    public void onClick(View view) {
        if (view == this.f35952a.c) {
            this.f35952a.a();
            Intent b = this.f35952a.a.m41621d().m41610b(this.f35952a.a.m41621d().m41608a(this.f35952a.a.m41619b()));
            if (b != null) {
                b.addFlags(524288);
                this.f35952a.getContext().startActivity(b);
            }
        } else if (view == this.f35952a.b) {
            this.f35952a.h = false;
            ActivityChooserView activityChooserView = this.f35952a;
            int i = this.f35952a.i;
            if (activityChooserView.a.m41621d() == null) {
                throw new IllegalStateException("No data model. Did you call #setDataModel?");
            }
            activityChooserView.getViewTreeObserver().addOnGlobalLayoutListener(activityChooserView.f);
            boolean z = activityChooserView.c.getVisibility() == 0;
            int c = activityChooserView.a.m41620c();
            int i2;
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (i == Integer.MAX_VALUE || c <= r3 + i) {
                activityChooserView.a.m41617a(false);
                activityChooserView.a.m41616a(i);
            } else {
                activityChooserView.a.m41617a(true);
                activityChooserView.a.m41616a(i - 1);
            }
            add b2 = activityChooserView.b();
            if (!b2.d()) {
                if (activityChooserView.h || !z) {
                    activityChooserView.a.m41618a(true, z);
                } else {
                    activityChooserView.a.m41618a(false, false);
                }
                b2.g(Math.min(activityChooserView.a.m41615a(), activityChooserView.d));
                b2.a();
                if (activityChooserView.e != null) {
                    activityChooserView.e.a(true);
                }
                b2.e().setContentDescription(activityChooserView.getContext().getString(gwb.cf));
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean onLongClick(View view) {
        if (view == this.f35952a.c) {
            if (this.f35952a.a.getCount() > 0) {
                this.f35952a.h = true;
                ActivityChooserView activityChooserView = this.f35952a;
                int i = this.f35952a.i;
                if (activityChooserView.a.m41621d() == null) {
                    throw new IllegalStateException("No data model. Did you call #setDataModel?");
                }
                activityChooserView.getViewTreeObserver().addOnGlobalLayoutListener(activityChooserView.f);
                boolean z = activityChooserView.c.getVisibility() == 0;
                int c = activityChooserView.a.m41620c();
                int i2;
                if (z) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (i == Integer.MAX_VALUE || c <= r3 + i) {
                    activityChooserView.a.m41617a(false);
                    activityChooserView.a.m41616a(i);
                } else {
                    activityChooserView.a.m41617a(true);
                    activityChooserView.a.m41616a(i - 1);
                }
                add b = activityChooserView.b();
                if (!b.d()) {
                    if (activityChooserView.h || !z) {
                        activityChooserView.a.m41618a(true, z);
                    } else {
                        activityChooserView.a.m41618a(false, false);
                    }
                    b.g(Math.min(activityChooserView.a.m41615a(), activityChooserView.d));
                    b.a();
                    if (activityChooserView.e != null) {
                        activityChooserView.e.a(true);
                    }
                    b.e().setContentDescription(activityChooserView.getContext().getString(gwb.cf));
                }
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    public void onDismiss() {
        if (this.f35952a.g != null) {
            this.f35952a.g.onDismiss();
        }
        if (this.f35952a.e != null) {
            this.f35952a.e.a(false);
        }
    }
}
