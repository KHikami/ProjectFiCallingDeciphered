package defpackage;

import org.apache.http.params.AbstractHttpParams;
import org.apache.http.params.HttpParams;

final class haz extends AbstractHttpParams {
    final /* synthetic */ hay a;

    haz(hay hay) {
        this.a = hay;
    }

    public HttpParams copy() {
        throw new UnsupportedOperationException();
    }

    public Object getParameter(String str) {
        return null;
    }

    public boolean removeParameter(String str) {
        String str2 = "Ignoring unsupported remove operation for: ";
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        return true;
    }

    public HttpParams setParameter(String str, Object obj) {
        if (!str.equals("http.conn-manager.timeout")) {
            Integer num;
            if (str.equals("http.socket.timeout")) {
                num = (Integer) obj;
                this.a.a.a = num.intValue();
            } else if (str.equals("http.connection.timeout")) {
                num = (Integer) obj;
                this.a.a.b = num.intValue();
            } else {
                String str2 = "Ignoring unsupported parameter: ";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
            }
        }
        return this;
    }
}
