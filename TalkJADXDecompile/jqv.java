import android.content.Context;

@Deprecated
public final class jqv {
    private jrc a;

    public jqv(Context context) {
        ba.a((Object) context, (Object) "context must be non-null");
        this.a = new jrc(context);
    }

    public jqv a(String str) {
        this.a.a(str);
        return this;
    }

    public jqv b(String str) {
        this.a.b(str);
        return this;
    }

    public jqv a(jre jre) {
        this.a.a(jre);
        return this;
    }

    public jqv a(jrk jrk) {
        this.a.a((jrk) ba.a((Object) jrk));
        return this;
    }

    public jqu a() {
        return new jqu(this.a);
    }
}
