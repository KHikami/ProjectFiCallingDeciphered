package p000;

import android.content.Context;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpStatusCodes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;

public final class est extends eul {
    private static final boolean f12206a = false;
    private static final long serialVersionUID = 2;
    private final String f12207b;

    static {
        kae kae = glk.f15565l;
    }

    public est(String str) {
        this.f12207b = str;
    }

    public nzf mo1944a(String str, int i, int i2) {
        return null;
    }

    protected String mo1943a(Context context) {
        String valueOf = String.valueOf("https://clients2.google.com");
        String valueOf2 = String.valueOf(mo1947g());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public String mo1947g() {
        return "/cr/report";
    }

    public evz mo1946b(Context context, eaf eaf) {
        String str;
        String valueOf;
        Exception exception;
        if (f12206a) {
            str = "[SEND] ";
            valueOf = String.valueOf(eaf.toString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        GenericUrl b = mo1948b(context);
        m14414m();
        File file = new File(this.f12207b);
        String a;
        if (file.exists()) {
            HttpResponse execute;
            a = fde.m15018e(eaf.m13268b()).m5629a();
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            HttpUriRequest httpPost = new HttpPost(b.toURI());
            try {
                HttpEntity oti = new oti();
                oti.a("prod", new otl("Google_Hangouts_Android"));
                oti.a("ver", new otl(String.valueOf(this.i.mo2300c()).concat("-calls")));
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
                glk.m17981d(valueOf, str.length() != 0 ? a.concat(str) : new String(a), new Object[0]);
                throw new fdo(114, exception);
            } catch (Exception e22) {
                exception = e22;
                valueOf = "Babel";
                a = "Crash log upload failed due to IOException ";
                str = String.valueOf(exception.toString());
                glk.m17981d(valueOf, str.length() != 0 ? a.concat(str) : new String(a), new Object[0]);
                throw new fdo(102, exception);
            }
            if (execute == null || execute.getStatusLine().getStatusCode() != HttpStatusCodes.STATUS_CODE_OK) {
                glk.m17981d("Babel", "Crash log upload unsuccessful.", new Object[0]);
                throw new fdo(108);
            }
            glk.m17979c("Babel", "Crash log successfully uploaded.", new Object[0]);
            file.delete();
        } else {
            a = "Babel";
            String str2 = "Crash no such log file ";
            str = String.valueOf(file.getAbsolutePath());
            glk.m17979c(a, str.length() != 0 ? str2.concat(str) : new String(str2), new Object[0]);
        }
        return null;
    }

    public String K_() {
        return "background_queue";
    }

    public long mo1017b() {
        return TimeUnit.HOURS.toMillis(24);
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        File file = new File(this.f12207b);
        if (file.exists()) {
            file.delete();
        }
    }
}
