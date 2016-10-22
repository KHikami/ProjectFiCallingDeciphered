import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;

public final class btw extends gpf implements btd {
    String a;

    public btw(Context context) {
        this(context, null);
    }

    private btw(Context context, AttributeSet attributeSet) {
        super(context, null);
    }

    public boolean a() {
        return false;
    }

    public void a(btf btf) {
        Activity activity;
        bko e = fde.e(((jca) jyn.a(getContext(), jca.class)).a());
        String str = btf.c;
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
        }
        activity = null;
        a(btf.s.a());
        if (activity == null || str == null || ("image/gif".equals(btf.s.j) && !gkd.a(getContext()))) {
            setOnClickListener(null);
            setClickable(false);
        } else {
            setOnClickListener(new btx(this, activity, e, str));
            setClickable(true);
        }
        a(ba.hQ);
        a(e, true, this.a, btf.s.c, btf.s.d, btf.s.n);
    }

    public void b(btf btf) {
        a(btf.s.a());
    }

    protected boolean b() {
        return false;
    }

    public void a(String str) {
        this.a = str;
    }
}
