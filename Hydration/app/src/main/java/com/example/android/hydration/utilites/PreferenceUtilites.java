package com.example.android.hydration.utilites;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PreferenceUtilites {
    public static final String KEY_WATER_COUNT="water-count";
    public static final String KEY_CHARGING_REMINDER_COUNT="charging-reminder-count";

    private static final int DEFAULT_COUNT= 0;
  synchronized private static void setWaterCount(Context context,int glassOfWater){
      SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
      SharedPreferences.Editor editor = prefs.edit();
      editor.putInt(KEY_WATER_COUNT, glassOfWater);
      editor.apply();
  }
  public static int getWaterCount (Context context){
      SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
      int glassOfWater = prefs.getInt(KEY_WATER_COUNT,DEFAULT_COUNT);
      return glassOfWater;
  }
  synchronized public static void incrementWaterCount(Context context){
  int waterCount= PreferenceUtilites.getWaterCount(context);
  PreferenceUtilites.setWaterCount(context,++waterCount);
  }

  synchronized public static void incrementChargingReminderCount(Context context){
      SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
      int chargingReminders = prefs.getInt(KEY_CHARGING_REMINDER_COUNT, DEFAULT_COUNT);
      SharedPreferences.Editor editor = prefs.edit();
      editor.putInt(KEY_CHARGING_REMINDER_COUNT,++chargingReminders);
      editor.apply();
  }
  public static int getChargingReminderCount(Context context) {
      SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
      int charingReminders = prefs.getInt(KEY_CHARGING_REMINDER_COUNT, DEFAULT_COUNT);
      return charingReminders;
  }

}

