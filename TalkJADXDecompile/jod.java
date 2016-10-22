import android.content.Context;

final class jod extends jgc {
    private final jcr a;

    public jod(String str, jcr jcr) {
        super(str);
        this.a = jcr;
    }

    protected jgz a(Context context) {
        try {
            jco[] a = this.a.a();
            String[] strArr = new String[a.length];
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = a[i].a();
            }
            jgz jgz = new jgz(true);
            jgz.d().putStringArray("account_name_array", strArr);
            return jgz;
        } catch (jct e) {
            return new jgz(false);
        }
    }
}
