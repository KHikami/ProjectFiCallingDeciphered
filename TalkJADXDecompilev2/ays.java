package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

public final class ays implements Callback {
    public static final ays a = new ays();
    final Map<FragmentManager, ayq> b = new HashMap();
    final Map<ed, ayu> c = new HashMap();
    private volatile amu d;
    private final Handler e = new Handler(Looper.getMainLooper(), this);

    ays() {
    }

    private amu b(Context context) {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = new amu(ami.a(context), new ayh(), new aym());
                }
            }
        }
        return this.d;
    }

    public amu a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (baq.b() && !(context instanceof Application)) {
            if (context instanceof dw) {
                return a((dw) context);
            }
            if (context instanceof Activity) {
                return a((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                return a(((ContextWrapper) context).getBaseContext());
            }
        }
        return b(context);
    }

    private amu a(dw dwVar) {
        if (baq.c()) {
            return a(dwVar.getApplicationContext());
        }
        ays.b((Activity) dwVar);
        return a((Context) dwVar, dwVar.J_(), null);
    }

    public amu a(dr drVar) {
        if (drVar.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (baq.c()) {
            return a(drVar.getActivity().getApplicationContext());
        } else {
            return a(drVar.getActivity(), drVar.getChildFragmentManager(), drVar);
        }
    }

    private amu a(Activity activity) {
        if (baq.c() || VERSION.SDK_INT < 11) {
            return a(activity.getApplicationContext());
        }
        ays.b(activity);
        return a((Context) activity, activity.getFragmentManager(), null);
    }

    private static void b(Activity activity) {
        if (VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    ayq a(FragmentManager fragmentManager, Fragment fragment) {
        ayq ayq = (ayq) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (ayq != null) {
            return ayq;
        }
        ayq = (ayq) this.b.get(fragmentManager);
        if (ayq != null) {
            return ayq;
        }
        Fragment ayq2 = new ayq();
        ayq2.a(fragment);
        this.b.put(fragmentManager, ayq2);
        fragmentManager.beginTransaction().add(ayq2, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.e.obtainMessage(1, fragmentManager).sendToTarget();
        return ayq2;
    }

    private amu a(Context context, FragmentManager fragmentManager, Fragment fragment) {
        ayq a = a(fragmentManager, null);
        amu b = a.b();
        if (b != null) {
            return b;
        }
        b = new amu(ami.a(context), a.a(), a.c());
        a.a(b);
        return b;
    }

    ayu a(ed edVar, dr drVar) {
        ayu ayu = (ayu) edVar.a("com.bumptech.glide.manager");
        if (ayu != null) {
            return ayu;
        }
        ayu = (ayu) this.c.get(edVar);
        if (ayu != null) {
            return ayu;
        }
        dr ayu2 = new ayu();
        ayu2.a(drVar);
        this.c.put(edVar, ayu2);
        edVar.a().a(ayu2, "com.bumptech.glide.manager").b();
        this.e.obtainMessage(2, edVar).sendToTarget();
        return ayu2;
    }

    private amu a(Context context, ed edVar, dr drVar) {
        ayu a = a(edVar, drVar);
        amu b = a.b();
        if (b != null) {
            return b;
        }
        b = new amu(ami.a(context), a.a(), a.c());
        a.a(b);
        return b;
    }

    public boolean handleMessage(Message message) {
        Object obj = null;
        boolean z = true;
        Object remove;
        switch (message.what) {
            case 1:
                FragmentManager fragmentManager = (FragmentManager) message.obj;
                remove = this.b.remove(fragmentManager);
                break;
            case 2:
                ed edVar = (ed) message.obj;
                remove = this.c.remove(edVar);
                break;
            default:
                z = false;
                remove = null;
                break;
        }
        if (z && r1 == null && Log.isLoggable("RMRetriever", 5)) {
            String valueOf = String.valueOf(obj);
            new StringBuilder(String.valueOf(valueOf).length() + 61).append("Failed to remove expected request manager fragment, manager: ").append(valueOf);
        }
        return z;
    }
}
