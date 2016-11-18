package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

public final class bey implements OnClickListener {
    final /* synthetic */ Context f3172a;
    final /* synthetic */ int f3173b;

    public bey(Context context, int i) {
        this.f3172a = context;
        this.f3173b = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        eqa eqa = (eqa) jyn.m25433b(this.f3172a, eqa.class);
        if (eqa != null) {
            this.f3172a.startActivity(eqa.mo1930a(this.f3172a, this.f3173b, epw.SETTINGS));
        }
    }
}
