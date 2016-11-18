package p000;

import android.app.PendingIntent;
import com.google.android.apps.hangouts.hangout.StressMode;
import java.util.ArrayList;
import java.util.List;

public class eid {
    public static final int f11582c = 2131492966;
    public static final int f11583d = 2131034131;
    public static final int f11584e = 2131034132;
    public final int f11585a;
    public final int f11586b;
    public final List<String> f11587f = new ArrayList();
    public String f11588g;
    public hg f11589h;
    public PendingIntent f11590i;
    public PendingIntent f11591j;
    public long f11592k;

    public eid(String str) {
        this.f11588g = str;
    }

    public eid m13962a(String str) {
        this.f11587f.add(str);
        return this;
    }

    public eid m13961a(PendingIntent pendingIntent, hg hgVar) {
        this.f11589h = hgVar;
        this.f11591j = pendingIntent;
        return this;
    }

    public eid m13960a(PendingIntent pendingIntent) {
        this.f11590i = pendingIntent;
        return this;
    }

    public eid m13959a(long j) {
        this.f11592k = j;
        return this;
    }

    public StressMode m13958a() {
        return new StressMode((String[]) this.f11587f.toArray(new String[this.f11587f.size()]), this.f11589h, this.f11591j, this.f11590i, new String[]{this.f11588g}, this.f11592k);
    }
}
