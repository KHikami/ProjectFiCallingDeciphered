package defpackage;

import android.app.Fragment;
import android.app.FragmentManager;
import android.view.ViewGroup;
import com.android.dialer.app.calllog.CallLogActivity;

/* compiled from: PG */
/* renamed from: als */
public final class als extends cd {
    private /* synthetic */ CallLogActivity c;

    public als(CallLogActivity callLogActivity, FragmentManager fragmentManager) {
        this.c = callLogActivity;
        super(fragmentManager);
    }

    public final long b(int i) {
        CallLogActivity callLogActivity = this.c;
        if (buf.k()) {
            als als = callLogActivity.g;
            i = 1 - i;
        }
        return (long) i;
    }

    public final Fragment a(int i) {
        int i2;
        CallLogActivity callLogActivity = this.c;
        if (buf.k()) {
            als als = callLogActivity.g;
            i2 = 1 - i;
        } else {
            i2 = i;
        }
        switch (i2) {
            case rl.c /*0*/:
                return new amo(-1, true);
            case rq.b /*1*/:
                return new amo(3, true);
            default:
                throw new IllegalStateException("No fragment at position " + i);
        }
    }

    public final Object a(ViewGroup viewGroup, int i) {
        amo amo = (amo) super.a(viewGroup, i);
        switch (i) {
            case rl.c /*0*/:
                this.c.h = amo;
                break;
        }
        return amo;
    }

    public final CharSequence c(int i) {
        return this.c.i[i];
    }

    public final int a() {
        return 2;
    }
}
