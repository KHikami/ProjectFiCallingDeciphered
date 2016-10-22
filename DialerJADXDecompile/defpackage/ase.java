package defpackage;

import android.net.Uri;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: ase */
final class ase implements Runnable {
    private /* synthetic */ Uri a;
    private /* synthetic */ asd b;

    ase(asd asd, Uri uri) {
        this.b = asd;
        this.a = uri;
    }

    public final void run() {
        if (Objects.equals(this.a, this.b.a.d)) {
            ame.a(this.b.a.b, this.a, this.b.a);
        }
    }
}
