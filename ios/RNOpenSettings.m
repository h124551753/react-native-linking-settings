//
//  React_Native_Open_Settings.m
//  React Native Open Settings
//
//  Created by Michael Morrissey on 11/4/15.
//  Copyright © 2015 Michael Morrissey. All rights reserved.
//

#import "RNOpenSettings.h"

@implementation RNOpenSettings

RCT_EXPORT_MODULE(RNOpenSettings);

RCT_EXPORT_METHOD(openSettings:(NSString *)uri) {
    NSLog(@"*******: %@", uri);
    dispatch_async(dispatch_get_main_queue(), ^{
        // 更新代码
        if(uri != nil && uri != NULL){
            NSURL *url = [NSURL URLWithString:uri];
            if ([[UIApplication sharedApplication] canOpenURL:url]) {
                if([[UIDevice currentDevice].systemVersion doubleValue] >= 10.0) {
                    [[UIApplication sharedApplication] openURL:url options:@{} completionHandler:nil];
                }else{
                    [[UIApplication sharedApplication] openURL:url];
                }
            }else{
                NSLog(@"can not open");
            }
        }else{
            [[UIApplication sharedApplication] openURL:[NSURL URLWithString:UIApplicationOpenSettingsURLString]];
        }
        
    });
}

@end
