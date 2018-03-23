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
CTION_SETTINGS  系统设置界面
ACTION_APN_SETTINGS APN设置界面
ACTION_LOCATION_SOURCE_SETTINGS 定位设置界面
ACTION_AIRPLANE_MODE_SETTINGS 更多连接方式设置界面
ACTION_DATA_ROAMING_SETTINGS  双卡和移动网络设置界面
ACTION_ACCESSIBILITY_SETTINGS 无障碍设置界面
ACTION_SYNC_SETTINGS  同步设置界面
ACTION_ADD_ACCOUNT  添加账户界面
ACTION_NETWORK_OPERATOR_SETTINGS  选取运营商的界面
ACTION_SECURITY_SETTINGS  安全设置界面
ACTION_PRIVACY_SETTINGS 备份重置设置界面
ACTION_VPN_SETTINGS VPN设置界面,可能不存在
ACTION_WIFI_SETTINGS  无线网设置界面
ACTION_WIFI_IP_SETTINGS WIFI的IP设置
ACTION_BLUETOOTH_SETTINGS 蓝牙设置
ACTION_CAST_SETTINGS  投射设置
ACTION_DATE_SETTINGS  日期时间设置
ACTION_SOUND_SETTINGS 声音设置
ACTION_DISPLAY_SETTINGS 显示设置
ACTION_LOCALE_SETTINGS  语言设置
ACTION_VOICE_INPUT_SETTINGS 辅助应用和语音输入设置
ACTION_INPUT_METHOD_SETTINGS  语言和输入法设置
ACTION_USER_DICTIONARY_SETTINGS 个人字典设置界面
ACTION_INTERNAL_STORAGE_SETTINGS  存储空间设置的界面
ACTION_SEARCH_SETTINGS  搜索设置界面
ACTION_APPLICATION_DEVELOPMENT_SETTINGS 开发者选项设置
ACTION_DEVICE_INFO_SETTINGS 手机状态信息的界面
ACTION_DREAM_SETTINGS 互动屏保设置的界面
ACTION_NOTIFICATION_LISTENER_SETTINGS 通知使用权设置的界面
ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS  勿扰权限设置的界面
ACTION_CAPTIONING_SETTINGS  字幕设置的界面
ACTION_PRINT_SETTINGS 打印设置界面
ACTION_BATTERY_SAVER_SETTINGS 节电助手界面
ACTION_HOME_SETTINGS  主屏幕设置界面
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
