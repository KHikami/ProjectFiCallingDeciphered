package p000;

import android.app.backup.BackupManager;
import android.content.SharedPreferences.Editor;
import java.util.Iterator;

final class dce implements Runnable {
    final /* synthetic */ dcd f9510a;

    dce(dcd dcd) {
        this.f9510a = dcd;
    }

    public void run() {
        synchronized (dcd.f9506d) {
            StringBuilder stringBuilder = new StringBuilder();
            Iterator it = this.f9510a.f9508b.iterator();
            Object obj = 1;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (obj == null) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(Integer.toString(gwb.m1507a(num), dcd.f9505c));
                obj = null;
            }
            Editor edit = this.f9510a.f9507a.getSharedPreferences("recentEmoji", 0).edit();
            edit.putString("recentEmojiKey", stringBuilder.toString());
            edit.apply();
            new BackupManager(this.f9510a.f9507a).dataChanged();
        }
    }
}
