import android.app.Activity;
import android.content.Context;
import java.util.Objects;

/* compiled from: PG */
public final class bhu implements awm {
    private final Context a;
    private final bja b;
    private final bhm c;

    public bhu(Context context, bja bja, bhm bhm) {
        this.a = (Context) Objects.requireNonNull(context);
        this.b = (bja) Objects.requireNonNull(bja);
        this.c = (bhm) Objects.requireNonNull(bhm);
    }

    public final void a(int i) {
        dem det = new det();
        det.d = buf.f(this.a, i);
        this.b.a(new bqj(det), i);
    }

    public final void a(int i, String str, long j) {
        dem det = new det();
        det.d = buf.a(this.a, i, str, j);
        this.b.a(new bqj(det), i);
    }

    public final void b(int i) {
        dem det = new det();
        det.c = new dev();
        det.c.a = i;
        this.b.a(new bqj(det));
    }

    public final void a(String str, String str2, String str3, long j) {
        bhm bhm = this.c;
        bhm.a();
        bmx bmx = bhm.a;
        bms bms = new bms();
        bms.a("&ec", str);
        bms.a("&ea", str2);
        bms.a("&el", str3);
        bms.a("&ev", Long.toString(j));
        bmx.a(bms.a());
    }

    public final void a(int i, Activity activity) {
        dem det = new det();
        det.b = new dew();
        det.b.a = i;
        this.b.a(new bqj(det));
        bhm bhm = this.c;
        bhm.a();
        bmx bmx = bhm.a;
        String valueOf = String.valueOf(activity.getClass().getName());
        String valueOf2 = String.valueOf(buf.k(i));
        bmx.a("&cd", new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(".").append(valueOf2).toString());
        bhm.a.a(new bmr().a());
    }
}
