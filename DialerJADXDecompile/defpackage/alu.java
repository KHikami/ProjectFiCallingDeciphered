package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dialer.app.DialtactsActivity;

/* compiled from: PG */
/* renamed from: alu */
final class alu implements OnClickListener {
    private /* synthetic */ alt a;

    alu(alt alt) {
        this.a = alt;
    }

    public final void onClick(View view) {
        amv amv = (amv) view.getTag();
        if (amv != null) {
            if (this.a.d != null) {
                this.a.d.a();
            }
            if (amv.d() == this.a.k) {
                amv.b(false);
                this.a.k = -1;
                this.a.l = -1;
                return;
            }
            if (amv.J == 3) {
                Context context = this.a.c;
                long[] jArr = amv.C;
                if (buf.h(context)) {
                    if (ame.b == null) {
                        ame.b = avn.b();
                    }
                    avm avm = ame.b;
                    amn amn = amn.MARK_CALL_READ;
                    avm.a(new amj(jArr, context), new Void[0]);
                }
                if (this.a.g == 3) {
                    ((DialtactsActivity) view.getContext()).l.a();
                }
            }
            ys ysVar = this.a;
            if (ysVar.k != -1) {
                ysVar.a.a(ysVar.k, 1, null);
            }
            amv.b(true);
            ysVar.k = amv.d();
            ysVar.l = amv.B;
        }
    }
}
