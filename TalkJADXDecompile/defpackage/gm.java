package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: gm */
public final class gm implements fz {
    private ArrayList<fr> a;
    private int b;
    private PendingIntent c;
    private ArrayList<Notification> d;
    private Bitmap e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private String m;

    public /* synthetic */ Object clone() {
        return a();
    }

    public gm() {
        this.a = new ArrayList();
        this.b = 1;
        this.d = new ArrayList();
        this.g = 8388613;
        this.h = -1;
        this.i = 0;
        this.k = 80;
    }

    public fx a(fx fxVar) {
        Bundle bundle = new Bundle();
        if (!this.a.isEmpty()) {
            bundle.putParcelableArrayList("actions", fq.a.a((fr[]) this.a.toArray(new fr[this.a.size()])));
        }
        if (this.b != 1) {
            bundle.putInt("flags", this.b);
        }
        if (this.c != null) {
            bundle.putParcelable("displayIntent", this.c);
        }
        if (!this.d.isEmpty()) {
            bundle.putParcelableArray("pages", (Parcelable[]) this.d.toArray(new Notification[this.d.size()]));
        }
        if (this.e != null) {
            bundle.putParcelable("background", this.e);
        }
        if (this.f != 0) {
            bundle.putInt("contentIcon", this.f);
        }
        if (this.g != 8388613) {
            bundle.putInt("contentIconGravity", this.g);
        }
        if (this.h != -1) {
            bundle.putInt("contentActionIndex", this.h);
        }
        if (this.i != 0) {
            bundle.putInt("customSizePreset", this.i);
        }
        if (this.j != 0) {
            bundle.putInt("customContentHeight", this.j);
        }
        if (this.k != 80) {
            bundle.putInt("gravity", this.k);
        }
        if (this.l != 0) {
            bundle.putInt("hintScreenTimeout", this.l);
        }
        if (this.m != null) {
            bundle.putString("dismissalId", this.m);
        }
        fxVar.a().putBundle("android.wearable.EXTENSIONS", bundle);
        return fxVar;
    }

    private gm a() {
        gm gmVar = new gm();
        gmVar.a = new ArrayList(this.a);
        gmVar.b = this.b;
        gmVar.c = this.c;
        gmVar.d = new ArrayList(this.d);
        gmVar.e = this.e;
        gmVar.f = this.f;
        gmVar.g = this.g;
        gmVar.h = this.h;
        gmVar.i = this.i;
        gmVar.j = this.j;
        gmVar.k = this.k;
        gmVar.l = this.l;
        gmVar.m = this.m;
        return gmVar;
    }

    public gm a(fr frVar) {
        this.a.add(frVar);
        return this;
    }

    public gm a(Notification notification) {
        this.d.add(notification);
        return this;
    }

    public gm a(Bitmap bitmap) {
        this.e = bitmap;
        return this;
    }

    public gm a(boolean z) {
        a(8, true);
        return this;
    }

    public gm b(boolean z) {
        a(4, true);
        return this;
    }

    public gm a(int i) {
        this.l = -1;
        return this;
    }

    public gm c(boolean z) {
        a(64, true);
        return this;
    }

    private void a(int i, boolean z) {
        if (z) {
            this.b |= i;
        } else {
            this.b &= i ^ -1;
        }
    }
}
