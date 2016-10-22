package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.widget.TextView;

/* renamed from: fco */
public final class fco {
    boolean a;
    boolean b;
    public String c;
    private final Context d;
    private final int e;

    fco(Context context, int i) {
        this.d = context;
        this.e = i;
    }

    public void a(Context context, OnCancelListener onCancelListener) {
        if (this.b) {
            Dialog dialog = new Dialog(context);
            dialog.requestWindowFeature(1);
            dialog.setContentView(gwb.uz);
            ((TextView) dialog.findViewById(gwb.uv)).setOnClickListener(new fcp(dialog));
            if (onCancelListener != null) {
                dialog.setOnCancelListener(onCancelListener);
            }
            dialog.show();
        } else if (this.a) {
            String str = this.c;
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

    boolean a() {
        return !((bbm) jyn.a(this.d, bbm.class)).f(this.e) && (this.a || this.b);
    }
}
