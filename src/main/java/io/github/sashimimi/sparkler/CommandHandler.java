package io.github.sashimimi.sparkler;

import java.util.Arrays;
import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;
import io.github.sashimimi.sparkler.CustomItemMeta;

public class CommandHandler implements CommandExecutor
{
	public Sparkler main;
	
	public CommandHandler(Sparkler main)
	{
		this.main = main;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (cmd.getName().equalsIgnoreCase("sp"))
		{
			if (sender instanceof Player)
			{	
				if (args.length > 0 && args.length < 2)
				{
					Player player = ((Player) sender).getPlayer();
					PlayerInventory inv = player.getInventory();
					List<Color> colors = Arrays.asList(Color.RED, Color.WHITE, Color.BLUE);
					
					switch (args[0])
					{
					case "banner":
						inv.setItem(inv.firstEmpty(), CustomItemMeta.americanBanner());
						return true;
					case "armor":
						inv.setItem(inv.firstEmpty(), CustomItemMeta.customLeatherArmor(Material.LEATHER_HELMET, Color.RED));
						inv.setItem(inv.firstEmpty(), CustomItemMeta.customLeatherArmor(Material.LEATHER_CHESTPLATE, Color.WHITE));
						inv.setItem(inv.firstEmpty(), CustomItemMeta.customLeatherArmor(Material.LEATHER_LEGGINGS, Color.BLUE));
						inv.setItem(inv.firstEmpty(), CustomItemMeta.customLeatherArmor(Material.LEATHER_BOOTS, Color.BLUE));
						return true;
					case "firework":
						inv.setItem(inv.firstEmpty(), CustomItemMeta.customFireworks(colors, FireworkEffect.Type.BALL));
						return true;
					}
				}
			}
			
			sender.sendMessage(ChatColor.AQUA + "[Sparkler]");
			sender.sendMessage(ChatColor.BLUE + "/sp" + ChatColor.AQUA + " Shows this help page");
			sender.sendMessage(ChatColor.BLUE + "/sp banner" + ChatColor.AQUA + " Gives the player a US-themed banner");
			sender.sendMessage(ChatColor.BLUE + "/sp armor" + ChatColor.AQUA + " Gives the player a set of US-themed armor");
			sender.sendMessage(ChatColor.BLUE + "/sp firework" + ChatColor.AQUA + " Gives the player some US-themed fireworks");
			return true;
		}
		
		return false;
	}
}
