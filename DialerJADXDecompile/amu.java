import android.content.res.Resources;
import android.text.TextUtils;

/* compiled from: PG */
final class amu {
    final anw a;
    final Resources b;
    final aob c;

    public amu(anw anw, Resources resources, aob aob) {
        this.a = anw;
        this.b = resources;
        this.c = aob;
    }

    static CharSequence a(ala ala) {
        if (!TextUtils.isEmpty(ala.a())) {
            return ala.a();
        }
        String valueOf = String.valueOf(ala.w);
        String valueOf2 = String.valueOf(ala.b);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
