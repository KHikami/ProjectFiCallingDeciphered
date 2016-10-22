package com.google.android.apps.hangouts.serverupdate;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Process;
import bko;
import fde;
import fmj;
import fmk;
import fou;
import fox;
import fpy;
import fqd;
import fqe;
import glj;
import glk;
import gwb;
import java.util.List;
import jyn;
import kae;
import mfa;
import wi;

public class ReceiveServerUpdateService extends fmj {
    private static final boolean a;
    private static final int b;
    private static final Object c;
    private static WakeLock d;
    private static boolean e;

    static {
        kae kae = glk.o;
        a = false;
        b = Process.myPid();
        c = new Object();
        gwb.a(new fpy());
    }

    public ReceiveServerUpdateService() {
        super("ReceiveServerUpdateService");
    }

    public void a(Intent intent, mfa<Intent> mfa_android_content_Intent) {
        if (intent == null) {
            glk.d("Babel_RecSvrUpdateSvc", "ReceiveServerUpdateService onHandleIntent called with null intent", new Object[0]);
            return;
        }
        boolean z = b == intent.getIntExtra("pid", -1);
        try {
            String valueOf;
            int intExtra = intent.getIntExtra("account_id", -1);
            bko e = fde.e(intExtra);
            int intExtra2 = intent.getIntExtra("op", 0);
            if (a) {
                String valueOf2 = String.valueOf(intent);
                valueOf = String.valueOf(a(intExtra2));
                new StringBuilder((String.valueOf(valueOf2).length() + 73) + String.valueOf(valueOf).length()).append("ReceiveServerUpdateService onHandleIntent ").append(valueOf2).append(" opCode: ").append(valueOf).append(" respectWakeLock ").append(z);
            }
            if (e != null) {
                switch (intExtra2) {
                    case wi.j /*1*/:
                        List<fqd> a = fqe.a(intent, intExtra, true);
                        if (a == null) {
                            glk.e("Babel_RecSvrUpdateSvc", "could not parse ServerUpdate", new Object[0]);
                            break;
                        }
                        for (fqd fqd : a) {
                            if (fqd instanceof fox) {
                                ((fox) fqd).a(1);
                            }
                            bko e2 = fde.e(intExtra);
                            if (glk.a("Babel_RecSvrUpdateSvc", 3)) {
                                String valueOf3;
                                Object obj = null;
                                if (fqd instanceof fou) {
                                    obj = ((fou) fqd).a;
                                }
                                String str = "Babel_RecSvrUpdateSvc";
                                String valueOf4 = String.valueOf(fqd.getClass().getSimpleName());
                                valueOf = String.valueOf(e2.b());
                                if (obj != null) {
                                    String str2 = "update convId ";
                                    valueOf3 = String.valueOf(obj);
                                    valueOf3 = valueOf3.length() != 0 ? str2.concat(valueOf3) : new String(str2);
                                } else {
                                    valueOf3 = "";
                                }
                                glk.a(str, new StringBuilder(((String.valueOf(valueOf4).length() + 32) + String.valueOf(valueOf).length()) + String.valueOf(valueOf3).length()).append("processServerUpdate: ").append(valueOf4).append(", account: ").append(valueOf).append(valueOf3).toString(), new Object[0]);
                            }
                            fqd.a(intExtra, mfa_android_content_Intent);
                        }
                        break;
                }
            }
            if (z) {
                d.release();
            }
        } catch (Throwable e3) {
            glk.d("Babel_RecSvrUpdateSvc", "AccountLoggedOutOrNotFoundException", e3);
            if (z) {
                d.release();
            }
        } catch (Throwable th) {
            if (z) {
                d.release();
            }
        }
    }

    public static void a() {
        e = gwb.a(gwb.H(), "babel_log_dump", false);
    }

    public static void a(String str, int i, long j, long j2, mfa<Intent> mfa_android_content_Intent) {
        Intent intent = new Intent(gwb.H(), ReceiveServerUpdateService.class);
        intent.putExtra("op", 1);
        intent.putExtra("account_id", i);
        fqe.a(intent, j, j2);
        fqe.a(intent, str);
        intent.putExtra("rqtms", glj.b());
        if (a || e) {
            intent.putExtra("rqtns", System.nanoTime());
        }
        Context H = gwb.H();
        synchronized (c) {
            if (d == null) {
                d = ((PowerManager) H.getSystemService("power")).newWakeLock(1, "hangouts_rsus");
            }
        }
        if (a) {
            String str2 = "acquiring wakelock for opcode ";
            String valueOf = String.valueOf(a(intent.getIntExtra("op", 0)));
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        d.acquire();
        intent.setClass(H, ReceiveServerUpdateService.class);
        intent.putExtra("pid", b);
        intent.putExtra("stack_trace", glk.a(new Throwable()));
        if (((fmk) jyn.a(H, fmk.class)).a(H, intent, mfa_android_content_Intent) == null) {
            String valueOf2 = String.valueOf(intent);
            glk.e("Babel_RecSvrUpdateSvc", new StringBuilder(String.valueOf(valueOf2).length() + 62).append("ReceiveServerUpdateService failed to start service for intent ").append(valueOf2).toString(), new Object[0]);
            d.release();
        }
    }

    private static String a(int i) {
        switch (i) {
            case wi.j /*1*/:
                return "OP_RECEIVE_SERVER_UPDATE";
            default:
                String valueOf = String.valueOf(Integer.toString(i));
                return new StringBuilder(String.valueOf(valueOf).length() + 17).append("(unknown opcode ").append(valueOf).append(")").toString();
        }
    }
}
