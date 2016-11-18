package p000;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import java.util.List;

public final class cps {
    private static final lo<Integer, String> f8801a;
    private static final lo<Integer, String> f8802b;

    static {
        lo loVar = new lo();
        f8801a = loVar;
        loVar.put(Integer.valueOf(1), "MESSAGE_RECEIVED_FAN_OUT");
        f8801a.put(Integer.valueOf(3), "MESSAGE_RECEIVED_COLD_SYNC");
        f8801a.put(Integer.valueOf(2), "MESSAGE_RECEIVED_WARM_SYNC");
        f8801a.put(Integer.valueOf(4), "MESSAGE_RECEIVED_USER_SCROLL_BACK");
        f8801a.put(Integer.valueOf(5), "MESSAGE_RECEIVED_CONVERSATION_REQUEST");
        loVar = new lo();
        f8802b = loVar;
        loVar.put(Integer.valueOf(0), "UNKNOWN_OBSERVED_STATUS");
        f8802b.put(Integer.valueOf(1), "OBSERVED");
        f8802b.put(Integer.valueOf(2), "UNOBSERVED");
    }

    public static void m10656a(cpw cpw) {
        View textView = new TextView(cpw.mo721a());
        Object b = cps.m10657b(cpw);
        textView.setTextIsSelectable(true);
        textView.setText(b);
        textView.setPadding(5, 5, 5, 5);
        textView.setGravity(17);
        AlertDialog create = new Builder(cpw.mo721a()).setTitle(bc.go).setView(textView).setPositiveButton("+", null).setNegativeButton("-", null).setNeutralButton("Share", null).setCancelable(true).create();
        create.show();
        create.getButton(-3).setOnClickListener(new cpt(b, cpw));
        create.getButton(-1).setOnClickListener(new cpu(textView));
        create.getButton(-2).setOnClickListener(new cpv(textView));
    }

    private static String m10657b(cpw cpw) {
        Resources resources = cpw.mo721a().getResources();
        StringBuilder stringBuilder = new StringBuilder();
        List o = cpw.mo735o();
        if (!o.isEmpty()) {
            stringBuilder.append("Reason for alert: ");
            stringBuilder.append((String) o.get(0));
            for (int i = 1; i < o.size(); i++) {
                stringBuilder.append(" and ");
                stringBuilder.append((String) o.get(i));
            }
            stringBuilder.append('\n');
        }
        stringBuilder.append(resources.getString(bc.kh, new Object[]{glj.m17957a(cpw.mo723c()).toString()}));
        stringBuilder.append('\n');
        stringBuilder.append("conversation_id");
        stringBuilder.append(": ");
        stringBuilder.append(cpw.mo731k());
        stringBuilder.append('\n');
        stringBuilder.append("message_id");
        stringBuilder.append(": ");
        stringBuilder.append(cpw.mo732l());
        stringBuilder.append('\n');
        stringBuilder.append("receive_type");
        stringBuilder.append(": ");
        stringBuilder.append(cps.m10655a(f8801a, cpw.mo724d()));
        stringBuilder.append("\n");
        if (cpw.mo725e() != 0) {
            stringBuilder.append("in_app_msg_latency");
            stringBuilder.append(": ");
            stringBuilder.append(cpw.mo726f());
            stringBuilder.append("ms\n");
        }
        if (cpw.mo722b()) {
            stringBuilder.append("observed_status");
            stringBuilder.append(": ");
            stringBuilder.append(cps.m10655a(f8802b, cpw.mo728h()));
            stringBuilder.append("\n");
            stringBuilder.append("sending_error");
            stringBuilder.append(": ");
            stringBuilder.append(cpw.mo727g());
            stringBuilder.append("\n");
        } else {
            stringBuilder.append("observed_status_from_server");
            stringBuilder.append(": ");
            stringBuilder.append(cps.m10655a(f8802b, cpw.mo728h()));
            stringBuilder.append("\n");
            if (cpw.mo729i() == 0) {
                stringBuilder.append("Not notified");
            } else {
                stringBuilder.append("Notification Latency: ");
                stringBuilder.append(cpw.mo730j());
                stringBuilder.append("ms");
            }
        }
        return stringBuilder.toString();
    }

    private static String m10655a(lo<Integer, String> loVar, int i) {
        String str = (String) loVar.get(Integer.valueOf(i));
        return str != null ? str : "UNKNOWN";
    }
}
