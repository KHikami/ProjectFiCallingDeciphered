package defpackage;

import android.database.Cursor;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class elb implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ DebugActivity b;

    public elb(DebugActivity debugActivity, String str) {
        this.b = debugActivity;
        this.a = str;
    }

    public void run() {
        DebugActivity debugActivity = this.b;
        String str = this.a;
        String str2 = "conversations";
        Cursor a = debugActivity.c.e().a(str2, null, "conversation_id=?", new String[]{str}, null, null, "sort_timestamp DESC");
        View inflate = debugActivity.getLayoutInflater().inflate(gwb.gn, null);
        Button button = (Button) inflate.findViewById(ba.fg);
        Button button2 = (Button) inflate.findViewById(ba.fi);
        Button button3 = (Button) inflate.findViewById(ba.fh);
        if ("conversations_view".equals(str2)) {
            button.setText("switch to conversation view");
            button.setVisibility(0);
            button.setOnClickListener(new ekm(debugActivity, str));
        }
        button2.setText("show participants");
        button2.setVisibility(0);
        button2.setOnClickListener(new ekn(debugActivity, str, button3, button2, button));
        button3.setText("show messages");
        button3.setVisibility(0);
        button3.setOnClickListener(new ekk(debugActivity, str, button3, button2, button));
        ((ListView) inflate.findViewById(16908298)).setAdapter(debugActivity.a(a));
        debugActivity.a(inflate, a, null);
    }
}
