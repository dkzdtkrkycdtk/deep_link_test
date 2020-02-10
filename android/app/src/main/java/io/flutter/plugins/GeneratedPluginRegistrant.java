package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.onesignal.flutter.OneSignalPlugin;
import name.avioli.unilinks.UniLinksPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    OneSignalPlugin.registerWith(registry.registrarFor("com.onesignal.flutter.OneSignalPlugin"));
    UniLinksPlugin.registerWith(registry.registrarFor("name.avioli.unilinks.UniLinksPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
