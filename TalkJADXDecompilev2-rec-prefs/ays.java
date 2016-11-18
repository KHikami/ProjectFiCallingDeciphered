package p000;

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
    public static final ays f2555a = new ays();
    final Map<FragmentManager, ayq> f2556b = new HashMap();
    final Map<ed, ayu> f2557c = new HashMap();
    private volatile amu f2558d;
    private final Handler f2559e = new Handler(Looper.getMainLooper(), this);

    ays() {
    }

    private amu m4362b(Context context) {
        if (this.f2558d == null) {
            synchronized (this) {
                if (this.f2558d == null) {
                    this.f2558d = new amu(ami.m2900a(context), new ayh(), new aym());
                }
            }
        }
        return this.f2558d;
    }

    public amu m4364a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (baq.m4688b() && !(context instanceof Application)) {
            if (context instanceof dw) {
                return m4361a((dw) context);
            }
            if (context instanceof Activity) {
                return m4358a((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                return m4364a(((ContextWrapper) context).getBaseContext());
            }
        }
        return m4362b(context);
    }

    private amu m4361a(dw dwVar) {
        if (baq.m4690c()) {
            return m4364a(dwVar.getApplicationContext());
        }
        ays.m4363b((Activity) dwVar);
        return m4360a((Context) dwVar, dwVar.J_(), null);
    }

    public amu m4365a(dr drVar) {
        if (drVar.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (baq.m4690c()) {
            return m4364a(drVar.getActivity().getApplicationContext());
        } else {
            return m4360a(drVar.getActivity(), drVar.getChildFragmentManager(), drVar);
        }
    }

    private amu m4358a(Activity activity) {
        if (baq.m4690c() || VERSION.SDK_INT < 11) {
            return m4364a(activity.getApplicationContext());
        }
        ays.m4363b(activity);
        return m4359a((Context) activity, activity.getFragmentManager(), null);
    }

    private static void m4363b(Activity activity) {
        if (VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    ayq m4366a(FragmentManager fragmentManager, Fragment fragment) {
        ayq ayq = (ayq) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (ayq != null) {
            return ayq;
        }
        ayq = (ayq) this.f2556b.get(fragmentManager);
        if (ayq != null) {
            return ayq;
        }
        Fragment ayq2 = new ayq();
        ayq2.m4355a(fragment);
        this.f2556b.put(fragmentManager, ayq2);
        fragmentManager.beginTransaction().add(ayq2, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.f2559e.obtainMessage(1, fragmentManager).sendToTarget();
        return ayq2;
    }

    private amu m4359a(Context context, FragmentManager fragmentManager, Fragment fragment) {
        ayq a = m4366a(fragmentManager, null);
        amu b = a.m4356b();
        if (b != null) {
            return b;
        }
        b = new amu(ami.m2900a(context), a.m4353a(), a.m4357c());
        a.m4354a(b);
        return b;
    }

    ayu m4367a(ed edVar, dr drVar) {
        ayu ayu = (ayu) edVar.mo1844a("com.bumptech.glide.manager");
        if (ayu != null) {
            return ayu;
        }
        ayu = (ayu) this.f2557c.get(edVar);
        if (ayu != null) {
            return ayu;
        }
        dr ayu2 = new ayu();
        ayu2.m4378a(drVar);
        this.f2557c.put(edVar, ayu2);
        edVar.mo1845a().mo1528a(ayu2, "com.bumptech.glide.manager").mo1529b();
        this.f2559e.obtainMessage(2, edVar).sendToTarget();
        return ayu2;
    }

    private amu m4360a(Context context, ed edVar, dr drVar) {
        ayu a = m4367a(edVar, drVar);
        amu b = a.m4379b();
        if (b != null) {
            return b;
        }
        b = new amu(ami.m2900a(context), a.m4376a(), a.m4380c());
        a.m4377a(b);
        return b;
    }

    public boolean handleMessage(Message message) {
        Object obj = null;
        boolean z = true;
        Object remove;
        switch (message.what) {
            case 1:
                FragmentManager fragmentManager = (FragmentManager) message.obj;
                remove = this.f2556b.remove(fragmentManager);
                break;
            case 2:
                ed edVar = (ed) message.obj;
                remove = this.f2557c.remove(edVar);
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
