package p000;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

final class dlp implements dpn {
    final /* synthetic */ dlo f10084a;

    dlp(dlo dlo) {
        this.f10084a = dlo;
    }

    public boolean mo1597a(Context context, int i) {
        int i2;
        dlo dlo = this.f10084a;
        bko e = fde.m15018e(i);
        if (e == null) {
            glk.m17981d("Babel_Call_logs", "Account null.", new Object[0]);
        }
        if (e == null || !gwb.m2155d(e)) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (i2 != 0) {
            dlo = this.f10084a;
            ful ful = (ful) jyn.m25426a(context, ful.class);
            long currentTimeMillis = System.currentTimeMillis();
            long e2 = ful.m16269e(i);
            int i3 = (e2 == -1 || e2 >= currentTimeMillis || currentTimeMillis >= e2 + gwb.m1519a(context, "babel_include_last_call_in_feedback_timeout_ms", fls.f13443t)) ? 0 : 1;
            if (i3 == 0 || TextUtils.isEmpty(ful.m16267c(i)) || TextUtils.isEmpty(ful.m16268d(i))) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            if (i2 != 0) {
                return true;
            }
        }
        return false;
    }

    public dpm[] mo1598b(Context context, int i) {
        int i2 = 1;
        gwb.aK();
        dlo dlo = this.f10084a;
        bko e = fde.m15018e(i);
        if (e == null) {
            glk.m17981d("Babel_Call_logs", "Account null.", new Object[0]);
        }
        if (e == null || !gwb.m2155d(e)) {
            i2 = 0;
        }
        if (i2 == 0) {
            glk.m17981d("Babel_Call_logs", "Diagnostics are not enabled.", new Object[0]);
            return new dpm[0];
        }
        iid a = ((iih) jyn.m25426a(context, iih.class)).mo1979a(i);
        File file = new File(((ful) jyn.m25426a(context, ful.class)).m16268d(i));
        if (file.exists()) {
            if (file.length() < 1048576) {
                i2 = (int) file.length();
            } else {
                i2 = 1048576;
            }
            byte[] bArr = new byte[i2];
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                if (fileInputStream.read(bArr, 0, i2) != i2) {
                    glk.m17981d("Babel_Call_logs", String.format("Read len (%d) != file len (%d).", new Object[]{Integer.valueOf(fileInputStream.read(bArr, 0, i2)), Integer.valueOf(i2)}), new Object[0]);
                }
                fileInputStream.close();
                a.mo1693b().mo1714c(2839);
                return new dpm[]{new dpm("call_log.txt", "text/plain", bArr)};
            } catch (FileNotFoundException e2) {
                glk.m17981d("Babel_Call_logs", "Log file not found when reading.", new Object[0]);
                a.mo1693b().mo1714c(2840);
                return new dpm[0];
            } catch (IOException e3) {
                glk.m17981d("Babel_Call_logs", "IOException when reading log file.", new Object[0]);
                a.mo1693b().mo1714c(2840);
                return new dpm[0];
            }
        }
        glk.m17981d("Babel_Call_logs", "Log file not found.", new Object[0]);
        a.mo1693b().mo1714c(2840);
        return new dpm[0];
    }
}
