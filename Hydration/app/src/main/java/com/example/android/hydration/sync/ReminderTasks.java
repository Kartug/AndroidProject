package com.example.android.hydration.sync;

import android.content.Context;

import com.example.android.hydration.utilites.NotificationUtils;
import com.example.android.hydration.utilites.PreferenceUtilites;

public class ReminderTasks {
public static final String ACTION_INCREMENT_WATER_COUNT="increment-water-count";
public static final String ACTION_DISMISS_NOTIFICATION="dismiss-notification";
    static final String ACTION_CHARGING_REMINDER = "charging-reminder";

public static void executeTask(Context context,String action){
    if(ACTION_INCREMENT_WATER_COUNT.equals(action)){
        incrementWaterCount(context);
    }else if (ACTION_DISMISS_NOTIFICATION.equals(action)){
        NotificationUtils.clearAllNotifications(context);
    }else if (ACTION_CHARGING_REMINDER.equals(action)) {
        issueChargingReminder(context);
    }
}

private static void incrementWaterCount(Context context){
    PreferenceUtilites.incrementWaterCount(context);
    NotificationUtils.clearAllNotifications(context);
}
    private static void issueChargingReminder(Context context) {
        PreferenceUtilites.incrementChargingReminderCount(context);
        NotificationUtils.remindUserBecauseCharging(context);
    }
}
