# react-native-linking-settings


Open your apps settings in the Settings app 

## Install
```
npm install react-native-linking-settings
```

## Inlink
react-native link



## Usage
LinkingSettings.openSettings(uri:string);

### for ios uri can be:
```
无线局域网 App-Prefs:root=WIFI

蓝牙 App-Prefs:root=Bluetooth

蜂窝移动网络 App-Prefs:root=MOBILE_DATA_SETTINGS_ID

个人热点 App-Prefs:root=INTERNET_TETHERING

运营商 App-Prefs:root=Carrier

通知 App-Prefs:root=NOTIFICATIONS_ID

通用 App-Prefs:root=General

通用-关于本机 App-Prefs:root=General&path=About

通用-键盘 App-Prefs:root=General&path=Keyboard

通用-辅助功能 App-Prefs:root=General&path=ACCESSIBILITY

通用-语言与地区 App-Prefs:root=General&path=INTERNATIONAL

通用-还原 App-Prefs:root=Reset

墙纸 App-Prefs:root=Wallpaper

Siri App-Prefs:root=SIRI

隐私 App-Prefs:root=Privacy

Safari App-Prefs:root=SAFARI

音乐 App-Prefs:root=MUSIC

音乐-均衡器 App-Prefs:root=MUSIC&path=com.apple.Music:EQ

照片与相机 App-Prefs:root=Photos

FaceTime App-Prefs:root=FACETIME
```

### for android uri can be:
```
SETTINGS  系统设置界面
APN_SETTINGS APN设置界面
LOCATION_SOURCE_SETTINGS 定位设置界面
AIRPLANE_MODE_SETTINGS 更多连接方式设置界面
DATA_ROAMING_SETTINGS  双卡和移动网络设置界面
ACCESSIBILITY_SETTINGS 无障碍设置界面
SYNC_SETTINGS  同步设置界面
ADD_ACCOUNT  添加账户界面
NETWORK_OPERATOR_SETTINGS  选取运营商的界面
SECURITY_SETTINGS  安全设置界面
PRIVACY_SETTINGS 备份重置设置界面
VPN_SETTINGS VPN设置界面,可能不存在
WIFI_SETTINGS  无线网设置界面
WIFI_IP_SETTINGS WIFI的IP设置
BLUETOOTH_SETTINGS 蓝牙设置
CAST_SETTINGS  投射设置
DATE_SETTINGS  日期时间设置
SOUND_SETTINGS 声音设置
DISPLAY_SETTINGS 显示设置
LOCALE_SETTINGS  语言设置
VOICE_INPUT_SETTINGS 辅助应用和语音输入设置
INPUT_METHOD_SETTINGS  语言和输入法设置
USER_DICTIONARY_SETTINGS 个人字典设置界面
INTERNAL_STORAGE_SETTINGS  存储空间设置的界面
SEARCH_SETTINGS  搜索设置界面
APPLICATION_DEVELOPMENT_SETTINGS 开发者选项设置
DEVICE_INFO_SETTINGS 手机状态信息的界面
DREAM_SETTINGS 互动屏保设置的界面
NOTIFICATION_LISTENER_SETTINGS 通知使用权设置的界面
NOTIFICATION_POLICY_ACCESS_SETTINGS  勿扰权限设置的界面
CAPTIONING_SETTINGS  字幕设置的界面
PRINT_SETTINGS 打印设置界面
BATTERY_SAVER_SETTINGS 节电助手界面
HOME_SETTINGS  主屏幕设置界面
```

Require the `react-native-linking-settings` module.

```javascript
import LinkingSettings from 'react-native-linking-settings';
```

And then, where you want to open the settings, just do
```javascript
if(Platform.OS=='ios'){
  LinkingSettings.openSettings('App-Prefs:root=WIFI');
}else{
  LinkingSettings.openSettings('SETTINGS');
}
```

Have fun!
