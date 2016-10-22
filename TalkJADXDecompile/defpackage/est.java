package defpackage;

import android.content.Context;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpStatusCodes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import oti;
import otk;
import otl;

/* renamed from: est */
public final class est extends eul {
    private static final boolean a;
    private static final long serialVersionUID = 2;
    private final String b;

    static {
        kae kae = glk.l;
        a = a;
    }

    public est(String str) {
        this.b = str;
    }

    public nzf a(String str, int i, int i2) {
        return null;
    }

    protected String a(Context context) {
        String valueOf = String.valueOf("https://clients2.google.com");
        String valueOf2 = String.valueOf(g());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public String g() {
        return "/cr/report";
    }

    public evz b(Context context, eaf eaf) {
        String str;
        String valueOf;
        Exception exception;
        if (a) {
            str = "[SEND] ";
            valueOf = String.valueOf(eaf.toString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        GenericUrl b = b(context);
        m();
        File file = new File(this.b);
        String a;
        if (file.exists()) {
            HttpResponse execute;
            a = fde.e(eaf.b()).a();
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            HttpUriRequest httpPost = new HttpPost(b.toURI());
            try {
                oti oti = new oti();
                oti.a("prod", new otl("Google_Hangouts_Android"));
                oti.a("ver", new otl(String.valueOf(this.i.c()).concat("-calls")));
                oti.a("email", new otl(a));
                oti.a("type", new otl("log"));
                oti.a("log", new otk(file));
                httpPost.setEntity(oti);
                execute = defaultHttpClient.execute(httpPost);
            } catch (FileNotFoundException e) {
                execute = null;
            } catch (Exception e2) {
                exception = e2;
                valueOf = "Babel";
                a = "Crash log upload failed due to ClientProtocolException ";
                str = String.valueOf(exception.toString());
                glk.d(valueOf, str.length() != 0 ? a.concat(str) : new String(a), new Object[0]);
                throw new fdo(114, exception);
            } catch (Exception e22) {
                exception = e22;
                valueOf = "Babel";
                a = "Crash log upload failed due to IOException ";
                str = String.valueOf(exception.toString());
                glk.d(valueOf, str.length() != 0 ? a.concat(str) : new String(a), new Object[0]);
                throw new fdo(102, exception);
            }
            if (execute == null || execute.getStatusLine().getStatusCode() != HttpStatusCodes.STATUS_CODE_OK) {
                glk.d("Babel", "Crash log upload unsuccessful.", new Object[0]);
                throw new fdo(108);
            }
            glk.c("Babel", "Crash log successfully uploaded.", new Object[0]);
            file.delete();
        } else {
            a = "Babel";
            String str2 = "Crash no such log file ";
            str = String.valueOf(file.getAbsolutePath());
            glk.c(a, str.length() != 0 ? str2.concat(str) : new String(str2), new Object[0]);
        }
        return null;
    }

    public String K_() {
        return "background_queue";
    }

    public long b() {
        return TimeUnit.HOURS.toMillis(24);
    }

    public void a(Context context, bko bko, fdo fdo) {
        File file = new File(this.b);
        if (file.exists()) {
            file.delete();
        }
    }
}
