package io.github.sashimimi.sparkler;

import org.bukkit.plugin.java.JavaPlugin;
import io.github.sashimimi.sparkler.CommandHandler;

public class Sparkler extends JavaPlugin
{
	private static Sparkler instance;
	
	public void onEnable()
	{
		getCommand("sp").setExecutor(new CommandHandler(this));
	}
	
	public void onDisable()
	{
		
	}
	
	public static Sparkler getInstance()
	{
		return instance;
	}
}
