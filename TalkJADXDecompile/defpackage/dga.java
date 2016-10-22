package defpackage;

/* renamed from: dga */
public abstract class dga implements djx {
    public /* synthetic */ int compareTo(Object obj) {
        return a((djx) obj);
    }

    public int a(djx djx) {
        boolean z;
        if (djx.a() != a()) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        return a() - djx.a();
    }
}
