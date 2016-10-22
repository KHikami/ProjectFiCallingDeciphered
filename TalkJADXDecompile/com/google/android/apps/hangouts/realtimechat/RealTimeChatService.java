package com.google.android.apps.hangouts.realtimechat;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import bc;
import bhl;
import bhm;
import bko;
import bkq;
import blf;
import blo;
import bls;
import bnz;
import boy;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.phone.DebugActivity;
import com.google.android.apps.hangouts.phone.PackageReplacedReceiver;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import com.google.api.client.http.HttpStatusCodes;
import dfm;
import duj;
import duv;
import ect;
import edo;
import ets;
import evz;
import ewg;
import ezj;
import fbt;
import fde;
import fdn;
import fdo;
import fdq;
import fdv;
import feh;
import fek;
import fey;
import ffv;
import fgm;
import fgz;
import fhb;
import fhc;
import fhf;
import fhg;
import fhh;
import fhl;
import fhm;
import fhn;
import fho;
import fhq;
import fhu;
import fhw;
import fia;
import fib;
import fie;
import fif;
import fig;
import fih;
import fii;
import fik;
import fil;
import fim;
import fin;
import fio;
import fip;
import fiu;
import fiz;
import fji;
import fjj;
import fjl;
import fki;
import fkn;
import flm;
import flo;
import flt;
import fme;
import fmf;
import fnn;
import fny;
import foh;
import fok;
import fqj;
import fqu;
import fwx;
import fwy;
import fx;
import giu;
import gjk;
import gks;
import gkv;
import glj;
import glk;
import glq;
import gma;
import gwb;
import hkh;
import iih;
import iil;
import iin;
import iiq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import jck;
import juh;
import jyn;
import kae;
import mav;
import mbr;
import nzf;
import wi;

public class RealTimeChatService extends IntentService {
    public static final boolean a;
    public static final gma b;
    public static final Object c;
    public static String d;
    public static Set<String> e;
    public static final CopyOnWriteArrayList<fip> f;
    public static final CopyOnWriteArrayList<fil> g;
    static iin<fik> h;
    public static final Handler i;
    static final Object j;
    public static final SparseArray<Long> k;
    private static boolean n;
    private static final int o;
    private static volatile fin p;
    private static volatile fio q;
    private static Map<Integer, Pair<String, mav>> r;
    private static AtomicInteger s;
    private static final Object t;
    private static WakeLock u;
    private static boolean v;
    private static final ScheduledExecutorService w;
    private static final SparseArray<ScheduledFuture> x;
    public volatile fny l;
    public flm m;
    private boolean y;
    private ServiceConnection z;

    public class AlarmReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if (RealTimeChatService.a) {
                String valueOf = String.valueOf(intent);
                String valueOf2 = String.valueOf(intent.getAction());
                String valueOf3 = String.valueOf(RealTimeChatService.e(intent.getIntExtra("op", 0)));
                new StringBuilder(((String.valueOf(valueOf).length() + 34) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("AlarmReceiver.onReceive ").append(valueOf).append(" ").append(valueOf2).append(" opcode: ").append(valueOf3);
            }
            RealTimeChatService.b(intent);
        }
    }

    static {
        kae kae = glk.o;
        a = false;
        b = gma.a("RTCS");
        n = false;
        o = Process.myPid();
        p = null;
        q = null;
        c = new Object();
        r = new ConcurrentHashMap();
        s = new AtomicInteger();
        f = new CopyOnWriteArrayList();
        g = new CopyOnWriteArrayList();
        t = new Object();
        i = new Handler(Looper.getMainLooper());
        j = new Object();
        w = Executors.newSingleThreadScheduledExecutor();
        x = new SparseArray();
        k = new SparseArray();
        gwb.a(new fhq());
    }

    public static void a() {
        boolean a = gwb.a(gwb.H(), "babel_log_dump", false);
        synchronized (j) {
            if (a) {
                if (h == null) {
                    h = new iin(100);
                    v = a;
                }
            }
            if (!(a || h == null)) {
                h = null;
            }
            v = a;
        }
    }

    public RealTimeChatService() {
        super("RealTimeChatService");
        this.z = new fhf(this);
    }

    public RealTimeChatService(String str) {
        super(str);
        this.z = new fhf(this);
    }

    private static final void f(int i) {
        b.b(e(i));
    }

    private static Intent g(int i) {
        Intent intent = new Intent(gwb.H(), RealTimeChatService.class);
        intent.putExtra("op", i);
        f(i);
        return intent;
    }

    private static Intent c(int i, int i2) {
        Intent g = g(i2);
        f(i2);
        g.putExtra("account_id", i);
        return g;
    }

    private static Intent a(int i, int i2, String str) {
        Intent intent = new Intent(gwb.H(), RealTimeChatService.class);
        f(i2);
        intent.putExtra("op", i2);
        intent.putExtra("account_id", i);
        intent.putExtra("conversation_id", str);
        return intent;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if ((i & 1) != 0) {
            String valueOf = String.valueOf(intent);
            String valueOf2 = String.valueOf(intent.getAction());
            String valueOf3 = String.valueOf(e(intent.getIntExtra("op", 0)));
            glk.d("Babel_RTCS", new StringBuilder(((String.valueOf(valueOf).length() + 98) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("RTCS.onStartCommand called for redelivery / retry ").append(valueOf).append(" ").append(valueOf2).append(" opcode: ").append(valueOf3).append(" flags ").append(i).append(" startId ").append(i2).toString(), new Object[0]);
        }
        return super.onStartCommand(intent, i, i2);
    }

    protected void onHandleIntent(Intent intent) {
        long nanoTime;
        if (a || v) {
            nanoTime = System.nanoTime();
        } else {
            nanoTime = 0;
        }
        if (this.m != null) {
            this.m.b(intent);
        }
        a(intent, nanoTime);
        if (this.m != null) {
            this.m.a();
        }
    }

    protected void a(Intent intent, long j) {
        if (intent == null) {
            glk.d("Babel_RTCS", "RTCS onHandleIntent called with null intent", new Object[0]);
            return;
        }
        long longExtra;
        int intExtra = intent.getIntExtra("op", 0);
        if (intExtra == 78) {
            gwb.f(2376);
        }
        int intExtra2 = intent.getIntExtra("account_id", -1);
        long longExtra2 = intent.getLongExtra("rqtms", 0);
        if (a || v) {
            longExtra = intent.getLongExtra("rqtns", 0);
        } else {
            longExtra = 0;
        }
        if (a) {
            long j2 = (j - longExtra) / 1000000;
            String valueOf = String.valueOf(e(intExtra));
            new StringBuilder(String.valueOf(valueOf).length() + 86).append("RTCIntent: start processing intent:").append(valueOf).append(" account:").append(intExtra2).append(" delay: ").append(j2).append(" ms");
        }
        boolean z = o == intent.getIntExtra("pid", -1);
        if (a) {
            valueOf = String.valueOf(intent);
            String valueOf2 = String.valueOf(intent.getAction());
            String valueOf3 = String.valueOf(e(intExtra));
            new StringBuilder(((String.valueOf(valueOf).length() + 47) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("onHandleIntent ").append(valueOf).append(" ").append(valueOf2).append(" opcode: ").append(valueOf3).append(" respectWakeLock ").append(z);
        }
        Object fik;
        if (!z || (u != null && u.isHeld())) {
            try {
                synchronized (blf.b) {
                    if (blf.c < 0) {
                        throw new IllegalStateException("sPendingChangeNotificationsCount is " + blf.c);
                    }
                    blf.c++;
                }
                switch (intExtra) {
                    case wi.dI /*16*/:
                        if (fqu.a) {
                            new StringBuilder(39).append("Removing contact loader for ").append(intExtra2);
                        }
                        fqu.c.remove(Integer.valueOf(intExtra2));
                        ((duj) jyn.a(gwb.H(), duj.class)).b(intExtra2);
                        fjj.d(intExtra2);
                        break;
                    case 74:
                        glk.a("Babel_RTCS", "locale changed.", new Object[0]);
                        EsProvider.a((Context) this);
                        break;
                    case 100:
                        PackageReplacedReceiver.a(getApplicationContext(), intent.getAction());
                        break;
                    case 173:
                        blo.a((Context) this);
                        break;
                    case 174:
                        blo.b((Context) this);
                        break;
                    default:
                        bko e = fde.e(intExtra2);
                        if (e != null) {
                            if (fde.d(e) && !a(intent) && intExtra != 19) {
                                if (intExtra == 78) {
                                    gwb.f(2525);
                                }
                                ((iih) jyn.a(gwb.H(), iih.class)).a(intExtra2).b().a(intExtra).c(2566);
                                break;
                            }
                            g(intent);
                            break;
                        }
                        glk.e("Babel_RTCS", "skipping intent for invalid account", new Object[0]);
                        if (intExtra == 78) {
                            gwb.f(2378);
                            break;
                        }
                        break;
                }
                if (gjk.b) {
                    gjk.c();
                }
                blf.a();
                if (z) {
                    u.release();
                }
                if (v || a) {
                    long nanoTime = System.nanoTime();
                    if (v && h != null) {
                        fik = new fik(intExtra, longExtra2, longExtra, j, nanoTime);
                        synchronized (j) {
                            if (h != null) {
                                h.a(fik);
                            }
                        }
                    }
                    if (a) {
                        longExtra2 = (nanoTime - j) / 1000000;
                        valueOf = String.valueOf(e(intExtra));
                        new StringBuilder(String.valueOf(valueOf).length() + 86).append("RTCIntent: finish processing intent:").append(valueOf).append(" account:").append(intExtra2).append(" time: ").append(longExtra2).append(" ms");
                    }
                }
            } catch (Throwable th) {
                blf.a();
                if (z) {
                    u.release();
                }
            }
        } else {
            String str = "Babel_RTCS";
            String valueOf4 = String.valueOf(intent);
            String valueOf5 = String.valueOf(intent.getAction());
            String valueOf6 = String.valueOf(e(intExtra));
            String valueOf7 = String.valueOf(u);
            if (u == null) {
                fik = "(null)";
            } else {
                fik = Boolean.valueOf(u.isHeld());
            }
            valueOf = String.valueOf(fik);
            glk.e(str, new StringBuilder(((((String.valueOf(valueOf4).length() + 58) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()) + String.valueOf(valueOf).length()).append("RTCS.onHandleIntent called ").append(valueOf4).append(" ").append(valueOf5).append(" opcode: ").append(valueOf6).append(" sWakeLock: ").append(valueOf7).append(" isHeld: ").append(valueOf).toString(), new Object[0]);
            if (intExtra == 78) {
                gwb.f(2377);
            }
            throw new IllegalStateException();
        }
    }

    public void onCreate() {
        super.onCreate();
        DebugActivity.b(getApplicationContext());
        if (!this.y) {
            if (a) {
                glk.a("Babel_RTCS", "start and bind to the request writer", new Object[0]);
            }
            getApplicationContext().startService(RequestWriter.n());
            bindService(new Intent(this, RequestWriter.class), this.z, 1);
            this.y = true;
        }
        new fii(this).execute(new Void[0]);
    }

    public void onDestroy() {
        if (this.y) {
            if (a) {
                glk.a("Babel_RTCS", "unbind to the request writer", new Object[0]);
            }
            unbindService(this.z);
            this.l = null;
            this.y = false;
        }
        super.onDestroy();
        if (this.m != null) {
            this.m.b();
        }
    }

    @Deprecated
    protected boolean a(Intent intent) {
        switch (intent.getIntExtra("op", -1)) {
            case wi.dD /*13*/:
            case wi.g /*14*/:
                return true;
            case 39:
                return fnn.class.getName().equals(intent.getStringExtra("server_response_type"));
            default:
                return false;
        }
    }

    public static void a(fip fip) {
        if (!f.contains(fip)) {
            f.add(fip);
        }
    }

    public static void b(fip fip) {
        f.remove(fip);
    }

    public static void a(fin fin) {
        p = fin;
    }

    public static void a(fio fio) {
        q = fio;
    }

    public static String a(String str) {
        return ((flo) jyn.a(gwb.H(), flo.class)).a(str);
    }

    static void b(Intent intent) {
        String valueOf;
        intent.putExtra("rqtms", glj.b());
        if (a || v) {
            intent.putExtra("rqtns", System.nanoTime());
        }
        Context H = gwb.H();
        synchronized (t) {
            if (u == null) {
                u = ((PowerManager) H.getSystemService("power")).newWakeLock(1, "hangouts_rtcs");
            }
        }
        if (a) {
            String str = "acquiring wakelock for opcode ";
            valueOf = String.valueOf(e(intent.getIntExtra("op", 0)));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        u.acquire();
        intent.setClass(H, RealTimeChatService.class);
        intent.putExtra("pid", o);
        if (a) {
            intent.putExtra("stack_trace", glk.a(new Throwable()));
        }
        if (H.startService(intent) == null) {
            valueOf = String.valueOf(intent);
            glk.e("Babel_RTCS", new StringBuilder(String.valueOf(valueOf).length() + 40).append("RTCS failed to start service for intent ").append(valueOf).toString(), new Object[0]);
            ((iih) jyn.a(H, iih.class)).a(intent.getIntExtra("account_id", -1)).b().c(2307);
            u.release();
        }
    }

    @Deprecated
    public static void a(bko bko, boolean z) {
        if (fdq.J.b(bko.g())) {
            h().a(new fiz(bko, z));
            return;
        }
        Intent c = c(bko.g(), 13);
        c.putExtra("retry_request", z);
        b(c);
    }

    public static void a(int i) {
        a(i, false, fjl.NO_DELAY, flt.ACCOUNT_LOGIN_SYNC);
        bnz.a(i);
    }

    public static void b(int i) {
        b(c(i, 16));
    }

    public static void a(bko bko, String str) {
        b(a(bko.g(), 76, str));
    }

    public static void b(bko bko, boolean z) {
        fde.e(bko).a(new ffv(true), ((fmf) jyn.a(gwb.H(), fmf.class)).a().a());
    }

    public static void a(fme fme, int i, int i2, boolean z) {
        Intent c = c(i, 19);
        c.putExtra("setselfinfo_bit", i2);
        c.putExtra("setselfinfo_bit_value", z);
        b(fme, c);
    }

    public static void b(bko bko, String str) {
        Intent c = c(bko.g(), 69);
        c.putExtra("member_gaiaid", str);
        b(c);
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent(context, RealTimeChatService.class);
        intent.setAction(str);
        intent.putExtra("op", 100);
        b(intent);
    }

    public static void c(bko bko, String str) {
        Intent c = c(bko.g(), 85);
        c.putExtra("phone_number", str);
        b(c);
    }

    public static void a(bko bko, String str, String str2, boolean z) {
        Intent c = c(bko.g(), 86);
        c.putExtra("phone_number", str);
        c.putExtra("verification_code", str2);
        c.putExtra("is_discoverable", z);
        b(c);
    }

    public static void a(int i, boolean z, String str) {
        Intent c = c(i, 201);
        c.putExtra("phone_number", str);
        c.putExtra("callerid_set_unset", z);
        b(c);
    }

    public static void b() {
        Intent intent = new Intent(gwb.H(), RealTimeChatService.class);
        intent.putExtra("op", 74);
        b(intent);
    }

    public static evz c(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras.containsKey("server_response_id")) {
            return gwb.a(gwb.H(), extras.getLong("server_response_id"));
        }
        if (extras.containsKey("server_response")) {
            return foh.b(intent.getByteArrayExtra("server_response"));
        }
        return null;
    }

    public static boolean d(bko bko, String str) {
        boolean z;
        if (a) {
            String valueOf = String.valueOf(e);
            String str2 = d;
            String valueOf2 = String.valueOf(bko.a());
            new StringBuilder((((String.valueOf(valueOf).length() + 30) + String.valueOf(str2).length()) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append("isFocusedConversation ").append(valueOf).append("/").append(str2).append(" ?==? ").append(str).append("/").append(valueOf2);
        }
        synchronized (c) {
            if (TextUtils.equals(bko.a(), d) && e != null && e.contains(str)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Deprecated
    public static void a(bko bko) {
        b(c(bko.g(), 14));
    }

    @Deprecated
    public static void a(int i, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        Intent c = c(i, 104);
        c.putStringArrayListExtra("account_gaiaids", arrayList);
        b(c);
    }

    private static bhl h() {
        return (bhl) jyn.a(gwb.H(), bhl.class);
    }

    public static void a(int i, long j) {
        h().a(new fki(fde.e(i), j));
    }

    public static void a(fme fme, bko bko, String str) {
        bhm fkn = new fkn(bko, str);
        fkn.b(fme.a());
        h().a(fkn);
    }

    public static void a(fme fme, bko bko, String str, long j, boolean z, boolean z2) {
        a(fme, bko, new String[]{str}, new long[]{j}, z, z2);
    }

    public static void a(fme fme, bko bko, String[] strArr, long[] jArr, boolean z, boolean z2) {
        Intent c = c(bko.g(), 72);
        c.putExtra("conversationids", strArr);
        c.putExtra("timestamps", jArr);
        c.putExtra("archive", z);
        c.putExtra("perform_locally", z2);
        b(fme, c);
    }

    public static void a(bko bko, String str, long j) {
        Intent a = a(bko.g(), 91, str);
        a.putExtra("timestamp", j);
        f(a);
    }

    public static void a(bko bko, String str, String[] strArr) {
        Intent a = a(bko.g(), 144, str);
        a.putExtra("event_ids", strArr);
        f(a);
    }

    public static void e(bko bko, String str) {
        f(a(bko.g(), 143, str));
    }

    public static void a(fme fme, Intent intent) {
        b(fme, intent);
    }

    public static void a(fme fme, bko bko, juh juh, String str) {
        Intent c = c(bko.g(), 185);
        c.putExtra("audience", juh);
        c.putExtra("original_conversation_id", str);
        c.putExtra("conversation_lookup", boy.NONE);
        b(fme, c);
    }

    public static void a(fme fme, bko bko, int i, String str, int i2) {
        Intent c = c(bko.g(), 142);
        c.putExtra("hangout_type", i);
        c.putExtra("hangout_topic", null);
        c.putExtra("hangout_media_type", i2);
        b(fme, c);
    }

    public static void f(bko bko, String str) {
        f(a(bko.g(), 117, str));
    }

    public static void g(bko bko, String str) {
        f(a(bko.g(), 33, str));
    }

    @Deprecated
    public static void a(bko bko, String str, String str2, CharSequence charSequence, String str3, int i, String str4, int i2, int i3, String str5, String str6, boolean z, hkh hkh, int i4) {
        Intent a = a(bko.g(), 31, str);
        a.putExtra("message_id", str2);
        a.putExtra("message_text", charSequence);
        a.putExtra("uri", str3);
        a.putExtra("rotation", i);
        a.putExtra("picasa_photo_id", str4);
        a.putExtra("width", i2);
        a.putExtra("height", i3);
        a.putExtra("content_type", str5);
        a.putExtra("subject", str6);
        a.putExtra("requires_mms", z);
        if (hkh != null) {
            a.putExtra("place", duv.a(hkh));
        }
        a.putExtra("timestamp", glj.b() * 1000);
        a.putExtra("otr_state", i4);
        f(a);
    }

    public static void a(flt flt) {
        int[] c = fde.c(true);
        String str = "Account ids ";
        String valueOf = String.valueOf(Arrays.toString(c));
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        for (int i : c) {
            if (fde.e(i) != null) {
                a(i, false, fjl.NO_DELAY, flt);
            }
        }
    }

    public static void c() {
        int i = 0;
        int[] c = fde.c(false);
        int length = c.length;
        while (i < length) {
            int i2 = c[i];
            if (a) {
                new StringBuilder(49).append("requestPatchAfterRequestWriterUpgrade ").append(i2);
            }
            f(c(i2, 114));
            i++;
        }
    }

    @Deprecated
    public static void a(bko bko, Long[] lArr, String str) {
        for (Long l : lArr) {
            Intent a = a(bko.g(), 44, str);
            a.putExtra("message_row_id", gwb.a(l));
            a.putExtra("timestamp", glj.b() * 1000);
            f(a);
        }
        h(bko, str);
    }

    public static void h(bko bko, String str) {
        if (blo.a(str) && !blo.b(str)) {
            f(a(bko.g(), 83, str));
        }
    }

    @Deprecated
    public static void a(bko bko, long[] jArr) {
        Intent c = c(bko.g(), 80);
        c.putExtra("message_row_ids", jArr);
        f(c);
    }

    public static void a(bko bko, String str, fwy fwy) {
        Intent c = c(bko.g(), 191);
        c.putExtra("conversation_id", str);
        c.putExtra("type", fwy.ordinal());
        f(c);
    }

    public static void c(int i) {
        f(c(i, 188));
    }

    public static void a(bko bko, String[] strArr) {
        Intent c = c(bko.g(), 187);
        c.putExtra("recent_call_row_ids", strArr);
        f(c);
    }

    public static void b(String str) {
        String[] split = str.split("\\|");
        if (split.length != 4) {
            String str2 = "Babel";
            String str3 = "onRequestDiscarded invalid token: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            glk.e(str2, valueOf, new Object[0]);
            return;
        }
        Intent a = a(fde.a(split[2]).g(), 113, split[3]);
        a.putExtra("message_row_id", Long.valueOf(split[1]));
        f(a);
    }

    public static void a(bko bko, String str, String str2, int i) {
        Intent a = a(bko.g(), 47, str);
        a.putExtra("message_id", str2);
        a.putExtra("error", i);
        f(a);
    }

    public static void a(bko bko, String str, boolean z) {
        Intent a = a(bko.g(), 84, str);
        a.putExtra("insert_error_message", z);
        f(a);
    }

    public static void a(bko bko, String str, juh juh) {
        Intent a = a(bko.g(), 32, str);
        a.putExtra("audience", juh);
        f(a);
    }

    public static void a(bko bko, String str, String str2) {
        Intent c = c(bko.g(), 36);
        c.putExtra("conversation_id", str);
        c.putExtra("message_id", str2);
        f(c);
    }

    @Deprecated
    public static void b(bko bko, String str, long j) {
        Intent a = a(bko.g(), 35, str);
        if (j > 0) {
            a.putExtra("watermark", j);
        }
        f(a);
    }

    public static void a(bko bko, String str, int i) {
        f(a(bko.g(), 180, str).putExtra("call_media_type", 0));
    }

    public static void b(int i, long j) {
        Intent c = c(i, 81);
        c.putExtra("scroll_timestamp", glj.a());
        c.putExtra("scroll_to_item_timestamp", j);
        f(c);
    }

    public static void c(bko bko, String str, long j) {
        Intent a = a(bko.g(), 82, str);
        a.putExtra("scroll_timestamp", glj.a());
        a.putExtra("scroll_to_item_timestamp", j);
        f(a);
    }

    public static void a(fme fme, bko bko, String str, String str2) {
        Intent c = c(bko.g(), 58);
        c.putExtra("query", str);
        c.putExtra("requester_id", str2);
        b(fme, c);
    }

    public static void a(fme fme, bko bko, ArrayList<fbt> arrayList, String str, boolean z) {
        Intent c = c(bko.g(), 59);
        c.putExtra("batch_gebi_tag", str);
        c.putExtra("from_contact_lookup", z);
        c.putParcelableArrayListExtra("com.google.android.apps.hangouts.EntityLookupSpecs", arrayList);
        b(fme, c);
    }

    public static void d(bko bko, String str, long j) {
        h().a(new fey(bko.g(), str, j));
    }

    public static void a(int i, boolean z, fjl fjl, flt flt) {
        a(i, z, fjl, -1, flt);
    }

    public static void b(bko bko, String[] strArr) {
        Intent c = c(bko.g(), 171);
        c.putExtra("conversationids", strArr);
        f(c);
    }

    public static void d() {
        f(g(173));
    }

    public static void e() {
        f(g(174));
    }

    public static void b(fme fme, bko bko, String str) {
        Intent c = c(bko.g(), 120);
        c.putExtra("gaia_id", str);
        b(fme, c);
    }

    public static void b(bko bko, String str, String str2) {
        Intent a = a(bko.g(), 37, str);
        a.putExtra("conversation_name", str2);
        f(a);
    }

    public static void b(bko bko, String str, int i) {
        Intent a = a(bko.g(), 38, str);
        a.putExtra("notification_level", i);
        f(a);
    }

    public static void a(bko bko, int i) {
        Intent a = a(bko.g(), 38, null);
        a.putExtra("notification_level", i);
        f(a);
    }

    public static void c(bko bko, String str, String str2) {
        f(a(bko.g(), 177, str).putExtra("ringtone_uri", str2));
    }

    public static void d(bko bko, String str, String str2) {
        f(a(bko.g(), 178, str).putExtra("ringtone_uri", str2));
    }

    public static void a(int i, String str, boolean z, boolean z2, boolean z3) {
        Intent a = a(i, 41, str);
        a.putExtra("accept", z);
        a.putExtra("block_inviter", z3);
        a.putExtra("report_inviter", z2);
        f(a);
    }

    public static void a(int i, int i2) {
        Intent c = c(i, 203);
        c.putExtra("affinity", i2);
        f(c);
    }

    public static void a(fme fme, int i, String str) {
        b(fme, a(i, 42, str));
    }

    public static void b(int i, int i2) {
        Intent c = c(i, 54);
        c.putExtra("conversation_sync_filter", i2);
        f(c);
    }

    public static boolean b(fme fme, int i, String str) {
        if (blo.a(str)) {
            return false;
        }
        b(fme, a(i, 65, str));
        return true;
    }

    public static void i(bko bko, String str) {
        f(a(bko.g(), 97, str));
    }

    public static void a(int i, int i2, ArrayList<String> arrayList, int i3) {
        fde.e(fde.e(i2)).a(new fgz(arrayList, i3), i);
    }

    public static void a(int i, String str, ContentValues contentValues) {
        Intent c = c(i, 193);
        c.putExtra("gaia_id", str);
        c.putExtra("content_values", contentValues);
        f(c);
    }

    public static void a(fme fme, bko bko, int i, boolean z) {
        Intent c = c(bko.g(), 121);
        c.putExtra("extra_rich_presence_type", i);
        c.putExtra("extra_rich_presence_type_enabled", z);
        b(fme, c);
    }

    public static void a(bko bko, mbr mbr) {
        Intent c = c(bko.g(), 68);
        c.putExtra("hangout_invite_receipt", nzf.a((nzf) mbr));
        f(c);
    }

    public static void j(bko bko, String str) {
        f(a(bko.g(), 79, str));
    }

    public static void a(bko bko, String str, mav mav, boolean z) {
        Intent c = c(bko.g(), 78);
        int andIncrement = s.getAndIncrement();
        c.putExtra("log_data_id", andIncrement);
        c.putExtra("is_nova", true);
        glk.a("Babel_RTCS", "Stashing logData, id " + andIncrement, new Object[0]);
        r.put(Integer.valueOf(andIncrement), Pair.create(str, mav));
        f(c);
        gwb.f(2013);
    }

    public static void k(bko bko, String str) {
        Intent c = c(bko.g(), 145);
        c.putExtra("compressed_log_file", str);
        f(c);
    }

    public static void d(int i) {
        b(c(i, 89));
    }

    public static void l(bko bko, String str) {
        Intent c = c(bko.g(), 189);
        c.putExtra("user_id", str);
        f(c);
    }

    public static void e(bko bko, String str, String str2) {
        fde.e(bko).a(new fgm(str, str2), -1);
    }

    public static void m(bko bko, String str) {
        Intent c = c(bko.g(), 179);
        c.putExtra("picasa_photo_id", str);
        f(c);
    }

    public static void a(fme fme, int i, ets ets, String str, String str2, String str3) {
        Intent c = c(i, 90);
        c.putExtra("chat_acl_key", ets.ordinal());
        c.putExtra("chat_acl_circle_id", str);
        c.putExtra("chat_acl_circle_name", str2);
        c.putExtra("chat_acl_level", str3);
        b(fme, c);
    }

    public static void a(fme fme, int i) {
        b(fme, c(i, (int) HttpStatusCodes.STATUS_CODE_NO_CONTENT));
    }

    public static void a(fme fme, int i, String str, String str2, String str3, boolean z, boolean z2) {
        Intent c = c(i, 92);
        c.putExtra("member_gaiaid", str);
        c.putExtra("phone_number", str2);
        c.putExtra("user_name", str3);
        c.putExtra("blocked", z);
        c.putExtra("retry_request", z2);
        b(fme, c);
    }

    public static void c(fme fme, int i, String str) {
        Intent c = c(i, 175);
        c.putExtra("member_gaiaid", str);
        b(fme, c);
    }

    public static void a(bko bko, byte[] bArr, boolean z) {
        Intent c = c(bko.g(), 176);
        c.putExtra("pdu", bArr);
        c.putExtra("is_sms_read", z);
        f(c);
    }

    public static void a(fme fme, bko bko) {
        b(fme, c(bko.g(), 96));
    }

    public static void c(fme fme, bko bko, String str) {
        Intent c = c(bko.g(), 99);
        c.putExtra("email_address", str);
        b(fme, c);
    }

    public static void a(int i, String str, String str2) {
        Intent a = a(i, 101, str);
        a.putExtra("conversation_name", str2);
        b(a);
    }

    public static void b(int i, String str) {
        b(a(i, 103, str));
    }

    public static void a(int i, String str, CharSequence charSequence) {
        Intent a = a(i, 147, str);
        a.putExtra("message_text", charSequence);
        b(a);
    }

    public static void b(fme fme, int i) {
        b(fme, c(i, 148));
    }

    public static void c(fme fme, int i) {
        b(fme, c(i, 150));
    }

    public static void d(fme fme, int i, String str) {
        Intent c = c(i, 151);
        c.putExtra("phone_number", str);
        b(fme, c);
    }

    public static void a(int i, int i2, fdv fdv) {
        Intent c = c(i, 153);
        c.putExtra("recent_call_type", i2);
        c.putExtra("recent_call_action_info", fdv);
        f(c);
    }

    public static void a(int i, long j, String str, boolean z) {
        Intent c = c(i, 190);
        c.putExtra("recent_call_timestamp", j);
        c.putExtra("recent_call_rate", str);
        c.putExtra("recent_call_is_free_call", z);
        f(c);
    }

    public static void a(fme fme, int i, String str, String str2) {
        iil.a((Object) str, glq.c(gwb.H(), str));
        iil.a((Object) str2, glq.c(gwb.H(), str2));
        Intent c = c(i, 196);
        c.putExtra("phone_number", str);
        c.putExtra("from_phone_number", str2);
        b(fme, c);
    }

    public static void n(bko bko, String str) {
        f(a(bko.g(), 160, str));
    }

    public static void d(fme fme, bko bko, String str) {
        Intent c = c(bko.g(), 194);
        c.putExtra("phone_number", str);
        b(fme, c);
    }

    private static void b(fme fme, Intent intent) {
        intent.putExtra("rid", fme.a());
        b(intent);
        if (a) {
            String valueOf = String.valueOf(fme);
            String valueOf2 = String.valueOf(e(intent.getIntExtra("op", 0)));
            new StringBuilder((String.valueOf(valueOf).length() + 30) + String.valueOf(valueOf2).length()).append("start command request ").append(valueOf).append(" opCode ").append(valueOf2);
        }
    }

    private static void f(Intent intent) {
        b(((fmf) jyn.a(gwb.H(), fmf.class)).a(-1), intent);
    }

    private void g(android.content.Intent r28) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.google.android.apps.hangouts.realtimechat.RealTimeChatService.g(android.content.Intent):void. bs: [B:14:0x00a3, B:207:0x0cf6]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r27 = this;
        r4 = "op";
        r5 = -1;
        r0 = r28;
        r4 = r0.getIntExtra(r4, r5);
        r5 = "account_id";
        r6 = -1;
        r0 = r28;
        r25 = r0.getIntExtra(r5, r6);
        r5 = fde.e(r25);
        r6 = "rid";
        r7 = -1;
        r0 = r28;
        r6 = r0.getIntExtra(r6, r7);
        r7 = a;
        if (r7 == 0) goto L_0x0062;
    L_0x0023:
        r7 = e(r4);
        r7 = java.lang.String.valueOf(r7);
        r8 = new java.lang.StringBuilder;
        r9 = java.lang.String.valueOf(r7);
        r9 = r9.length();
        r9 = r9 + 63;
        r8.<init>(r9);
        r9 = "processIntent opCode ";
        r8 = r8.append(r9);
        r7 = r8.append(r7);
        r8 = " account ";
        r7 = r7.append(r8);
        r0 = r25;
        r7 = r7.append(r0);
        r8 = " requestId ";
        r7 = r7.append(r8);
        r7.append(r6);
        r6 = b;
        r7 = e(r4);
        r6.c(r7);
    L_0x0062:
        r6 = q;
        if (r6 == 0) goto L_0x006d;
    L_0x0066:
        r6 = q;
        r0 = r28;
        r6.a(r0);
    L_0x006d:
        if (r5 != 0) goto L_0x0098;
    L_0x006f:
        r5 = "Babel_RTCS";
        r6 = new java.lang.StringBuilder;
        r7 = 48;
        r6.<init>(r7);
        r7 = "Skipping intent for invalid account: ";
        r6 = r6.append(r7);
        r0 = r25;
        r6 = r6.append(r0);
        r6 = r6.toString();
        r7 = 0;
        r7 = new java.lang.Object[r7];
        glk.e(r5, r6, r7);
        r5 = 78;
        if (r4 != r5) goto L_0x0097;
    L_0x0092:
        r4 = 2379; // 0x94b float:3.334E-42 double:1.1754E-320;
        gwb.f(r4);
    L_0x0097:
        return;
    L_0x0098:
        r26 = fde.e(r5);
        switch(r4) {
            case 13: goto L_0x01a7;
            case 14: goto L_0x0133;
            case 19: goto L_0x01d6;
            case 55: goto L_0x0225;
            case 72: goto L_0x02e8;
            case 76: goto L_0x02d2;
            case 91: goto L_0x0365;
            case 104: goto L_0x0179;
            case 111: goto L_0x03f9;
            case 114: goto L_0x0419;
            case 120: goto L_0x0429;
            case 121: goto L_0x0501;
            case 124: goto L_0x0568;
            case 136: goto L_0x0581;
            case 143: goto L_0x03c3;
            case 144: goto L_0x03a5;
            case 153: goto L_0x05c0;
            case 160: goto L_0x060a;
            case 163: goto L_0x0620;
            case 175: goto L_0x0453;
            case 176: goto L_0x04c8;
            case 187: goto L_0x05fd;
            case 188: goto L_0x05f8;
            case 190: goto L_0x05d8;
            case 194: goto L_0x062e;
            case 199: goto L_0x047d;
            case 200: goto L_0x04b8;
            default: goto L_0x009f;
        };
    L_0x009f:
        switch(r4) {
            case 30: goto L_0x00a3;
            case 31: goto L_0x0715;
            case 32: goto L_0x0998;
            case 33: goto L_0x09ba;
            case 35: goto L_0x09d2;
            case 36: goto L_0x0a7b;
            case 37: goto L_0x0aa2;
            case 38: goto L_0x0ac5;
            case 39: goto L_0x0646;
            case 41: goto L_0x0b61;
            case 42: goto L_0x0bad;
            case 44: goto L_0x0870;
            case 47: goto L_0x07da;
            case 54: goto L_0x0bc5;
            case 58: goto L_0x0c99;
            case 59: goto L_0x0cb9;
            case 65: goto L_0x0bde;
            case 68: goto L_0x0a63;
            case 69: goto L_0x0d1c;
            case 73: goto L_0x0d34;
            case 78: goto L_0x0d64;
            case 79: goto L_0x0d4c;
            case 80: goto L_0x092a;
            case 81: goto L_0x0a17;
            case 82: goto L_0x0a39;
            case 83: goto L_0x08a1;
            case 84: goto L_0x082e;
            case 85: goto L_0x06bc;
            case 86: goto L_0x06d4;
            case 89: goto L_0x0dff;
            case 90: goto L_0x0e0f;
            case 92: goto L_0x0c2d;
            case 96: goto L_0x0c73;
            case 97: goto L_0x0c83;
            case 99: goto L_0x0e86;
            case 101: goto L_0x0e9e;
            case 103: goto L_0x0eb3;
            case 112: goto L_0x0ef4;
            case 113: goto L_0x0975;
            case 116: goto L_0x0ec1;
            case 117: goto L_0x06fd;
            case 128: goto L_0x0f04;
            case 131: goto L_0x0f0b;
            case 132: goto L_0x0f10;
            case 133: goto L_0x0f15;
            case 140: goto L_0x0f2d;
            case 142: goto L_0x0f4e;
            case 145: goto L_0x0de7;
            case 146: goto L_0x0f78;
            case 147: goto L_0x0f85;
            case 148: goto L_0x0fad;
            case 150: goto L_0x0fbd;
            case 151: goto L_0x0fcd;
            case 157: goto L_0x0fee;
            case 167: goto L_0x0ce2;
            case 169: goto L_0x101e;
            case 171: goto L_0x0d06;
            case 172: goto L_0x1030;
            case 177: goto L_0x0b1b;
            case 178: goto L_0x0b3e;
            case 179: goto L_0x0e6e;
            case 180: goto L_0x09f4;
            case 185: goto L_0x00a3;
            case 189: goto L_0x0e56;
            case 191: goto L_0x0942;
            case 193: goto L_0x0c0d;
            case 196: goto L_0x0ffe;
            case 201: goto L_0x1048;
            case 203: goto L_0x0b94;
            case 204: goto L_0x0e46;
            default: goto L_0x00a2;
        };
    L_0x00a2:
        goto L_0x0097;
    L_0x00a3:
        r4 = "audience";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r7 = r0.getSerializableExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r7 = (juh) r7;	 Catch:{ Exception -> 0x00f1 }
        r4 = new fej;	 Catch:{ Exception -> 0x00f1 }
        r6 = "conversation_name";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r6);	 Catch:{ Exception -> 0x00f1 }
        r8 = "conversation_lookup";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r8 = r0.getSerializableExtra(r8);	 Catch:{ Exception -> 0x00f1 }
        r8 = (boy) r8;	 Catch:{ Exception -> 0x00f1 }
        r9 = "conversation_hangout";	 Catch:{ Exception -> 0x00f1 }
        r10 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r9 = r0.getBooleanExtra(r9, r10);	 Catch:{ Exception -> 0x00f1 }
        r10 = "force_group";	 Catch:{ Exception -> 0x00f1 }
        r11 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r10 = r0.getBooleanExtra(r10, r11);	 Catch:{ Exception -> 0x00f1 }
        r11 = "transport_type";	 Catch:{ Exception -> 0x00f1 }
        r12 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r11 = r0.getIntExtra(r11, r12);	 Catch:{ Exception -> 0x00f1 }
        r12 = "invite_token_url";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r12 = r0.getStringExtra(r12);	 Catch:{ Exception -> 0x00f1 }
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;
    L_0x00f1:
        r4 = move-exception;
        r0 = r27;
        r1 = r25;
        r5 = bkq.d(r0, r1);
        r6 = "Babel_RTCS";
        r7 = new java.lang.StringBuilder;
        r8 = 45;
        r7.<init>(r8);
        r8 = "Exception in processIntent, logged off: ";
        r7 = r7.append(r8);
        r7 = r7.append(r5);
        r7 = r7.toString();
        glk.d(r6, r7, r4);
        r6 = new fiu;
        r7 = "rid";
        r8 = -1;
        r0 = r28;
        r7 = r0.getIntExtra(r7, r8);
        r8 = 2;
        r9 = 0;
        r6.<init>(r7, r8, r9);
        r7 = 0;
        r0 = r28;
        a(r0, r6, r7);
        r6 = r4 instanceof java.lang.RuntimeException;
        if (r6 == 0) goto L_0x0097;
    L_0x012e:
        if (r5 != 0) goto L_0x0097;
    L_0x0130:
        r4 = (java.lang.RuntimeException) r4;
        throw r4;
    L_0x0133:
        gwb.u();
        r4 = r5.a();
        r6 = 0;
        r7 = 0;
        gwb.a(r4, r6, r7);
        r4 = ffh.a();
        r4 = r4.c();
        if (r4 != 0) goto L_0x0155;
    L_0x0149:
        r4 = "Babel_RTCS";
        r5 = "GCM registration not done. Skip unregistering account";
        r6 = 0;
        r6 = new java.lang.Object[r6];
        glk.d(r4, r5, r6);
        goto L_0x0097;
    L_0x0155:
        r4 = gwb.H();
        r6 = jcf.class;
        r4 = jyn.a(r4, r6);
        r4 = (jcf) r4;
        r0 = r25;
        r4 = r4.c(r0);
        if (r4 == 0) goto L_0x0097;
    L_0x0169:
        r4 = new fkv;
        r4.<init>(r5);
        r0 = r27;
        r1 = r26;
        r2 = r28;
        r0.a(r1, r2, r4);
        goto L_0x0097;
    L_0x0179:
        r4 = ffh.a();
        r4 = r4.c();
        if (r4 != 0) goto L_0x018f;
    L_0x0183:
        r4 = "Babel_RTCS";
        r5 = "GCM registration not done before unregistering account";
        r6 = 0;
        r6 = new java.lang.Object[r6];
        glk.e(r4, r5, r6);
        goto L_0x0097;
    L_0x018f:
        r4 = "account_gaiaids";
        r0 = r28;
        r4 = r0.getStringArrayListExtra(r4);
        r6 = new fkw;
        r6.<init>(r5, r4);
        r0 = r27;
        r1 = r26;
        r2 = r28;
        r0.a(r1, r2, r6);
        goto L_0x0097;
    L_0x01a7:
        r4 = ffh.a();
        r4 = r4.c();
        if (r4 != 0) goto L_0x01bd;
    L_0x01b1:
        r4 = "Babel_RTCS";
        r5 = "GCM registration not done before registering account";
        r6 = 0;
        r6 = new java.lang.Object[r6];
        glk.e(r4, r5, r6);
        goto L_0x0097;
    L_0x01bd:
        r4 = "retry_request";
        r6 = 0;
        r0 = r28;
        r4 = r0.getBooleanExtra(r4, r6);
        r6 = new fiz;
        r6.<init>(r5, r4);
        r0 = r27;
        r1 = r26;
        r2 = r28;
        r0.a(r1, r2, r6);
        goto L_0x0097;
    L_0x01d6:
        r4 = "setselfinfo_bit";
        r6 = -1;
        r0 = r28;
        r4 = r0.getIntExtra(r4, r6);
        r6 = -1;
        if (r4 != r6) goto L_0x01ee;
    L_0x01e2:
        r4 = "Babel_RTCS";
        r5 = "OP_SET_SELF_INFO_BIT -- no EXTRA_SETSELFINO_BIT specified";
        r6 = 0;
        r6 = new java.lang.Object[r6];
        glk.e(r4, r5, r6);
        goto L_0x0097;
    L_0x01ee:
        r6 = "setselfinfo_bit_value";
        r7 = 0;
        r0 = r28;
        r6 = r0.getBooleanExtra(r6, r7);
        r7 = a;
        if (r7 == 0) goto L_0x0215;
    L_0x01fb:
        r7 = new java.lang.StringBuilder;
        r8 = 55;
        r7.<init>(r8);
        r8 = "OP_SET_SELF_INFO_BIT whichBit: ";
        r7 = r7.append(r8);
        r7 = r7.append(r4);
        r8 = " value: ";
        r7 = r7.append(r8);
        r7.append(r6);
    L_0x0215:
        r7 = new fkm;
        r7.<init>(r5, r4, r6);
        r0 = r27;
        r1 = r26;
        r2 = r28;
        r0.a(r1, r2, r7);
        goto L_0x0097;
    L_0x0225:
        r4 = gjk.b;
        if (r4 == 0) goto L_0x023b;
    L_0x0229:
        r4 = new gjn;
        r4.<init>();
        r6 = "rtcs_handle_warm_sync";
        r4 = r4.a(r6);
        r4 = r4.a(r5);
        r4.b();
    L_0x023b:
        r4 = "expected_hash";
        r6 = -1;
        r0 = r28;
        r6 = r0.getLongExtra(r4, r6);
        r4 = new fcw;
        r8 = gwb.H();
        r4.<init>(r8);
        r8 = r5.g();
        r8 = r4.a(r8);
        r10 = -1;
        r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r4 == 0) goto L_0x0284;
    L_0x025c:
        r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r4 != 0) goto L_0x0284;
    L_0x0260:
        r4 = a;
        if (r4 == 0) goto L_0x0097;
    L_0x0264:
        r4 = "RequestWarmSyncOperation is cancelled due to matched hash values for account: ";
        r6 = r5.a();
        r6 = java.lang.String.valueOf(r6);
        r7 = r6.length();
        if (r7 == 0) goto L_0x027e;
    L_0x0274:
        r4.concat(r6);
    L_0x0277:
        r4 = 2310; // 0x906 float:3.237E-42 double:1.1413E-320;
        gwb.a(r5, r4);
        goto L_0x0097;
    L_0x027e:
        r6 = new java.lang.String;
        r6.<init>(r4);
        goto L_0x0277;
    L_0x0284:
        r4 = fjj.c(r25);
        r8 = a;
        if (r8 == 0) goto L_0x029f;
    L_0x028c:
        r8 = "RequestWarmSyncOperation is executed directly: ";
        r5 = r5.a();
        r5 = java.lang.String.valueOf(r5);
        r9 = r5.length();
        if (r9 == 0) goto L_0x02cc;
    L_0x029c:
        r8.concat(r5);
    L_0x029f:
        r4.k();
        r5 = "suppress_notifications";
        r8 = 0;
        r0 = r28;
        r5 = r0.getBooleanExtra(r5, r8);
        r8 = "no_missed_events_expected";
        r9 = 0;
        r0 = r28;
        r8 = r0.getBooleanExtra(r8, r9);
        r4.a(r8);
        r4.b(r5);
        r5 = 2;
        r4.a(r5);
        r4.b(r6);
        r0 = r27;
        r1 = r26;
        r2 = r28;
        r0.a(r1, r2, r4);
        goto L_0x0097;
    L_0x02cc:
        r5 = new java.lang.String;
        r5.<init>(r8);
        goto L_0x029f;
    L_0x02d2:
        r4 = "conversation_id";
        r0 = r28;
        r4 = r0.getStringExtra(r4);
        r5 = new blo;
        r0 = r27;
        r1 = r25;
        r5.<init>(r0, r1);
        r5.m(r4);
        goto L_0x0097;
    L_0x02e8:
        r4 = "archive";
        r6 = 1;
        r0 = r28;
        r6 = r0.getBooleanExtra(r4, r6);
        r4 = "perform_locally";
        r7 = 0;
        r0 = r28;
        r7 = r0.getBooleanExtra(r4, r7);
        r4 = "conversationids";
        r0 = r28;
        r8 = r0.getStringArrayExtra(r4);
        r4 = "timestamps";
        r0 = r28;
        r9 = r0.getLongArrayExtra(r4);
        r4 = r8.length;
        r10 = r9.length;
        if (r4 == r10) goto L_0x0316;
    L_0x030e:
        r4 = new java.lang.IllegalStateException;
        r5 = "Must have same number of conversation ids and timestamps to archive";
        r4.<init>(r5);
        throw r4;
    L_0x0316:
        r10 = new java.util.ArrayList;
        r10.<init>();
        r4 = 0;
    L_0x031c:
        r11 = r8.length;
        if (r4 >= r11) goto L_0x032e;
    L_0x031f:
        r11 = new fda;
        r12 = r8[r4];
        r14 = r9[r4];
        r11.<init>(r12, r14);
        r10.add(r11);
        r4 = r4 + 1;
        goto L_0x031c;
    L_0x032e:
        r4 = new fcz;
        r4.<init>(r5, r10, r6, r7);
        r5 = "rid";
        r6 = -1;
        r0 = r28;
        r5 = r0.getIntExtra(r5, r6);
        r4.b(r5);
        r0 = r27;
        r1 = r26;
        r2 = r28;
        r0.a(r1, r2, r4);
        r4 = r27.getApplicationContext();
        r5 = ect.class;
        r4 = jyn.a(r4, r5);
        r4 = (ect) r4;
        r5 = 1;
        r0 = r25;
        r4.a(r0, r5);
        r4 = gwb.H();
        r0 = r25;
        blf.a(r4, r0);
        goto L_0x0097;
    L_0x0365:
        r4 = "conversation_id";
        r0 = r28;
        r4 = r0.getStringExtra(r4);
        r6 = "timestamp";
        r8 = -1;
        r0 = r28;
        r6 = r0.getLongExtra(r6, r8);
        r8 = new fer;
        r8.<init>(r5, r4, r6);
        r4 = "rid";
        r5 = -1;
        r0 = r28;
        r4 = r0.getIntExtra(r4, r5);
        r8.b(r4);
        r0 = r27;
        r1 = r26;
        r2 = r28;
        r0.a(r1, r2, r8);
        r4 = r27.getApplicationContext();
        r5 = ect.class;
        r4 = jyn.a(r4, r5);
        r4 = (ect) r4;
        r5 = 1;
        r0 = r25;
        r4.a(r0, r5);
        goto L_0x0097;
    L_0x03a5:
        r4 = "conversation_id";
        r0 = r28;
        r4 = r0.getStringExtra(r4);
        r5 = "event_ids";
        r0 = r28;
        r5 = r0.getStringArrayExtra(r5);
        r6 = new blo;
        r0 = r27;
        r1 = r25;
        r6.<init>(r0, r1);
        a(r6, r4, r5);
        goto L_0x0097;
    L_0x03c3:
        r4 = "conversation_id";
        r0 = r28;
        r4 = r0.getStringExtra(r4);
        r6 = new fhc;
        r6.<init>();
        blf.a(r5, r6, r4);
        r5 = r6.b();
        r4 = r27.getApplicationContext();
        r7 = fmf.class;
        r4 = jyn.a(r4, r7);
        r4 = (fmf) r4;
        r4 = r4.a();
        r4 = r4.a();
        r0 = r27;
        r7 = r0.l;
        r0 = r26;
        r0.a(r5, r4, r7);
        r6.c();
        goto L_0x0097;
    L_0x03f9:
        r4 = new blo;
        r0 = r27;
        r1 = r25;
        r4.<init>(r0, r1);
        r5 = "conversation_id";
        r0 = r28;
        r5 = r0.getStringExtra(r5);
        r6 = "extra_pending_conversation_operations";
        r8 = 0;
        r0 = r28;
        r6 = r0.getLongExtra(r6, r8);
        blf.b(r4, r5, r6);
        goto L_0x0097;
    L_0x0419:
        r4 = new ffa;
        r4.<init>(r5);
        r0 = r27;
        r1 = r26;
        r2 = r28;
        r0.a(r1, r2, r4);
        goto L_0x0097;
    L_0x0429:
        r4 = "gaia_id";
        r0 = r28;
        r4 = r0.getStringExtra(r4);
        r6 = android.text.TextUtils.isEmpty(r4);
        if (r6 != 0) goto L_0x0447;
    L_0x0437:
        r6 = new fev;
        r6.<init>(r5, r4);
        r0 = r27;
        r1 = r26;
        r2 = r28;
        r0.a(r1, r2, r6);
        goto L_0x0097;
    L_0x0447:
        r4 = "Babel_RTCS";
        r5 = "Dismiss suggested contacts operation scheduled without gaiaid";
        r6 = 0;
        r6 = new java.lang.Object[r6];
        glk.e(r4, r5, r6);
        goto L_0x0097;
    L_0x0453:
        r4 = "member_gaiaid";
        r0 = r28;
        r4 = r0.getStringExtra(r4);
        r6 = android.text.TextUtils.isEmpty(r4);
        if (r6 != 0) goto L_0x0471;
    L_0x0461:
        r6 = new fku;
        r6.<init>(r5, r4);
        r0 = r27;
        r1 = r26;
        r2 = r28;
        r0.a(r1, r2, r6);
        goto L_0x0097;
    L_0x0471:
        r4 = "Babel_RTCS";
        r5 = "Undismiss suggested contacts operation scheduled without gaiaid";
        r6 = 0;
        r6 = new java.lang.Object[r6];
        glk.e(r4, r5, r6);
        goto L_0x0097;
    L_0x047d:
        r4 = "current_version";
        r0 = r28;
        r4 = r0.getByteArrayExtra(r4);
        r6 = "gaia_id";
        r0 = r28;
        r6 = r0.getStringExtra(r6);
        r7 = "remove";
        r8 = 0;
        r0 = r28;
        r7 = r0.getBooleanExtra(r7, r8);
        r8 = android.text.TextUtils.isEmpty(r6);
        if (r8 != 0) goto L_0x04ac;
    L_0x049c:
        r8 = new fla;
        r8.<init>(r5, r4, r6, r7);
        r0 = r27;
        r1 = r26;
        r2 = r28;
        r0.a(r1, r2, r8);
        goto L_0x0097;
    L_0x04ac:
        r4 = "Babel_RTCS";
        r5 = "Favorite contacts operation scheduled without gaiaid";
        r6 = 0;
        r6 = new java.lang.Object[r6];
        glk.e(r4, r5, r6);
        goto L_0x0097;
    L_0x04b8:
        r4 = new ffn;
        r4.<init>(r5);
        r0 = r27;
        r1 = r26;
        r2 = r28;
        r0.a(r1, r2, r4);
        goto L_0x0097;
    L_0x04c8:
        r4 = "pdu";
        r0 = r28;
        r4 = r0.getByteArrayExtra(r4);
        r6 = "is_sms_read";
        r7 = 0;
        r0 = r28;
        r6 = r0.getBooleanExtra(r6, r7);
        r7 = 1;
        r7 = new android.telephony.SmsMessage[r7];
        r8 = 0;
        r4 = android.telephony.SmsMessage.createFromPdu(r4);
        r7[r8] = r4;
        r4 = 0;
        r8 = java.lang.Boolean.valueOf(r6);
        blf.a(r7, r5, r4, r8);
        if (r6 != 0) goto L_0x0097;
    L_0x04ed:
        r4 = r27.getApplicationContext();
        r5 = ect.class;
        r4 = jyn.a(r4, r5);
        r4 = (ect) r4;
        r5 = 1;
        r0 = r25;
        r4.a(r0, r5);
        goto L_0x0097;
    L_0x0501:
        r4 = "extra_rich_presence_type";
        r6 = -1;
        r0 = r28;
        r4 = r0.getIntExtra(r4, r6);
        if (r4 < 0) goto L_0x0516;
    L_0x050c:
        r6 = "extra_rich_presence_type_enabled";
        r0 = r28;
        r6 = r0.hasExtra(r6);
        if (r6 != 0) goto L_0x0539;
    L_0x0516:
        r5 = a;
        if (r5 == 0) goto L_0x0097;
    L_0x051a:
        r5 = "SetRichPresenceEnabledState failed.";
        if (r4 >= 0) goto L_0x052f;
    L_0x051e:
        r4 = " Invalid rich presence type.";
    L_0x0520:
        r4 = java.lang.String.valueOf(r4);
        r6 = r4.length();
        if (r6 == 0) goto L_0x0532;
    L_0x052a:
        r5.concat(r4);
        goto L_0x0097;
    L_0x052f:
        r4 = " Unknown if enabled.";
        goto L_0x0520;
    L_0x0532:
        r4 = new java.lang.String;
        r4.<init>(r5);
        goto L_0x0097;
    L_0x0539:
        r6 = "extra_rich_presence_type_enabled";
        r7 = 0;
        r0 = r28;
        r6 = r0.getBooleanExtra(r6, r7);
        r7 = new java.util.ArrayList;
        r8 = 1;
        r7.<init>(r8);
        r8 = new gkv;
        r4 = java.lang.Integer.valueOf(r4);
        r6 = java.lang.Boolean.valueOf(r6);
        r8.<init>(r4, r6);
        r7.add(r8);
        r4 = new fkl;
        r4.<init>(r5, r7);
        r0 = r27;
        r1 = r26;
        r2 = r28;
        r0.a(r1, r2, r4);
        goto L_0x0097;
    L_0x0568:
        r4 = "participant_entity";
        r0 = r28;
        r4 = r0.getParcelableExtra(r4);
        r4 = (edk) r4;
        r5 = new blo;
        r0 = r27;
        r1 = r25;
        r5.<init>(r0, r1);
        r6 = 1;
        r5.a(r4, r6);
        goto L_0x0097;
    L_0x0581:
        r4 = new blo;
        r0 = r27;
        r1 = r25;
        r4.<init>(r0, r1);
        r5 = "conversation_id";
        r0 = r28;
        r5 = r0.getStringExtra(r5);
        r6 = r4.e();
        r7 = "SELECT count(*) from messages WHERE conversation_id=? LIMIT 1";
        r8 = 1;
        r8 = new java.lang.String[r8];
        r9 = 0;
        r8[r9] = r5;
        r6 = r6.a(r7, r8);
        r7 = r6.moveToFirst();	 Catch:{ all -> 0x05b9 }
        if (r7 == 0) goto L_0x05b2;	 Catch:{ all -> 0x05b9 }
    L_0x05a8:
        r7 = 0;	 Catch:{ all -> 0x05b9 }
        r7 = r6.getInt(r7);	 Catch:{ all -> 0x05b9 }
        if (r7 != 0) goto L_0x05b2;	 Catch:{ all -> 0x05b9 }
    L_0x05af:
        r4.A(r5);	 Catch:{ all -> 0x05b9 }
    L_0x05b2:
        if (r6 == 0) goto L_0x0097;
    L_0x05b4:
        r6.close();
        goto L_0x0097;
    L_0x05b9:
        r4 = move-exception;
        if (r6 == 0) goto L_0x05bf;
    L_0x05bc:
        r6.close();
    L_0x05bf:
        throw r4;
    L_0x05c0:
        r4 = "recent_call_action_info";
        r0 = r28;
        r4 = r0.getParcelableExtra(r4);
        r4 = (fdv) r4;
        r6 = "recent_call_type";
        r7 = 0;
        r0 = r28;
        r6 = r0.getIntExtra(r6, r7);
        gwb.a(r5, r6, r4);
        goto L_0x0097;
    L_0x05d8:
        r4 = "recent_call_timestamp";
        r6 = 0;
        r0 = r28;
        r6 = r0.getLongExtra(r4, r6);
        r4 = "recent_call_rate";
        r0 = r28;
        r4 = r0.getStringExtra(r4);
        r8 = "recent_call_is_free_call";
        r9 = 1;
        r0 = r28;
        r8 = r0.getBooleanExtra(r8, r9);
        gwb.a(r5, r6, r4, r8);
        goto L_0x0097;
    L_0x05f8:
        gwb.b(r5);
        goto L_0x0097;
    L_0x05fd:
        r4 = "recent_call_row_ids";
        r0 = r28;
        r4 = r0.getStringArrayExtra(r4);
        gwb.a(r5, r4);
        goto L_0x0097;
    L_0x060a:
        r4 = new blo;
        r0 = r27;
        r1 = r25;
        r4.<init>(r0, r1);
        r5 = "conversation_id";
        r0 = r28;
        r5 = r0.getStringExtra(r5);
        r4.j(r5);
        goto L_0x0097;
    L_0x0620:
        r4 = i;
        r5 = new fic;
        r0 = r27;
        r5.<init>(r0);
        r4.post(r5);
        goto L_0x0097;
    L_0x062e:
        r4 = "phone_number";
        r0 = r28;
        r4 = r0.getStringExtra(r4);
        r6 = new ffr;
        r6.<init>(r5, r4);
        r0 = r27;
        r1 = r26;
        r2 = r28;
        r0.a(r1, r2, r6);
        goto L_0x0097;
    L_0x0646:
        r6 = c(r28);	 Catch:{ Exception -> 0x00f1 }
        if (r6 != 0) goto L_0x0658;	 Catch:{ Exception -> 0x00f1 }
    L_0x064c:
        r4 = "Babel_RTCS";	 Catch:{ Exception -> 0x00f1 }
        r5 = "Received null server response";	 Catch:{ Exception -> 0x00f1 }
        r6 = 0;	 Catch:{ Exception -> 0x00f1 }
        r6 = new java.lang.Object[r6];	 Catch:{ Exception -> 0x00f1 }
        glk.d(r4, r5, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0658:
        r7 = r28.getExtras();	 Catch:{ Exception -> 0x00f1 }
        r4 = "server_response_id";	 Catch:{ Exception -> 0x00f1 }
        r4 = r7.containsKey(r4);	 Catch:{ Exception -> 0x00f1 }
        if (r4 == 0) goto L_0x0692;	 Catch:{ Exception -> 0x00f1 }
    L_0x0664:
        r4 = "account_id";	 Catch:{ Exception -> 0x00f1 }
        r8 = -1;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r8 = r0.getIntExtra(r4, r8);	 Catch:{ Exception -> 0x00f1 }
        r4 = r27.getApplicationContext();	 Catch:{ Exception -> 0x00f1 }
        r9 = jcf.class;	 Catch:{ Exception -> 0x00f1 }
        r4 = jyn.a(r4, r9);	 Catch:{ Exception -> 0x00f1 }
        r4 = (jcf) r4;	 Catch:{ Exception -> 0x00f1 }
        r4 = r4.a(r8);	 Catch:{ Exception -> 0x00f1 }
        r8 = "preserve_response_data";	 Catch:{ Exception -> 0x00f1 }
        r4 = r4.c(r8);	 Catch:{ Exception -> 0x00f1 }
        if (r4 != 0) goto L_0x0692;	 Catch:{ Exception -> 0x00f1 }
    L_0x0685:
        r4 = r27.getApplicationContext();	 Catch:{ Exception -> 0x00f1 }
        r8 = "server_response_id";	 Catch:{ Exception -> 0x00f1 }
        r8 = r7.getLong(r8);	 Catch:{ Exception -> 0x00f1 }
        gwb.b(r4, r8);	 Catch:{ Exception -> 0x00f1 }
    L_0x0692:
        r8 = glj.a();	 Catch:{ Exception -> 0x00f1 }
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x00f1 }
        r8 = r8 * r10;	 Catch:{ Exception -> 0x00f1 }
        r6.c(r8);	 Catch:{ Exception -> 0x00f1 }
        r4 = r27.getApplicationContext();	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r7 = r0.l;	 Catch:{ Exception -> 0x00f1 }
        r0 = r26;	 Catch:{ Exception -> 0x00f1 }
        r4 = a(r4, r5, r0, r6, r7);	 Catch:{ Exception -> 0x00f1 }
        a(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = faz.a;	 Catch:{ Exception -> 0x00f1 }
        r5 = r6.c();	 Catch:{ Exception -> 0x00f1 }
        r5 = faz.a(r5);	 Catch:{ Exception -> 0x00f1 }
        r4.c(r5);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x06bc:
        r4 = "phone_number";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = new eqc;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x06d4:
        r4 = "phone_number";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = "verification_code";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r6);	 Catch:{ Exception -> 0x00f1 }
        r7 = "is_discoverable";	 Catch:{ Exception -> 0x00f1 }
        r8 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r7 = r0.getBooleanExtra(r7, r8);	 Catch:{ Exception -> 0x00f1 }
        r8 = new epr;	 Catch:{ Exception -> 0x00f1 }
        r8.<init>(r5, r4, r6, r7);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r8);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x06fd:
        r4 = new fiv;	 Catch:{ Exception -> 0x00f1 }
        r6 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r6);	 Catch:{ Exception -> 0x00f1 }
        r4.<init>(r5, r6);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0715:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r10 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "message_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r11 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "message_text";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getCharSequenceExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r12 = r4.toString();	 Catch:{ Exception -> 0x00f1 }
        r4 = "uri";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r13 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "picasa_photo_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r15 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "rotation";	 Catch:{ Exception -> 0x00f1 }
        r6 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r14 = r0.getIntExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r4 = "width";	 Catch:{ Exception -> 0x00f1 }
        r6 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r16 = r0.getIntExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r4 = "height";	 Catch:{ Exception -> 0x00f1 }
        r6 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r17 = r0.getIntExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r4 = "content_type";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r18 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "subject";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r19 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "requires_mms";	 Catch:{ Exception -> 0x00f1 }
        r6 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r20 = r0.getBooleanExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r4 = "place";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getParcelableExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = (duv) r4;	 Catch:{ Exception -> 0x00f1 }
        if (r4 != 0) goto L_0x07d5;	 Catch:{ Exception -> 0x00f1 }
    L_0x0781:
        r21 = 0;	 Catch:{ Exception -> 0x00f1 }
    L_0x0783:
        r4 = "timestamp";	 Catch:{ Exception -> 0x00f1 }
        r6 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r22 = r0.getLongExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r4 = "otr_state";	 Catch:{ Exception -> 0x00f1 }
        r6 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r24 = r0.getIntExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r7 = new fju;	 Catch:{ Exception -> 0x00f1 }
        r8 = r27.getApplicationContext();	 Catch:{ Exception -> 0x00f1 }
        r9 = r5;	 Catch:{ Exception -> 0x00f1 }
        r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r7);	 Catch:{ Exception -> 0x00f1 }
        r4 = a;	 Catch:{ Exception -> 0x00f1 }
        if (r4 == 0) goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x07ad:
        r4 = "rtcs_timestamp_begin_ms";	 Catch:{ Exception -> 0x00f1 }
        r6 = -1;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getLongExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r6 = glj.b();	 Catch:{ Exception -> 0x00f1 }
        r4 = r6 - r4;	 Catch:{ Exception -> 0x00f1 }
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00f1 }
        r7 = 64;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r7);	 Catch:{ Exception -> 0x00f1 }
        r7 = "****** IntentService Delay (SendMessage): ";	 Catch:{ Exception -> 0x00f1 }
        r6 = r6.append(r7);	 Catch:{ Exception -> 0x00f1 }
        r4 = r6.append(r4);	 Catch:{ Exception -> 0x00f1 }
        r5 = "ms";	 Catch:{ Exception -> 0x00f1 }
        r4.append(r5);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x07d5:
        r21 = r4.a();	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0783;	 Catch:{ Exception -> 0x00f1 }
    L_0x07da:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = "message_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r6);	 Catch:{ Exception -> 0x00f1 }
        r7 = "error";	 Catch:{ Exception -> 0x00f1 }
        r8 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r7 = r0.getIntExtra(r7, r8);	 Catch:{ Exception -> 0x00f1 }
        r8 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00f1 }
        r9 = java.lang.String.valueOf(r4);	 Catch:{ Exception -> 0x00f1 }
        r9 = r9.length();	 Catch:{ Exception -> 0x00f1 }
        r9 = r9 + 24;	 Catch:{ Exception -> 0x00f1 }
        r10 = java.lang.String.valueOf(r6);	 Catch:{ Exception -> 0x00f1 }
        r10 = r10.length();	 Catch:{ Exception -> 0x00f1 }
        r9 = r9 + r10;	 Catch:{ Exception -> 0x00f1 }
        r8.<init>(r9);	 Catch:{ Exception -> 0x00f1 }
        r9 = "OP_SET_MESSAGE_FAILED: ";	 Catch:{ Exception -> 0x00f1 }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x00f1 }
        r8 = r8.append(r4);	 Catch:{ Exception -> 0x00f1 }
        r9 = " ";	 Catch:{ Exception -> 0x00f1 }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x00f1 }
        r8.append(r6);	 Catch:{ Exception -> 0x00f1 }
        r8 = new fkk;	 Catch:{ Exception -> 0x00f1 }
        r8.<init>(r5, r4, r6, r7);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r8);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x082e:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "insert_error_message";	 Catch:{ Exception -> 0x00f1 }
        r5 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r5 = r0.getBooleanExtra(r4, r5);	 Catch:{ Exception -> 0x00f1 }
        r4 = new blo;	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r25;	 Catch:{ Exception -> 0x00f1 }
        r4.<init>(r0, r1);	 Catch:{ Exception -> 0x00f1 }
        r7 = fwx.UNKNOWN;	 Catch:{ Exception -> 0x00f1 }
        r8 = fwx.FAILED_TO_SEND;	 Catch:{ Exception -> 0x00f1 }
        r4.a(r6, r7, r8);	 Catch:{ Exception -> 0x00f1 }
        r8 = r4.T(r6);	 Catch:{ Exception -> 0x00f1 }
        blf.a(r4, r6, r8);	 Catch:{ Exception -> 0x00f1 }
        r7 = 4;	 Catch:{ Exception -> 0x00f1 }
        r4.g(r6, r7);	 Catch:{ Exception -> 0x00f1 }
        if (r5 == 0) goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x085c:
        r8 = glj.a();	 Catch:{ Exception -> 0x00f1 }
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x00f1 }
        r8 = r8 * r10;	 Catch:{ Exception -> 0x00f1 }
        r5 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00f1 }
        r5.<init>();	 Catch:{ Exception -> 0x00f1 }
        r10 = -1;	 Catch:{ Exception -> 0x00f1 }
        r7 = r6;	 Catch:{ Exception -> 0x00f1 }
        blf.a(r4, r5, r6, r7, r8, r10);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0870:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r9 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "message_row_id";	 Catch:{ Exception -> 0x00f1 }
        r6 = -1;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r10 = r0.getLongExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r4 = "timestamp";	 Catch:{ Exception -> 0x00f1 }
        r6 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r12 = r0.getLongExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r6 = new fju;	 Catch:{ Exception -> 0x00f1 }
        r7 = r27.getApplicationContext();	 Catch:{ Exception -> 0x00f1 }
        r8 = r5;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r7, r8, r9, r10, r12);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x08a1:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r7 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = gwb.g(r5, r7);	 Catch:{ Exception -> 0x00f1 }
        r8 = 1;	 Catch:{ Exception -> 0x00f1 }
        r4 = r5.b();	 Catch:{ Exception -> 0x00f1 }
        r9 = r4.a;	 Catch:{ Exception -> 0x00f1 }
        r10 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00f1 }
        r10.<init>();	 Catch:{ Exception -> 0x00f1 }
        r4 = r6.h();	 Catch:{ Exception -> 0x00f1 }
        r4 = r4 + -1;	 Catch:{ Exception -> 0x00f1 }
    L_0x08bf:
        if (r4 < 0) goto L_0x08d9;	 Catch:{ Exception -> 0x00f1 }
    L_0x08c1:
        r11 = r6.a(r4);	 Catch:{ Exception -> 0x00f1 }
        r11 = r11.h();	 Catch:{ Exception -> 0x00f1 }
        r12 = r11.b();	 Catch:{ Exception -> 0x00f1 }
        r12 = r9.equals(r12);	 Catch:{ Exception -> 0x00f1 }
        if (r12 != 0) goto L_0x08d6;	 Catch:{ Exception -> 0x00f1 }
    L_0x08d3:
        r10.add(r11);	 Catch:{ Exception -> 0x00f1 }
    L_0x08d6:
        r4 = r4 + -1;	 Catch:{ Exception -> 0x00f1 }
        goto L_0x08bf;	 Catch:{ Exception -> 0x00f1 }
    L_0x08d9:
        r4 = r10.size();	 Catch:{ Exception -> 0x00f1 }
        r9 = 1;	 Catch:{ Exception -> 0x00f1 }
        if (r4 <= r9) goto L_0x08e1;	 Catch:{ Exception -> 0x00f1 }
    L_0x08e0:
        r8 = 2;	 Catch:{ Exception -> 0x00f1 }
    L_0x08e1:
        r4 = r6.j();	 Catch:{ Exception -> 0x00f1 }
        r4 = r4 + -1;	 Catch:{ Exception -> 0x00f1 }
    L_0x08e7:
        if (r4 < 0) goto L_0x0904;	 Catch:{ Exception -> 0x00f1 }
    L_0x08e9:
        r8 = r6.b(r4);	 Catch:{ Exception -> 0x00f1 }
        r8 = r8.b();	 Catch:{ Exception -> 0x00f1 }
        r9 = r6.b(r4);	 Catch:{ Exception -> 0x00f1 }
        r9 = r9.d();	 Catch:{ Exception -> 0x00f1 }
        r8 = gwb.b(r8, r9);	 Catch:{ Exception -> 0x00f1 }
        r10.add(r8);	 Catch:{ Exception -> 0x00f1 }
        r8 = 2;	 Catch:{ Exception -> 0x00f1 }
        r4 = r4 + -1;	 Catch:{ Exception -> 0x00f1 }
        goto L_0x08e7;	 Catch:{ Exception -> 0x00f1 }
    L_0x0904:
        r4 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00f1 }
        r4.<init>();	 Catch:{ Exception -> 0x00f1 }
        r12 = new euw;	 Catch:{ Exception -> 0x00f1 }
        r6 = new eup;	 Catch:{ Exception -> 0x00f1 }
        r9 = 0;	 Catch:{ Exception -> 0x00f1 }
        r11 = 0;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r7, r8, r9, r10, r11);	 Catch:{ Exception -> 0x00f1 }
        r12.<init>(r6);	 Catch:{ Exception -> 0x00f1 }
        r4.add(r12);	 Catch:{ Exception -> 0x00f1 }
        r6 = new fid;	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r0, r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x092a:
        r4 = "message_row_ids";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getLongArrayExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = new fet;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0942:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = "type";	 Catch:{ Exception -> 0x00f1 }
        r7 = -1;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getIntExtra(r6, r7);	 Catch:{ Exception -> 0x00f1 }
        r7 = java.lang.Integer.valueOf(r6);	 Catch:{ Exception -> 0x00f1 }
        r8 = -1;	 Catch:{ Exception -> 0x00f1 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ Exception -> 0x00f1 }
        iil.b(r7, r8);	 Catch:{ Exception -> 0x00f1 }
        r7 = fwy.values();	 Catch:{ Exception -> 0x00f1 }
        r6 = r7[r6];	 Catch:{ Exception -> 0x00f1 }
        r7 = new feu;	 Catch:{ Exception -> 0x00f1 }
        r7.<init>(r5, r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r7);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0975:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r5 = "message_row_id";	 Catch:{ Exception -> 0x00f1 }
        r6 = -1;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getLongExtra(r5, r6);	 Catch:{ Exception -> 0x00f1 }
        r5 = new blo;	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r25;	 Catch:{ Exception -> 0x00f1 }
        r5.<init>(r0, r1);	 Catch:{ Exception -> 0x00f1 }
        blf.a(r5, r6);	 Catch:{ Exception -> 0x00f1 }
        blf.d(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0998:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "audience";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getSerializableExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = (juh) r4;	 Catch:{ Exception -> 0x00f1 }
        r7 = new fgi;	 Catch:{ Exception -> 0x00f1 }
        r7.<init>(r5, r6, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r7);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x09ba:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = new fgj;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x09d2:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = "watermark";	 Catch:{ Exception -> 0x00f1 }
        r8 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getLongExtra(r6, r8);	 Catch:{ Exception -> 0x00f1 }
        r8 = new fkz;	 Catch:{ Exception -> 0x00f1 }
        r8.<init>(r5, r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r8);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x09f4:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r5 = "call_media_type";	 Catch:{ Exception -> 0x00f1 }
        r6 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r5 = r0.getIntExtra(r5, r6);	 Catch:{ Exception -> 0x00f1 }
        r6 = new blo;	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r25;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r0, r1);	 Catch:{ Exception -> 0x00f1 }
        r8 = r6.M(r4);	 Catch:{ Exception -> 0x00f1 }
        r6.a(r5, r8, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0a17:
        r4 = "scroll_timestamp";	 Catch:{ Exception -> 0x00f1 }
        r6 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getLongExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r6 = "scroll_to_item_timestamp";	 Catch:{ Exception -> 0x00f1 }
        r8 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getLongExtra(r6, r8);	 Catch:{ Exception -> 0x00f1 }
        r8 = new blo;	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r25;	 Catch:{ Exception -> 0x00f1 }
        r8.<init>(r0, r1);	 Catch:{ Exception -> 0x00f1 }
        r8.a(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0a39:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r5 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "scroll_timestamp";	 Catch:{ Exception -> 0x00f1 }
        r6 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getLongExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r4 = "scroll_to_item_timestamp";	 Catch:{ Exception -> 0x00f1 }
        r8 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r8 = r0.getLongExtra(r4, r8);	 Catch:{ Exception -> 0x00f1 }
        r4 = new blo;	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r25;	 Catch:{ Exception -> 0x00f1 }
        r4.<init>(r0, r1);	 Catch:{ Exception -> 0x00f1 }
        r4.b(r5, r6, r8);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0a63:
        r4 = "hangout_invite_receipt";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getByteArrayExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = new fcx;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0a7b:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = "message_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r6);	 Catch:{ Exception -> 0x00f1 }
        r7 = new fja;	 Catch:{ Exception -> 0x00f1 }
        r7.<init>(r5, r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r7);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0aa2:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = "conversation_name";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r6);	 Catch:{ Exception -> 0x00f1 }
        r7 = new fkx;	 Catch:{ Exception -> 0x00f1 }
        r7.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r7.a(r6);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r7);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0ac5:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = "notification_level";	 Catch:{ Exception -> 0x00f1 }
        r7 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getIntExtra(r6, r7);	 Catch:{ Exception -> 0x00f1 }
        if (r4 != 0) goto L_0x0aec;	 Catch:{ Exception -> 0x00f1 }
    L_0x0ad8:
        r4 = new fkx;	 Catch:{ Exception -> 0x00f1 }
        r7 = 0;	 Catch:{ Exception -> 0x00f1 }
        r4.<init>(r5, r7);	 Catch:{ Exception -> 0x00f1 }
        r4.a(r6);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0aec:
        r7 = new blo;	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r25;	 Catch:{ Exception -> 0x00f1 }
        r7.<init>(r0, r1);	 Catch:{ Exception -> 0x00f1 }
        r4 = r7.ab(r4);	 Catch:{ Exception -> 0x00f1 }
        r7 = r4.iterator();	 Catch:{ Exception -> 0x00f1 }
    L_0x0afd:
        r4 = r7.hasNext();	 Catch:{ Exception -> 0x00f1 }
        if (r4 == 0) goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0b03:
        r4 = r7.next();	 Catch:{ Exception -> 0x00f1 }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x00f1 }
        r8 = new fkx;	 Catch:{ Exception -> 0x00f1 }
        r8.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r8.a(r6);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r8);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0afd;	 Catch:{ Exception -> 0x00f1 }
    L_0x0b1b:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = "ringtone_uri";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r6);	 Catch:{ Exception -> 0x00f1 }
        r7 = new fkx;	 Catch:{ Exception -> 0x00f1 }
        r7.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r7.b(r6);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r7);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0b3e:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = "ringtone_uri";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r6);	 Catch:{ Exception -> 0x00f1 }
        r7 = new fkx;	 Catch:{ Exception -> 0x00f1 }
        r7.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r7.c(r6);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r7);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0b61:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "accept";	 Catch:{ Exception -> 0x00f1 }
        r7 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r7 = r0.getBooleanExtra(r4, r7);	 Catch:{ Exception -> 0x00f1 }
        r4 = "report_inviter";	 Catch:{ Exception -> 0x00f1 }
        r8 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r8 = r0.getBooleanExtra(r4, r8);	 Catch:{ Exception -> 0x00f1 }
        r4 = "block_inviter";	 Catch:{ Exception -> 0x00f1 }
        r9 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r9 = r0.getBooleanExtra(r4, r9);	 Catch:{ Exception -> 0x00f1 }
        r4 = new fjb;	 Catch:{ Exception -> 0x00f1 }
        r4.<init>(r5, r6, r7, r8, r9);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0b94:
        r4 = "affinity";	 Catch:{ Exception -> 0x00f1 }
        r6 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getIntExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r6 = new feq;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0bad:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = new fjg;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0bc5:
        r4 = "conversation_sync_filter";	 Catch:{ Exception -> 0x00f1 }
        r6 = 1;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getIntExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r6 = new fjf;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0bde:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = new blo;	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r25;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r0, r1);	 Catch:{ Exception -> 0x00f1 }
        r7 = r6.t(r4);	 Catch:{ Exception -> 0x00f1 }
        r8 = 2;	 Catch:{ Exception -> 0x00f1 }
        if (r7 == r8) goto L_0x0c08;	 Catch:{ Exception -> 0x00f1 }
    L_0x0bf6:
        r6 = 0;	 Catch:{ Exception -> 0x00f1 }
    L_0x0bf8:
        r8 = new fjd;	 Catch:{ Exception -> 0x00f1 }
        r8.<init>(r5, r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r8);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0c08:
        r6 = r6.O(r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0bf8;	 Catch:{ Exception -> 0x00f1 }
    L_0x0c0d:
        r4 = "gaia_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r5 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "content_values";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getParcelableExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = (android.content.ContentValues) r4;	 Catch:{ Exception -> 0x00f1 }
        r6 = new blo;	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r25;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r0, r1);	 Catch:{ Exception -> 0x00f1 }
        r6.a(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0c2d:
        r4 = "member_gaiaid";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "phone_number";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r7 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "user_name";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r8 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "blocked";	 Catch:{ Exception -> 0x00f1 }
        r9 = 1;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r9 = r0.getBooleanExtra(r4, r9);	 Catch:{ Exception -> 0x00f1 }
        r4 = "retry_request";	 Catch:{ Exception -> 0x00f1 }
        r10 = 1;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r10 = r0.getBooleanExtra(r4, r10);	 Catch:{ Exception -> 0x00f1 }
        r4 = new fdt;	 Catch:{ Exception -> 0x00f1 }
        r4.<init>(r5, r6, r7, r8, r9, r10);	 Catch:{ Exception -> 0x00f1 }
        r5 = "rid";	 Catch:{ Exception -> 0x00f1 }
        r6 = -1;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r5 = r0.getIntExtra(r5, r6);	 Catch:{ Exception -> 0x00f1 }
        r4.b(r5);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0c73:
        r4 = new fgk;	 Catch:{ Exception -> 0x00f1 }
        r4.<init>(r5);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0c83:
        r4 = new blo;	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r25;	 Catch:{ Exception -> 0x00f1 }
        r4.<init>(r0, r1);	 Catch:{ Exception -> 0x00f1 }
        r5 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r5 = r0.getStringExtra(r5);	 Catch:{ Exception -> 0x00f1 }
        r4.Q(r5);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0c99:
        r4 = "query";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = "requester_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r6);	 Catch:{ Exception -> 0x00f1 }
        r7 = new fjp;	 Catch:{ Exception -> 0x00f1 }
        r7.<init>(r5, r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r7);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0cb9:
        r4 = "com.google.android.apps.hangouts.EntityLookupSpecs";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getParcelableArrayListExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = "batch_gebi_tag";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r6);	 Catch:{ Exception -> 0x00f1 }
        r7 = "from_contact_lookup";	 Catch:{ Exception -> 0x00f1 }
        r8 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r7 = r0.getBooleanExtra(r7, r8);	 Catch:{ Exception -> 0x00f1 }
        r8 = new ffm;	 Catch:{ Exception -> 0x00f1 }
        r8.<init>(r5, r4, r6, r7);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r8);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0ce2:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r5 = new blo;	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r25;	 Catch:{ Exception -> 0x00f1 }
        r5.<init>(r0, r1);	 Catch:{ Exception -> 0x00f1 }
        r5.a();	 Catch:{ Exception -> 0x00f1 }
        blo.b(r5, r4);	 Catch:{ all -> 0x0d01 }
        r5.b();	 Catch:{ all -> 0x0d01 }
        r5.c();	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0d01:
        r4 = move-exception;	 Catch:{ Exception -> 0x00f1 }
        r5.c();	 Catch:{ Exception -> 0x00f1 }
        throw r4;	 Catch:{ Exception -> 0x00f1 }
    L_0x0d06:
        r4 = "conversationids";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringArrayExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r5 = new blo;	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r25;	 Catch:{ Exception -> 0x00f1 }
        r5.<init>(r0, r1);	 Catch:{ Exception -> 0x00f1 }
        r5.a(r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0d1c:
        r4 = "member_gaiaid";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = new fft;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0d34:
        r4 = "hangout_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = new ffq;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0d4c:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = new ffp;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0d64:
        r4 = "log_data_id";	 Catch:{ Exception -> 0x00f1 }
        r6 = -1;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getIntExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r4 = r;	 Catch:{ Exception -> 0x00f1 }
        r7 = java.lang.Integer.valueOf(r6);	 Catch:{ Exception -> 0x00f1 }
        r4 = r4.remove(r7);	 Catch:{ Exception -> 0x00f1 }
        r4 = (android.util.Pair) r4;	 Catch:{ Exception -> 0x00f1 }
        r7 = "is_nova";	 Catch:{ Exception -> 0x00f1 }
        r8 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r7 = r0.getBooleanExtra(r7, r8);	 Catch:{ Exception -> 0x00f1 }
        if (r4 == 0) goto L_0x0dc3;	 Catch:{ Exception -> 0x00f1 }
    L_0x0d84:
        r8 = "Babel_RTCS";	 Catch:{ Exception -> 0x00f1 }
        r9 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00f1 }
        r10 = 33;	 Catch:{ Exception -> 0x00f1 }
        r9.<init>(r10);	 Catch:{ Exception -> 0x00f1 }
        r10 = "Pulled logData for id ";	 Catch:{ Exception -> 0x00f1 }
        r9 = r9.append(r10);	 Catch:{ Exception -> 0x00f1 }
        r6 = r9.append(r6);	 Catch:{ Exception -> 0x00f1 }
        r6 = r6.toString();	 Catch:{ Exception -> 0x00f1 }
        r9 = 0;	 Catch:{ Exception -> 0x00f1 }
        r9 = new java.lang.Object[r9];	 Catch:{ Exception -> 0x00f1 }
        glk.a(r8, r6, r9);	 Catch:{ Exception -> 0x00f1 }
        r6 = 2380; // 0x94c float:3.335E-42 double:1.176E-320;	 Catch:{ Exception -> 0x00f1 }
        gwb.f(r6);	 Catch:{ Exception -> 0x00f1 }
        r8 = new fjc;	 Catch:{ Exception -> 0x00f1 }
        r6 = r4.first;	 Catch:{ Exception -> 0x00f1 }
        r6 = (java.lang.String) r6;	 Catch:{ Exception -> 0x00f1 }
        r4 = r4.second;	 Catch:{ Exception -> 0x00f1 }
        r4 = (mav) r4;	 Catch:{ Exception -> 0x00f1 }
        r8.<init>(r5, r6, r4, r7);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r8);	 Catch:{ Exception -> 0x00f1 }
        r4 = 2014; // 0x7de float:2.822E-42 double:9.95E-321;	 Catch:{ Exception -> 0x00f1 }
        gwb.f(r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0dc3:
        r4 = "Babel_RTCS";	 Catch:{ Exception -> 0x00f1 }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00f1 }
        r7 = 29;	 Catch:{ Exception -> 0x00f1 }
        r5.<init>(r7);	 Catch:{ Exception -> 0x00f1 }
        r7 = "No logdata for id ";	 Catch:{ Exception -> 0x00f1 }
        r5 = r5.append(r7);	 Catch:{ Exception -> 0x00f1 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x00f1 }
        r5 = r5.toString();	 Catch:{ Exception -> 0x00f1 }
        r6 = 0;	 Catch:{ Exception -> 0x00f1 }
        r6 = new java.lang.Object[r6];	 Catch:{ Exception -> 0x00f1 }
        glk.e(r4, r5, r6);	 Catch:{ Exception -> 0x00f1 }
        r4 = 2239; // 0x8bf float:3.138E-42 double:1.106E-320;	 Catch:{ Exception -> 0x00f1 }
        gwb.f(r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0de7:
        r4 = "compressed_log_file";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = new flk;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0dff:
        r4 = new ffl;	 Catch:{ Exception -> 0x00f1 }
        r4.<init>(r5);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0e0f:
        r4 = "chat_acl_key";	 Catch:{ Exception -> 0x00f1 }
        r6 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getIntExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r6 = "chat_acl_circle_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r7 = r0.getStringExtra(r6);	 Catch:{ Exception -> 0x00f1 }
        r6 = "chat_acl_circle_name";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r8 = r0.getStringExtra(r6);	 Catch:{ Exception -> 0x00f1 }
        r6 = "chat_acl_level";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r9 = r0.getStringExtra(r6);	 Catch:{ Exception -> 0x00f1 }
        r6 = ets.values();	 Catch:{ Exception -> 0x00f1 }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00f1 }
        r4 = new fkf;	 Catch:{ Exception -> 0x00f1 }
        r4.<init>(r5, r6, r7, r8, r9);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0e46:
        r4 = new fkg;	 Catch:{ Exception -> 0x00f1 }
        r4.<init>(r5);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0e56:
        r4 = "user_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = new ffx;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0e6e:
        r4 = "picasa_photo_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = new ffj;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0e86:
        r4 = "email_address";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = new fjt;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0e9e:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = "conversation_name";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r6);	 Catch:{ Exception -> 0x00f1 }
        blf.a(r5, r4, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0eb3:
        r4 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = 2;	 Catch:{ Exception -> 0x00f1 }
        blf.a(r5, r4, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0ec1:
        r4 = "mms_content_location";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "mms_transaction_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r7 = r0.getByteArrayExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = "notification_row_id";	 Catch:{ Exception -> 0x00f1 }
        r8 = -1;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r8 = r0.getLongExtra(r4, r8);	 Catch:{ Exception -> 0x00f1 }
        r4 = "mms_auto_retrieve";	 Catch:{ Exception -> 0x00f1 }
        r10 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r10 = r0.getBooleanExtra(r4, r10);	 Catch:{ Exception -> 0x00f1 }
        r4 = new fjn;	 Catch:{ Exception -> 0x00f1 }
        r4.<init>(r5, r6, r7, r8, r10);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0ef4:
        r4 = "mms_auto_retrieve";	 Catch:{ Exception -> 0x00f1 }
        r6 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getBooleanExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        blf.a(r5, r0, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0f04:
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        blf.b(r5, r0);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0f0b:
        gwb.O();	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0f10:
        gwb.P();	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0f15:
        r4 = "free_sms_storage_action_index";	 Catch:{ Exception -> 0x00f1 }
        r5 = -1;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getIntExtra(r4, r5);	 Catch:{ Exception -> 0x00f1 }
        r5 = "free_sms_storage_duration";	 Catch:{ Exception -> 0x00f1 }
        r6 = -1;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getLongExtra(r5, r6);	 Catch:{ Exception -> 0x00f1 }
        fyx.a(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0f2d:
        r4 = "notification_row_id";	 Catch:{ Exception -> 0x00f1 }
        r6 = -1;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getLongExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r4 = "mms_auto_retrieve";	 Catch:{ Exception -> 0x00f1 }
        r8 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getBooleanExtra(r4, r8);	 Catch:{ Exception -> 0x00f1 }
        r8 = "error";	 Catch:{ Exception -> 0x00f1 }
        r9 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r8 = r0.getIntExtra(r8, r9);	 Catch:{ Exception -> 0x00f1 }
        blf.a(r5, r6, r4, r8);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0f4e:
        r4 = "hangout_type";	 Catch:{ Exception -> 0x00f1 }
        r6 = 1;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getIntExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r6 = "hangout_topic";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r6);	 Catch:{ Exception -> 0x00f1 }
        r7 = "hangout_media_type";	 Catch:{ Exception -> 0x00f1 }
        r8 = 1;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r7 = r0.getIntExtra(r7, r8);	 Catch:{ Exception -> 0x00f1 }
        r8 = new fel;	 Catch:{ Exception -> 0x00f1 }
        r8.<init>(r5, r4, r6, r7);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r8);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0f78:
        r4 = "mms_dump_file";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        blf.b(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0f85:
        r4 = "message_text";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getCharSequenceExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x00f1 }
        r6 = "conversation_id";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r6);	 Catch:{ Exception -> 0x00f1 }
        if (r6 == 0) goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0f9b:
        if (r4 == 0) goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0f9d:
        r7 = new few;	 Catch:{ Exception -> 0x00f1 }
        r7.<init>(r5, r6, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r7);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0fad:
        r4 = new ffy;	 Catch:{ Exception -> 0x00f1 }
        r4.<init>(r5);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0fbd:
        r4 = new fex;	 Catch:{ Exception -> 0x00f1 }
        r4.<init>(r5);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0fcd:
        r4 = "phone_number";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = android.text.TextUtils.isEmpty(r4);	 Catch:{ Exception -> 0x00f1 }
        r7 = "Expected condition to be false";	 Catch:{ Exception -> 0x00f1 }
        iil.b(r7, r6);	 Catch:{ Exception -> 0x00f1 }
        r6 = new ffk;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0fee:
        r4 = new ffs;	 Catch:{ Exception -> 0x00f1 }
        r4.<init>(r5);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r4);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x0ffe:
        r4 = "phone_number";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = "from_phone_number";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r6 = r0.getStringExtra(r6);	 Catch:{ Exception -> 0x00f1 }
        r7 = new fez;	 Catch:{ Exception -> 0x00f1 }
        r7.<init>(r5, r4, r6);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r7);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x101e:
        r4 = "extra_duration";	 Catch:{ Exception -> 0x00f1 }
        r6 = 0;	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getLongExtra(r4, r6);	 Catch:{ Exception -> 0x00f1 }
        java.lang.Thread.sleep(r4);	 Catch:{ InterruptedException -> 0x102d }
        goto L_0x0097;
    L_0x102d:
        r4 = move-exception;
        goto L_0x0097;
    L_0x1030:
        r4 = "image_urls";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringArrayExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = new ffo;	 Catch:{ Exception -> 0x00f1 }
        r6.<init>(r5, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r6);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;	 Catch:{ Exception -> 0x00f1 }
    L_0x1048:
        r4 = "phone_number";	 Catch:{ Exception -> 0x00f1 }
        r0 = r28;	 Catch:{ Exception -> 0x00f1 }
        r4 = r0.getStringExtra(r4);	 Catch:{ Exception -> 0x00f1 }
        r6 = r28.getExtras();	 Catch:{ Exception -> 0x00f1 }
        r7 = "callerid_set_unset";	 Catch:{ Exception -> 0x00f1 }
        r6 = r6.getBoolean(r7);	 Catch:{ Exception -> 0x00f1 }
        r7 = new fke;	 Catch:{ Exception -> 0x00f1 }
        r7.<init>(r5, r6, r4);	 Catch:{ Exception -> 0x00f1 }
        r0 = r27;	 Catch:{ Exception -> 0x00f1 }
        r1 = r26;	 Catch:{ Exception -> 0x00f1 }
        r2 = r28;	 Catch:{ Exception -> 0x00f1 }
        r0.a(r1, r2, r7);	 Catch:{ Exception -> 0x00f1 }
        goto L_0x0097;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.hangouts.realtimechat.RealTimeChatService.g(android.content.Intent):void");
    }

    public static List<fiu> a(Context context, bko bko, fdn fdn, evz evz, fny fny) {
        blo blo;
        fhc fhc = new fhc();
        List<fiu> linkedList = new LinkedList();
        if (a) {
            String valueOf = String.valueOf(evz);
            new StringBuilder(String.valueOf(valueOf).length() + 17).append("processResponse: ").append(valueOf);
        }
        if (glk.a("Babel_RTCS", 3)) {
            String valueOf2 = String.valueOf(evz.getClass().getSimpleName());
            String valueOf3 = String.valueOf(bko.a());
            glk.a("Babel_RTCS", new StringBuilder((String.valueOf(valueOf2).length() + 26) + String.valueOf(valueOf3).length()).append("processResponse ").append(valueOf2).append(" for acct ").append(valueOf3).toString(), new Object[0]);
        }
        evz.a(context, bko);
        if (!((evz instanceof ewg) || (evz instanceof ezj))) {
            linkedList.add(new fiu(evz.b(), 1, evz));
        }
        long j = 0;
        if (a) {
            j = glj.b();
        }
        fhc.a(bko);
        if (bkq.d(context, bko.g())) {
            blo = null;
        } else {
            blo = new blo(context, bko.g());
        }
        blf.a(blo, evz, fhc);
        fhc.d();
        if (a) {
            long b = glj.b();
            if (b - j > 1000) {
                valueOf3 = String.valueOf(evz.getClass().getSimpleName());
                new StringBuilder(String.valueOf(valueOf3).length() + 44).append("processResponse ").append(valueOf3).append(" took ").append(b - j).append("ms");
            }
        }
        ((ect) jyn.a(context, ect.class)).a(bko.g(), fhc.f());
        Collection b2 = fhc.b();
        if (!b2.isEmpty()) {
            if (glk.a("Babel_RTCS", 3)) {
                int size = b2.size();
                String valueOf4 = String.valueOf(evz.getClass().getSimpleName());
                glk.a("Babel_RTCS", new StringBuilder(String.valueOf(valueOf4).length() + 62).append("processResponse: sending ").append(size).append(" requests from processing ").append(valueOf4).toString(), new Object[0]);
            }
            fdn.a(b2, 0, fny);
        }
        fhc.c();
        return linkedList;
    }

    public static void a(jck jck, List<gkv<Integer, Boolean>> list) {
        for (gkv gkv : list) {
            String str;
            int a = gwb.a((Integer) gkv.a);
            boolean b = gwb.b((Boolean) gkv.b);
            switch (a) {
                case wi.l /*2*/:
                    str = "rich_status_device_reporting_key";
                    break;
                case wi.s /*6*/:
                    str = "last_seen_bool_key";
                    break;
                default:
                    if (a) {
                        new StringBuilder(77).append("RichPresenceEnabledStateNotification received for unhandled type: ").append(a);
                        break;
                    }
                    continue;
            }
            jck.c(str, b);
        }
    }

    public static void b(bko bko) {
        i.post(new fie(bko));
    }

    private Object a(fdn fdn, Intent intent, fhb fhb) {
        if (n && fhb == null) {
            glk.d("Babel_RTCS", "executeOperation called with no operation", new Object[0]);
            return null;
        }
        fhb.f = intent.getStringExtra("stack_trace");
        fhb.w_();
        int intExtra = intent.getIntExtra("rid", -1);
        fiu fiu = new fiu(intExtra, fhb.u_(), null);
        Object v_ = fhb.v_();
        a(intent, fiu, v_);
        fhb.a(fdn, intExtra, this.l);
        fhb.d.c();
        return v_;
    }

    private static void a(Intent intent, fiu fiu, Object obj) {
        i.post(new fif(intent, fiu, obj));
        iiq.a(new fig(intent, fiu, obj));
    }

    public static void a(bko bko, List<fiu> list) {
        i.post(new fih(list, bko));
        iiq.a(new fhg(list, bko));
    }

    public static void a(bko bko, long j) {
        i.post(new fhh(bko, j));
    }

    public static void a(bko bko, fok fok, fdo fdo) {
        i.post(new fhl(fok, bko, fdo));
        iiq.a(new fhm(fok, bko, fdo));
    }

    public static void a(blo blo, String str, String[] strArr) {
        boolean z = strArr != null;
        StringBuilder stringBuilder = new StringBuilder();
        blo.a();
        if (z) {
            try {
                for (String str2 : strArr) {
                    blo.a(str, str2, fwx.ON_SERVER, 0);
                    stringBuilder.append("-");
                    stringBuilder.append(str2);
                }
            } catch (Throwable th) {
                blo.c();
            }
        } else {
            blo.k(str, -2147483648L);
        }
        bls f = blo.f(str);
        blo.b();
        blo.c();
        blf.d(blo);
        if (f != null) {
            int i;
            CharSequence charSequence = f.d;
            if (charSequence == null) {
                charSequence = f.o;
            }
            Context H = gwb.H();
            fx fxVar = new fx(H);
            fxVar.e(true);
            if (z) {
                i = bc.aE;
            } else {
                i = bc.aD;
            }
            fxVar.a(H.getResources().getString(i));
            fxVar.b(charSequence);
            fxVar.a(glj.a());
            fxVar.a(R$drawable.ca);
            Intent a = gwb.a(blo.g().g(), str, f.b);
            a.addFlags(67108864);
            fxVar.a(PendingIntent.getActivity(H, 0, a, 268435456));
            NotificationManager notificationManager = (NotificationManager) H.getSystemService("notification");
            String valueOf = String.valueOf(stringBuilder.toString());
            notificationManager.notify(new StringBuilder((String.valueOf(str).length() + 17) + String.valueOf(valueOf).length()).append("failed_to_delete:").append(str).append(valueOf).toString(), 11, fxVar.b());
        }
    }

    public static void a(bko bko, fdo fdo) {
        giu b;
        if (fdo != null) {
            b = fdo.b();
        } else {
            b = null;
        }
        if (b == null) {
            return;
        }
        if ((p == null || b.a == null || !p.a(bko, b)) && ((dfm) jyn.a(gwb.H(), dfm.class)).a(true, false)) {
            iiq.a(new fhn(bko));
        }
    }

    public static void a(int i, bko bko, fiu fiu) {
        if (i <= 0) {
            glk.c("Babel_RTCS", "skipping notifyResponseReceived for non-positive requestId", new Object[0]);
        } else {
            i.post(new fho(fiu, i, bko));
        }
    }

    public static void a(String str, List<edo> list) {
        i.post(new fhu(str, list));
    }

    public static void a(fqj fqj) {
        i.post(new fhw(fqj));
    }

    public static void f(bko bko, String str, String str2) {
        new StringBuilder((String.valueOf(str).length() + 40) + String.valueOf(str2).length()).append("notifyConvIdChanged : old ").append(str).append(", new convId: ").append(str2);
        Throwable th = new Throwable();
        synchronized (c) {
            if (d(bko, str)) {
                d = bko.a();
                if (e.remove(str)) {
                    e.add(str2);
                }
            }
        }
        ((flo) jyn.a(gwb.H(), flo.class)).a(str, str2);
    }

    public static void a(boolean z, List<fiu> list, bko bko) {
        if (list != null) {
            String valueOf = String.valueOf(list);
            new StringBuilder(String.valueOf(valueOf).length() + 34).append("Server response broadcast results ").append(valueOf);
            Throwable th = new Throwable();
            for (fiu fiu : list) {
                int a = fiu.a();
                if (a == -1) {
                    glk.a("Babel_RTCS", "Server response skipping listeners for non-positive request id", new Object[0]);
                } else if (z) {
                    r4 = g.iterator();
                    while (r4.hasNext()) {
                        fim fim = (fim) r4.next();
                        r5 = String.valueOf(fim);
                        new StringBuilder(String.valueOf(r5).length() + 38).append("Server response broadcast bg listener ").append(r5);
                        fim.a(a, bko, fiu);
                    }
                } else {
                    r4 = f.iterator();
                    while (r4.hasNext()) {
                        fip fip = (fip) r4.next();
                        r5 = String.valueOf(fip);
                        new StringBuilder(String.valueOf(r5).length() + 35).append("Server response broadcast listener ").append(r5);
                        fip.a(a, bko, fiu);
                    }
                }
            }
        }
    }

    public static void a(Intent intent, fiu fiu, Object obj, boolean z) {
        int intExtra = intent.getIntExtra("op", -1);
        int intExtra2 = intent.getIntExtra("rid", -1);
        int intExtra3 = intent.getIntExtra("account_id", -1);
        bko e = fde.e(intExtra3);
        if (e == null) {
            glk.d("Babel_RTCS", "[onIntentProcessed] Skipping intent for invalid account: " + intExtra3, new Object[0]);
            return;
        }
        if (a) {
            String valueOf = String.valueOf(e(intExtra));
            new StringBuilder(String.valueOf(valueOf).length() + 71).append("[onIntentProcessed] opCode=").append(valueOf).append(", requestId=").append(intExtra2).append(", account=").append(intExtra3);
        }
        Iterator it;
        int a;
        Iterator it2;
        if (!z) {
            switch (intExtra) {
                case 30:
                    fek fek = (fek) obj;
                    it = f.iterator();
                    while (it.hasNext()) {
                        ((fip) it.next()).a(intExtra2, e, fek, fiu);
                    }
                case 39:
                    if (obj != null) {
                        for (fiu fiu2 : (List) obj) {
                            a = fiu2.a();
                            if (a <= 0) {
                                glk.c("Babel_RTCS", "Skipping onResponseReceived for non-positive request id", new Object[0]);
                            }
                            it2 = f.iterator();
                            while (it2.hasNext()) {
                                ((fip) it2.next()).a(a, e, fiu2);
                            }
                        }
                    }
                case 185:
                    fek fek2 = (fek) obj;
                    String stringExtra = intent.getStringExtra("original_conversation_id");
                    Iterator it3 = f.iterator();
                    while (it3.hasNext()) {
                        ((fip) it3.next()).a(intExtra2, e, fek2, fiu, stringExtra);
                    }
                default:
            }
        } else if (intExtra == 39 && obj != null) {
            for (fiu fiu22 : (List) obj) {
                a = fiu22.a();
                if (a <= 0) {
                    glk.c("Babel_RTCS", "Skipping bg onResponseReceived for non-positive request id", new Object[0]);
                }
                it2 = g.iterator();
                while (it2.hasNext()) {
                    ((fim) it2.next()).a(a, e, fiu22);
                }
            }
        }
    }

    public static String e(int i) {
        switch (i) {
            case wi.dD /*13*/:
                return "OP_REGISTER_ACCOUNT";
            case wi.g /*14*/:
                return "OP_UNREGISTER_ACCOUNT";
            case wi.dI /*16*/:
                return "OP_ACCOUNT_REMOVED";
            case wi.dL /*19*/:
                return "OP_SET_SELF_INFO_BIT";
            case 30:
                return "OP_START_CONVERSATION";
            case 31:
                return "OP_SEND_SMS";
            case 32:
                return "OP_INVITE_PARTICIPANTS";
            case 33:
                return "OP_LEAVE_CONVERSATION";
            case 35:
                return "OP_UPDATE_CONVERSATION_WATERMARK";
            case 36:
                return "OP_REMOVE_MESSAGE";
            case 37:
                return "OP_SET_CONVERSATION_NAME";
            case 38:
                return "OP_SET_CONVERSATION_NOTIFICATION_LEVEL";
            case 39:
                return "OP_RECEIVE_RESPONSE";
            case 41:
                return "OP_REPLY_TO_INVITATION";
            case 42:
                return "OP_REQUEST_MORE_EVENTS";
            case 44:
                return "OP_RETRY_SEND_SMS";
            case 47:
                return "OP_SET_MESSAGE_FAILED";
            case 52:
                return "OP_REQUEST_SUGGESTED_CONTACTS";
            case 54:
                return "OP_REQUEST_MORE_CONVERSATIONS";
            case 55:
                return "OP_REQUEST_WARM_SYNC";
            case 58:
                return "OP_REQUEST_SEARCH_CONTACTS";
            case 59:
                return "OP_REQUEST_GET_CONTACT_BY_ID";
            case 60:
                return "OP_SET_ACTIVE_CLIENT";
            case 65:
                return "OP_REQUEST_CONVERSATION_META_DATA";
            case 68:
                return "OP_HANGOUT_CALL_INVITE_ACK";
            case 69:
                return "OP_GET_PROFILE";
            case 72:
                return "OP_ARCHIVE_CONVERSATIONS";
            case 73:
                return "OP_REQUEST_HANGOUT_INFO";
            case 74:
                return "OP_LOCALE_CHANGED";
            case 76:
                return "OP_EXPIRE_LAST_MESSAGE";
            case 78:
                return "OP_REPORT_CALL_PERF_STATS";
            case wi.ai /*79*/:
                return "OP_REQUEST_HANGOUT_PARTICIPANTS";
            case 80:
                return "OP_DELETE_MESSAGE";
            case 81:
                return "OP_UPDATE_CONVERSATION_SCROLL_TIME";
            case 82:
                return "OP_UPDATE_MESSAGE_SCROLL_TIME";
            case 83:
                return "OP_RETRY_CREATE_CONVERSATION";
            case 84:
                return "OP_SET_CONVERSATION_CREATE_FAILED";
            case 85:
                return "OP_START_PHONE_VERIFICATION";
            case 86:
                return "OP_FINISH_PHONE_VERIFICATION";
            case 89:
                return "OP_GET_CHAT_ACL_SETTINGS";
            case 90:
                return "OP_SET_CHAT_ACL_SETTING";
            case 91:
                return "OP_DELETE_CONVERSATION";
            case 92:
                return "OP_SET_USER_BLOCK";
            case 96:
                return "OP_LOAD_BLOCKED_PEOPLE";
            case 98:
                return "OP_REFRESH_PARTICIPANTS_INFO";
            case 99:
                return "OP_SEND_OFFNETWORK_INVITATION";
            case 100:
                return "OP_HANDLE_PACKAGE_REPLACED";
            case 101:
                return "OP_REVERT_CONVERSATION_NAME";
            case 103:
                return "OP_SET_CONVERSATION_INVITE_FAILURE";
            case 104:
                return "OP_UNREGISTER_REMOVED_ACCOUNTS";
            case 111:
                return "OP_SEND_PENDING_CONVERSATION_OPERATIONS";
            case 112:
                return "OP_RECEIVE_MMS_MESSAGE";
            case 113:
                return "OP_COMPLETE_CANCEL_SEND_MESSAGE";
            case 114:
                return "OP_PATCH_AFTER_REQUEST_WRITER_UPGRADE";
            case 116:
                return "OP_RETRIEVE_MMS_MESSAGE";
            case 117:
                return "OP_RESTART_PURGED_CONVERSATION";
            case 120:
                return "OP_DISMISS_SUGGESTED_CONTACT";
            case 121:
                return "OP_SET_RICH_PRESENCE_ENABLED_STATE";
            case 124:
                return "OP_INSERT_PARTICIPANT_ENTITY";
            case 128:
                return "OP_RECEIVE_SMS_DELIVERY_REPORT";
            case 131:
                return "OP_HANDLE_STORAGE_LOW_SMS";
            case 132:
                return "OP_HANDLE_STORAGE_OK_SMS";
            case 133:
                return "OP_FREE_SMS_STORAGE";
            case 136:
                return "OP_REMOVE_CONVERSATION_IF_EMPTY";
            case 140:
                return "OP_REVIVE_MMS_NOTIFICATION";
            case 142:
                return "OP_CREATE_HANGOUT_ID";
            case 143:
                return "OP_LEAVE_CONTINGENCY_FAILED";
            case 144:
                return "OP_DELETE_CONVERSATION_FAILED";
            case 145:
                return "OP_UPLOAD_VIDEO_CALL_LOGS";
            case 146:
                return "OP_RECEIVE_SMSMMS_FROM_DUMP_FILE";
            case 147:
                return "OP_SEND_EASTER_EGG";
            case 148:
                return "OP_GET_VOICE_ACCOUNT_INFO";
            case 150:
                return "OP_ENABLE_VOICE_CALLING";
            case 151:
                return "OP_GET_CALL_RATE";
            case 153:
                return "OP_ADD_RECENT_PSTN_CALL";
            case 157:
                return "OP_GET_PHONE_LIST";
            case 160:
                return "OP_CLEAR_CONTINUATION_TOKEN";
            case 163:
                return "OP_WARN_NO_SIM_FOR_SMS";
            case 167:
                return "OP_REFRESH_SMS_PARTICIPANTS";
            case 169:
                return "OP_TEST_WATCHDOG";
            case 171:
                return "OP_UNMERGE_CONVERSATIONS";
            case 172:
                return "OP_REQUEST_FIFE_URLS";
            case 173:
                return "OP_MERGE_ALL_CONVERSATIONS";
            case 174:
                return "OP_UNMERGE_ALL_CONVERSATIONS";
            case 175:
                return "OP_UNDISMISS_SUGGESTED_CONTACT";
            case 176:
                return "OP_SAVE_SMS_AND_NOTIFY_IF_UNREAD";
            case 179:
                return "OP_GET_AUDIO_DATA";
            case 180:
                return "OP_UPDATE_CONVERSATION_CALL_MEDIA_TYPE";
            case 185:
                return "OP_FORK_CONVERSATION";
            case 186:
                return "OP_TICKLE_GCM";
            case 189:
                return "OP_GET_USER_PHOTO_ALBUMS";
            case 193:
                return "OP_CACHE_PRESENCE";
            case 196:
                return "OP_FETCH_PROXY_NUMBER";
            case 199:
                return "OP_UPDATE_FAVORITE_CONTACT";
            case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                return "OP_GET_FAVORITES";
            case 203:
                return "OP_DECLINE_ALL_INVITES";
            case HttpStatusCodes.STATUS_CODE_NO_CONTENT /*204*/:
                return "OP_SET_CHAT_ACLS_HAPPY_STATE";
            default:
                String valueOf = String.valueOf(Integer.toString(i));
                return new StringBuilder(String.valueOf(valueOf).length() + 17).append("(unknown opcode ").append(valueOf).append(")").toString();
        }
    }

    public static void a(int i, String str, byte[] bArr, long j, boolean z) {
        Intent c = c(i, 116);
        c.putExtra("mms_content_location", str);
        c.putExtra("mms_transaction_id", bArr);
        c.putExtra("notification_row_id", j);
        c.putExtra("mms_auto_retrieve", z);
        f(c);
    }

    public static void a(Uri uri, long j, long j2, boolean z) {
        if (fde.i()) {
            Intent c = c(fde.k().g(), 112);
            c.putExtra("uri", uri);
            c.putExtra("thread_id", -1);
            c.putExtra("notification_row_id", j2);
            c.putExtra("mms_auto_retrieve", z);
            f(c);
        }
    }

    public static void a(int i, long j, boolean z, int i2) {
        Intent c = c(i, 140);
        c.putExtra("notification_row_id", j);
        c.putExtra("mms_auto_retrieve", z);
        c.putExtra("error", i2);
        f(c);
    }

    public static void a(blo blo, String str, long j) {
        Intent c = c(blo.g().g(), 111);
        c.putExtra("conversation_id", str);
        c.putExtra("extra_pending_conversation_operations", j);
        f(c);
    }

    public static void d(Intent intent) {
        bko k = fde.k();
        if (k != null) {
            intent.setClass(gwb.H(), RealTimeChatService.class);
            intent.putExtra("op", 128);
            intent.putExtra("account_id", k.g());
            f(intent);
        }
    }

    public static String e(Intent intent) {
        int intExtra = intent.getIntExtra("op", -1);
        switch (intExtra) {
            case 39:
                String stringExtra = intent.getStringExtra("server_response_type");
                String str = "ServerResponse: ";
                stringExtra = String.valueOf(stringExtra.substring(stringExtra.lastIndexOf(46) + 1));
                return stringExtra.length() != 0 ? str.concat(stringExtra) : new String(str);
            default:
                return e(intExtra);
        }
    }

    public static void f() {
        bko k = fde.k();
        if (k != null) {
            f(c(k.g(), 131));
        }
    }

    public static void g() {
        bko k = fde.k();
        if (k != null) {
            f(c(k.g(), 132));
        }
    }

    public static void c(int i, long j) {
        bko k = fde.k();
        if (k != null) {
            Intent c = c(k.g(), 133);
            c.putExtra("free_sms_storage_action_index", i);
            c.putExtra("free_sms_storage_duration", j);
            f(c);
        }
    }

    public static void c(String str) {
        bko k = fde.k();
        if (k != null) {
            Intent c = c(k.g(), 146);
            c.putExtra("mms_dump_file", str);
            f(c);
        }
    }

    public static void c(bko bko) {
        f(c(bko.g(), 163));
    }

    public static void b(bko bko, long j) {
        Intent c = c(bko.g(), 169);
        c.putExtra("extra_duration", j);
        f(c);
    }

    public static void a(String str, String str2) {
        i.post(new fia(str, str2));
    }

    public static void a(int i, evz evz) {
        if (fdq.J.b(i)) {
            h().a(new feh(evz, i));
            return;
        }
        Intent c = c(i, 39);
        long j = -1;
        byte[] f = evz.f();
        int length = f.length;
        if (((long) length) > gwb.a(gwb.H(), "babel_maximum_request_writer_intent_extra_size", 0)) {
            j = gwb.a(gwb.H(), evz);
            c.putExtra("server_response_id", j);
        } else {
            c.putExtra("server_response", f);
        }
        c.putExtra("server_response_type", evz.getClass().getName());
        c.putExtra("rid", evz.b());
        if (a) {
            String valueOf = String.valueOf(evz);
            new StringBuilder(String.valueOf(valueOf).length() + 104).append("handleServerResponse: ").append(valueOf).append(" size(").append(length).append(") stored response id: ").append(j).append(" accountId: ").append(i);
        }
        b(c);
    }

    public static void a(int i, boolean z, fjl fjl, long j, flt flt) {
        if (fdq.K.b(i)) {
            h().a(new fji(i).a(z).a(flt).b(false).a(), 0);
            return;
        }
        fjj c = fjj.c(i);
        if (c.g()) {
            long a;
            boolean z2 = false;
            if (z) {
                z2 = c.h();
            }
            Intent intent = new Intent("com.google.android.apps.hangouts.SYNC");
            intent.putExtra("op", 55);
            intent.putExtra("account_id", i);
            String str = "no_missed_events_expected";
            z2 = z && !z2;
            intent.putExtra(str, z2);
            intent.putExtra("suppress_notifications", false);
            intent.putExtra("expected_hash", j);
            PendingIntent broadcast = PendingIntent.getBroadcast(gwb.H(), gks.a(i, 1, 109, null), intent, 134217728);
            long b = glj.b();
            synchronized (k) {
                a = gwb.a((Long) k.get(i));
            }
            if (b >= a + 1000) {
                a = c.a(fjl);
                b = a - b;
                AlarmManager alarmManager = (AlarmManager) gwb.H().getSystemService("alarm");
                if (b <= 5000) {
                    ScheduledFuture scheduledFuture = (ScheduledFuture) x.get(i);
                    if (!(scheduledFuture == null || scheduledFuture.isDone() || scheduledFuture.isCancelled())) {
                        a = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                        if (0 < b && b < a) {
                            scheduledFuture.cancel(false);
                        } else {
                            return;
                        }
                    }
                    x.put(i, w.schedule(new fib(broadcast, i), b, TimeUnit.MILLISECONDS));
                    alarmManager.cancel(broadcast);
                    return;
                }
                alarmManager.set(2, a, broadcast);
                synchronized (k) {
                    k.put(i, Long.valueOf(a));
                }
            }
        }
    }
}
