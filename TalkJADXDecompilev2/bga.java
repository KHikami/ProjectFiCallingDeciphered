package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

public final class bga extends hv<beq> {
    private Context f;
    private int g;
    private bet h;

    public /* synthetic */ Object d() {
        return h();
    }

    public bga(Context context, bet bet) {
        super(context);
        this.f = context;
        this.g = ((jca) jyn.a(context, jca.class)).a();
        this.h = bet;
    }

    private beq h() {
        if (!gwb.g(this.f, this.g)) {
            return null;
        }
        Context context = this.f;
        int i = this.g;
        bet bet = this.h;
        if (!bes.c.containsKey(Integer.valueOf(i))) {
            bes.c.put(Integer.valueOf(i), new HashSet());
        }
        ((Set) bes.c.get(Integer.valueOf(i))).add(bet);
        return bes.a(context, i);
    }
}
