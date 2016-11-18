package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;

final class yb implements OnClickListener, OnDismissListener, OnKeyListener, yo {
    xv a;
    private xy b;
    private uo c;
    private yo d;

    public yb(xy xyVar) {
        this.b = xyVar;
    }

    public void a(IBinder iBinder) {
        xy xyVar = this.b;
        up upVar = new up(xyVar.e());
        this.a = new xv(upVar.a(), gwb.bV);
        this.a.a((yo) this);
        this.b.a(this.a);
        upVar.a(this.a.a(), (OnClickListener) this);
        View q = xyVar.q();
        if (q != null) {
            upVar.a(q);
        } else {
            upVar.a(xyVar.p()).a(xyVar.o());
        }
        upVar.a((OnKeyListener) this);
        this.c = upVar.b();
        this.c.setOnDismissListener(this);
        LayoutParams attributes = this.c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        this.c.show();
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            Window window;
            View decorView;
            DispatcherState keyDispatcherState;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                window = this.c.getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    if (decorView != null) {
                        keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                window = this.c.getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    if (decorView != null) {
                        keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null && keyDispatcherState.isTracking(keyEvent)) {
                            this.b.a(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.b.performShortcut(i, keyEvent, 0);
    }

    private void a() {
        if (this.c != null) {
            this.c.dismiss();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.a.a(this.b, true);
    }

    public void a(xy xyVar, boolean z) {
        if (z || xyVar == this.b) {
            a();
        }
        if (this.d != null) {
            this.d.a(xyVar, z);
        }
    }

    public boolean a(xy xyVar) {
        if (this.d != null) {
            return this.d.a(xyVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.a((yc) this.a.a().getItem(i), 0);
    }
}
