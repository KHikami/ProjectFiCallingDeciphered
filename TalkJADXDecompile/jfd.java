import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

public final class jfd implements jza, kcd, kcn, kcq {
    private jfl a;
    private jfi b;
    private jfk c;

    public jfd(kbu kbu) {
        kbu.a((kcq) this);
    }

    public void b(Bundle bundle) {
        bundle.putParcelable("requestcodehelper_pending_requests", this.b);
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            this.b = (jfi) bundle.getParcelable("requestcodehelper_pending_requests");
        } else {
            this.b = new jfi();
        }
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.a = (jfl) jyn.a(jfl.class);
        this.c = (jfk) jyn.a(jfk.class);
    }

    public void a(jfe jfe) {
        ArrayList arrayList = new ArrayList(this.b.a());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Integer num = (Integer) obj;
            jfe.a(num.intValue(), this.b.a(num).intValue());
        }
    }

    public void a(int i) {
        if (TextUtils.isEmpty(this.c.a(i))) {
            throw new IllegalArgumentException("You must use a resource id as the request code to guarantee overlap does not occur");
        }
    }

    public int b(int i) {
        Integer a = this.b.a(Integer.valueOf(i));
        if (a == null) {
            a = Integer.valueOf(this.a.a());
            this.b.a(Integer.valueOf(i), a);
        }
        return a.intValue();
    }

    public boolean a(int i, jfh jfh) {
        for (Integer num : this.b.a()) {
            if (this.b.a(num).intValue() == i) {
                jfh.a(num.intValue());
                return true;
            }
        }
        return false;
    }
}
