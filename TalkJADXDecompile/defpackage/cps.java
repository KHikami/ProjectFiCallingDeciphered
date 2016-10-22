package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import java.util.List;

/* renamed from: cps */
public final class cps {
    private static final lo<Integer, String> a;
    private static final lo<Integer, String> b;

    static {
        lo loVar = new lo();
        a = loVar;
        loVar.put(Integer.valueOf(1), "MESSAGE_RECEIVED_FAN_OUT");
        a.put(Integer.valueOf(3), "MESSAGE_RECEIVED_COLD_SYNC");
        a.put(Integer.valueOf(2), "MESSAGE_RECEIVED_WARM_SYNC");
        a.put(Integer.valueOf(4), "MESSAGE_RECEIVED_USER_SCROLL_BACK");
        a.put(Integer.valueOf(5), "MESSAGE_RECEIVED_CONVERSATION_REQUEST");
        loVar = new lo();
        b = loVar;
        loVar.put(Integer.valueOf(0), "UNKNOWN_OBSERVED_STATUS");
        b.put(Integer.valueOf(1), "OBSERVED");
        b.put(Integer.valueOf(2), "UNOBSERVED");
    }

    public static void a(cpw cpw) {
        View textView = new TextView(cpw.a());
        Object b = cps.b(cpw);
        textView.setTextIsSelectable(true);
        textView.setText(b);
        textView.setPadding(5, 5, 5, 5);
        textView.setGravity(17);
        AlertDialog create = new Builder(cpw.a()).setTitle(bc.go).setView(textView).setPositiveButton("+", null).setNegativeButton("-", null).setNeutralButton("Share", null).setCancelable(true).create();
        create.show();
        create.getButton(-3).setOnClickListener(new cpt(b, cpw));
        create.getButton(-1).setOnClickListener(new cpu(textView));
        create.getButton(-2).setOnClickListener(new cpv(textView));
    }

    private static String b(cpw cpw) {
        Resources resources = cpw.a().getResources();
        StringBuilder stringBuilder = new StringBuilder();
        List o = cpw.o();
        if (!o.isEmpty()) {
            stringBuilder.append("Reason for alert: ");
            stringBuilder.append((String) o.get(0));
            for (int i = 1; i < o.size(); i++) {
                stringBuilder.append(" and ");
                stringBuilder.append((String) o.get(i));
            }
            stringBuilder.append('\n');
        }
        stringBuilder.append(resources.getString(bc.kh, new Object[]{glj.a(cpw.c()).toString()}));
        stringBuilder.append('\n');
        stringBuilder.append("conversation_id");
        stringBuilder.append(": ");
        stringBuilder.append(cpw.k());
        stringBuilder.append('\n');
        stringBuilder.append("message_id");
        stringBuilder.append(": ");
        stringBuilder.append(cpw.l());
        stringBuilder.append('\n');
        stringBuilder.append("receive_type");
        stringBuilder.append(": ");
        stringBuilder.append(cps.a(a, cpw.d()));
        stringBuilder.append("\n");
        if (cpw.e() != 0) {
            stringBuilder.append("in_app_msg_latency");
            stringBuilder.append(": ");
            stringBuilder.append(cpw.f());
            stringBuilder.append("ms\n");
        }
        if (cpw.b()) {
            stringBuilder.append("observed_status");
            stringBuilder.append(": ");
            stringBuilder.append(cps.a(b, cpw.h()));
            stringBuilder.append("\n");
            stringBuilder.append("sending_error");
            stringBuilder.append(": ");
            stringBuilder.append(cpw.g());
            stringBuilder.append("\n");
        } else {
            stringBuilder.append("observed_status_from_server");
            stringBuilder.append(": ");
            stringBuilder.append(cps.a(b, cpw.h()));
            stringBuilder.append("\n");
            if (cpw.i() == 0) {
                stringBuilder.append("Not notified");
            } else {
                stringBuilder.append("Notification Latency: ");
                stringBuilder.append(cpw.j());
                stringBuilder.append("ms");
            }
        }
        return stringBuilder.toString();
    }

    private static String a(lo<Integer, String> loVar, int i) {
        String str = (String) loVar.get(Integer.valueOf(i));
        return str != null ? str : "UNKNOWN";
    }
}
