package defpackage;

import android.app.backup.BackupManager;
import android.content.SharedPreferences.Editor;
import java.util.Iterator;

final class dce implements Runnable {
    final /* synthetic */ dcd a;

    dce(dcd dcd) {
        this.a = dcd;
    }

    public void run() {
        synchronized (dcd.d) {
            StringBuilder stringBuilder = new StringBuilder();
            Iterator it = this.a.b.iterator();
            Object obj = 1;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (obj == null) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(Integer.toString(gwb.a(num), dcd.c));
                obj = null;
            }
            Editor edit = this.a.a.getSharedPreferences("recentEmoji", 0).edit();
            edit.putString("recentEmojiKey", stringBuilder.toString());
            edit.apply();
            new BackupManager(this.a.a).dataChanged();
        }
    }
}
