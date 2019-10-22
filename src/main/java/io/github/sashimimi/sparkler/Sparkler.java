package io.github.sashimimi.sparkler;

import org.bukkit.plugin.java.JavaPlugin;
import io.github.sashimimi.sparkler.CommandHandler;

/**
 * The main class for the Sparkler plugin.
 * It contains methods that set up the main functionality of the plugin,
 * like event listeners and command handlers.
 * 
 * @author sashimimi
 * @version 1.0.0
 * @since 1.0.0
 * @since October 22, 2019
 *
 */

public class Sparkler extends JavaPlugin
{
	private static Sparkler instance;
	
	/**
	 * Creates an instance of the main class for use in other classes.
	 * 
	 * @since 1.0.0
	 * @return the instance of the main class
	 */
	public static Sparkler getInstance()
	{
		return instance;
	}
	
	/**
	 * Override methods to set up and register the plugin with the Spigot server.
	 * 
	 * @since 1.0.0
	 */
	public void onEnable()
	{
		getCommand("sp").setExecutor(new CommandHandler(this));
	}
	
	public void onDisable()
	{
		
	}
}
