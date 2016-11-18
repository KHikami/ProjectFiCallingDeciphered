package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

public final class fod extends Handler {
    private RequestWriter f13559a;

    public fod(RequestWriter requestWriter) {
        this.f13559a = requestWriter;
    }

    public void handleMessage(Message message) {
        try {
            if (message.arg1 == 1) {
                foe.m15782a(this.f13559a.mo1193e()).m15789a(this.f13559a);
                if (RequestWriter.f6781e) {
                    this.f13559a.m9128a("MSG_LOAD");
                }
            } else {
                Intent intent = (Intent) message.getData().getParcelable("intent");
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    int i = extras.getInt("account_id");
                    dzz a = RequestWriter.m9144a(extras, foe.m15782a(this.f13559a.mo1193e()), i);
                    String c;
                    if (a != null) {
                        if (((jcf) jyn.m25426a(this.f13559a.mo1193e(), jcf.class)).mo3467c(i)) {
                            long b;
                            if (extras.containsKey("server_request")) {
                                b = foe.m15782a(this.f13559a.mo1193e()).m15790b(a);
                                if (RequestWriter.f6781e) {
                                    new StringBuilder(56).append("Handling EXTRA_WRITABLE_REQUEST for ").append(b);
                                }
                            }
                            ead a2 = a.m13246a();
                            b = extras.getLong("timestamp");
                            if (a2 instanceof fjy) {
                                fok g = ((fjy) a2).m8007g();
                                if (g instanceof cpa) {
                                    cpa cpa = (cpa) g;
                                    c = cpa.m8180c();
                                    dvm a3 = ba.m4618c().m12794b(c).m12789a(cpa.m8181d());
                                    ba.m4548a(i, b, 10, a3.m12786a(202));
                                    ba.m4548a(i, glj.m17963b(), 10, a3.m12786a(203));
                                }
                            }
                            this.f13559a.mo1187a(a);
                        } else {
                            glk.m17981d("Babel_RequestWriter", this.f13559a.m9128a("Invalid account: " + i), new Object[0]);
                            if (RequestWriter.f6781e) {
                                glk.m17981d("Babel_RequestWriter", this.f13559a.m9128a("Looper release"), new Object[0]);
                            }
                            this.f13559a.m9134k();
                            return;
                        }
                    } else if (extras.containsKey("cancel_request")) {
                        String string = extras.getString("cancel_request");
                        if (RequestWriter.f6781e) {
                            c = "Handling EXTRA_CANCEL_STRING for ";
                            String valueOf = String.valueOf(string);
                            if (valueOf.length() != 0) {
                                c.concat(valueOf);
                            } else {
                                valueOf = new String(c);
                            }
                        }
                        this.f13559a.m9157b(string);
                    }
                } else {
                    this.f13559a.m9163m();
                    long longExtra = intent.getLongExtra("backoff_period", 500);
                    if (RequestWriter.f6781e) {
                        new StringBuilder(65).append("RequestWriter.handleMessage. resumeAllQueues ").append(longExtra);
                    }
                    this.f13559a.m9151a(longExtra);
                }
                if (RequestWriter.f6781e) {
                    this.f13559a.m9128a("MSG_INTENT");
                }
            }
            if (RequestWriter.f6781e) {
                glk.m17981d("Babel_RequestWriter", this.f13559a.m9128a("Looper release"), new Object[0]);
            }
            this.f13559a.m9134k();
        } catch (Throwable th) {
            if (RequestWriter.f6781e) {
                glk.m17981d("Babel_RequestWriter", this.f13559a.m9128a("Looper release"), new Object[0]);
            }
            this.f13559a.m9134k();
        }
    }
}
