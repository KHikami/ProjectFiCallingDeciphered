import android.content.Context;

public abstract class euc extends esw {
    private static final long serialVersionUID = 1;

    protected fom j() {
        return fom.MESI_API;
    }

    public static off a(boolean z) {
        int i;
        off off = new off();
        if (z) {
            i = 408;
        } else {
            i = 407;
        }
        off.b = Integer.valueOf(i);
        off.c = Integer.valueOf(2);
        if (gwb.az(gwb.H())) {
            i = 3;
        } else {
            i = 2;
        }
        off.a = Integer.valueOf(i);
        return off;
    }

    protected String c(Context context) {
        return gwb.b(context, "babel_room_server_apiary_trace_token", fls.f);
    }
}
