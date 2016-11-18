package p000;

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
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class dw extends dp implements cs, ct {
    final Handler f631c = new dx(this);
    final eb f632d = new eb(new dy(this));
    boolean f633e;
    boolean f634f;
    boolean f635g;
    boolean f636h;
    boolean f637i;
    boolean f638j;
    boolean f639k;
    int f640l;
    lp<String> f641m;

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
        this.f632d.m13421c();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.f641m.m29844a(i4);
            this.f641m.m29847b(i4);
            if (str != null) {
                dr a = this.f632d.m13406a(str);
                if (a == null) {
                    new StringBuilder("Activity result no fragment exists for who: ").append(str);
                    return;
                } else {
                    a.onActivityResult(65535 & i, i2, intent);
                    return;
                }
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (!this.f632d.m13407a().mo1849c()) {
            super.onBackPressed();
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f632d.m13413a(z);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f632d.m13419b(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f632d.m13408a(configuration);
    }

    public void onCreate(Bundle bundle) {
        this.f632d.m13410a(null);
        super.onCreate(bundle);
        dz dzVar = (dz) getLastNonConfigurationInstance();
        if (dzVar != null) {
            this.f632d.m13412a(dzVar.f10890c);
        }
        if (bundle != null) {
            this.f632d.m13409a(bundle.getParcelable("android:support:fragments"), dzVar != null ? dzVar.f10889b : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f640l = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (!(intArray == null || stringArray == null || intArray.length != stringArray.length)) {
                    this.f641m = new lp(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f641m.m29845a(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f641m == null) {
            this.f641m = new lp();
            this.f640l = 0;
        }
        this.f632d.m13425f();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu) | this.f632d.m13415a(menu, getMenuInflater());
        if (VERSION.SDK_INT >= 11) {
            return onCreatePanelMenu;
        }
        return true;
    }

    final View mo151a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f632d.m13405a(view, str, context, attributeSet);
    }

    public void onDestroy() {
        super.onDestroy();
        m1093a(false);
        this.f632d.m13432m();
        this.f632d.m13436q();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f632d.m13433n();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case 0:
                return this.f632d.m13416a(menuItem);
            case 6:
                return this.f632d.m13420b(menuItem);
            default:
                return false;
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case 0:
                this.f632d.m13418b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.f634f = false;
        if (this.f631c.hasMessages(2)) {
            this.f631c.removeMessages(2);
            f_();
        }
        this.f632d.m13429j();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f632d.m13421c();
    }

    public void onStateNotSaved() {
        this.f632d.m13421c();
    }

    public void onResume() {
        super.onResume();
        this.f631c.sendEmptyMessage(2);
        this.f634f = true;
        this.f632d.m13434o();
    }

    public void onPostResume() {
        super.onPostResume();
        this.f631c.removeMessages(2);
        f_();
        this.f632d.m13434o();
    }

    public void f_() {
        this.f632d.m13428i();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        if (this.f638j) {
            this.f638j = false;
            menu.clear();
            onCreatePanelMenu(i, menu);
        }
        return mo1199a(view, menu) | this.f632d.m13414a(menu);
    }

    public boolean mo1199a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public final Object onRetainNonConfigurationInstance() {
        if (this.f635g) {
            m1093a(true);
        }
        Object g_ = g_();
        el e = this.f632d.m13424e();
        lo s = this.f632d.m13438s();
        if (e == null && s == null && g_ == null) {
            return null;
        }
        Object dzVar = new dz();
        dzVar.f10888a = g_;
        dzVar.f10889b = e;
        dzVar.f10890c = s;
        return dzVar;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable d = this.f632d.m13423d();
        if (d != null) {
            bundle.putParcelable("android:support:fragments", d);
        }
        if (this.f641m.m29843a() > 0) {
            bundle.putInt("android:support:next_request_index", this.f640l);
            int[] iArr = new int[this.f641m.m29843a()];
            String[] strArr = new String[this.f641m.m29843a()];
            for (int i = 0; i < this.f641m.m29843a(); i++) {
                iArr[i] = this.f641m.m29849d(i);
                strArr[i] = (String) this.f641m.m29850e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public void onStart() {
        super.onStart();
        this.f635g = false;
        this.f636h = false;
        this.f631c.removeMessages(1);
        if (!this.f633e) {
            this.f633e = true;
            this.f632d.m13426g();
        }
        this.f632d.m13421c();
        this.f632d.m13434o();
        this.f632d.m13435p();
        this.f632d.m13427h();
        this.f632d.m13437r();
    }

    public void onStop() {
        super.onStop();
        this.f635g = true;
        this.f631c.sendEmptyMessage(1);
        this.f632d.m13430k();
    }

    public Object g_() {
        return null;
    }

    public void F_() {
        if (VERSION.SDK_INT >= 11) {
            gwb.m1736a((Activity) this);
        } else {
            this.f638j = true;
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
        printWriter.print(this.f633e);
        printWriter.print("mResumed=");
        printWriter.print(this.f634f);
        printWriter.print(" mStopped=");
        printWriter.print(this.f635g);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f636h);
        this.f632d.m13411a(str2, fileDescriptor, printWriter, strArr);
        this.f632d.m13407a().mo1847a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        m1086a(str + "  ", printWriter, getWindow().getDecorView());
    }

    private static String m1085a(View view) {
        char c;
        char c2 = 'F';
        char c3 = '.';
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(view.getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(view)));
        stringBuilder.append(' ');
        switch (view.getVisibility()) {
            case 0:
                stringBuilder.append('V');
                break;
            case 4:
                stringBuilder.append('I');
                break;
            case 8:
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

    private void m1086a(String str, PrintWriter printWriter, View view) {
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(dw.m1085a(view));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount > 0) {
                String str2 = str + "  ";
                for (int i = 0; i < childCount; i++) {
                    m1086a(str2, printWriter, viewGroup.getChildAt(i));
                }
            }
        }
    }

    void m1093a(boolean z) {
        if (!this.f636h) {
            this.f636h = true;
            this.f637i = z;
            this.f631c.removeMessages(1);
            I_();
        } else if (z) {
            this.f632d.m13435p();
            this.f632d.m13422c(true);
        }
    }

    void I_() {
        this.f632d.m13422c(this.f637i);
        this.f632d.m13431l();
    }

    public void mo1050a(dr drVar) {
    }

    public ed J_() {
        return this.f632d.m13407a();
    }

    public fg m1095f() {
        return this.f632d.m13417b();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!(this.b || i == -1)) {
            dn.m1083b(i);
        }
        super.startActivityForResult(intent, i);
    }

    public final void b_(int i) {
        if (!this.f639k && i != -1) {
            dn.m1083b(i);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str = (String) this.f641m.m29844a(i3);
            this.f641m.m29847b(i3);
            if (str != null) {
                dr a = this.f632d.m13406a(str);
                if (a == null) {
                    new StringBuilder("Activity result no fragment exists for who: ").append(str);
                } else {
                    a.onRequestPermissionsResult(i & 65535, strArr, iArr);
                }
            }
        }
    }

    public void m1090a(dr drVar, Intent intent, int i, Bundle bundle) {
        this.b = true;
        if (i == -1) {
            try {
                cq.m10682a(this, intent, -1, bundle);
            } finally {
                this.b = false;
            }
        } else {
            dn.m1083b(i);
            cq.m10682a(this, intent, ((m1087b(drVar) + 1) << 16) + (65535 & i), bundle);
            this.b = false;
        }
    }

    public void m1091a(dr drVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.a = true;
        if (i == -1) {
            try {
                cq.m10683a(this, intentSender, i, intent, i2, i3, i4, bundle);
            } finally {
                this.a = false;
            }
        } else {
            dn.m1083b(i);
            cq.m10683a(this, intentSender, ((m1087b(drVar) + 1) << 16) + (65535 & i), intent, i2, i3, i4, bundle);
            this.a = false;
        }
    }

    private int m1087b(dr drVar) {
        if (this.f641m.m29843a() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.f641m.m29851f(this.f640l) >= 0) {
            this.f640l = (this.f640l + 1) % 65534;
        }
        int i = this.f640l;
        this.f641m.m29845a(i, drVar.f754q);
        this.f640l = (this.f640l + 1) % 65534;
        return i;
    }

    void m1092a(dr drVar, String[] strArr, int i) {
        if (i == -1) {
            cq.m10684a(this, strArr, i);
            return;
        }
        dn.m1083b(i);
        try {
            this.f639k = true;
            cq.m10684a(this, strArr, ((m1087b(drVar) + 1) << 16) + (65535 & i));
        } finally {
            this.f639k = false;
        }
    }
}
