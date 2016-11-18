package p000;

import android.content.Context;
import com.google.api.client.http.GenericUrl;

public abstract class esw extends eul {
    public static final boolean f12215a = false;
    public static final gma f12216b = faz.f12604a;
    private static final long serialVersionUID = 1;

    static {
        kae kae = glk.f15565l;
    }

    public evz mo1946b(Context context, eaf eaf) {
        String str;
        String valueOf;
        if (f12215a) {
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
        gma gma = f12216b;
        valueOf = String.valueOf(getClass().getSimpleName());
        gma.m18079c(new StringBuilder(String.valueOf(valueOf).length() + 12).append(valueOf).append("_").append(L_()).toString());
        int b = eaf.m13268b();
        if (((fzw) jyn.m25426a(context, fzw.class)).mo2146a(b)) {
            glk.m17982e("BabelClient", "[SEND] skipping for sms only account: " + b, new Object[0]);
            throw new fdo(138, "Cannot send request for SMS only account");
        }
        dzh a = dzg.m13144a(eul.f12200g);
        boolean l = mo2043l();
        int i = 0;
        while (i < 2) {
            if (l) {
                try {
                    faz.m14868a();
                    faz.m14870a(a, b);
                } catch (fdo e) {
                    if (mo1955b(context, i, e)) {
                        if (m14397a(e)) {
                            l = true;
                        }
                        i++;
                    } else {
                        throw e;
                    }
                }
            }
            return m14427a(context, b, mo1954a(context, i) ? null : a, eaf.m13270d());
        }
        return null;
    }

    private evz m14427a(Context context, int i, dzh dzh, int i2) {
        String str = "END ";
        String valueOf = String.valueOf(getClass().getSimpleName());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        gma gma = f12216b;
        valueOf = String.valueOf(getClass().getSimpleName());
        gma.m18079c(new StringBuilder(String.valueOf(valueOf).length() + 12).append(valueOf).append("_").append(L_()).toString());
        if (glk.m17973a("BabelClient", 3)) {
            valueOf = String.valueOf(getClass().getSimpleName());
            glk.m17976b("BabelClient", new StringBuilder(String.valueOf(valueOf).length() + 41).append("sendRequestProto ").append(valueOf).append(" for account ").append(i).toString(), new Object[0]);
        }
        GenericUrl b = mo1948b(context);
        m14414m();
        b.put("alt", (Object) "proto");
        if (f12215a) {
            str = "sendRequestProto to ";
            String valueOf2 = String.valueOf(b.toString());
            if (valueOf2.length() != 0) {
                str.concat(valueOf2);
            } else {
                valueOf2 = new String(str);
            }
        }
        String str2;
        try {
            faz a = faz.m14868a();
            if (dzh == null) {
                glk.m17979c("BabelClient", "no auth data.", new Object[0]);
            }
            evz a2 = a.m14875a(b, this, i, dzh, mo1950k(), i2);
            if (a2 != null) {
                int i3 = a2.f5801c.f12529b;
                long j = a2.f5803e;
                String valueOf3;
                if (i3 != 1) {
                    str2 = "Babel";
                    valueOf3 = String.valueOf(this);
                    String str3 = a2.f5801c.f12528a;
                    if (a2.f5801c != null) {
                        str = a2.f5801c.f12530c;
                    } else {
                        str = "(null)";
                    }
                    glk.m17982e(str2, new StringBuilder(((String.valueOf(valueOf3).length() + 67) + String.valueOf(str3).length()) + String.valueOf(str).length()).append("ServerRequest sent ").append(valueOf3).append(" got responseStatus ").append(i3).append(" desc ").append(str3).append(" debug_url ").append(str).toString(), new Object[0]);
                } else if (f12215a) {
                    str2 = String.valueOf(this);
                    valueOf3 = a2.f5801c.f12528a;
                    if (a2.f5801c != null) {
                        str = a2.f5801c.f12530c;
                    } else {
                        str = "(null)";
                    }
                    new StringBuilder(((String.valueOf(str2).length() + 67) + String.valueOf(valueOf3).length()) + String.valueOf(str).length()).append("ServerRequest sent ").append(str2).append(" got responseStatus ").append(i3).append(" desc ").append(valueOf3).append(" debug_url ").append(str);
                }
                switch (i3) {
                    case 1:
                    case 6:
                    case 9:
                        return a2;
                    case 2:
                        throw new fdo(107, j, "Response error: ERROR_BUSY");
                    case 3:
                        throw new fdo(108, j, "Response error: ERROR_UNEXPECTED");
                    case 4:
                        throw new fdo(111, j, "Response error: ERROR_INVALID_REQUEST");
                    case 5:
                        throw new fdo(109, j, "Response error: ERROR_RETRY_LIMIT");
                    case 7:
                        throw new fdo(112, j, "Response error: ERROR_QUOTA_EXCEEDED");
                    case 8:
                        throw new fdo(113, j, "Response error: ERROR_RESPONSE_NOT_FOUND");
                    default:
                        str2 = "BabelClient";
                        if (a2.f5801c != null) {
                            str = a2.f5801c.f12530c;
                        } else {
                            str = "(null)";
                        }
                        glk.m17982e(str2, new StringBuilder(String.valueOf(str).length() + 71).append("got unknown ResponseStatus in response header ").append(i3).append("; debugUrl is ").append(str).toString(), new Object[0]);
                        throw new fdo(108, j, "Resonse error: ERROR_UNEXPECTED");
                }
            }
            if (glk.m17973a("BabelClient", 3)) {
                glk.m17976b("Babel", "received null response", new Object[0]);
            }
            return null;
        } catch (Exception e) {
            valueOf = String.valueOf(b);
            str2 = String.valueOf(e.getMessage());
            glk.m17981d("BabelClient", new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(str2).length()).append("Error making http request: url ").append(valueOf).append(" ").append(str2).toString(), new Object[0]);
            if (e.getStatusCode() < 400 || e.getStatusCode() >= 500) {
                throw new fdo(105, e);
            }
            throw new fdo(104, e);
        } catch (Exception e2) {
            valueOf = String.valueOf(b);
            glk.m17981d("BabelClient", new StringBuilder(String.valueOf(valueOf).length() + 50).append("EOFException making http request (retryable): url ").append(valueOf).toString(), new Object[0]);
            throw new fdo(103, e2);
        } catch (fdo e3) {
            throw e3;
        } catch (Exception e22) {
            valueOf = String.valueOf(b);
            glk.m17978c("BabelClient", new StringBuilder(String.valueOf(valueOf).length() + 31).append("Error making http request: url ").append(valueOf).toString(), (Throwable) e22);
            throw new fdo(102, e22);
        }
    }

    public boolean mo1954a(Context context, int i) {
        return false;
    }

    public int m14430h() {
        return 0;
    }

    public int mo1957i() {
        return 3;
    }
}
