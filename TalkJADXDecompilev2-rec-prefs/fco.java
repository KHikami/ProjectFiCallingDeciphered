package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.widget.TextView;

public final class fco {
    boolean f12697a;
    boolean f12698b;
    public String f12699c;
    private final Context f12700d;
    private final int f12701e;

    fco(Context context, int i) {
        this.f12700d = context;
        this.f12701e = i;
    }

    public void m14968a(Context context, OnCancelListener onCancelListener) {
        if (this.f12698b) {
            Dialog dialog = new Dialog(context);
            dialog.requestWindowFeature(1);
            dialog.setContentView(gwb.uz);
            ((TextView) dialog.findViewById(gwb.uv)).setOnClickListener(new fcp(dialog));
            if (onCancelListener != null) {
                dialog.setOnCancelListener(onCancelListener);
            }
            dialog.show();
        } else if (this.f12697a) {
            String str = this.f12699c;
            CharSequence string = context.getString(gwb.uC, new Object[]{"11"});
            Dialog dialog2 = new Dialog(context);
            dialog2.requestWindowFeature(1);
            dialog2.setContentView(gwb.uy);
            ((TextView) dialog2.findViewById(gwb.ux)).setText(new StringBuilder(String.valueOf(str).length() + 2).append("\"").append(str).append("\"").toString());
            ((TextView) dialog2.findViewById(gwb.uw)).setText(string);
            ((TextView) dialog2.findViewById(gwb.uv)).setOnClickListener(new fcq(dialog2));
            if (onCancelListener != null) {
                dialog2.setOnCancelListener(onCancelListener);
            }
            dialog2.show();
        }
    }

    boolean m14969a() {
        return !((bbm) jyn.m25426a(this.f12700d, bbm.class)).mo446f(this.f12701e) && (this.f12697a || this.f12698b);
    }
}
