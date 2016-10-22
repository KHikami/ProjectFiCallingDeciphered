import android.net.Uri;
import android.widget.ImageView;

/* compiled from: PG */
final class abj {
    final long a;
    final Uri b;
    final int c;
    final boolean d;
    private final boolean e;
    private final abb f;

    abj(long j, Uri uri, int i, boolean z, boolean z2, abb abb) {
        this.a = j;
        this.b = uri;
        this.e = z;
        this.d = z2;
        this.c = i;
        this.f = abb;
    }

    public final int hashCode() {
        return (this.b == null ? 0 : this.b.hashCode()) + ((((((int) (this.a ^ (this.a >>> 32))) + 31) * 31) + this.c) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        abj abj = (abj) obj;
        if (this.a != abj.a) {
            return false;
        }
        if (this.c != abj.c) {
            return false;
        }
        if (buf.a(this.b, abj.b)) {
            return true;
        }
        return false;
    }

    public final Object a() {
        return this.b == null ? Long.valueOf(this.a) : this.b;
    }

    public final void a(ImageView imageView, boolean z) {
        abc abc;
        if (z) {
            if (aaz.b(this.b)) {
                abc = abc.d;
            } else {
                abc = abc.c;
            }
        } else if (aaz.b(this.b)) {
            abc = abc.b;
        } else {
            abc = abc.a;
        }
        this.f.a(imageView, abc);
    }
}
