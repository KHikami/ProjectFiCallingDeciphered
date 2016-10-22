import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

class gd {
    public Notification a(fx fxVar, fy fyVar) {
        Notification a = gwb.a(fxVar.F, fxVar.a, fxVar.d(), fxVar.c(), fxVar.d, fxVar.e);
        if (fxVar.j > 0) {
            a.flags |= 128;
        }
        if (fxVar.C != null) {
            a.contentView = fxVar.C;
        }
        return a;
    }

    public Bundle a(Notification notification) {
        return null;
    }

    public ArrayList<Parcelable> a(fr[] frVarArr) {
        return null;
    }

    gd() {
    }
}
