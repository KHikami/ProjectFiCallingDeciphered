package p000;

import android.content.Context;
import android.os.ConditionVariable;
import android.widget.Toast;

final class bqe extends fje {
    final Context f4207a;
    Exception f4208b;
    int f4209c;
    String f4210d;
    final /* synthetic */ bqd f4211e;
    private final ConditionVariable f4212f;

    bqe(bqd bqd, Context context, ConditionVariable conditionVariable) {
        this.f4211e = bqd;
        super(context);
        this.f4207a = context;
        this.f4212f = conditionVariable;
    }

    public void mo650a(int i, bko bko, fek fek, fiu fiu) {
        if (i == this.f4209c) {
            if (fiu.m15391b() != 1) {
                int i2;
                glk.m17982e("Babel_ConvCreator", "Error in RealTimeChatServiceResult returned by conversation creation request: " + fiu.m15391b(), new Object[0]);
                Context context = this.f4207a;
                if (fiu.m15391b() == 4) {
                    i2 = bc.ax;
                } else {
                    i2 = bc.cI;
                }
                Toast.makeText(context, i2, 0).show();
            } else {
                this.f4210d = fek.f12913a;
            }
            this.f4212f.open();
        }
    }

    protected void mo651a(fiu fiu) {
    }

    protected void mo652a(Exception exception) {
        this.f4208b = exception;
        this.f4212f.open();
    }
}
