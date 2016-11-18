package defpackage;

import android.content.Intent;
import android.support.v7.widget.ActivityChooserView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;

public final class zy implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {
    final /* synthetic */ ActivityChooserView a;

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        switch (((zx) adapterView.getAdapter()).getItemViewType(i)) {
            case 0:
                this.a.a();
                if (!this.a.h) {
                    if (!this.a.a.e()) {
                        i++;
                    }
                    Intent b = this.a.a.d().b(i);
                    if (b != null) {
                        b.addFlags(524288);
                        this.a.getContext().startActivity(b);
                        return;
                    }
                    return;
                } else if (i > 0) {
                    this.a.a.d().c(i);
                    return;
                } else {
                    return;
                }
            case 1:
                ActivityChooserView activityChooserView = this.a;
                if (activityChooserView.a.d() == null) {
                    throw new IllegalStateException("No data model. Did you call #setDataModel?");
                }
                add b2;
                activityChooserView.getViewTreeObserver().addOnGlobalLayoutListener(activityChooserView.f);
                boolean z = activityChooserView.c.getVisibility() == 0;
                activityChooserView.a.c();
                if (z) {
                    activityChooserView.a.a(false);
                    activityChooserView.a.a(Integer.MAX_VALUE);
                    b2 = activityChooserView.b();
                } else {
                    activityChooserView.a.a(false);
                    activityChooserView.a.a(Integer.MAX_VALUE);
                    b2 = activityChooserView.b();
                }
                if (!b2.d()) {
                    if (activityChooserView.h || !z) {
                        activityChooserView.a.a(true, z);
                    } else {
                        activityChooserView.a.a(false, false);
                    }
                    b2.g(Math.min(activityChooserView.a.a(), activityChooserView.d));
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
        if (view == this.a.c) {
            this.a.a();
            Intent b = this.a.a.d().b(this.a.a.d().a(this.a.a.b()));
            if (b != null) {
                b.addFlags(524288);
                this.a.getContext().startActivity(b);
            }
        } else if (view == this.a.b) {
            this.a.h = false;
            ActivityChooserView activityChooserView = this.a;
            int i = this.a.i;
            if (activityChooserView.a.d() == null) {
                throw new IllegalStateException("No data model. Did you call #setDataModel?");
            }
            activityChooserView.getViewTreeObserver().addOnGlobalLayoutListener(activityChooserView.f);
            boolean z = activityChooserView.c.getVisibility() == 0;
            int c = activityChooserView.a.c();
            int i2;
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (i == Integer.MAX_VALUE || c <= r3 + i) {
                activityChooserView.a.a(false);
                activityChooserView.a.a(i);
            } else {
                activityChooserView.a.a(true);
                activityChooserView.a.a(i - 1);
            }
            add b2 = activityChooserView.b();
            if (!b2.d()) {
                if (activityChooserView.h || !z) {
                    activityChooserView.a.a(true, z);
                } else {
                    activityChooserView.a.a(false, false);
                }
                b2.g(Math.min(activityChooserView.a.a(), activityChooserView.d));
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
        if (view == this.a.c) {
            if (this.a.a.getCount() > 0) {
                this.a.h = true;
                ActivityChooserView activityChooserView = this.a;
                int i = this.a.i;
                if (activityChooserView.a.d() == null) {
                    throw new IllegalStateException("No data model. Did you call #setDataModel?");
                }
                activityChooserView.getViewTreeObserver().addOnGlobalLayoutListener(activityChooserView.f);
                boolean z = activityChooserView.c.getVisibility() == 0;
                int c = activityChooserView.a.c();
                int i2;
                if (z) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (i == Integer.MAX_VALUE || c <= r3 + i) {
                    activityChooserView.a.a(false);
                    activityChooserView.a.a(i);
                } else {
                    activityChooserView.a.a(true);
                    activityChooserView.a.a(i - 1);
                }
                add b = activityChooserView.b();
                if (!b.d()) {
                    if (activityChooserView.h || !z) {
                        activityChooserView.a.a(true, z);
                    } else {
                        activityChooserView.a.a(false, false);
                    }
                    b.g(Math.min(activityChooserView.a.a(), activityChooserView.d));
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
        if (this.a.g != null) {
            this.a.g.onDismiss();
        }
        if (this.a.e != null) {
            this.a.e.a(false);
        }
    }
}
