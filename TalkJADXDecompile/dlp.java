import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

final class dlp implements dpn {
    final /* synthetic */ dlo a;

    dlp(dlo dlo) {
        this.a = dlo;
    }

    public boolean a(Context context, int i) {
        int i2;
        dlo dlo = this.a;
        bko e = fde.e(i);
        if (e == null) {
            glk.d("Babel_Call_logs", "Account null.", new Object[0]);
        }
        if (e == null || !gwb.d(e)) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (i2 != 0) {
            dlo = this.a;
            ful ful = (ful) jyn.a(context, ful.class);
            long currentTimeMillis = System.currentTimeMillis();
            long e2 = ful.e(i);
            int i3 = (e2 == -1 || e2 >= currentTimeMillis || currentTimeMillis >= e2 + gwb.a(context, "babel_include_last_call_in_feedback_timeout_ms", fls.t)) ? 0 : 1;
            if (i3 == 0 || TextUtils.isEmpty(ful.c(i)) || TextUtils.isEmpty(ful.d(i))) {
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

    public dpm[] b(Context context, int i) {
        int i2 = 1;
        gwb.aK();
        dlo dlo = this.a;
        bko e = fde.e(i);
        if (e == null) {
            glk.d("Babel_Call_logs", "Account null.", new Object[0]);
        }
        if (e == null || !gwb.d(e)) {
            i2 = 0;
        }
        if (i2 == 0) {
            glk.d("Babel_Call_logs", "Diagnostics are not enabled.", new Object[0]);
            return new dpm[0];
        }
        iid a = ((iih) jyn.a(context, iih.class)).a(i);
        File file = new File(((ful) jyn.a(context, ful.class)).d(i));
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
                    glk.d("Babel_Call_logs", String.format("Read len (%d) != file len (%d).", new Object[]{Integer.valueOf(fileInputStream.read(bArr, 0, i2)), Integer.valueOf(i2)}), new Object[0]);
                }
                fileInputStream.close();
                a.b().c(2839);
                return new dpm[]{new dpm("call_log.txt", "text/plain", bArr)};
            } catch (FileNotFoundException e2) {
                glk.d("Babel_Call_logs", "Log file not found when reading.", new Object[0]);
                a.b().c(2840);
                return new dpm[0];
            } catch (IOException e3) {
                glk.d("Babel_Call_logs", "IOException when reading log file.", new Object[0]);
                a.b().c(2840);
                return new dpm[0];
            }
        }
        glk.d("Babel_Call_logs", "Log file not found.", new Object[0]);
        a.b().c(2840);
        return new dpm[0];
    }
}
