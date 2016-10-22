import android.content.Context;

final class hhj implements hhq {
    hhj() {
    }

    public hhs a(Context context, String str, hhr hhr) {
        hhs hhs = new hhs();
        hhs.b = hhr.a(context, str, true);
        if (hhs.b != 0) {
            hhs.c = 1;
        } else {
            hhs.a = hhr.a(context, str);
            if (hhs.a != 0) {
                hhs.c = -1;
            }
        }
        return hhs;
    }
}
