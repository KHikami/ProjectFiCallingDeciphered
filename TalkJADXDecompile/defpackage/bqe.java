package defpackage;

import android.content.Context;
import android.os.ConditionVariable;
import android.widget.Toast;

/* renamed from: bqe */
final class bqe extends fje {
    final Context a;
    Exception b;
    int c;
    String d;
    final /* synthetic */ bqd e;
    private final ConditionVariable f;

    bqe(bqd bqd, Context context, ConditionVariable conditionVariable) {
        this.e = bqd;
        super(context);
        this.a = context;
        this.f = conditionVariable;
    }

    public void a(int i, bko bko, fek fek, fiu fiu) {
        if (i == this.c) {
            if (fiu.b() != 1) {
                int i2;
                glk.e("Babel_ConvCreator", "Error in RealTimeChatServiceResult returned by conversation creation request: " + fiu.b(), new Object[0]);
                Context context = this.a;
                if (fiu.b() == 4) {
                    i2 = bc.ax;
                } else {
                    i2 = bc.cI;
                }
                Toast.makeText(context, i2, 0).show();
            } else {
                this.d = fek.a;
            }
            this.f.open();
        }
    }

    protected void a(fiu fiu) {
    }

    protected void a(Exception exception) {
        this.b = exception;
        this.f.open();
    }
}
