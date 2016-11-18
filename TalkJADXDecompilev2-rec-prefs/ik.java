package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class ik {
    private static final Object f17840f = new Object();
    private static ik f17841g;
    private final Context f17842a;
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> f17843b = new HashMap();
    private final HashMap<String, ArrayList<in>> f17844c = new HashMap();
    private final ArrayList<im> f17845d = new ArrayList();
    private final Handler f17846e;

    public static ik m22097a(Context context) {
        ik ikVar;
        synchronized (f17840f) {
            if (f17841g == null) {
                f17841g = new ik(context.getApplicationContext());
            }
            ikVar = f17841g;
        }
        return ikVar;
    }

    private ik(Context context) {
        this.f17842a = context;
        this.f17846e = new il(this, context.getMainLooper());
    }

    public void m22100a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f17843b) {
            in inVar = new in(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.f17843b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f17843b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(intentFilter);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                arrayList = (ArrayList) this.f17844c.get(action);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f17844c.put(action, arrayList);
                }
                arrayList.add(inVar);
            }
        }
    }

    public void m22099a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f17843b) {
            ArrayList arrayList = (ArrayList) this.f17843b.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                IntentFilter intentFilter = (IntentFilter) arrayList.get(i);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList arrayList2 = (ArrayList) this.f17844c.get(action);
                    if (arrayList2 != null) {
                        int i3 = 0;
                        while (i3 < arrayList2.size()) {
                            int i4;
                            if (((in) arrayList2.get(i3)).f18098b == broadcastReceiver) {
                                arrayList2.remove(i3);
                                i4 = i3 - 1;
                            } else {
                                i4 = i3;
                            }
                            i3 = i4 + 1;
                        }
                        if (arrayList2.size() <= 0) {
                            this.f17844c.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m22101a(Intent intent) {
        synchronized (this.f17843b) {
            Object obj;
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f17842a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set categories = intent.getCategories();
            if ((intent.getFlags() & 8) != 0) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                new StringBuilder("Resolving type ").append(resolveTypeIfNeeded).append(" scheme ").append(scheme).append(" of intent ").append(intent);
            }
            ArrayList arrayList = (ArrayList) this.f17844c.get(intent.getAction());
            if (arrayList != null) {
                if (obj != null) {
                    new StringBuilder("Action list: ").append(arrayList);
                }
                ArrayList arrayList2 = null;
                int i = 0;
                while (i < arrayList.size()) {
                    ArrayList arrayList3;
                    in inVar = (in) arrayList.get(i);
                    if (obj != null) {
                        new StringBuilder("Matching against filter ").append(inVar.f18097a);
                    }
                    if (inVar.f18099c) {
                        if (obj != null) {
                            arrayList3 = arrayList2;
                        }
                        arrayList3 = arrayList2;
                    } else {
                        int match = inVar.f18097a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (obj != null) {
                                new StringBuilder("  Filter matched!  match=0x").append(Integer.toHexString(match));
                            }
                            if (arrayList2 == null) {
                                arrayList3 = new ArrayList();
                            } else {
                                arrayList3 = arrayList2;
                            }
                            arrayList3.add(inVar);
                            inVar.f18099c = true;
                        } else {
                            if (obj != null) {
                                String str;
                                switch (match) {
                                    case -4:
                                        str = "category";
                                        break;
                                    case -3:
                                        str = "action";
                                        break;
                                    case -2:
                                        str = "data";
                                        break;
                                    case -1:
                                        str = "type";
                                        break;
                                    default:
                                        str = "unknown reason";
                                        break;
                                }
                                new StringBuilder("  Filter did not match: ").append(str);
                            }
                            arrayList3 = arrayList2;
                        }
                    }
                    i++;
                    arrayList2 = arrayList3;
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((in) arrayList2.get(i2)).f18099c = false;
                    }
                    this.f17845d.add(new im(intent, arrayList2));
                    if (!this.f17846e.hasMessages(1)) {
                        this.f17846e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
        }
    }

    public void m22102b(Intent intent) {
        if (m22101a(intent)) {
            m22098a();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m22098a() {
        while (true) {
            synchronized (this.f17843b) {
                int size = this.f17845d.size();
                if (size <= 0) {
                    return;
                }
                im[] imVarArr = new im[size];
                this.f17845d.toArray(imVarArr);
                this.f17845d.clear();
            }
        }
    }
}
