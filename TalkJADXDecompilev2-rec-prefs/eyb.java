package p000;

import java.io.Serializable;
import java.util.Calendar;

public final class eyb implements Serializable {
    private static final long serialVersionUID = 1;
    public String f12461a;
    public String f12462b;
    public int f12463c;
    public Calendar f12464d;
    public Calendar f12465e;

    public static Calendar m14768a(kpd kpd) {
        if (kpd == null) {
            return Calendar.getInstance();
        }
        Calendar instance = Calendar.getInstance();
        instance.set(gwb.m1507a(kpd.f22615c), gwb.m1507a(kpd.f22614b), gwb.m1507a(kpd.f22613a));
        return instance;
    }
}
