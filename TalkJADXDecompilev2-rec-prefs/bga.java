package p000;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

public final class bga extends hv<beq> {
    private Context f3255f;
    private int f3256g;
    private bet f3257h;

    public /* synthetic */ Object mo213d() {
        return m5100h();
    }

    public bga(Context context, bet bet) {
        super(context);
        this.f3255f = context;
        this.f3256g = ((jca) jyn.m25426a(context, jca.class)).mo2317a();
        this.f3257h = bet;
    }

    private beq m5100h() {
        if (!gwb.m2222g(this.f3255f, this.f3256g)) {
            return null;
        }
        Context context = this.f3255f;
        int i = this.f3256g;
        bet bet = this.f3257h;
        if (!bes.f3161c.containsKey(Integer.valueOf(i))) {
            bes.f3161c.put(Integer.valueOf(i), new HashSet());
        }
        ((Set) bes.f3161c.get(Integer.valueOf(i))).add(bet);
        return bes.m5025a(context, i);
    }
}
