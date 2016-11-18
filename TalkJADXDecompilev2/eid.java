package defpackage;

import android.app.PendingIntent;
import com.google.android.apps.hangouts.hangout.StressMode;
import java.util.ArrayList;
import java.util.List;

public class eid {
    public static final int c = 2131492966;
    public static final int d = 2131034131;
    public static final int e = 2131034132;
    public final int a;
    public final int b;
    public final List<String> f = new ArrayList();
    public String g;
    public hg h;
    public PendingIntent i;
    public PendingIntent j;
    public long k;

    public eid(String str) {
        this.g = str;
    }

    public eid a(String str) {
        this.f.add(str);
        return this;
    }

    public eid a(PendingIntent pendingIntent, hg hgVar) {
        this.h = hgVar;
        this.j = pendingIntent;
        return this;
    }

    public eid a(PendingIntent pendingIntent) {
        this.i = pendingIntent;
        return this;
    }

    public eid a(long j) {
        this.k = j;
        return this;
    }

    public StressMode a() {
        return new StressMode((String[]) this.f.toArray(new String[this.f.size()]), this.h, this.j, this.i, new String[]{this.g}, this.k);
    }
}
