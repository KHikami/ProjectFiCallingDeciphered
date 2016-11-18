package p000;

import android.database.Cursor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ekm implements OnClickListener {
    final /* synthetic */ String f11763a;
    final /* synthetic */ DebugActivity f11764b;

    ekm(DebugActivity debugActivity, String str) {
        this.f11764b = debugActivity;
        this.f11763a = str;
    }

    public void onClick(View view) {
        DebugActivity debugActivity = this.f11764b;
        String str = this.f11763a;
        String str2 = "conversations_view";
        Cursor a = debugActivity.f6666c.m6044e().m6200a(str2, null, "conversation_id=?", new String[]{str}, null, null, "sort_timestamp DESC");
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
        ((ListView) inflate.findViewById(16908298)).setAdapter(debugActivity.m8915a(a));
        debugActivity.m8919a(inflate, a, null);
    }
}
