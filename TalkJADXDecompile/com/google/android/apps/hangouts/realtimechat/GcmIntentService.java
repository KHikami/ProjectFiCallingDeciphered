package com.google.android.apps.hangouts.realtimechat;

import android.content.Intent;
import android.text.TextUtils;
import bcu;
import bhl;
import bko;
import com.google.android.apps.hangouts.serverupdate.ReceiveServerUpdateService;
import dgg;
import dip;
import edo;
import fde;
import fdq;
import fjl;
import flt;
import fmj;
import fnc;
import fpv;
import gjk;
import gjn;
import glj;
import glk;
import gwb;
import jyn;
import kae;
import mfa;

@Deprecated
public class GcmIntentService extends fmj {
    private static final boolean a;

    static {
        kae kae = glk.o;
        a = false;
    }

    public static String a(Intent intent) {
        return intent.getStringExtra("proto");
    }

    public GcmIntentService() {
        super("GcmIntentService");
    }

    public GcmIntentService(String str) {
        super(str);
    }

    public final void a(Intent intent, mfa<Intent> mfa_android_content_Intent) {
        if (intent == null) {
            try {
                glk.e("Babel_GcmIntentService", "GcmIntentService.handleMessage called with null intent", new Object[0]);
            } catch (Throwable th) {
                Throwable th2 = th;
                ((bcu) jyn.a(getApplicationContext(), bcu.class)).a();
            }
        } else if (intent.getAction().equals("com.google.android.c2dm.intent.RECEIVE")) {
            String valueOf;
            String valueOf2;
            if (a) {
                valueOf = String.valueOf(intent);
                valueOf2 = String.valueOf("com.google.android.c2dm.intent.RECEIVE");
                new StringBuilder((String.valueOf(valueOf).length() + 15) + String.valueOf(valueOf2).length()).append("handleMessage ").append(valueOf).append(" ").append(valueOf2);
            }
            long b = glj.b() * 1000;
            CharSequence stringExtra = intent.getStringExtra("message_type");
            if (!TextUtils.equals(stringExtra, "send_event")) {
                if (TextUtils.equals(stringExtra, "deleted_messages")) {
                    if (gjk.b) {
                        new gjn().a("gcm_dirty_ping").b();
                    }
                    glk.a("Babel_GcmIntentService", "got deleted_messages tickle from GCM", new Object[0]);
                    RealTimeChatService.a(flt.DIRTY_PING_SYNC);
                } else {
                    String valueOf3;
                    String stringExtra2 = intent.getStringExtra("type");
                    boolean equals = TextUtils.equals(stringExtra2, "hangout");
                    Object obj = (stringExtra2 == null || !stringExtra2.startsWith("call/")) ? null : 1;
                    Object obj2 = (stringExtra2 == null || TextUtils.equals(stringExtra2, "babel:proto")) ? 1 : null;
                    boolean equals2 = TextUtils.equals(stringExtra2, "babel:synctickle");
                    if (equals) {
                        valueOf2 = intent.getStringExtra("focus_account_id");
                    } else if (obj == null && obj2 == null && !equals2) {
                        valueOf2 = "Babel_GcmIntentService";
                        valueOf3 = String.valueOf("gcm push with unknown type = ");
                        valueOf = String.valueOf(stringExtra2);
                        if (valueOf.length() != 0) {
                            valueOf = valueOf3.concat(valueOf);
                        } else {
                            valueOf = new String(valueOf3);
                        }
                        glk.e(valueOf2, valueOf, new Object[0]);
                        gwb.a(null, 2139);
                        if (gjk.b) {
                            new gjn().a("gcm_error_unknown").b(stringExtra2).b();
                        }
                    } else {
                        valueOf2 = intent.getStringExtra("recipient");
                    }
                    if (TextUtils.isEmpty(valueOf2)) {
                        valueOf2 = "Babel_GcmIntentService";
                        valueOf3 = "gcm push received for empty recipient in type:";
                        valueOf = String.valueOf(stringExtra2);
                        glk.e(valueOf2, valueOf.length() != 0 ? valueOf3.concat(valueOf) : new String(valueOf3), new Object[0]);
                        gwb.a(null, 1837);
                        if (gjk.b) {
                            new gjn().a("gcm_error_missing_participant").b();
                        }
                    } else {
                        edo a = edo.a(valueOf2);
                        bko a2 = fde.a(a);
                        String str;
                        if (a2 == null) {
                            valueOf3 = "Babel_GcmIntentService";
                            str = "gcm push received for invalid account: ";
                            valueOf = String.valueOf(glk.b(valueOf2));
                            if (valueOf.length() != 0) {
                                valueOf = str.concat(valueOf);
                            } else {
                                valueOf = new String(str);
                            }
                            glk.e(valueOf3, valueOf, new Object[0]);
                            gwb.a(null, 1838);
                            if (gjk.b) {
                                new gjn().a("gcm_error_unknown_participant").a(a).b();
                            }
                            ((fnc) jyn.a(getApplicationContext(), fnc.class)).a(valueOf2);
                        } else if (fde.d(a2)) {
                            if (glk.a("Babel_GcmIntentService", 3)) {
                                valueOf2 = "Babel_GcmIntentService";
                                valueOf3 = "gcm push received for logged off account: ";
                                valueOf = String.valueOf(a2.a());
                                if (valueOf.length() != 0) {
                                    valueOf = valueOf3.concat(valueOf);
                                } else {
                                    valueOf = new String(valueOf3);
                                }
                                glk.b(valueOf2, valueOf, new Object[0]);
                            }
                            if (gjk.b) {
                                new gjn().a("gcm_error_logged_out_participant").a(a2).b();
                            }
                            fde.i(a2.g());
                        } else {
                            if (a) {
                                if (equals) {
                                    valueOf = "gcm hangout push received for account: ";
                                    valueOf2 = String.valueOf(a2.a());
                                    if (valueOf2.length() != 0) {
                                        valueOf.concat(valueOf2);
                                    } else {
                                        valueOf2 = new String(valueOf);
                                    }
                                } else if (obj2 != null) {
                                    valueOf = "gcm heavy tickle push received for account: ";
                                    valueOf2 = String.valueOf(a2.a());
                                    if (valueOf2.length() != 0) {
                                        valueOf.concat(valueOf2);
                                    } else {
                                        valueOf2 = new String(valueOf);
                                    }
                                } else if (equals2) {
                                    valueOf = "gcm sync tickle push received for account: ";
                                    valueOf2 = String.valueOf(a2.a());
                                    if (valueOf2.length() != 0) {
                                        valueOf.concat(valueOf2);
                                    } else {
                                        valueOf2 = new String(valueOf);
                                    }
                                }
                            }
                            if (gjk.b) {
                                gjn gjn = new gjn();
                                if (equals) {
                                    gjn.a("gcm_video_ring");
                                } else if (obj2 != null) {
                                    gjn.a("gcm_heavy");
                                } else if (equals2) {
                                    gjn.a("gcm_sync");
                                }
                                gjn.a(a2).b();
                            }
                            if (obj2 != null) {
                                str = intent.getStringExtra("proto");
                                long longExtra = intent.getLongExtra("timestamp", 0);
                                if (fdq.G.b(a2.g())) {
                                    ((bhl) jyn.a(getApplicationContext(), bhl.class)).a(new fpv(a2.g(), str, longExtra, b));
                                } else {
                                    ReceiveServerUpdateService.a(str, a2.g(), longExtra, b, mfa_android_content_Intent);
                                }
                            } else if (equals2) {
                                RealTimeChatService.a(a2.g(), false, fjl.NO_DELAY, flt.SYNC_TICKLE_SYNC);
                            } else if (equals) {
                                if (fde.d(a2)) {
                                    valueOf2 = "Babel_GcmIntentService";
                                    valueOf3 = "Hangout notification for account that is not setup yet: ";
                                    valueOf = String.valueOf(glk.b(a2.a()));
                                    glk.d(valueOf2, valueOf.length() != 0 ? valueOf3.concat(valueOf) : new String(valueOf3), new Object[0]);
                                } else {
                                    new dip(getApplicationContext(), intent.getStringExtra("focus_account_id"), intent.getStringExtra("id"), intent.getStringExtra("notification"), intent.getStringExtra("inviter_jid")).a(getApplicationContext());
                                }
                            } else if (obj != null) {
                                dgg.a().a(intent);
                            }
                        }
                    }
                }
            }
        }
        if (gjk.b) {
            gjk.c();
        }
    }
}
