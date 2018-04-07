# MiniWalls API

To use the following API:
1. Clone to this Github repository to your local machine.
2. Run `mvn install`
3. Add the following dependency to your Maven POM file:
```
<dependency>
    <groupId>xyz.laur</groupId>
    <artifactId>miniwalls-api</artifactId>
    <version>1.1.4</version>
</dependency>
```


Here is an example of the API:
```
package xyz.laur.apitest;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.laur.miniwalls.api.MiniWallsDeathEvent;

import java.util.logging.Level;

public class ApiTest extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    private void onEvent(MiniWallsDeathEvent event) {
        getLogger().log(Level.INFO, "{0} ({1}) has been killed by {2} ({3})",
                new String[]{event.getPlayer().getName(), event.getTeam(),
                        event.getKiller().getName(), event.getKillerTeam()});
    }
}
```

The plugin outputs every time when someone dies. For example:
```
[ApiTest] ByteBuddy (green) has been killed by ol0fmeister (blue)
```

Following events can be used:
1. MiniWallsDeathEvent
*Note:* When the player does not die from attack from another player (for example when they fell to void), the killer is the same player that died.
