package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

public final class jfd implements jza, kcd, kcn, kcq {
    private jfl f19956a;
    private jfi f19957b;
    private jfk f19958c;

    public jfd(kbu kbu) {
        kbu.m25514a((kcq) this);
    }

    public void mo645b(Bundle bundle) {
        bundle.putParcelable("requestcodehelper_pending_requests", this.f19957b);
    }

    public void mo643a(Bundle bundle) {
        if (bundle != null) {
            this.f19957b = (jfi) bundle.getParcelable("requestcodehelper_pending_requests");
        } else {
            this.f19957b = new jfi();
        }
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f19956a = (jfl) jyn.m25443a(jfl.class);
        this.f19958c = (jfk) jyn.m25443a(jfk.class);
    }

    public void m24078a(jfe jfe) {
        ArrayList arrayList = new ArrayList(this.f19957b.m24087a());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Integer num = (Integer) obj;
            jfe.mo3486a(num.intValue(), this.f19957b.m24086a(num).intValue());
        }
    }

    public void m24075a(int i) {
        if (TextUtils.isEmpty(this.f19958c.m24089a(i))) {
            throw new IllegalArgumentException("You must use a resource id as the request code to guarantee overlap does not occur");
        }
    }

    public int m24080b(int i) {
        Integer a = this.f19957b.m24086a(Integer.valueOf(i));
        if (a == null) {
            a = Integer.valueOf(this.f19956a.m24090a());
            this.f19957b.m24088a(Integer.valueOf(i), a);
        }
        return a.intValue();
    }

    public boolean m24079a(int i, jfh jfh) {
        for (Integer num : this.f19957b.m24087a()) {
            if (this.f19957b.m24086a(num).intValue() == i) {
                jfh.mo3487a(num.intValue());
                return true;
            }
        }
        return false;
    }
}
