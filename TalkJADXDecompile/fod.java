import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

public final class fod extends Handler {
    private RequestWriter a;

    public fod(RequestWriter requestWriter) {
        this.a = requestWriter;
    }

    public void handleMessage(Message message) {
        try {
            if (message.arg1 == 1) {
                foe.a(this.a.e()).a(this.a);
                if (RequestWriter.e) {
                    this.a.a("MSG_LOAD");
                }
            } else {
                Intent intent = (Intent) message.getData().getParcelable("intent");
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    int i = extras.getInt("account_id");
                    dzz a = RequestWriter.a(extras, foe.a(this.a.e()), i);
                    String c;
                    if (a != null) {
                        if (((jcf) jyn.a(this.a.e(), jcf.class)).c(i)) {
                            long b;
                            if (extras.containsKey("server_request")) {
                                b = foe.a(this.a.e()).b(a);
                                if (RequestWriter.e) {
                                    new StringBuilder(56).append("Handling EXTRA_WRITABLE_REQUEST for ").append(b);
                                }
                            }
                            ead a2 = a.a();
                            b = extras.getLong("timestamp");
                            if (a2 instanceof fjy) {
                                fok g = ((fjy) a2).g();
                                if (g instanceof cpa) {
                                    cpa cpa = (cpa) g;
                                    c = cpa.c();
                                    dvm a3 = ba.c().b(c).a(cpa.d());
                                    ba.a(i, b, 10, a3.a(202));
                                    ba.a(i, glj.b(), 10, a3.a(203));
                                }
                            }
                            this.a.a(a);
                        } else {
                            glk.d("Babel_RequestWriter", this.a.a("Invalid account: " + i), new Object[0]);
                            if (RequestWriter.e) {
                                glk.d("Babel_RequestWriter", this.a.a("Looper release"), new Object[0]);
                            }
                            this.a.k();
                            return;
                        }
                    } else if (extras.containsKey("cancel_request")) {
                        String string = extras.getString("cancel_request");
                        if (RequestWriter.e) {
                            c = "Handling EXTRA_CANCEL_STRING for ";
                            String valueOf = String.valueOf(string);
                            if (valueOf.length() != 0) {
                                c.concat(valueOf);
                            } else {
                                valueOf = new String(c);
                            }
                        }
                        this.a.b(string);
                    }
                } else {
                    this.a.m();
                    long longExtra = intent.getLongExtra("backoff_period", 500);
                    if (RequestWriter.e) {
                        new StringBuilder(65).append("RequestWriter.handleMessage. resumeAllQueues ").append(longExtra);
                    }
                    this.a.a(longExtra);
                }
                if (RequestWriter.e) {
                    this.a.a("MSG_INTENT");
                }
            }
            if (RequestWriter.e) {
                glk.d("Babel_RequestWriter", this.a.a("Looper release"), new Object[0]);
            }
            this.a.k();
        } catch (Throwable th) {
            if (RequestWriter.e) {
                glk.d("Babel_RequestWriter", this.a.a("Looper release"), new Object[0]);
            }
            this.a.k();
        }
    }
}
