import android.content.Context;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpStatusCodes;

public abstract class esw extends eul {
    public static final boolean a;
    public static final gma b;
    private static final long serialVersionUID = 1;

    static {
        kae kae = glk.l;
        a = a;
        b = faz.a;
    }

    public evz b(Context context, eaf eaf) {
        String str;
        String valueOf;
        if (a) {
            str = "[SEND] ";
            valueOf = String.valueOf(eaf.toString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        str = "END ";
        valueOf = String.valueOf(getClass().getSimpleName());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        gma gma = b;
        valueOf = String.valueOf(getClass().getSimpleName());
        gma.c(new StringBuilder(String.valueOf(valueOf).length() + 12).append(valueOf).append("_").append(L_()).toString());
        int b = eaf.b();
        if (((fzw) jyn.a(context, fzw.class)).a(b)) {
            glk.e("BabelClient", "[SEND] skipping for sms only account: " + b, new Object[0]);
            throw new fdo(138, "Cannot send request for SMS only account");
        }
        dzh a = dzg.a(eul.g);
        boolean l = l();
        int i = 0;
        while (i < 2) {
            if (l) {
                try {
                    faz.a();
                    faz.a(a, b);
                } catch (fdo e) {
                    if (b(context, i, e)) {
                        if (a(e)) {
                            l = true;
                        }
                        i++;
                    } else {
                        throw e;
                    }
                }
            }
            return a(context, b, a(context, i) ? null : a, eaf.d());
        }
        return null;
    }

    private evz a(Context context, int i, dzh dzh, int i2) {
        String str;
        String str2 = "END ";
        String valueOf = String.valueOf(getClass().getSimpleName());
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        gma gma = b;
        valueOf = String.valueOf(getClass().getSimpleName());
        gma.c(new StringBuilder(String.valueOf(valueOf).length() + 12).append(valueOf).append("_").append(L_()).toString());
        if (glk.a("BabelClient", 3)) {
            valueOf = String.valueOf(getClass().getSimpleName());
            glk.b("BabelClient", new StringBuilder(String.valueOf(valueOf).length() + 41).append("sendRequestProto ").append(valueOf).append(" for account ").append(i).toString(), new Object[0]);
        }
        GenericUrl b = b(context);
        m();
        b.put("alt", (Object) "proto");
        if (a) {
            str2 = "sendRequestProto to ";
            String valueOf2 = String.valueOf(b.toString());
            if (valueOf2.length() != 0) {
                str2.concat(valueOf2);
            } else {
                valueOf2 = new String(str2);
            }
        }
        try {
            faz a = faz.a();
            if (dzh == null) {
                glk.c("BabelClient", "no auth data.", new Object[0]);
            }
            evz a2 = a.a(b, this, i, dzh, k(), i2);
            if (a2 != null) {
                int i3 = a2.c.b;
                long j = a2.e;
                String valueOf3;
                if (i3 != 1) {
                    str = "Babel";
                    valueOf3 = String.valueOf(this);
                    String str3 = a2.c.a;
                    if (a2.c != null) {
                        str2 = a2.c.c;
                    } else {
                        str2 = "(null)";
                    }
                    glk.e(str, new StringBuilder(((String.valueOf(valueOf3).length() + 67) + String.valueOf(str3).length()) + String.valueOf(str2).length()).append("ServerRequest sent ").append(valueOf3).append(" got responseStatus ").append(i3).append(" desc ").append(str3).append(" debug_url ").append(str2).toString(), new Object[0]);
                } else if (a) {
                    str = String.valueOf(this);
                    valueOf3 = a2.c.a;
                    if (a2.c != null) {
                        str2 = a2.c.c;
                    } else {
                        str2 = "(null)";
                    }
                    new StringBuilder(((String.valueOf(str).length() + 67) + String.valueOf(valueOf3).length()) + String.valueOf(str2).length()).append("ServerRequest sent ").append(str).append(" got responseStatus ").append(i3).append(" desc ").append(valueOf3).append(" debug_url ").append(str2);
                }
                switch (i3) {
                    case wi.j /*1*/:
                    case wi.s /*6*/:
                    case wi.n /*9*/:
                        return a2;
                    case wi.l /*2*/:
                        throw new fdo(107, j, "Response error: ERROR_BUSY");
                    case wi.z /*3*/:
                        throw new fdo(108, j, "Response error: ERROR_UNEXPECTED");
                    case wi.h /*4*/:
                        throw new fdo(111, j, "Response error: ERROR_INVALID_REQUEST");
                    case wi.p /*5*/:
                        throw new fdo(109, j, "Response error: ERROR_RETRY_LIMIT");
                    case wi.q /*7*/:
                        throw new fdo(112, j, "Response error: ERROR_QUOTA_EXCEEDED");
                    case wi.m /*8*/:
                        throw new fdo(113, j, "Response error: ERROR_RESPONSE_NOT_FOUND");
                    default:
                        str = "BabelClient";
                        if (a2.c != null) {
                            str2 = a2.c.c;
                        } else {
                            str2 = "(null)";
                        }
                        glk.e(str, new StringBuilder(String.valueOf(str2).length() + 71).append("got unknown ResponseStatus in response header ").append(i3).append("; debugUrl is ").append(str2).toString(), new Object[0]);
                        throw new fdo(108, j, "Resonse error: ERROR_UNEXPECTED");
                }
            }
            if (glk.a("BabelClient", 3)) {
                glk.b("Babel", "received null response", new Object[0]);
            }
            return null;
        } catch (Exception e) {
            valueOf = String.valueOf(b);
            str = String.valueOf(e.getMessage());
            glk.d("BabelClient", new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(str).length()).append("Error making http request: url ").append(valueOf).append(" ").append(str).toString(), new Object[0]);
            if (e.getStatusCode() < 400 || e.getStatusCode() >= HttpStatusCodes.STATUS_CODE_SERVER_ERROR) {
                throw new fdo(105, e);
            }
            throw new fdo(104, e);
        } catch (Exception e2) {
            valueOf = String.valueOf(b);
            glk.d("BabelClient", new StringBuilder(String.valueOf(valueOf).length() + 50).append("EOFException making http request (retryable): url ").append(valueOf).toString(), new Object[0]);
            throw new fdo(103, e2);
        } catch (fdo e3) {
            throw e3;
        } catch (Exception e22) {
            valueOf = String.valueOf(b);
            glk.c("BabelClient", new StringBuilder(String.valueOf(valueOf).length() + 31).append("Error making http request: url ").append(valueOf).toString(), (Throwable) e22);
            throw new fdo(102, e22);
        }
    }

    public boolean a(Context context, int i) {
        return a;
    }

    public int h() {
        return 0;
    }

    public int i() {
        return 3;
    }
}
