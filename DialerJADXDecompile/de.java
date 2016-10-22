import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: PG */
public class de extends cz implements ck, cl {
    final Handler b;
    final dj c;
    boolean d;
    int e;
    ik f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;

    public de() {
        this.b = new df(this);
        this.c = new dj(new dg(this));
    }

    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.c.a();
        int i3 = i >> 16;
        if (i3 != 0) {
            Object obj;
            int i4 = i3 - 1;
            ik ikVar = this.f;
            int a = hx.a(ikVar.c, ikVar.e, i4);
            if (a < 0 || ikVar.d[a] == ik.a) {
                obj = null;
            } else {
                obj = ikVar.d[a];
            }
            String str = (String) obj;
            ik ikVar2 = this.f;
            i4 = hx.a(ikVar2.c, ikVar2.e, i4);
            if (i4 >= 0 && ikVar2.d[i4] != ik.a) {
                ikVar2.d[i4] = ik.a;
                ikVar2.b = true;
            }
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            db a2 = this.c.a(str);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
                return;
            } else {
                a2.a(65535 & i, i2);
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (!this.c.a.d.c()) {
            a_();
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.c.a.d.a(z);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.c.a.d.b(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.a.d.a(configuration);
    }

    public void onCreate(Bundle bundle) {
        dj djVar = this.c;
        djVar.a.d.a(djVar.a, djVar.a, null);
        super.onCreate(bundle);
        dh dhVar = (dh) getLastNonConfigurationInstance();
        if (dhVar != null) {
            this.c.a.e = dhVar.b;
        }
        if (bundle != null) {
            dt dtVar;
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            dj djVar2 = this.c;
            if (dhVar != null) {
                dtVar = dhVar.a;
            } else {
                dtVar = null;
            }
            djVar2.a.d.a(parcelable, dtVar);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.e = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f = new ik(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f.a(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f == null) {
            this.f = new ik();
            this.e = 0;
        }
        this.c.a.d.i();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        dj djVar = this.c;
        onCreatePanelMenu |= djVar.a.d.a(menu, getMenuInflater());
        if (VERSION.SDK_INT >= 11) {
            return onCreatePanelMenu;
        }
        return true;
    }

    final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.c.a.d.a(view, str, context, attributeSet);
    }

    public void onDestroy() {
        super.onDestroy();
        a(false);
        this.c.a.d.n();
        dk dkVar = this.c.a;
        if (dkVar.g != null) {
            dkVar.g.g();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 5 || i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        onBackPressed();
        return true;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.c.a.d.o();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case rl.c /*0*/:
                return this.c.a.d.a(menuItem);
            case rl.i /*6*/:
                return this.c.a.d.b(menuItem);
            default:
                return false;
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case rl.c /*0*/:
                this.c.a.d.b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.h = false;
        if (this.b.hasMessages(2)) {
            this.b.removeMessages(2);
            this.c.a.d.l();
        }
        this.c.a.d.a(4, false);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.c.a();
    }

    public void onStateNotSaved() {
        this.c.a();
    }

    public void onResume() {
        super.onResume();
        this.b.sendEmptyMessage(2);
        this.h = true;
        this.c.b();
    }

    public void onPostResume() {
        super.onPostResume();
        this.b.removeMessages(2);
        this.c.a.d.l();
        this.c.b();
    }

    protected final void b() {
        this.c.a.d.l();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        if (this.k) {
            this.k = false;
            menu.clear();
            onCreatePanelMenu(i, menu);
        }
        return super.onPreparePanel(0, view, menu) | this.c.a.d.a(menu);
    }

    public final Object onRetainNonConfigurationInstance() {
        int i;
        ij ijVar;
        int i2 = 0;
        if (this.d) {
            a(true);
        }
        dt g = this.c.a.d.g();
        dk dkVar = this.c.a;
        if (dkVar.e != null) {
            int size = dkVar.e.size();
            eg[] egVarArr = new eg[size];
            for (int i3 = size - 1; i3 >= 0; i3--) {
                egVarArr[i3] = (eg) dkVar.e.c(i3);
            }
            boolean z = dkVar.f;
            i = 0;
            while (i2 < size) {
                eg egVar = egVarArr[i2];
                if (!egVar.e && z) {
                    if (!egVar.d) {
                        egVar.b();
                    }
                    egVar.d();
                }
                if (egVar.e) {
                    i = true;
                } else {
                    egVar.g();
                    dkVar.e.remove(egVar.c);
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i != 0) {
            ijVar = dkVar.e;
        } else {
            ijVar = null;
        }
        if (g == null && ijVar == null) {
            return null;
        }
        Object dhVar = new dh();
        dhVar.a = g;
        dhVar.b = ijVar;
        return dhVar;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable h = this.c.a.d.h();
        if (h != null) {
            bundle.putParcelable("android:support:fragments", h);
        }
        if (this.f.b() > 0) {
            bundle.putInt("android:support:next_request_index", this.e);
            int[] iArr = new int[this.f.b()];
            String[] strArr = new String[this.f.b()];
            for (int i = 0; i < this.f.b(); i++) {
                iArr[i] = this.f.b(i);
                strArr[i] = (String) this.f.c(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public void onStart() {
        super.onStart();
        this.d = false;
        this.i = false;
        this.b.removeMessages(1);
        if (!this.g) {
            this.g = true;
            this.c.a.d.j();
        }
        this.c.a();
        this.c.b();
        dk dkVar = this.c.a;
        if (!dkVar.i) {
            dkVar.i = true;
            if (dkVar.g != null) {
                dkVar.g.b();
            } else if (!dkVar.h) {
                dkVar.g = dkVar.a("(root)", dkVar.i, false);
                if (!(dkVar.g == null || dkVar.g.d)) {
                    dkVar.g.b();
                }
            }
            dkVar.h = true;
        }
        this.c.a.d.k();
        dk dkVar2 = this.c.a;
        if (dkVar2.e != null) {
            int i;
            int size = dkVar2.e.size();
            eg[] egVarArr = new eg[size];
            for (i = size - 1; i >= 0; i--) {
                egVarArr[i] = (eg) dkVar2.e.c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                eg egVar = egVarArr[i2];
                if (egVar.e) {
                    egVar.e = false;
                    for (i = egVar.b.b() - 1; i >= 0; i--) {
                        eh ehVar = (eh) egVar.b.c(i);
                        if (ehVar.e) {
                            ehVar.e = false;
                            if (!(ehVar.d == ehVar.f || ehVar.d)) {
                                ehVar.a();
                            }
                        }
                    }
                }
                egVar.f();
            }
        }
    }

    public void onStop() {
        super.onStop();
        this.d = true;
        this.b.sendEmptyMessage(1);
        this.c.a.d.m();
    }

    public void c() {
        if (VERSION.SDK_INT >= 11) {
            buf.a((Activity) this);
        } else {
            this.k = true;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = VERSION.SDK_INT;
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.g);
        printWriter.print("mResumed=");
        printWriter.print(this.h);
        printWriter.print(" mStopped=");
        printWriter.print(this.d);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.i);
        dk dkVar = this.c.a;
        printWriter.print(str2);
        printWriter.print("mLoadersStarted=");
        printWriter.println(dkVar.i);
        if (dkVar.g != null) {
            printWriter.print(str2);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(dkVar.g)));
            printWriter.println(":");
            dkVar.g.a(str2 + "  ", fileDescriptor, printWriter, strArr);
        }
        this.c.a.d.a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        a(str + "  ", printWriter, getWindow().getDecorView());
    }

    private static String a(View view) {
        char c;
        char c2 = 'F';
        char c3 = '.';
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(view.getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(view)));
        stringBuilder.append(' ');
        switch (view.getVisibility()) {
            case rl.c /*0*/:
                stringBuilder.append('V');
                break;
            case rl.f /*4*/:
                stringBuilder.append('I');
                break;
            case rl.j /*8*/:
                stringBuilder.append('G');
                break;
            default:
                stringBuilder.append('.');
                break;
        }
        if (view.isFocusable()) {
            c = 'F';
        } else {
            c = '.';
        }
        stringBuilder.append(c);
        if (view.isEnabled()) {
            c = 'E';
        } else {
            c = '.';
        }
        stringBuilder.append(c);
        stringBuilder.append(view.willNotDraw() ? '.' : 'D');
        if (view.isHorizontalScrollBarEnabled()) {
            c = 'H';
        } else {
            c = '.';
        }
        stringBuilder.append(c);
        if (view.isVerticalScrollBarEnabled()) {
            c = 'V';
        } else {
            c = '.';
        }
        stringBuilder.append(c);
        if (view.isClickable()) {
            c = 'C';
        } else {
            c = '.';
        }
        stringBuilder.append(c);
        if (view.isLongClickable()) {
            c = 'L';
        } else {
            c = '.';
        }
        stringBuilder.append(c);
        stringBuilder.append(' ');
        if (!view.isFocused()) {
            c2 = '.';
        }
        stringBuilder.append(c2);
        if (view.isSelected()) {
            c = 'S';
        } else {
            c = '.';
        }
        stringBuilder.append(c);
        if (view.isPressed()) {
            c3 = 'P';
        }
        stringBuilder.append(c3);
        stringBuilder.append(' ');
        stringBuilder.append(view.getLeft());
        stringBuilder.append(',');
        stringBuilder.append(view.getTop());
        stringBuilder.append('-');
        stringBuilder.append(view.getRight());
        stringBuilder.append(',');
        stringBuilder.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            stringBuilder.append(" #");
            stringBuilder.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (!(id == 0 || resources == null)) {
                String str;
                switch (-16777216 & id) {
                    case 16777216:
                        str = "android";
                        break;
                    case 2130706432:
                        str = "app";
                        break;
                    default:
                        try {
                            str = resources.getResourcePackageName(id);
                            break;
                        } catch (NotFoundException e) {
                            break;
                        }
                }
                String resourceTypeName = resources.getResourceTypeName(id);
                String resourceEntryName = resources.getResourceEntryName(id);
                stringBuilder.append(" ");
                stringBuilder.append(str);
                stringBuilder.append(":");
                stringBuilder.append(resourceTypeName);
                stringBuilder.append("/");
                stringBuilder.append(resourceEntryName);
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private final void a(String str, PrintWriter printWriter, View view) {
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(a(view));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount > 0) {
                String str2 = str + "  ";
                for (int i = 0; i < childCount; i++) {
                    a(str2, printWriter, viewGroup.getChildAt(i));
                }
            }
        }
    }

    final void a(boolean z) {
        if (!this.i) {
            this.i = true;
            this.j = z;
            this.b.removeMessages(1);
            this.c.a(this.j);
            this.c.a.d.a(2, false);
        } else if (z) {
            dk dkVar = this.c.a;
            if (!dkVar.i) {
                dkVar.i = true;
                if (dkVar.g != null) {
                    dkVar.g.b();
                } else if (!dkVar.h) {
                    dkVar.g = dkVar.a("(root)", dkVar.i, false);
                    if (!(dkVar.g == null || dkVar.g.d)) {
                        dkVar.g.b();
                    }
                }
                dkVar.h = true;
            }
            this.c.a(true);
        }
    }

    public final dl d() {
        return this.c.a.d;
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!(this.a || i == -1)) {
            cx.b(i);
        }
        super.startActivityForResult(intent, i);
    }

    public final void b_(int i) {
        if (i != -1) {
            cx.b(i);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            Object obj;
            int i3 = i2 - 1;
            ik ikVar = this.f;
            int a = hx.a(ikVar.c, ikVar.e, i3);
            if (a < 0 || ikVar.d[a] == ik.a) {
                obj = null;
            } else {
                obj = ikVar.d[a];
            }
            String str = (String) obj;
            ik ikVar2 = this.f;
            i3 = hx.a(ikVar2.c, ikVar2.e, i3);
            if (i3 >= 0 && ikVar2.d[i3] != ik.a) {
                ikVar2.d[i3] = ik.a;
                ikVar2.b = true;
            }
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            } else if (this.c.a(str) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
            } else {
                db.i();
            }
        }
    }
}
