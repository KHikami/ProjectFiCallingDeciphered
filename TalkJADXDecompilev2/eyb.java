package defpackage;

import java.io.Serializable;
import java.util.Calendar;

public final class eyb implements Serializable {
    private static final long serialVersionUID = 1;
    public String a;
    public String b;
    public int c;
    public Calendar d;
    public Calendar e;

    public static Calendar a(kpd kpd) {
        if (kpd == null) {
            return Calendar.getInstance();
        }
        Calendar instance = Calendar.getInstance();
        instance.set(gwb.a(kpd.c), gwb.a(kpd.b), gwb.a(kpd.a));
        return instance;
    }
}
