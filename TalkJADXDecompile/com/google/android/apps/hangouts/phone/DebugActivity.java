package com.google.android.apps.hangouts.phone;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import android.text.format.Time;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import ba;
import bko;
import blo;
import bmv;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import ekh;
import eki;
import ekj;
import ekr;
import ekx;
import elb;
import elc;
import eld;
import ele;
import elh;
import eul;
import evz;
import fde;
import fio;
import glk;
import gwb;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import jca;
import jcf;
import jcu;
import jyy;
import wi;

public class DebugActivity extends jyy {
    public static final String[] i;
    public TextView a;
    public ListView b;
    public blo c;
    public ListView d;
    public RecordingService e;
    public ArrayAdapter<Intent> f;
    public bko g;
    public boolean h;
    private final jca l;
    private jcf m;
    private ServiceConnection n;

    public class RecordingService extends Service {
        public static final SimpleDateFormat d;
        public final Handler a;
        public ArrayAdapter<Intent> b;
        public final ArrayList<Intent> c;
        public String e;
        private final IBinder f;

        public RecordingService() {
            this.a = new Handler();
            this.f = new elh(this);
            this.c = new ArrayList();
        }

        static {
            d = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        }

        public void a(ArrayAdapter<Intent> arrayAdapter, String str) {
            this.b = arrayAdapter;
            this.e = str;
            this.b.clear();
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Intent intent = (Intent) obj;
                if (this.e == null || TextUtils.equals(intent.getStringExtra("conversation_id"), this.e)) {
                    this.b.add(intent);
                }
            }
            this.b.notifyDataSetChanged();
        }

        public IBinder onBind(Intent intent) {
            return this.f;
        }

        public void onCreate() {
            RealTimeChatService.a(new fio(this));
        }

        public void onDestroy() {
        }

        public void onStart(Intent intent, int i) {
        }

        public int onStartCommand(Intent intent, int i, int i2) {
            return 1;
        }
    }

    public DebugActivity() {
        this.l = new jcu(this, this.k).a(this.j);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.gf);
        this.g = fde.e(this.l.a());
        this.a = (TextView) findViewById(ba.ax);
        this.b = (ListView) findViewById(16908298);
        this.d = (ListView) findViewById(ba.eT);
        this.m = (jcf) this.j.a(jcf.class);
        this.m.b(this.g.g()).b("preserve_response_data", true).d();
        new ekh(this).b(new Void[0]);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.m.b(this.g.g()).b("preserve_response_data", this.h).d();
    }

    public void a() {
        Cursor a = this.c.e().a("conversations", null, null, null, null, null, "sort_timestamp DESC");
        this.b.setAdapter(a(a, new int[]{a.getColumnIndex("generated_name"), a.getColumnIndex("conversation_id")}));
        this.b.setOnItemClickListener(new ekr(this, a));
    }

    public static Intent a(Context context) {
        return new Intent(context, RecordingService.class);
    }

    public void onStart() {
        super.onStart();
        Intent intent = new Intent(this, RecordingService.class);
        if (this.n == null) {
            this.n = new ele(this);
        }
        bindService(intent, this.n, 1);
    }

    public void onResume() {
        super.onResume();
        String stringExtra = getIntent().getStringExtra("conversation_id");
        if (stringExtra != null) {
            getIntent().removeExtra("conversation_id");
            new Handler().postDelayed(new elb(this, stringExtra), 100);
        }
    }

    public void onStop() {
        super.onStop();
        if (this.n != null) {
            unbindService(this.n);
            this.n = null;
        }
        if (!((CheckBox) findViewById(ba.aj)).isChecked()) {
            stopService(a((Context) this));
        }
    }

    public static void b(Context context) {
        new Thread(new elc(context)).start();
    }

    public ArrayAdapter<Intent> b() {
        return new eld(this, this, gwb.gZ, ba.gf);
    }

    static {
        i = new String[]{"url:hangouts_conserver", "url:hangouts_conserver_upload", "url:hangouts_rs"};
    }

    public BaseAdapter a(List<String> list, List<Object> list2) {
        return new eki(this, list, list2);
    }

    public static String a(String str, Object obj) {
        if (obj == null) {
            return "NULL";
        }
        if ((obj instanceof eul) || (obj instanceof evz)) {
            return obj.getClass().getSimpleName();
        }
        String obj2 = obj.toString();
        Object toLowerCase = str.toLowerCase(Locale.US);
        if (toLowerCase.contains("timestamp") || toLowerCase.contains("watermark")) {
            try {
                long parseLong = Long.parseLong(obj2) / 1000;
                Time time = new Time();
                time.set(parseLong);
                return time.format("%c");
            } catch (Exception e) {
                glk.a("Babel", String.valueOf(toLowerCase).concat(" is not a Long"), new Object[0]);
                return obj2;
            }
        } else if (!"sms_type".equals(toLowerCase)) {
            return obj2;
        } else {
            String str2 = null;
            switch (Integer.parseInt(obj2)) {
                case -1:
                    str2 = "UNKNOWN";
                    break;
                case wi.w /*0*/:
                    str2 = "SMS";
                    break;
                case wi.j /*1*/:
                    str2 = "MMS";
                    break;
                case wi.l /*2*/:
                    str2 = "MMS Notif Ind";
                    break;
            }
            return new StringBuilder((String.valueOf(obj2).length() + 3) + String.valueOf(str2).length()).append(obj2).append(" (").append(str2).append(")").toString();
        }
    }

    public BaseAdapter a(Cursor cursor) {
        String valueOf;
        List list;
        List arrayList = new ArrayList();
        if (cursor.moveToPosition(0)) {
            List<String> asList = Arrays.asList((String[]) cursor.getColumnNames().clone());
            Collections.sort(asList);
            for (String valueOf2 : asList) {
                try {
                    arrayList.add(cursor.getString(cursor.getColumnIndex(valueOf2)));
                } catch (Exception e) {
                    String str = "???: ";
                    valueOf2 = String.valueOf(e.getMessage());
                    arrayList.add(valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
                }
            }
            list = asList;
        } else {
            list = new ArrayList();
        }
        return a(list, arrayList);
    }

    public BaseAdapter a(Cursor cursor, int[] iArr) {
        return new ekj(this, cursor, iArr);
    }

    public void a(View view, Cursor cursor, Runnable runnable) {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        PopupWindow popupWindow = new PopupWindow(view, point.x, point.y - 25);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(-1));
        popupWindow.setOnDismissListener(new ekx(this, cursor, runnable));
        popupWindow.showAtLocation(getWindow().getDecorView(), 0, 0, 0);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        if (view.equals(this.b)) {
            contextMenu.add(0, 1, 0, "FOCUS");
            contextMenu.add(0, 2, 0, "CLEAR FOCUS");
            contextMenu.add(0, 3, 0, "REMOVE CONVERSATION");
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        Cursor cursor = (Cursor) this.b.getAdapter().getItem(((AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        String string = cursor.getString(cursor.getColumnIndex("conversation_id"));
        switch (menuItem.getItemId()) {
            case wi.j /*1*/:
                this.f = b();
                this.e.a(this.f, string);
                this.d.setAdapter(this.f);
                break;
            case wi.l /*2*/:
                this.f = b();
                this.e.a(this.f, null);
                this.d.setAdapter(this.f);
                break;
            case wi.z /*3*/:
                this.c.k(string);
                a();
                break;
        }
        this.b.invalidateViews();
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "Clear History");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case wi.j /*1*/:
                this.f.clear();
                this.e.c.clear();
                this.f.notifyDataSetChanged();
                return true;
            default:
                return false;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return true;
    }

    private static void a(StringBuilder stringBuilder, Cursor cursor, String str, String str2, int i) {
        stringBuilder.append(str);
        stringBuilder.append("; count == ");
        stringBuilder.append(cursor.getCount());
        stringBuilder.append("\n\n");
        if (cursor.moveToFirst()) {
            String[] strArr = (String[]) cursor.getColumnNames().clone();
            Arrays.sort(strArr);
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                i2++;
                i3 = Math.max(i3, strArr[i2].length());
            }
            do {
                stringBuilder.append(">>>>>>>>>> ");
                stringBuilder.append(str2);
                stringBuilder.append("    ");
                stringBuilder.append(cursor.getString(cursor.getColumnIndex(str2)));
                stringBuilder.append("\n\n");
                for (String str3 : strArr) {
                    for (i2 = 0; i2 <= 0; i2++) {
                        stringBuilder.append("    ");
                    }
                    stringBuilder.append(str3);
                    for (i2 = (i3 - str3.length()) + 1; i2 >= 0; i2--) {
                        stringBuilder.append(' ');
                    }
                    try {
                        stringBuilder.append(cursor.getString(cursor.getColumnIndex(str3)));
                    } catch (Exception e) {
                        stringBuilder.append("???");
                    }
                    stringBuilder.append('\n');
                }
                stringBuilder.append("\n\n");
            } while (cursor.moveToNext());
        }
    }

    public static String a(bko bko, String str) {
        bmv e = new blo(gwb.H(), bko.g()).e();
        StringBuilder stringBuilder = new StringBuilder();
        Cursor a = e.a("conversations", null, "conversation_id=?", new String[]{str}, null, null, "sort_timestamp DESC");
        a(stringBuilder, a, "CONVERSATIONS", "conversation_id", 0);
        a.close();
        a = e.a("conversation_participants_view", null, "conversation_id=?", new String[]{str}, null, null, null);
        stringBuilder.append("PARTICIPANTS\n");
        a(stringBuilder, a, "PARTICIPANTS", "_id", 0);
        a.close();
        Cursor a2 = e.a("messages", null, "conversation_id=?", new String[]{str}, null, null, "timestamp ASC");
        a(stringBuilder, a2, "MESSAGES", "message_id", 0);
        a2.close();
        return stringBuilder.toString();
    }
}
