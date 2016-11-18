package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

public final class gm implements fz {
    private ArrayList<fr> f15621a = new ArrayList();
    private int f15622b = 1;
    private PendingIntent f15623c;
    private ArrayList<Notification> f15624d = new ArrayList();
    private Bitmap f15625e;
    private int f15626f;
    private int f15627g = 8388613;
    private int f15628h = -1;
    private int f15629i = 0;
    private int f15630j;
    private int f15631k = 80;
    private int f15632l;
    private String f15633m;

    public /* synthetic */ Object clone() {
        return m18063a();
    }

    public fx mo1800a(fx fxVar) {
        Bundle bundle = new Bundle();
        if (!this.f15621a.isEmpty()) {
            bundle.putParcelableArrayList("actions", fq.f13726a.mo2205a((fr[]) this.f15621a.toArray(new fr[this.f15621a.size()])));
        }
        if (this.f15622b != 1) {
            bundle.putInt("flags", this.f15622b);
        }
        if (this.f15623c != null) {
            bundle.putParcelable("displayIntent", this.f15623c);
        }
        if (!this.f15624d.isEmpty()) {
            bundle.putParcelableArray("pages", (Parcelable[]) this.f15624d.toArray(new Notification[this.f15624d.size()]));
        }
        if (this.f15625e != null) {
            bundle.putParcelable("background", this.f15625e);
        }
        if (this.f15626f != 0) {
            bundle.putInt("contentIcon", this.f15626f);
        }
        if (this.f15627g != 8388613) {
            bundle.putInt("contentIconGravity", this.f15627g);
        }
        if (this.f15628h != -1) {
            bundle.putInt("contentActionIndex", this.f15628h);
        }
        if (this.f15629i != 0) {
            bundle.putInt("customSizePreset", this.f15629i);
        }
        if (this.f15630j != 0) {
            bundle.putInt("customContentHeight", this.f15630j);
        }
        if (this.f15631k != 80) {
            bundle.putInt("gravity", this.f15631k);
        }
        if (this.f15632l != 0) {
            bundle.putInt("hintScreenTimeout", this.f15632l);
        }
        if (this.f15633m != null) {
            bundle.putString("dismissalId", this.f15633m);
        }
        fxVar.m16416a().putBundle("android.wearable.EXTENSIONS", bundle);
        return fxVar;
    }

    private gm m18063a() {
        gm gmVar = new gm();
        gmVar.f15621a = new ArrayList(this.f15621a);
        gmVar.f15622b = this.f15622b;
        gmVar.f15623c = this.f15623c;
        gmVar.f15624d = new ArrayList(this.f15624d);
        gmVar.f15625e = this.f15625e;
        gmVar.f15626f = this.f15626f;
        gmVar.f15627g = this.f15627g;
        gmVar.f15628h = this.f15628h;
        gmVar.f15629i = this.f15629i;
        gmVar.f15630j = this.f15630j;
        gmVar.f15631k = this.f15631k;
        gmVar.f15632l = this.f15632l;
        gmVar.f15633m = this.f15633m;
        return gmVar;
    }

    public gm m18069a(fr frVar) {
        this.f15621a.add(frVar);
        return this;
    }

    public gm m18067a(Notification notification) {
        this.f15624d.add(notification);
        return this;
    }

    public gm m18068a(Bitmap bitmap) {
        this.f15625e = bitmap;
        return this;
    }

    public gm m18070a(boolean z) {
        m18064a(8, true);
        return this;
    }

    public gm m18071b(boolean z) {
        m18064a(4, true);
        return this;
    }

    public gm m18066a(int i) {
        this.f15632l = -1;
        return this;
    }

    public gm m18072c(boolean z) {
        m18064a(64, true);
        return this;
    }

    private void m18064a(int i, boolean z) {
        if (z) {
            this.f15622b |= i;
        } else {
            this.f15622b &= i ^ -1;
        }
    }
}
