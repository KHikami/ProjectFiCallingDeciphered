import android.content.Context;
import java.util.ArrayList;

final class cad implements byp {
    private final Context a;
    private final kbu b;
    private final jyn c;

    public cad(Context context, kbu kbu, jyn jyn) {
        this.a = context;
        this.b = kbu;
        this.c = jyn;
    }

    private byo b(Iterable<byn> iterable) {
        return new cac(this.a, this.b, iterable);
    }

    public byo a(Iterable<Class<?>> iterable) {
        Iterable arrayList = new ArrayList();
        for (Class b : iterable) {
            byn byn = (byn) this.c.b(b);
            if (byn != null) {
                arrayList.add(byn);
            }
        }
        return b(arrayList);
    }
}
