package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class ism implements itc, itd {
    final Context f18873a;
    final AudioManager f18874b;
    final isw f18875c = new isw(this);
    final Object f18876d = new Object();
    boolean f18877e;
    boolean f18878f;
    isq f18879g;
    isr f18880h = isr.SPEAKERPHONE_ON;
    final Set<isq> f18881i = new CopyOnWriteArraySet();
    isv f18882j;
    BluetoothAdapter f18883k;
    BluetoothHeadset f18884l;
    ist f18885m;
    BluetoothDevice f18886n;
    isr f18887o;
    private final Runnable f18888p = new iss(this);
    private ijn f18889q;
    private boolean f18890r;
    private boolean f18891s;
    private final Runnable f18892t = new isn(this);

    public ism(Context context, boolean z) {
        this.f18873a = context;
        this.f18874b = (AudioManager) context.getSystemService("audio");
        if (m23138l()) {
            this.f18881i.add(isq.EARPIECE);
        }
        this.f18881i.add(isq.SPEAKERPHONE);
        isq isq = (z || !m23138l()) ? isq.SPEAKERPHONE : isq.EARPIECE;
        this.f18879g = isq;
    }

    public void mo3385a(ite ite) {
        if (this.f18889q == null) {
            iil.m21874a("Must use CallClient", ite instanceof ijn);
            this.f18889q = (ijn) ite;
            synchronized (this.f18876d) {
                if (!this.f18877e) {
                    iiq.m4948a(this.f18888p);
                }
                mo3396a(this.f18890r);
                c_(this.f18891s);
            }
        }
    }

    public void mo3394a() {
        synchronized (this.f18876d) {
            if (this.f18877e) {
                itx.m23277a(3, "vclib", "releaseBluetoothAudio");
                if (this.f18883k != null) {
                    m23133g();
                    m23135i();
                    this.f18873a.unregisterReceiver(this.f18885m);
                    this.f18885m = null;
                    this.f18883k.closeProfileProxy(1, this.f18884l);
                    this.f18884l = null;
                    this.f18886n = null;
                    this.f18883k = null;
                }
                itx.m23277a(3, "vclib", "releaseWiredHeadsetAudio");
                this.f18873a.unregisterReceiver(this.f18875c);
                this.f18874b.setMode(0);
                this.f18874b.abandonAudioFocus(null);
                itx.m23277a(4, "vclib", "Restoring saved speakerphone state to" + this.f18878f);
                m23121b(this.f18878f);
                this.f18877e = false;
            }
        }
        this.f18889q = null;
    }

    public void mo3396a(boolean z) {
        boolean z2 = true;
        this.f18890r = z;
        synchronized (this.f18876d) {
            if (this.f18889q != null) {
                boolean z3;
                String str = "vclib";
                if (z) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                itx.m23277a(3, str, "Setting audio mute state to " + z3);
                ijn ijn = this.f18889q;
                if (z) {
                    z2 = false;
                }
                ijn.m21960a(z2);
            }
        }
    }

    public boolean mo3397b() {
        return this.f18890r;
    }

    public void c_(boolean z) {
        boolean z2 = true;
        this.f18891s = z;
        if (this.f18889q != null) {
            boolean z3;
            String str = "vclib";
            if (z) {
                z3 = false;
            } else {
                z3 = true;
            }
            itx.m23277a(3, str, "Setting playout mute state to " + z3);
            ijn ijn = this.f18889q;
            if (z) {
                z2 = false;
            }
            ijn.mo3220b(z2);
        }
    }

    public boolean Q_() {
        return this.f18891s;
    }

    public void m23124a(isq isq) {
        synchronized (this.f18876d) {
            switch (isp.f18895a[isq.ordinal()]) {
                case 1:
                    this.f18887o = this.f18880h;
                    itx.m23277a(3, "vclib", "turnOnBluetooth");
                    if (this.f18880h != isr.BLUETOOTH_ON && this.f18880h != isr.BLUETOOTH_TURNING_ON) {
                        m23132f();
                        break;
                    }
                    String valueOf = String.valueOf(this.f18880h);
                    itx.m23277a(3, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 50).append("turnOnBluetooth: state is already ").append(valueOf).append(", cannot turn on").toString());
                    break;
                    break;
                case 2:
                    if (!this.f18877e || m23122m()) {
                        this.f18887o = isr.SPEAKERPHONE_ON;
                    } else {
                        this.f18880h = isr.SPEAKERPHONE_ON;
                    }
                    m23121b(true);
                    break;
                case 3:
                    if (!this.f18877e || m23122m()) {
                        this.f18887o = isr.WIRED_HEADSET_ON;
                    } else {
                        this.f18880h = isr.WIRED_HEADSET_ON;
                    }
                    m23121b(false);
                    break;
                case 4:
                    if (!this.f18877e || m23122m()) {
                        this.f18887o = isr.EARPIECE_ON;
                    } else {
                        this.f18880h = isr.EARPIECE_ON;
                    }
                    m23121b(false);
                    break;
            }
        }
        m23131e();
    }

    public isr m23129c() {
        return this.f18880h;
    }

    public Set<isq> m23130d() {
        return this.f18881i;
    }

    public void m23125a(isv isv) {
        this.f18882j = isv;
    }

    private void m23121b(boolean z) {
        itx.m23277a(3, "vclib", "setSpeakerphoneOn(" + z + "), wasOn=" + this.f18874b.isSpeakerphoneOn());
        this.f18874b.setSpeakerphoneOn(z);
    }

    void m23131e() {
        String valueOf = String.valueOf(this.f18880h);
        String valueOf2 = String.valueOf(this.f18881i);
        itx.m23277a(3, "vclib", new StringBuilder((String.valueOf(valueOf).length() + 30) + String.valueOf(valueOf2).length()).append("reportUpdate: state=").append(valueOf).append(", devices=").append(valueOf2).toString());
        gwb.m1863a(new iso(this));
    }

    void m23132f() {
        itx.m23277a(3, "vclib", "startBluetoothSco");
        m23135i();
        if (this.f18884l != null) {
            if (this.f18886n == null) {
                List connectedDevices = this.f18884l.getConnectedDevices();
                if (connectedDevices.size() > 0) {
                    this.f18886n = (BluetoothDevice) connectedDevices.get(0);
                }
            }
            if (this.f18886n != null) {
                if (VERSION.SDK_INT >= 18) {
                    itx.m23277a(3, "vclib", "startBluetoothSco : JBMR2+ Workaround");
                    try {
                        Method declaredMethod = Class.forName(this.f18884l.getClass().getName()).getDeclaredMethod("startScoUsingVirtualVoiceCall", new Class[]{BluetoothDevice.class});
                        declaredMethod.setAccessible(true);
                        Boolean bool = (Boolean) declaredMethod.invoke(this.f18884l, new Object[]{this.f18886n});
                        if (bool != null && bool.booleanValue()) {
                            this.f18880h = isr.BLUETOOTH_TURNING_ON;
                        }
                    } catch (ClassNotFoundException e) {
                        iil.m21870a(e.toString());
                    } catch (NoSuchMethodException e2) {
                        iil.m21870a(e2.toString());
                    } catch (InvocationTargetException e3) {
                        iil.m21870a(e3.toString());
                    } catch (IllegalAccessException e4) {
                        iil.m21870a(e4.toString());
                    }
                    itx.m23277a(3, "vclib", "done");
                } else {
                    itx.m23277a(3, "vclib", "startBluetoothSco : pre-JBMR2");
                    this.f18874b.startBluetoothSco();
                    this.f18880h = isr.BLUETOOTH_TURNING_ON;
                }
                if (this.f18880h == isr.BLUETOOTH_TURNING_ON) {
                    m23131e();
                    m23134h();
                }
            }
        }
    }

    private boolean m23122m() {
        itx.m23277a(3, "vclib", "turnOffBluetooth");
        if (this.f18880h == isr.BLUETOOTH_ON || this.f18880h == isr.BLUETOOTH_TURNING_ON) {
            m23133g();
            return true;
        }
        String valueOf = String.valueOf(this.f18880h);
        itx.m23277a(3, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 52).append("turnOffBluetooth: state is already ").append(valueOf).append(", cannot turn off").toString());
        return false;
    }

    void m23133g() {
        itx.m23277a(3, "vclib", "stopBluetoothSco");
        m23135i();
        if (this.f18884l != null && this.f18886n != null) {
            if (VERSION.SDK_INT >= 18) {
                try {
                    itx.m23277a(3, "vclib", "stopBluetoothSco : JBMR2+ Workaround");
                    Method declaredMethod = Class.forName(this.f18884l.getClass().getName()).getDeclaredMethod("stopScoUsingVirtualVoiceCall", new Class[]{BluetoothDevice.class});
                    declaredMethod.setAccessible(true);
                    Boolean bool = (Boolean) declaredMethod.invoke(this.f18884l, new Object[]{this.f18886n});
                    if (bool != null && bool.booleanValue()) {
                        this.f18880h = isr.BLUETOOTH_TURNING_OFF;
                    }
                } catch (ClassNotFoundException e) {
                    iil.m21870a(e.toString());
                } catch (NoSuchMethodException e2) {
                    iil.m21870a(e2.toString());
                } catch (InvocationTargetException e3) {
                    iil.m21870a(e3.toString());
                } catch (IllegalAccessException e4) {
                    iil.m21870a(e4.toString());
                }
                itx.m23277a(3, "vclib", "done");
            } else {
                itx.m23277a(3, "vclib", "stopBluetoothSco : pre-JBMR2");
                this.f18874b.stopBluetoothSco();
                this.f18880h = isr.BLUETOOTH_TURNING_OFF;
            }
            if (this.f18880h == isr.BLUETOOTH_TURNING_OFF) {
                m23131e();
                m23134h();
            }
        }
    }

    void m23134h() {
        itx.m23277a(3, "vclib", "Starting bluetooth timer");
        gwb.m1864a(this.f18892t, 5000);
    }

    void m23135i() {
        itx.m23277a(3, "vclib", "Canceling bluetooth timer");
        gwb.m2042b(this.f18892t);
    }

    void m23136j() {
        itx.m23277a(3, "vclib", "Starting or stopping Bluetooth timed out");
        m23135i();
        switch (isp.f18896b[this.f18880h.ordinal()]) {
            case 1:
                if (this.f18884l == null || this.f18886n == null || !this.f18884l.isAudioConnected(this.f18886n)) {
                    m23133g();
                    m23137k();
                } else {
                    itx.m23277a(6, "vclib", "We thought BT had timed out, but it's actually on; updating state.");
                    this.f18880h = isr.BLUETOOTH_ON;
                }
                m23131e();
                return;
            case 2:
                if (this.f18884l == null || this.f18886n == null || !this.f18884l.isAudioConnected(this.f18886n)) {
                    itx.m23277a(6, "vclib", "We thought BT had timed out, but it's actually off; updating state.");
                    m23137k();
                } else {
                    this.f18880h = isr.BLUETOOTH_ON;
                }
                m23131e();
                return;
            default:
                return;
        }
    }

    void m23137k() {
        if (this.f18887o == null || (this.f18887o == isr.WIRED_HEADSET_ON && !this.f18881i.contains(isq.WIRED_HEADSET))) {
            String valueOf = String.valueOf(this.f18887o);
            itx.m23277a(6, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 131).append("usePendingAudioDeviceState: there's no pending state or it was WH, but has been unplugged; using default device. Pending state was ").append(valueOf).toString());
            this.f18887o = null;
            m23124a(this.f18879g);
            return;
        }
        valueOf = String.valueOf(this.f18887o);
        itx.m23277a(3, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 34).append("usePendingAudioDeviceState: using ").append(valueOf).toString());
        this.f18880h = this.f18887o;
        this.f18887o = null;
        m23121b(this.f18880h == isr.SPEAKERPHONE_ON);
        m23131e();
    }

    public boolean m23138l() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f18873a.getSystemService("phone");
        if (VERSION.SDK_INT >= 22) {
            return telephonyManager.isVoiceCapable();
        }
        return telephonyManager.getPhoneType() != 0;
    }
}
