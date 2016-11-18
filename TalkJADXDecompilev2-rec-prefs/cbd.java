package p000;

import android.app.Activity;
import android.content.Context;

public abstract class cbd implements jze, jzr {
    public abstract void mo789a(Context context, kbu kbu, jyn jyn);

    public void mo674a(Activity activity, kbu kbu, jyn jyn) {
        mo789a((Context) activity, kbu, jyn);
    }

    public void mo675a(dr drVar, kbu kbu, jyn jyn) {
        mo789a(drVar.getContext(), kbu, jyn);
    }
}
