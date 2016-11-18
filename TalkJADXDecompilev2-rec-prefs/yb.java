package p000;

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
    xv f35794a;
    private xy f35795b;
    private uo f35796c;
    private yo f35797d;

    public yb(xy xyVar) {
        this.f35795b = xyVar;
    }

    public void m41466a(IBinder iBinder) {
        xy xyVar = this.f35795b;
        up upVar = new up(xyVar.m41433e());
        this.f35794a = new xv(upVar.m40903a(), gwb.bV);
        this.f35794a.mo4511a((yo) this);
        this.f35795b.m41415a(this.f35794a);
        upVar.m40908a(this.f35794a.m41384a(), (OnClickListener) this);
        View q = xyVar.m41446q();
        if (q != null) {
            upVar.m40907a(q);
        } else {
            upVar.m40906a(xyVar.m41445p()).m40909a(xyVar.m41444o());
        }
        upVar.m40905a((OnKeyListener) this);
        this.f35796c = upVar.m40915b();
        this.f35796c.setOnDismissListener(this);
        LayoutParams attributes = this.f35796c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        this.f35796c.show();
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            Window window;
            View decorView;
            DispatcherState keyDispatcherState;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                window = this.f35796c.getWindow();
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
                window = this.f35796c.getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    if (decorView != null) {
                        keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null && keyDispatcherState.isTracking(keyEvent)) {
                            this.f35795b.m41417a(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f35795b.performShortcut(i, keyEvent, 0);
    }

    private void m41465a() {
        if (this.f35796c != null) {
            this.f35796c.dismiss();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f35794a.mo4510a(this.f35795b, true);
    }

    public void mo4441a(xy xyVar, boolean z) {
        if (z || xyVar == this.f35795b) {
            m41465a();
        }
        if (this.f35797d != null) {
            this.f35797d.mo4441a(xyVar, z);
        }
    }

    public boolean mo4442a(xy xyVar) {
        if (this.f35797d != null) {
            return this.f35797d.mo4442a(xyVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f35795b.m41418a((yc) this.f35794a.m41384a().getItem(i), 0);
    }
}
