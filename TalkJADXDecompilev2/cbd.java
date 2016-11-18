package defpackage;

import android.app.Activity;
import android.content.Context;

public abstract class cbd implements jze, jzr {
    public abstract void a(Context context, kbu kbu, jyn jyn);

    public void a(Activity activity, kbu kbu, jyn jyn) {
        a((Context) activity, kbu, jyn);
    }

    public void a(dr drVar, kbu kbu, jyn jyn) {
        a(drVar.getContext(), kbu, jyn);
    }
}
