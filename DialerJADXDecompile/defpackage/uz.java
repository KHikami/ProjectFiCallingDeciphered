package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.widget.ActivityChooserView;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: uz */
public final class uz implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {
    private /* synthetic */ ActivityChooserView a;

    public uz(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (((uy) adapterView.getAdapter()).getItemViewType(i)) {
            case rl.c /*0*/:
                this.a.b();
                if (!this.a.j) {
                    if (!this.a.a.b) {
                        i++;
                    }
                    Intent b = this.a.a.a.b(i);
                    if (b != null) {
                        b.addFlags(524288);
                        this.a.getContext().startActivity(b);
                    }
                } else if (i > 0) {
                    up upVar = this.a.a.a;
                    synchronized (upVar.b) {
                        float f;
                        upVar.d();
                        uq uqVar = (uq) upVar.c.get(i);
                        uq uqVar2 = (uq) upVar.c.get(0);
                        if (uqVar2 != null) {
                            f = (uqVar2.b - uqVar.b) + 5.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (upVar.d.add(new us(new ComponentName(uqVar.a.activityInfo.packageName, uqVar.a.activityInfo.name), System.currentTimeMillis(), f))) {
                            upVar.i = true;
                            upVar.e();
                            if (upVar.h) {
                                if (upVar.i) {
                                    upVar.i = false;
                                    if (!TextUtils.isEmpty(upVar.f)) {
                                        buf.a(new ut(upVar), new ArrayList(upVar.d), upVar.f);
                                    }
                                }
                                upVar.notifyChanged();
                                break;
                            }
                            throw new IllegalStateException("No preceding call to #readHistoricalData");
                        }
                        break;
                    }
                }
            case rq.b /*1*/:
                this.a.a(Integer.MAX_VALUE);
            default:
                throw new IllegalArgumentException();
        }
    }

    public final void onClick(View view) {
        if (view == this.a.f) {
            this.a.b();
            Intent b = this.a.a.a.b(this.a.a.a.a(this.a.a.a.b()));
            if (b != null) {
                b.addFlags(524288);
                this.a.getContext().startActivity(b);
            }
        } else if (view == this.a.d) {
            this.a.j = false;
            this.a.a(this.a.k);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final boolean onLongClick(View view) {
        if (view == this.a.f) {
            if (this.a.a.getCount() > 0) {
                this.a.j = true;
                this.a.a(this.a.k);
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    public final void onDismiss() {
        ActivityChooserView activityChooserView = this.a;
        if (this.a.h != null) {
            this.a.h.a(false);
        }
    }
}
