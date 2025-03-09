 import net.md_5.bungee.api.connection.ProxiedPlayer;

 public class GUIManager {

  private final PlayerServerPlugin plugin;

  public GUIManager(PlayerServerPlugin plugin) {
   this.plugin = plugin;
  }

  public void openMainMenu(ProxiedPlayer player) {
   // Implement GUI logic here
   // Example: Create an inventory with buttons for start/stop, plugin management, etc.
   player.sendMessage("Opening server management GUI (not implemented yet)...");
  }

  // Add methods for other GUI menus (plugin management, settings, etc.)
 }
