package defpackage;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: eor */
final class eor extends eov {
    final /* synthetic */ eon a;

    eor(eon eon) {
        this.a = eon;
        super(eon);
    }

    boolean a() {
        long toMicros = TimeUnit.MILLISECONDS.toMicros(glj.a());
        long d = ((fuz) jyn.a(this.a.e, fuz.class)).d(this.a.f);
        if (toMicros > d) {
            return false;
        }
        this.a.d.postDelayed(this.a.i, TimeUnit.MICROSECONDS.toMillis(d) - glj.a());
        return true;
    }

    gag b() {
        long d = ((fuz) jyn.a(this.a.e, fuz.class)).d(this.a.f);
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(new Date(d / 1000));
        Object obj = "";
        if (instance2.get(6) > instance.get(6)) {
            obj = String.valueOf(instance2.getDisplayName(7, 1, Locale.getDefault())).concat(" ");
        }
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(this.a.e);
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(timeFormat.format(instance2.getTime()));
        if (valueOf2.length() != 0) {
            valueOf2 = valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
        return new gah(this.a.e).a(this.a.e.getString(bc.hJ, new Object[]{valueOf2})).c(this.a.e.getString(bc.hL)).a(new eos(this)).a();
    }
}
