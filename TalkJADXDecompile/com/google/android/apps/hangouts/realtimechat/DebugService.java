package com.google.android.apps.hangouts.realtimechat;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import bor;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;
import fde;
import ffh;
import fik;
import fsi;
import glk;
import gwb;
import itz;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;
import jyn;
import kae;

public class DebugService extends Service {
    private static final boolean a;
    private static volatile boolean b;

    static {
        kae kae = glk.o;
        a = false;
    }

    public static void a(Context context) {
        boolean z = true;
        boolean a = gwb.a(context, "babel_log_dump", false);
        if (a) {
            new StringBuilder(65).append("refreshGservices currently enabled: ").append(b).append(" captureDebugLogs: ").append(a);
        }
        if (a && !b) {
            b = true;
        } else if (a || !b) {
            z = false;
        } else {
            b = false;
        }
        if (z) {
            Intent intent = new Intent(context, DebugService.class);
            intent.putExtra("enabled", b);
            context.startService(intent);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (a) {
            String valueOf = String.valueOf(intent);
            new StringBuilder(String.valueOf(valueOf).length() + 15).append("onStartCommand ").append(valueOf);
        }
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("enabled", false);
            if (a) {
                new StringBuilder(29).append("onStartCommand enabled: ").append(booleanExtra);
            }
            if (!booleanExtra) {
                stopSelf();
            }
        }
        return 2;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    protected void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Object obj = 1;
        Object obj2 = 1;
        Object obj3 = 1;
        Object obj4 = 1;
        Object obj5 = 1;
        Object obj6 = 1;
        if (strArr != null) {
            for (Object obj7 : strArr) {
                if ("-all".equals(obj7)) {
                    obj = 1;
                    obj2 = 1;
                    obj4 = 1;
                } else if ("-log".equals(obj7)) {
                    obj = 1;
                } else if ("-nolog".equals(obj7)) {
                    obj = null;
                } else if ("-watermarks".equals(obj7)) {
                    obj2 = 1;
                } else if ("-nowatermarks".equals(obj7)) {
                    obj2 = null;
                } else if ("-accounts".equals(obj7)) {
                    obj3 = 1;
                } else if ("-noaccounts".equals(obj7)) {
                    obj3 = null;
                } else if ("-nav".equals(obj7)) {
                    obj4 = 1;
                } else if ("-nonav".equals(obj7)) {
                    obj4 = null;
                } else if ("-rtcs".equals(obj7)) {
                    obj5 = 1;
                } else if ("-nortcs".equals(obj7)) {
                    obj5 = null;
                } else if ("-medialoader".equals(obj7)) {
                    obj6 = 1;
                } else if ("-nomedialoader".equals(obj7)) {
                    obj6 = null;
                }
            }
        }
        Object obj8 = obj6;
        obj6 = obj3;
        obj3 = obj4;
        obj4 = obj8;
        if (obj6 != null) {
            fde.a(printWriter);
            ffh a = ffh.a();
            if (a == null) {
                printWriter.println("GCM Registration not inited");
            } else {
                a.a(printWriter);
            }
        }
        if (obj2 != null) {
            printWriter.println("");
            printWriter.println("----WatermarkTracker-----");
            ((bor) jyn.a((Context) this, bor.class)).a();
        }
        if (obj != null) {
            printWriter.println("");
            printWriter.println("------------------------");
            printWriter.println("### Log History ###");
            itz itz = glk.z;
            if (itz != null) {
                itz.a(printWriter);
            }
        }
        if (obj3 != null) {
            printWriter.println("");
            printWriter.println("------------------------");
            printWriter.println("### Log Navigations ###");
            BabelHomeActivity.a(printWriter);
        }
        if (obj5 != null) {
            printWriter.println("");
            printWriter.println("------------------------");
            printWriter.println("### RTCS intents ###");
            synchronized (RealTimeChatService.j) {
                if (RealTimeChatService.h == null) {
                } else {
                    printWriter.println("enqueueTime          s-q   e-s   e-q opcode");
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.getDefault());
                    for (int i = 0; i < RealTimeChatService.h.a(); i++) {
                        fik fik = (fik) RealTimeChatService.h.a(i);
                        printWriter.println(String.format(Locale.getDefault(), "%s %5d %5d %5d %s", new Object[]{simpleDateFormat.format(Long.valueOf(fik.b)), Long.valueOf((fik.d - fik.c) / 1000000), Long.valueOf((fik.e - fik.d) / 1000000), Long.valueOf((fik.e - fik.c) / 1000000), RealTimeChatService.e(fik.a)}));
                    }
                }
            }
        }
        if (obj4 != null) {
            printWriter.println("");
            printWriter.println("------------------------");
            printWriter.println("### MediaLoader Requests ###");
            fsi.a(printWriter);
        }
    }
}
