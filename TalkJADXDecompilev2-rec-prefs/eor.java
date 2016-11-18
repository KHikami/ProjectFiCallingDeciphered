package p000;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

final class eor extends eov {
    final /* synthetic */ eon f11949a;

    eor(eon eon) {
        this.f11949a = eon;
        super(eon);
    }

    boolean mo1924a() {
        long toMicros = TimeUnit.MILLISECONDS.toMicros(glj.m17956a());
        long d = ((fuz) jyn.m25426a(this.f11949a.f11938e, fuz.class)).m16296d(this.f11949a.f11939f);
        if (toMicros > d) {
            return false;
        }
        this.f11949a.f11937d.postDelayed(this.f11949a.f11942i, TimeUnit.MICROSECONDS.toMillis(d) - glj.m17956a());
        return true;
    }

    gag mo1925b() {
        long d = ((fuz) jyn.m25426a(this.f11949a.f11938e, fuz.class)).m16296d(this.f11949a.f11939f);
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(new Date(d / 1000));
        Object obj = "";
        if (instance2.get(6) > instance.get(6)) {
            obj = String.valueOf(instance2.getDisplayName(7, 1, Locale.getDefault())).concat(" ");
        }
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(this.f11949a.f11938e);
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(timeFormat.format(instance2.getTime()));
        if (valueOf2.length() != 0) {
            valueOf2 = valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
        return new gah(this.f11949a.f11938e).m16814a(this.f11949a.f11938e.getString(bc.hJ, new Object[]{valueOf2})).m16817c(this.f11949a.f11938e.getString(bc.hL)).m16813a(new eos(this)).m16811a();
    }
}
