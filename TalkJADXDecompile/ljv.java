import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;

final class ljv implements Runnable {
    final /* synthetic */ UUID a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ mti c;
    final /* synthetic */ lju d;

    ljv(lju lju, UUID uuid, ArrayList arrayList, mti mti) {
        this.d = lju;
        this.a = uuid;
        this.b = arrayList;
        this.c = mti;
    }

    public void run() {
        this.d.c.remove(this.a);
        List unmodifiableList = Collections.unmodifiableList(this.b);
        lkb.b(ljg.b);
        try {
            for (ljs ljw : (Set) this.d.b.a()) {
                this.c.a(ljy.a(new ljw(this, ljw, unmodifiableList)), this.d.a);
            }
        } finally {
            lkb.b(null);
        }
    }
}
